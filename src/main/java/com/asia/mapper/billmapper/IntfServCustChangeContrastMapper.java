package com.asia.mapper.billmapper;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author WangBaoQiang
 * @ClassName: IntfServCustChangeContrastDao
 * @description: TODO
 * @date 2019/7/309:40
 * @Version 1.0
 */
@Repository
public interface IntfServCustChangeContrastMapper {
   public List<Map<String, Object>> selectIntfServCustChangeContrast(Map map);
}
