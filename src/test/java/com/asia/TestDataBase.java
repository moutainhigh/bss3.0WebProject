package com.asia;

import com.asia.mapper.billmapper.IntfServCustChangeContrastMapper;
import com.asia.mapper.orclmapper.Info3mExeFeeMapper;
import com.asia.mapper.orclmapper.InfoOverAccuFeeMapper;
import com.asia.vo.Info3mExeFee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author WangBaoQiang
 * @ClassName: TestDataBase
 * @description: TODO
 * @date 2019/8/815:03
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDataBase {
    @Autowired
    private Info3mExeFeeMapper info3mExeFeeMapperDao;
    @Autowired
    private IntfServCustChangeContrastMapper intfServCustChangeContrastMapperDao;
    @Autowired
    private InfoOverAccuFeeMapper infoOverAccuFeeMapperDao;
    @Test
    public void Test() {
        String accNum = "13351501158";
       List<Map<String,Object>> info3mExeFeeList= info3mExeFeeMapperDao.selectInfo3MExeFeeTest(accNum,"201711");
        if (info3mExeFeeList.size() > 0) {
        }

    }

    @Test
    public void TestMysql() {
        Map map = new HashMap();
        map.put("servId", "313048290105");
        List<Map<String,Object>> Tetslist = intfServCustChangeContrastMapperDao.selectIntfServCustChangeContrast(map);
    }
    @Test
    public void TestOracle() {
        String accNum = "13351501158";
        List<Info3mExeFee> info3mExeFeeList= info3mExeFeeMapperDao.selectInfo3MExeFee(Long.parseLong(accNum),"201711");
        if (info3mExeFeeList.size() > 0) {
        }

    }

    @Test
    public void TestDymTable() {
        String servId = "12312";
        String tableName = "mobile_call_event_0431_11707";
       List<Map<String, Object>> infoOverList=  infoOverAccuFeeMapperDao.selectMobileDataEvent(servId,tableName);
    }
}
