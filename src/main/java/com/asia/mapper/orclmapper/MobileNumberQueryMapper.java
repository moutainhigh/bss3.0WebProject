package com.asia.mapper.orclmapper;

import com.asia.vo.UmpSmsInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MobileNumberQueryMapper {
    String moBileNumberQuery(@Param("accNbr") String accNbr);
}