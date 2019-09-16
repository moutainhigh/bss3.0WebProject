package com.asia.mapper.orclmapper;

import com.asia.vo.TerminalChargeRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface TerminalChargeRecordMapper {
    long getCntFromOtherPaymentId(@Param("otherPaymentId") long ohterPaymentId,
                                  @Param("busiCode") String busiCode);

    int insertTerminalChargeRecord(TerminalChargeRecord record);

    int updateTerminalChargeRecord(TerminalChargeRecord record);

}