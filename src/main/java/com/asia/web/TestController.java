package com.asia.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.common.baseObj.Constant;
import com.asia.common.utils.LogUtil;
import com.asia.common.utils.StringUtil;
import com.asia.domain.localApi.QueryAddValueFeeReq;
import com.asia.domain.localApi.QueryAddValueFeeRes;
import com.asia.domain.localApi.child.QueryAddValueFeeResBean;
import com.asia.domain.localApi.child.QueryAddValueFeeResListBean;
import com.asia.internal.common.BillException;
import com.asia.internal.errcode.ErrorCodeCompEnum;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author WangBaoQiang
 * @ClassName: TestController
 * @description: TODO
 * @date 2019/6/1019:49
 * @Version 1.0
 */
@RequestMapping(value="/test",produces="application/json;charset=UTF-8")
@RestController
public class TestController {
    @PostMapping("queryTest")
    public String queryAddValueFee(@RequestBody QueryAddValueFeeReq queryAddValueFeeReq,
                                   @RequestHeader Map<String,String> headers, HttpServletResponse response){
        //记录业务日志
        LogUtil.debug("START [queryAddValueFee] SERVICE...", null, this.getClass());
        LogUtil.debug("/local/queryAddValueFee" +" body>>"+JSON.toJSONString(queryAddValueFeeReq,SerializerFeature.WriteMapNullValue)
                +" header>>"+JSON.toJSONString(headers),null, this.getClass());
        QueryAddValueFeeRes info=new QueryAddValueFeeRes();
        try {
            //查询类型
            if (StringUtil.isEmpty(queryAddValueFeeReq.getStdCcrCustomizeBillQueryBill().getQueryFlag())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_FLAG_IS_EMPTY);
            }
            //查询值类型
            if (StringUtil.isEmpty(queryAddValueFeeReq.getStdCcrCustomizeBillQueryBill().getDestinationAttr())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_ATTR_IS_EMPTY);
            }
            //查询值
            if (StringUtil.isEmpty(queryAddValueFeeReq.getStdCcrCustomizeBillQueryBill().getAccNbr())) {
                throw new BillException(ErrorCodeCompEnum.QUERY_VALUE_IS_EMPTY);
            }
            //系统id
            String systemId = queryAddValueFeeReq.getStdCcrCustomizeBillQueryBill().getSystemId();
            if (StringUtil.isEmpty(systemId)) {
                throw new BillException(ErrorCodeCompEnum.SYSTEM_ID_ERROR);
            }
            QueryAddValueFeeRes queryAddValueFeeRes = new QueryAddValueFeeRes();
            QueryAddValueFeeResBean queryAddValueFeeResBean = new QueryAddValueFeeResBean();
            //QueryAddValueFeeResListBean bean = new QueryAddValueFeeResListBean();
            List<QueryAddValueFeeResListBean> list = new ArrayList<QueryAddValueFeeResListBean>();
            String jsonString = "{\"errorCode\": \"0\",\n" +
                    "  \"errorMsg\": \"SUCCESS\",\n" +
                    "  \"stdCcaCustomizeBillQueryBill\": {\n" +
                    "    \"acctName\": \"刘广亮\",\n" +
                    "    \"itemInformation\": [\n" +
                    "      {\n" +
                    "        \"accNbrDetail\": null,\n" +
                    "        \"charge\": \"0\",\n" +
                    "        \"chargeTypeName\": \"月基本费\",\n" +
                    "        \"classId\": \"2001\",\n" +
                    "        \"parentClassId\": \"2400\",\n" +
                    "        \"productOffName\": null,\n" +
                    "        \"showlevel\": \"2\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"accNbrDetail\": null,\n" +
                    "        \"charge\": \"300\",\n" +
                    "        \"chargeTypeName\": \"套餐及叠加包超出费用\",\n" +
                    "        \"classId\": \"2401\",\n" +
                    "        \"parentClassId\": \"0\",\n" +
                    "        \"productOffName\": null,\n" +
                    "        \"showlevel\": \"1\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"accNbrDetail\": null,\n" +
                    "        \"charge\": \"300\",\n" +
                    "        \"chargeTypeName\": \"天气预报信息费\",\n" +
                    "        \"classId\": \"2163\",\n" +
                    "        \"parentClassId\": \"2006\",\n" +
                    "        \"productOffName\": null,\n" +
                    "        \"showlevel\": \"3\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"accNbrDetail\": null,\n" +
                    "        \"charge\": \"300\",\n" +
                    "        \"chargeTypeName\": \"代收费\",\n" +
                    "        \"classId\": \"2006\",\n" +
                    "        \"parentClassId\": \"2401\",\n" +
                    "        \"productOffName\": null,\n" +
                    "        \"showlevel\": \"2\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"accNbrDetail\": null,\n" +
                    "        \"charge\": \"0\",\n" +
                    "        \"chargeTypeName\": \"包月费\",\n" +
                    "        \"classId\": \"2012\",\n" +
                    "        \"parentClassId\": \"2001\",\n" +
                    "        \"productOffName\": null,\n" +
                    "        \"showlevel\": \"3\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"accNbrDetail\": null,\n" +
                    "        \"charge\": \"0\",\n" +
                    "        \"chargeTypeName\": \"套餐及叠加包月基本费\",\n" +
                    "        \"classId\": \"2400\",\n" +
                    "        \"parentClassId\": \"0\",\n" +
                    "        \"productOffName\": null,\n" +
                    "        \"showlevel\": \"1\"\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"sumCharge\": \"300\"\n" +
                    "  }\n" +
                    "}";
            JSONObject json = JSON.parseObject(jsonString);
            Map<String, Object> map = (Map) json.get("stdCcaCustomizeBillQueryBill");
            String acctName = map.get("acctName").toString();
            List<Map<String, Object>> itemList = (List) map.get("itemInformation");
            int sumCharge = 0;
            for (int i = 0; i < itemList.size(); i++) {
                String showlevel = String.valueOf(itemList.get(i).get("showlevel"));
                String classId = String.valueOf(itemList.get(i).get("classId"));
                String parentClassId = String.valueOf(itemList.get(i).get("parentClassId"));
                String charge = String.valueOf(itemList.get(i).get("charge"));
                String accNbrDetail = String.valueOf(itemList.get(i).get("accNbrDetail"));
                String chargeTypeName = String.valueOf(itemList.get(i).get("chargeTypeName"));
                String productOffName = String.valueOf(itemList.get(i).get("productOffName"));
                if ("2005".equals(classId) || "2006".equals(classId)) {
                    sumCharge += Integer.parseInt(charge);
                    QueryAddValueFeeResListBean bean = new QueryAddValueFeeResListBean();
                    bean.setShowlevel(showlevel);
                    bean.setClassId(classId);
                    bean.setParentClassId(parentClassId);
                    bean.setCharge(charge);
                    bean.setAccNbrDetail(accNbrDetail);
                    bean.setChargeTypeName(chargeTypeName);
                    bean.setProductOffName(productOffName);
                    list.add(bean);
                    for (int m = 0; m < itemList.size(); m++) {
                        String showlevel2 = String.valueOf(itemList.get(m).get("showlevel"));
                        String classId2 = String.valueOf(itemList.get(m).get("classId"));
                        String parentClassId2 = String.valueOf(itemList.get(m).get("parentClassId"));
                        String charge2 = String.valueOf(itemList.get(m).get("charge"));
                        String accNbrDetail2 = String.valueOf(itemList.get(m).get("accNbrDetail"));
                        String chargeTypeName2 = String.valueOf(itemList.get(m).get("chargeTypeName"));
                        String productOffName2 = String.valueOf(itemList.get(m).get("productOffName"));
                        if (classId2.equals(parentClassId) ) {//2005与2006 同一个父类，取一个
                            QueryAddValueFeeResListBean bean1 = new QueryAddValueFeeResListBean();
                            bean1.setShowlevel(showlevel2);
                            bean1.setClassId(classId2);
                            bean1.setParentClassId(parentClassId2);
                            bean1.setCharge(charge2);
                            bean1.setAccNbrDetail(accNbrDetail2);
                            bean1.setChargeTypeName(chargeTypeName2);
                            bean1.setProductOffName(productOffName2);
                            list.add(bean1);
                        }
                        if (parentClassId2.equals(classId)) {//取其父类
                            QueryAddValueFeeResListBean bean2 = new QueryAddValueFeeResListBean();
                            bean2.setShowlevel(showlevel2);
                            bean2.setClassId(classId2);
                            bean2.setParentClassId(parentClassId2);
                            bean2.setCharge(charge2);
                            bean2.setAccNbrDetail(accNbrDetail2);
                            bean2.setChargeTypeName(chargeTypeName2);
                            bean2.setProductOffName(productOffName2);
                            list.add(bean2);
                        }

                    }

                }

            }
            queryAddValueFeeResBean.setItemInformation(list);
            queryAddValueFeeResBean.setSumCharge(String.valueOf(sumCharge));
            queryAddValueFeeResBean.setAcctName(acctName);
            queryAddValueFeeRes.setStdCcaCustomizeBillQueryBill(queryAddValueFeeResBean);
            info = queryAddValueFeeRes;

        }catch (BillException err) {
            LogUtil.error("/local/queryAddValueFeeReq服务调用失败"+ "body>>"+ JSON.toJSONString(queryAddValueFeeReq, SerializerFeature.WriteMapNullValue)
                    +" header>>"+ JSON.toJSONString(headers), err,this.getClass());
            info.setErrorCode(err.getErrCode());
            info.setErrorMsg(err.getMessage());
            LogUtil.error("输出参数[queryAddValueFeeRes]=" + JSON.toJSONString(info, SerializerFeature.WriteMapNullValue), err, this.getClass());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        } catch (Exception e) {
            LogUtil.error("/local/queryAddValueFeeReq服务调用失败"+ "body>>"+JSON.toJSONString(queryAddValueFeeReq,SerializerFeature.WriteMapNullValue)
                    +" header>>"+JSON.toJSONString(headers), e,this.getClass());
            info.setErrorCode(Constant.ResultCode.ERROR);
            info.setErrorMsg(e.getMessage());
            LogUtil.error("输出参数[queryAddValueFeeRes]=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), e, this.getClass());
            return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
        }
        LogUtil.debug("输出参数 queryAddValueFeeRes=" + JSON.toJSONString(info,SerializerFeature.WriteMapNullValue), null, this.getClass());
        LogUtil.debug("END [queryAddValueFee] SERVICE...", null, this.getClass());
        return JSON.toJSONString(info, SerializerFeature.WriteMapNullValue);
    }
}
