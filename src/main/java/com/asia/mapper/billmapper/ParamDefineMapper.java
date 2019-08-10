package com.asia.mapper.billmapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
//@TargetDataSource("ds1")
public interface ParamDefineMapper {
   public String queryParamName(@Param("ids") String paramCode);
}
