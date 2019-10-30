package com.asia.mapper.billingmapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ABestPayReturnInfoMapper {
    String queryBestPayReturnId(@Param("acct_id") String acct_id,
                                @Param("returnRoleId") String returnRoleId,
                                @Param("accNbr") String accNbr);

}