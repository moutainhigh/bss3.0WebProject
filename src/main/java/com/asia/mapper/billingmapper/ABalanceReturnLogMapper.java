package com.asia.mapper.billingmapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ABalanceReturnLogMapper {
    String queryTotalSubsidies(@Param("instance_id") String instance_id);

    String queryRealPerformMonth(@Param("instance_id") String instance_id);

}