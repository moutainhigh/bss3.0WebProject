package com.asia.mapper.orclmapper;

import com.asia.vo.InfoAccu2Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InfoAccu2ServiceMapper {
    List<InfoAccu2Service> selectInfoAccu2Service(@Param("accNbr") Long accNbr,
                                                  @Param("alarmDate") String alarmDate);

    List<InfoAccu2Service> selectInfoAccu2ServiceByBeginDate(@Param("accNbr") Long accNbr,
                                                  @Param("beginDate") String beginDate,
                                                             @Param("endDate") String endDate     );

}