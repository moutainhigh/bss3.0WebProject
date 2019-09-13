package com.asia.mapper.orclmapper;

import com.asia.vo.BussihallChargeRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface BussihallChargeRecordMapper {
    long getCntFromOtherPaymentId(@Param("otherPaymentId") long otherPaymentId,
                                  @Param("busiCode") String busiCode);

    int insertBussihallChargeRecord(BussihallChargeRecord record);

}