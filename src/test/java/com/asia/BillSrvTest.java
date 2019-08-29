/*package com.asia;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.domain.bon3.StdCcrQueryServ;
import com.asia.domain.openApi.child.OperAttrStruct;
import com.asia.domain.openApi.child.SvcObjectStruct;
import com.asia.mapper.billmapper.IntfServCustChangeContrastMapper;
import com.asia.mapper.billmapper.ParamDefineMapper;
import com.asia.mapper.ordmapper.ProdInstRouteMapper;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.dao.DataAccessException;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

*//**
 * @author WangBaoQiang
 * @ClassName: BillSrvTest
 * @description: TODO
 * @date 2019/6/1016:37
 * @Version 1.0
 *//*

*//**
 * 使用@MybatisTest默认会使用虚拟的数据源代替你的配置
 * 如果想使用你配置的数据库则使用@AutoConfigureTestDatabase
 * (replace = AutoConfigureTestDatabase.Replace.NONE) Replace.NONE表示不会替换数据源配置
 *//*

@RunWith(SpringRunner.class)
@MybatisTest
//@AutoConfigureTestDatabase
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BillSrvTest {
    public static final Logger logger = Logger.getLogger(BillSrvTest.class);
    @Autowired
    private ParamDefineMapper paramDefineMapper;
    @Autowired
    private IntfServCustChangeContrastMapper intfServCustChangeContrastMapperDao;
    @Autowired
    private ProdInstRouteMapper prodInstRouteMapperDao;
    @Test
    public void testQuery() {
        try {
            String paramCode = "1";
            String paramName;
            paramName = paramDefineMapper.queryParamName(paramCode);
            if (paramName == null) {

            }
        } catch (DataAccessException e) {
            e.printStackTrace();

        }
    }
    @Test
    public void Bon3Test() {
        StdCcrQueryServ a =new StdCcrQueryServ();
        String str= JSON.toJSONString(a, SerializerFeature.WriteMapNullValue);
        System.out.println(str);
    }
    @Test
    public void OpenApiTest(){
        Map map=new HashMap();

        OperAttrStruct oper= new OperAttrStruct();
        oper.setLanId(11);
        oper.setOperOrgId(1);
        oper.setOperPost(11);
        oper.setOperServiceId("111");
        oper.setOperTime("sksk");
        oper.setStaffId(11);
        SvcObjectStruct svc =new SvcObjectStruct();
        svc.setDataArea("0531");
        svc.setObjAttr("sksk");
        svc.setObjType("type");
        svc.setObjValue("val");
        map.put("operAttrStruct", oper);
        map.put("svcObjectStruct", svc);
        map.put("billingCycleId", 201803);
        Map<String,String> m=JSON.parseObject(JSON.toJSONString(oper), Map.class);

        System.out.println(JSON.toJSONString(map,SerializerFeature.WriteMapNullValue));
    }
    @Test
    public void DataCheageTest() {
        long prodInstId = 123;
        List<Map<String, Object>> prodInstRouteList = new ArrayList<Map<String, Object>>();
        prodInstRouteList = prodInstRouteMapperDao.selectProdInstRouteId(prodInstId);
    }
}*/
