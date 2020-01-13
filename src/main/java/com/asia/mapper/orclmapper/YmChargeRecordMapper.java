package com.asia.mapper.orclmapper;

import com.asia.vo.YmChargeRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface YmChargeRecordMapper {
    long getCntFromOtherPaymentId(@Param("otherPayMentId") String otherPayMentId,
                                  @Param("busiCode") String busiCode);
    int insertYmChargeRecord(YmChargeRecord record);

    int updateYmChargeRecord(YmChargeRecord record);

    int insertItemChargeOrder(Map map);

    List<Map<String, Object>> getAcctIdFromAcctCd(@Param("acctCd") String acctCd);
  }