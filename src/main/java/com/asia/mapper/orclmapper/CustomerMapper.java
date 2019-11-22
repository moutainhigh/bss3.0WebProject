package com.asia.mapper.orclmapper;

import com.asia.vo.BussihallChargeRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {
    String queryCustNameByCustId(@Param("custId") String custId);

}