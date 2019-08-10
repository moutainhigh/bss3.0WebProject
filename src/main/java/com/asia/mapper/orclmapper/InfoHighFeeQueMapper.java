package com.asia.mapper.orclmapper;

import com.asia.vo.InfoHighFeeQue;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author WangBaoQiang
 * @ClassName: InfoHighFeeQueMapper
 * @description: TODO
 * @date 2019/8/820:00
 * @Version 1.0
 */
@Repository
public interface  InfoHighFeeQueMapper {
    List<InfoHighFeeQue> selectInfoHighFee(@Param("accNbr") Long accNbr,
                                          @Param("alarmDate") String alarmDate);
}
