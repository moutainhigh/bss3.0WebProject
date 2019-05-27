package com.asia.web;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asia.service.DubboServiceImpl;

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
	
	@PostMapping("/test")
	public String searchServInfo(@RequestBody String str,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		acctService.test();
		return null;
	}
}