package com.asia.dao;

import com.asia.common.baseObj.Constant;
import com.asia.common.utils.LogUtil;
import com.asia.common.utils.StringUtil;
import com.asia.common.utils.UUID;
import com.asia.domain.localApi.MeterPrintActionReq;
import com.asia.domain.localApi.MobileNumberQueryReq;
import com.asia.domain.localApi.MobileNumberQueryRes;
import com.asia.domain.localApi.child.MobileNumberQueryServiceListBean;
import com.asia.domain.localApi.child.MobileNumberQueryServiceListTypeBean;
import com.asia.domain.openApi.RechargeBalanceReq;
import com.asia.domain.openApi.RollRechargeBalanceReq;
import com.asia.domain.openApi.child.OperAttrStruct;
import com.asia.domain.openApi.child.SvcObjectStruct;
import com.asia.internal.common.BillException;
import com.asia.internal.common.ResultInfo;
import com.asia.internal.errcode.ErrorCodeCompEnum;
import com.asia.internal.errcode.ErrorCodePublicEnum;
import com.asia.mapper.orclmapper.*;
import com.asia.vo.*;
import org.apache.dubbo.common.logger.Logger;
import org.apache.dubbo.common.logger.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;



/**
 * @author WangBaoQiang
 * @ClassName: OverAccuDao
 * @description: TODO
 * @date 2019/8/913:23
 * @Version 1.0
 */
