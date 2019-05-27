package com.asia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.account.api.SystemSwitchService;
import com.asiainfo.account.model.request.SystemSwitchQueryRequest;

/**
 * 服务调用层,但本处不涉及事务
 * ClassName: DubboServiceImpl <br/>
 * date: 2019年4月23日 下午8:30:30 <br/>
 * @author yinyanzhen
 */
@Service
public class DubboServiceImpl{
	/*@Autowired
    private SystemSwitchService systemSwitchService;*/
	
	public void test(){
		/*SystemSwitchQueryRequest systemSwitchQueryRequest =new SystemSwitchQueryRequest();
		systemSwitchService.getSystemSwitch(systemSwitchQueryRequest);*/
	}
}