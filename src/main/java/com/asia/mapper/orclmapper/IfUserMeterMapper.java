package com.asia.mapper.orclmapper;

import com.asia.vo.IfUserMeter;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface IfUserMeterMapper {
    long selectcountUserMeter(@Param("servId") String servId);
    int deleteIfUserMeter(@Param("servId") String servId);
    int insertIfUserMeter(IfUserMeter record);

}