package com.asia.mapper.orclmapper;

import com.asia.vo.RemindKdRemain;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RemindKdRemainMapper {
    List<RemindKdRemain> selectRemindKdRemain(@Param("accNbr") String accNbr,
                                              @Param("beginDate") String beginDate,
                                              @Param("endDate") String endDate);

    List<RemindKdRemain> selectRemindKdRemainByMonth(@Param("accNbr") String accNbr,
                                                      @Param("alarmDate") String alarmDate);
}