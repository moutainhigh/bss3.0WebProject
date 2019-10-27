package com.asia.mapper.orclmapper;

import com.asia.vo.Info3mExeFee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author WangBaoQiang
 * @ClassName: Info3mExeFeeMapper
 * @description: TODO
 * @date 2019/8/69:28
 * @Version 1.0
 */
@Repository
public interface Info3mExeFeeMapper {
    List<Info3mExeFee> selectInfoHighFeeByBeginDate(@Param("accNbr") String accNbr,
                                                    @Param("beginDate") String beginDate,
                                                    @Param("endDate") String endDate);
    List<Info3mExeFee> selectInfo3MExeFee(@Param("accNbr") String accNbr,
                                          @Param("alarmDate") String alarmDate);
    List<Map<String, Object>> selectInfo3MExeFeeTest(@Param("accNbr") String accNbr,
                                                     @Param("alarmDate") String alarmDate);
}
