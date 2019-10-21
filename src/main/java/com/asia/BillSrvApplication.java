package com.asia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class})
@ServletComponentScan
//@MapperScan("com.asia.mapper")
//@Import({DynamicDataSourceRegister.class})
@ImportResource("classpath:application-dubbo.xml")//不调试dubbo服务时,可以注释掉,避免ZK找不到注册地址报错
public class BillSrvApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillSrvApplication.class, args);
	}

}
