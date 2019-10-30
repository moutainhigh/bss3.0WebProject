package com.asia.mapper.billingmapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
public interface AReturnRuleInstanceMapper {
    String queryAReturnRuleInstance(@Param("acct_id") String acct_id,
                                          @Param("return_rule_id") String return_rule_id);

}