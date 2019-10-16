package com.asia.dao;

import com.asia.mapper.billmapper.BillInstMappper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author WangBaoQiang
 * @ClassName: userByPhoneQueryServiceDao
 * @description: TODO
 * @date 2019/8/1013:57
 * @Version 1.0
 */
@Repository
public class userByPhoneQueryServiceDao {
    @Autowired
    BillInstMappper billInstMappperDao;

}
