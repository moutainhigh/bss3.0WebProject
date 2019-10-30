package com.asia.mapper.orclmapper;

import com.asia.vo.TerminalChargeRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface TerminalChargeRecordMapper {
    long getCntFromOtherPaymentId(@Param("otherPayMentId") String otherPayMentId,
                                  @Param("busiCode") String busiCode);

    int insertTerminalChargeRecord(TerminalChargeRecord record);

    int updateTerminalChargeRecord(TerminalChargeRecord record);

}