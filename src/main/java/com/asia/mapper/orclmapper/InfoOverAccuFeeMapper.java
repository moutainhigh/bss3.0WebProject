package com.asia.mapper.orclmapper;


import com.asia.vo.BillingCycle;
import com.asia.vo.ProdInst;
import com.asia.vo.ProdInstRegion;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface InfoOverAccuFeeMapper {
    List<BillingCycle> selectBillingCyle(@Param("Month") String queryMonth);
    List<Map<String, Object>> selectMobileDataEvent(@Param("servId") String servId,
                                                    @Param("tableName") String tableName);
    List<ProdInst> selectProdInst(@Param("accNum") long accNum);
    List<ProdInstRegion> selectProdInstRegion(@Param("prodInstId") long prodInstId);

}
