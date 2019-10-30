package com.asia.mapper.billingmapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ABestPayReturnInfoDetailMapper {
    String queryTotalSubsidies(@Param("bestPayReturnId") String bestPayReturnId);

    String queryRealPerformMonth(@Param("bestPayReturnId") String bestPayReturnId);

}