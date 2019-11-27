package com.asia.mapper.cpcpmapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface POfferPayPlanInfoMapper {
    List<Map<String,Object>> queryPOfferPayPlanInfo(@Param("offer_id") String offer_id);

    List<Map<String,Object>> selectPOfferPayPlanInfo(@Param("offer_id") String offer_id);

}