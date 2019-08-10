package com.asia.mapper.ordmapper;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ProdInstRouteMapper {
  public List<Map<String, Object>> selectProdInstRouteId(Long prodInstId);

}