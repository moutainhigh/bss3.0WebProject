package com.asia.mapper.orclmapper;

import com.asia.vo.BussihallChargeRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface BussihallChargeRecordMapper {
    long getCntFromOtherPaymentId(@Param("otherPayMentId") String otherPayMentId,
                                  @Param("busiCode") String busiCode);

    int insertBussihallChargeRecord(BussihallChargeRecord record);

    int updateBussihallChargeRecord(BussihallChargeRecord record);

}