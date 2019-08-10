package com.asia.web;

import com.asia.service.impl.DubboServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 账务Dubbo服务暴漏
 * ClassName: DubboController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2019年4月23日 下午8:33:49 <br/>
 * @author yinyanzhen
 */
@RequestMapping(value="/acct",produces="application/json;charset=UTF-8")
@RestController
public class DubboController{
	@Autowired
	private DubboServiceImpl acctService;
	/*@Autowired
	SystemSwitchService systemSwitchService;*/
	@PostMapping("/test")
	public String searchServInfo(@RequestBody String str,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		acctService.test();
		return null;
	}
	/*@RequestMapping("/test1")
	public String getSystemSwitch (){

		SystemSwitchQuery systemSwitchQuery = new SystemSwitchQuery();
		systemSwitchQuery.setStaffID(1L);
		systemSwitchQuery.setSwitchID(123L);

		SystemSwitchQueryRequest systemSwitchQueryRequest = new SystemSwitchQueryRequest();
		systemSwitchQueryRequest.setSystemSwitchQuery(systemSwitchQuery);

		SystemSwitchQueryResponse systemSwitchQueryResponse = systemSwitchService.getSystemSwitch(systemSwitchQueryRequest);

		return JSON.toJSONString(systemSwitchQueryResponse);
	}*/
}