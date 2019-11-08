package com.asia.mapper.orclmapper;

import com.asia.vo.CreditFeeRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface QueryWingPaymentRedPackMapper {
    public List<Map<String,Object>> QueryWingPaymentRedPack(@Param("servId") String servId);
}