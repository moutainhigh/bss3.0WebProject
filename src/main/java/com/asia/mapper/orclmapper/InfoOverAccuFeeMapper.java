package com.asia.mapper.orclmapper;


import com.asia.vo.BillingCycle;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface InfoOverAccuFeeMapper {
    List<BillingCycle> selectBillingCyle(@Param("queryMonth") String queryMonth);
    List<Map<String, Object>> selectMobileDataEvent(@Param("servId") String servId,
                                                    @Param("tableName") String tableName);
    List<BillingCycle> selectBillingCyleFromCyleId(@Param("billingCycleId") String billingCycleId);

}
