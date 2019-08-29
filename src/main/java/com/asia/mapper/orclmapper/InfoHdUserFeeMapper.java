package com.asia.mapper.orclmapper;

import com.asia.vo.InfoHdUserFee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InfoHdUserFeeMapper {
    List<InfoHdUserFee> selectInfoHdUserFee(@Param("prodId") String prodId);

    }