@Repository
public class OrclCommonDao {
    public static final Logger logger = LoggerFactory.getLogger(OrclCommonDao.class);
    @Autowired
    InfoOverAccuFeeMapper infoOverAccuFeeMapperDao;
    @Autowired
    ResultInfo resultInfo;
    @Autowired
    IfUserMeterMapper ifUserMeterMapperDao;
    @Autowired
    EChannlMeterPrintLogMapper eChannlMeterPrintLogMapperDao;
    @Autowired
    MobileNumberQueryMapper mobileNumberQueryDao;
    @Autowired
    VcChargeRecordMapper vcChargeRecordMapperDao;
    @Autowired
    TerminalChargeRecordMapper terminalChargeRecordMapperDao;
    @Autowired
    CreditFeeRecordMapper creditFeeRecordMapperDao;
    @Autowired
    BussihallChargeRecordMapper bussihallChargeRecordMapperDao;
    /**
     * @Author WangBaoQiang
     * @Description //
     * @Date 20:51 2019/9/29
     * @Param [accNum, queryMoth, map]
     * @return com.asia.internal.common.ResultInfo
    */
    public ResultInfo overAccuData(long accNum, String queryMoth, Map map) {
        String paramName = "";
        Map returnMap = new HashMap();
        try {
            List<BillingCycle> billingCycleList = infoOverAccuFeeMapperDao.selectBillingCyle(queryMoth);
            if (billingCycleList.size() == 0) {
                throw new BillException(ErrorCodeCompEnum.BILLING_CYCYLE_ERR);
            }
            BillingCycle billingCycle = new BillingCycle();
            billingCycle = billingCycleList.get(0);
            long billingCycleId = billingCycle.getBillingCycleId();
            List<ProdInst> prodInstList = infoOverAccuFeeMapperDao.selectProdInst(accNum);
            if (prodInstList.size() == 0) {
                throw new BillException(ErrorCodeCompEnum.HSS_SEARCH_SERV_INFO_NOT_EXIST);
            }
            ProdInst prodInst = prodInstList.get(0);
            long prodInstId = prodInst.getProdInstId();
            List<ProdInstRegion> prodInstRegionList = infoOverAccuFeeMapperDao.selectProdInstRegion(prodInstId);
            if (prodInstRegionList.size() == 0) {
                throw new BillException(ErrorCodeCompEnum.PROD_REGION_ERR);
            }

            ProdInstRegion prodInstRegion = prodInstRegionList.get(0);
            String areaCode = prodInstRegion.getRegionId().toString();
            areaCode = areaCode.substring(0, 3);
            String strTableName = "mobile_data_event_0" + areaCode + "_" + billingCycleId;
            List<Map<String, Object>> overFeeAccuList = infoOverAccuFeeMapperDao.selectMobileDataEvent(String.valueOf(prodInstId), strTableName);
            map = overFeeAccuList.get(0);
            resultInfo.setResultInfo(ErrorCodePublicEnum.SUCCESS);
        } catch (BillException err) {
            resultInfo.setResultInfo(err);
            logger.error("", err);
        }catch (Exception e) {
            logger.error("", e);
            resultInfo.setResultInfo(new BillException("1",e));
        }
        return resultInfo;
    }
    /**
     * @Author WangBaoQiang
     * @Description //详单禁查
     * @Date 21:49 2019/9/29
     * @Param [servId, action, areaCode]
     * @return com.asia.internal.common.ResultInfo
    */
    public ResultInfo userMeterOrder(String servId, String action, String areaCode) {
        ResultInfo resultInfo = new ResultInfo();
       long cnt =  ifUserMeterMapperDao.selectcountUserMeter(servId);
        IfUserMeter ifUserMeter = new IfUserMeter();
        ifUserMeter.setForbidStatus("1");
        ifUserMeter.setRegionCode(areaCode);
        ifUserMeter.setServId(servId);
        try {
            if ("0".equals(action)) {
                if (cnt == 0) {
                    if (ifUserMeterMapperDao.insertIfUserMeter(ifUserMeter) < 0) {
                        throw new BillException(ErrorCodeCompEnum.USER_METER_OPEN_ERR);
                    }
                }
            } else {
                if (cnt > 0) {
                    if (ifUserMeterMapperDao.deleteIfUserMeter(servId) < 0) {
                        throw new BillException(ErrorCodeCompEnum.USER_METER_CANCEL_ERR);
                    }
                }
            }
            resultInfo.setResultInfo(ErrorCodePublicEnum.SUCCESS);
        } catch (BillException err) {
            resultInfo.setResultInfo(err);
        } catch (Exception e) {
            logger.error("", e);
            resultInfo.setResultInfo(new BillException(Constant.ResultCode.ERROR,e));
        }
        return  resultInfo;
    }
    /**
     * @Author WangBaoQiang
     * @Description //详单打印日志记录
     * @Date 21:49 2019/9/29
     * @Param [meterPrintActionReq]
     * @return com.asia.internal.common.ResultInfo
    */
    public ResultInfo preserveMeterPrintLog(MeterPrintActionReq meterPrintActionReq) {
        ResultInfo resultInfo = new ResultInfo();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        EChannlMeterPrintLog eChannlMeterPrintLog = new EChannlMeterPrintLog();
        try {

            eChannlMeterPrintLog.setActionDate(sdf.parse(meterPrintActionReq.getPrintDate()));
            eChannlMeterPrintLog.setExpirDate(sdf.parse(meterPrintActionReq.getExpirDate()));
            eChannlMeterPrintLog.setPrintMonth(meterPrintActionReq.getPrintMonth());
            eChannlMeterPrintLog.setPhoneId(meterPrintActionReq.getAccNbr());
            eChannlMeterPrintLog.setSystemId(meterPrintActionReq.getSystemId());
            eChannlMeterPrintLog.setTerminalId(meterPrintActionReq.getTerminalId());
            eChannlMeterPrintLog.setActionType(meterPrintActionReq.getActionType());
            eChannlMeterPrintLog.setRegionCode(meterPrintActionReq.getAreaCode());
            eChannlMeterPrintLog.setKeyId(UUID.getUUID());
            eChannlMeterPrintLog.setOpId(meterPrintActionReq.getStaffId());
            eChannlMeterPrintLog.setSerialId(meterPrintActionReq.getSerialId());
            eChannlMeterPrintLog.setValidDate(sdf.parse(meterPrintActionReq.getValidDate()));
            String remark ="";
            int type = Integer.parseInt(meterPrintActionReq.getActionType());
            switch (type) {
                case 0:
                    remark =type + "--漫游清单打印";
                    break;
                case 1:
                    remark = type + "--长途清单（包括普通长途，IP长途，96688长途，等）打印";
                    break;
                case 2:
                    remark = type + "--市话详单打印";
                    break;
                case 3:
                    remark = type + "--信息台清单打印";
                    break;
                case 4:
                    remark = type + "--数据清单打印";
                    break;
                case 5:
                    remark = type + "--短信通信清单打印";
                    break;
                case 6:
                    remark = type + "--短信服务清单打印";
                    break;
                case 7:
                    remark = type + "--预付费充值清单打印";
                    break;
                case 8:
                    remark = type + "--预付费扣费清单打印";
                    break;
                    default:
                        remark = type + "  未知类型清单打印";
            }
            eChannlMeterPrintLog.setActionRemark(remark);
            LogUtil.debug("[Begin 插入详单打印记录]----------------",null, this.getClass());
            LogUtil.debug("[详单打印记录]：" + eChannlMeterPrintLog.toString(),null, this.getClass());
            int ret = eChannlMeterPrintLogMapperDao.insertEChannlMeterPrintLog(eChannlMeterPrintLog);
            if (ret < 0) {
                throw new BillException("1","详单打印记录失败");
            }
            resultInfo.setResultInfo(ErrorCodePublicEnum.SUCCESS);
        } catch (BillException err) {
            resultInfo.setResultInfo(err);
        } catch (Exception e) {
            resultInfo.setResultInfo(new BillException("1",e));
        }
        LogUtil.debug("[end 插入详单打印记录]----------------",null, this.getClass());
        return  resultInfo;
    }
    /**
     * @Author WangBaoQiang
     * @Description 检查缴费流水是否存在
     * @Date 15:05 2019/8/31
     * @Param [rechargeBalanceReq]
     * @return com.asia.internal.common.ResultInfo
    */
    public ResultInfo checkSerialnumberExist(RechargeBalanceReq rechargeBalanceReq) {
        ResultInfo resultInfo = new ResultInfo();
        OperAttrStruct operAttrStruct = new OperAttrStruct();
        operAttrStruct = rechargeBalanceReq.getOperAttrStruct();
        if (StringUtil.isEmpty(operAttrStruct.getOperOrgId())) {
            resultInfo.setResultInfo(ErrorCodePublicEnum.CHANNEL_ID_NO_FOUND);
            return resultInfo;
        }
        String channelId = operAttrStruct.getOperOrgId().toString();
        String tableName = "";
        long cnt=0;
        long flowId = Long.parseLong(rechargeBalanceReq.getFlowId());
        if ("4102".equals(channelId)) {//VC充值 vc_charge_record
            cnt = vcChargeRecordMapperDao.getCntFromOtherPaymentId(flowId, channelId);
        } else if ("3001".equals(channelId)) { //自助终端 terminal_charge_record
            cnt = terminalChargeRecordMapperDao.getCntFromOtherPaymentId(flowId, channelId);
        } else if ("9".equals(channelId)) {//crm credit_fee_record
            cnt = creditFeeRecordMapperDao.getCntFromOtherPaymentId(flowId, channelId);
        } else {//bussihall_charge_record
            cnt = bussihallChargeRecordMapperDao.getCntFromOtherPaymentId(flowId, channelId);
        }
        if (cnt > 0) {
            resultInfo.setResultInfo(ErrorCodePublicEnum.PAY_SERIALNUMBER_IS_EXIST);
            return resultInfo;
        }
        resultInfo.setResultInfo(ErrorCodePublicEnum.SUCCESS);
        return resultInfo;
    }
    /**
     * @Author WangBaoQiang
     * @Description 插入流水号
     * @Date 15:57 2019/9/3
     * @Param [rechargeBalanceReq]
     * @return com.asia.internal.common.ResultInfo
    */
    public ResultInfo insertSerialnumber(RechargeBalanceReq rechargeBalanceReq, long paymentId,String lanId) {
        ResultInfo resultInfo = new ResultInfo();
        VcChargeRecord vcChargeRecord = new VcChargeRecord();
        TerminalChargeRecord terminalChargeRecord = new TerminalChargeRecord();
        BussihallChargeRecord bussihallChargeRecord = new BussihallChargeRecord();
        CreditFeeRecord creditFeeRecord = new CreditFeeRecord();
        OperAttrStruct operAttrStruct = new OperAttrStruct();
        SvcObjectStruct svcObjectStruct = new SvcObjectStruct();

        operAttrStruct = rechargeBalanceReq.getOperAttrStruct();
        svcObjectStruct = rechargeBalanceReq.getSvcObjectStruct();
        if (StringUtil.isEmpty(operAttrStruct.getOperOrgId())) {
            resultInfo.setResultInfo(ErrorCodePublicEnum.CHANNEL_ID_NO_FOUND);
            return resultInfo;
        }
        String channelId = operAttrStruct.getOperOrgId().toString();
        //工号
        String staffId = operAttrStruct.getStaffId().toString();
        //外围流水
        String otherPaymentId = String.valueOf(rechargeBalanceReq.getFlowId());
        //号码
        String acctNbr = svcObjectStruct.getObjValue();
        //号码类型
        String valueType = svcObjectStruct.getObjAttr();
        //缴费流水
        long flowId = Long.parseLong(rechargeBalanceReq.getFlowId());
        //充值金额
        long amount = rechargeBalanceReq.getRechargeAmount();
        String tableName = "";
        long cnt=0;
        LogUtil.info("[开始插入缴费流水]----------------",null, this.getClass());
        if ("4102".equals(channelId)) {//VC充值 vc_charge_record
            vcChargeRecord.setAccNbr(acctNbr);
            vcChargeRecord.setBusiCode(channelId);
            vcChargeRecord.setOtherPaymentId(otherPaymentId);
            vcChargeRecord.setStaffId(staffId);
            vcChargeRecord.setPaymentDate(new Date());
            vcChargeRecord.setCreatedDate(new Date());
            vcChargeRecord.setState(Short.parseShort("0"));
            vcChargeRecord.setAmount(BigDecimal.valueOf(amount));
            vcChargeRecord.setPaymentId(paymentId);
            vcChargeRecord.setSoRegionCode("431");
            vcChargeRecord.setIsRegionCode(lanId);
            LogUtil.info("[VC入库信息]" + vcChargeRecord.toString(),null, this.getClass());
            cnt = vcChargeRecordMapperDao.insertVcChargeRecord(vcChargeRecord);
        } else if ("3001".equals(channelId)) { //自助终端 terminal_charge_record
            terminalChargeRecord.setAccNbr(acctNbr);
            terminalChargeRecord.setBusiCode(channelId);
            terminalChargeRecord.setOtherPaymentId(otherPaymentId);
            terminalChargeRecord.setStaffId(staffId);
            terminalChargeRecord.setAmount(BigDecimal.valueOf(amount));
            terminalChargeRecord.setPaymentDate(new Date());
            terminalChargeRecord.setCreatedDate(new Date());
            terminalChargeRecord.setState(Short.parseShort("0"));
            terminalChargeRecord.setPaymentId(paymentId);
            terminalChargeRecord.setIsRegionCode(lanId);
            LogUtil.info("[自助终端入库信息]" + terminalChargeRecord.toString(),null, this.getClass());
            cnt = terminalChargeRecordMapperDao.insertTerminalChargeRecord(terminalChargeRecord);
        } else if ("9".equals(channelId)) {//crm credit_fee_record
            creditFeeRecord.setAccNbr(acctNbr);
            creditFeeRecord.setBusiCode(channelId);
            creditFeeRecord.setOtherPaymentId(otherPaymentId);
            creditFeeRecord.setStaffId(staffId);
            creditFeeRecord.setAmount(BigDecimal.valueOf(amount));
            creditFeeRecord.setPaymentDate(new Date());
            creditFeeRecord.setCreatedDate(new Date());
            creditFeeRecord.setState(Short.parseShort("0"));
            creditFeeRecord.setPaymentId(paymentId);
            LogUtil.info("[CRM入库信息]" + creditFeeRecord.toString(),null, this.getClass());
            cnt = creditFeeRecordMapperDao.insertCreditFeeRecord(creditFeeRecord);
        } else {//bussihall_charge_record
            bussihallChargeRecord.setAccNbr(acctNbr);
            bussihallChargeRecord.setBusiCode(channelId);
            bussihallChargeRecord.setOtherPaymentId(otherPaymentId);
            bussihallChargeRecord.setStaffId(staffId);
            bussihallChargeRecord.setAmount(BigDecimal.valueOf(amount));
            bussihallChargeRecord.setPaymentDate(new Date());
            bussihallChargeRecord.setCreatedDate(new Date());
            bussihallChargeRecord.setState(Short.parseShort("0"));
            bussihallChargeRecord.setPaymentId(paymentId);
            bussihallChargeRecord.setIsRegionCode(lanId);
            LogUtil.info("[其他渠道入库信息]" + bussihallChargeRecord.toString(),null, this.getClass());
            cnt = bussihallChargeRecordMapperDao.insertBussihallChargeRecord(bussihallChargeRecord);
        }
        if (cnt < 0) {
            LogUtil.error("[缴费信息入库失败]" + " 外围缴费流水：" + otherPaymentId + " 渠道：" + channelId,
                    null, this.getClass());
            resultInfo.setResultInfo(ErrorCodePublicEnum.DB_INSERT_ERROR);
            return resultInfo;
        }
        LogUtil.info("[插入缴费流水结束]----------------",null, this.getClass());
        resultInfo.setResultInfo(ErrorCodePublicEnum.SUCCESS);
        return resultInfo;
    }

