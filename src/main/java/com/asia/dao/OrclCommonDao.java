package com.asia.dao;

import com.asia.common.utils.StringUtil;
import com.asia.common.utils.UUID;
import com.asia.domain.localApi.MeterPrintActionReq;
import com.asia.domain.localApi.MobileNumberQueryReq;
import com.asia.domain.localApi.MobileNumberQueryRes;
import com.asia.domain.localApi.child.MobileNumberQueryServiceListBean;
import com.asia.domain.localApi.child.MobileNumberQueryServiceListTypeBean;
import com.asia.internal.common.BillException;
import com.asia.internal.common.ResultInfo;
import com.asia.internal.errcode.ErrorCodePublicEnum;
import com.asia.mapper.orclmapper.EChannlMeterPrintLogMapper;
import com.asia.mapper.orclmapper.IfUserMeterMapper;
import com.asia.mapper.orclmapper.InfoOverAccuFeeMapper;
import com.asia.mapper.orclmapper.MobileNumberQueryMapper;
import com.asia.vo.*;
import org.apache.dubbo.common.logger.Logger;
import org.apache.dubbo.common.logger.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    public ResultInfo overAccuData(long accNum, String queryMoth, Map map) {
        String paramName = "";
        Map returnMap = new HashMap();
        try {
            List<BillingCycle> billingCycleList = infoOverAccuFeeMapperDao.selectBillingCyle(queryMoth);
            if (billingCycleList.size() == 0) {
                throw new BillException("1","账期为空");
            }
            BillingCycle billingCycle = new BillingCycle();
            billingCycle = billingCycleList.get(0);
            long billingCycleId = billingCycle.getBillingCycleId();
            List<ProdInst> prodInstList = infoOverAccuFeeMapperDao.selectProdInst(accNum);
            if (prodInstList.size() == 0) {
                throw new BillException("1","用户不存在或已拆机");
            }
            ProdInst prodInst = prodInstList.get(0);
            long prodInstId = prodInst.getProdInstId();
            List<ProdInstRegion> prodInstRegionList = infoOverAccuFeeMapperDao.selectProdInstRegion(prodInstId);
            if (prodInstRegionList.size() == 0) {
                throw new BillException("1","用户区域不存在");
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
            resultInfo.setResultInfo(new BillException("2",e));
        }
        return resultInfo;
    }
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
                        throw new BillException("1", "开通失败");
                    }
                }
            } else {
                if (cnt > 0) {
                    if (ifUserMeterMapperDao.deleteIfUserMeter(servId) < 0) {
                        throw new BillException("1", "取消失败");
                    }
                }
            }
            resultInfo.setResultInfo(ErrorCodePublicEnum.SUCCESS);
        } catch (BillException err) {
            resultInfo.setResultInfo(err);
        } catch (Exception e) {
            logger.error("", e);
            resultInfo.setResultInfo(new BillException("2",e));
        }
        return  resultInfo;
    }

    public ResultInfo preserveMeterPrintLog(MeterPrintActionReq meterPrintActionReq) {
        ResultInfo resultInfo = new ResultInfo();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        EChannlMeterPrintLog eChannlMeterPrintLog = new EChannlMeterPrintLog();
        try {
            if (StringUtil.isEmpty(meterPrintActionReq.getAccNbr())) {
                throw  new BillException("1","AccNbr节点元素不符合规范, AccNbr节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getSystemId())) {
                throw  new BillException("1","systemId节点元素不符合规范, systemId节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getActionType())) {
                throw new BillException("1","actionType节点元素不符合规范, actionType节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getAreaCode())) {
                throw new BillException("1", "areaCode节点元素不符合规范, areaCode节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getPrintMonth())) {
                throw new BillException("1", "printMonth节点元素不符合规范, printMonth节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getTerminalId())) {
                throw new BillException("1", "terminalId节点元素不符合规范, terminalId节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getStaffId())) {
                throw new BillException("1", "staffId节点元素不符合规范, staffId节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getSerialId())) {
                throw new BillException("1", "serialId节点元素不符合规范, serialId节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getPrintDate())) {
                throw new BillException("1", "printDate节点元素不符合规范, printDate节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getValidDate())) {
                throw new BillException("1", "validDate节点元素不符合规范, validDate节点元素值不能null");
            }
            if (StringUtil.isEmpty(meterPrintActionReq.getExpirDate())) {
                throw new BillException("1", "expirDate节点元素不符合规范, expirDate节点元素值不能null");
            }
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
            int ret = eChannlMeterPrintLogMapperDao.insertEChannlMeterPrintLog(eChannlMeterPrintLog);
            if (ret < 0) {
                throw new BillException("1","详单打印记录失败");
            }
            resultInfo.setResultInfo(ErrorCodePublicEnum.SUCCESS);
        } catch (BillException err) {
            resultInfo.setResultInfo(err);
        } catch (Exception e) {
            resultInfo.setResultInfo(new BillException("2",e));
        }
        return  resultInfo;
    }

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
