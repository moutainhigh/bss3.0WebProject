package com.asia.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author WangBaoQiang
 * @ClassName: acctApiUrl
 * @description: TODO
 * @date 2019/9/1520:54
 * @Version 1.0
 */
@Configuration
@PropertySource("classpath:config/systemConfig.properties")
public class SystemConfig {
    @Value("${system.kefu.id}")
    private String kfId;
    @Value("${system.kefu.staff}")
    private String kfStaff;
    @Value("${system.vc.id}")
    private String vcId;
    @Value("${system.vc.staff}")
    private String vcStaff;
    @Value("${system.vc.balanceType}")
    private String vcBalanceType;
    @Value("${system.crm.id}")
    private String crmId;
    @Value("${system.crm.balanceType}")
    private String crmBalanceType;
    @Value("${system.st.id}")
    private String stId;

    public String getKfId(){ return kfId;}
    public String getKfStaff(){ return kfStaff;}
    public String getVcId(){ return vcId;}
    public String getVcBalanceType(){ return vcBalanceType;}
    public String getCrmId(){ return crmId;}
    public String getVcStaff(){ return vcStaff;}
    public String getCrmBalanceType(){return crmBalanceType;}
    public String getStId(){return stId;}
}
