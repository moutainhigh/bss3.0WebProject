package com.asia.mapper.billmapper;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author WangBaoQiang
 * @ClassName: billInstMappper
 * @description: TODO
 * @date 2019/10/1510:49
 * @Version 1.0
 */
@Repository
public interface BillInstMappper {
    List<Map<String, Object>> selectNpAccNbr(Map map);
    List<Map<String, Object>> selectNewWorkPartner(Map map);
}
