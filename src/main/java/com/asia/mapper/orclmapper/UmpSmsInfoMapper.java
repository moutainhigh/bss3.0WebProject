package com.asia.mapper.orclmapper;

import com.asia.vo.UmpSmsInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UmpSmsInfoMapper {
    List<UmpSmsInfo> selectUmpSmsInfo(@Param("accNbr") Long accNbr,
                                      @Param("beginDate") String beginDate,
                                      @Param("endDate") String endDate);
}