package com.asia.mapper.orclmapper;

import com.asia.vo.InfoNoAccu2Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InfoNoAccu2ServiceMapper {
    List<InfoNoAccu2Service> selectInfoNoAccu2Service(@Param("accNbr") Long accNbr,
                                                @Param("alarmDate") String alarmDate);
    List<InfoNoAccu2Service> selectInfoNoAccu2ServiceByBeginDate(@Param("accNbr") Long accNbr,
                                                                 @Param("beginDate") String beginDate,
                                                                 @Param("endDate") String endDate);
}