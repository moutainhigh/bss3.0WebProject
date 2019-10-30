package com.asia.mapper.orclmapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Map;

@Repository
public interface NfoHDUserFeeMapper {
    String queryTotalConsumed(@Param("servId") String servId);

}