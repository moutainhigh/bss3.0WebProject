package com.asia.mapper.orclmapper;

import com.asia.vo.VcChargeRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface VcChargeRecordMapper {
    long getCntFromOtherPaymentId(@Param("otherPayMentId") long otherPayMentId,
                                  @Param("busiCode") String busiCode);
    int insertVcChargeRecord(VcChargeRecord record);

    int updateVcChargeRecord(VcChargeRecord record);
  }