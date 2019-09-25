package com.asia.mapper.orclmapper;

import com.asia.vo.InfoAccu5gUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InfoAccu5gUserMapper {
    List<InfoAccu5gUser> selectInfoAccu5gUser(@Param("accNbr") Long accNbr,
                                              @Param("alarmDate") String alarmDate);
    List<InfoAccu5gUser> selectInfoAccu5gUserByBeginDate(@Param("accNbr") Long accNbr,
                                              @Param("beginDate") String beginDate,
                                                         @Param("endDate") String endDate);
}