    /**
     * @Author ChenJian
     * @Description 修改流水号（冲正回退、冲正）
     * @Date 15:57 2019/9/14
     * @Param [rechargeBalanceReq]
     * @return com.asia.internal.common.ResultInfo
     */
    public ResultInfo updateSerialnumber(RollRechargeBalanceReq rechargeBalanceReq, long paymentId,String reqServiceId) {
        ResultInfo resultInfo = new ResultInfo();
        VcChargeRecord vcChargeRecord = new VcChargeRecord();
        TerminalChargeRecord terminalChargeRecord = new TerminalChargeRecord();
        BussihallChargeRecord bussihallChargeRecord = new BussihallChargeRecord();
        CreditFeeRecord creditFeeRecord = new CreditFeeRecord();
        OperAttrStruct operAttrStruct = new OperAttrStruct();
        SvcObjectStruct svcObjectStruct = new SvcObjectStruct();

        operAttrStruct = rechargeBalanceReq.getOperAttrStruct();

        String channelId = operAttrStruct.getOperOrgId().toString();
        //工号
        String staffId = operAttrStruct.getStaffId().toString();
        //源外围流水
        String otherPaymentId = rechargeBalanceReq.getSrcServiceId().toString();
        //号码
        String acctNbr = svcObjectStruct.getObjValue();
        //号码类型
        String valueType = svcObjectStruct.getObjAttr();
        //缴费流水
        long flowId = Long.parseLong(rechargeBalanceReq.getReqServiceId());
        //充值金额
        //long amount = rechargeBalanceReq.getRechargeAmount();
        String tableName = "";
        long cnt=0;
        LogUtil.info("[修改冲正流水记录]----------------",null, this.getClass());
        LogUtil.info("源流水号：" + otherPaymentId + "请求流水号" + reqServiceId
                + "",null, this.getClass());
        if ("4102".equals(channelId)) {//VC充值 vc_charge_record
            vcChargeRecord.setOtherPaymentId(otherPaymentId);
            vcChargeRecord.setUnpayOtherPaymentId(reqServiceId);
            vcChargeRecord.setUnpayPaymentId(String.valueOf(paymentId));
            cnt = vcChargeRecordMapperDao.updateVcChargeRecord(vcChargeRecord);
        } /*else if ("3001".equals(channelId)) { //自助终端 terminal_charge_record
            terminalChargeRecord.setOtherPaymentId(otherPaymentId);
            terminalChargeRecord.setUnpayOtherPaymentId(reqServiceId);
            terminalChargeRecord.setUnpayPaymentId(String.valueOf(paymentId));
            cnt = terminalChargeRecordMapperDao.updateTerminalChargeRecord(terminalChargeRecord);
        } else if ("9".equals(channelId)) {//crm credit_fee_record
            creditFeeRecord.setOtherPaymentId(otherPaymentId);
            creditFeeRecord.setPaymentId(paymentId);
            cnt = creditFeeRecordMapperDao.updateCreditFeeRecord(creditFeeRecord);
        } else {//bussihall_charge_record
            bussihallChargeRecord.setOtherPaymentId(otherPaymentId);
            bussihallChargeRecord.setPaymentId(paymentId);
            bussihallChargeRecord.setUnpayOtherPaymentId(reqServiceId);
            bussihallChargeRecord.setUnpayPaymentId(String.valueOf(paymentId));
            cnt = bussihallChargeRecordMapperDao.updateBussihallChargeRecord(bussihallChargeRecord);
        }*/
        if (cnt < 0) {
            resultInfo.setResultInfo(ErrorCodePublicEnum.DB_INSERT_ERROR);
            return resultInfo;
        }
        LogUtil.info("[修改冲正流水记录结束]----------------",null, this.getClass());
        LogUtil.info(flowId + "冲正成功",null, this.getClass());
        resultInfo.setResultInfo(ErrorCodePublicEnum.SUCCESS);
        return resultInfo;
    }

    //是否为电信号段（查号头表）
    public MobileNumberQueryRes moBileNumberQuery(MobileNumberQueryReq mobileNumberQueryReq, Map<String, String> headers){
        MobileNumberQueryRes mobileNumberQueryRes=new MobileNumberQueryRes();

        MobileNumberQueryServiceListBean mobileNumberQueryServiceListBean=new MobileNumberQueryServiceListBean();

        MobileNumberQueryServiceListTypeBean mobileNumberQueryServiceListTypeBean=new MobileNumberQueryServiceListTypeBean();

        String dataValue=mobileNumberQueryDao.moBileNumberQuery(mobileNumberQueryReq.getValue());

        mobileNumberQueryServiceListBean.setDataValue(dataValue);

        List<MobileNumberQueryServiceListBean> list=new ArrayList<MobileNumberQueryServiceListBean>();
        list.add(mobileNumberQueryServiceListBean);

        mobileNumberQueryServiceListTypeBean.setDataInfo(list);
        mobileNumberQueryRes.setDataInfoSet(mobileNumberQueryServiceListTypeBean);
        mobileNumberQueryRes.setResult("0");
        return mobileNumberQueryRes;

    }
}
