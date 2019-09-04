package com.asia.mapper.orclmapper;

import com.asia.vo.CreditFeeRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface CreditFeeRecordMapper {
    long getCntFromOtherPaymentId(@Param("otherPaymentId") long ohterPaymentId,
                                  @Param("busiCode") String busiCode);
    int insertCreditFeeRecord(CreditFeeRecord record);
}