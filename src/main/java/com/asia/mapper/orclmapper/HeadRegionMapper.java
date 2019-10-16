package com.asia.mapper.orclmapper;

import java.util.List;
import java.util.Map;

/**
 * @author WangBaoQiang
 * @ClassName: HeadRegionMapper
 * @description: TODO
 * @date 2019/10/1521:47
 * @Version 1.0
 */
public interface HeadRegionMapper {
    List<Map<String, Object>> selectHeadRegion(Map map);
}
