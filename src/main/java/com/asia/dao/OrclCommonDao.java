package com.asia.dao;

import com.asia.internal.common.BillException;
import com.asia.internal.common.ResultInfo;
import com.asia.internal.errcode.ErrorCodePublicEnum;
import com.asia.mapper.orclmapper.IfUserMeterMapper;
import com.asia.mapper.orclmapper.InfoOverAccuFeeMapper;
import com.asia.vo.BillingCycle;
import com.asia.vo.IfUserMeter;
import com.asia.vo.ProdInst;
import com.asia.vo.ProdInstRegion;
import org.apache.dubbo.common.logger.Logger;
import org.apache.dubbo.common.logger.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
        } catch (BillException err) {
            resultInfo.setResultInfo(err);
        } catch (Exception e) {
            logger.error("", e);
            resultInfo.setResultInfo(new BillException("2",e));
        }
        resultInfo.setResultInfo(ErrorCodePublicEnum.SUCCESS);
        return  resultInfo;
    }
}
