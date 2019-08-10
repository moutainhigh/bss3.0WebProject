package com.asia.web.openApi;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.asia.common.baseObj.Constant;
import com.asia.common.utils.LogUtil;
import com.asia.domain.openApi.InvoiceRes;
import com.asia.domain.openApi.IssueInvoiceRes;
import com.asia.domain.openApi.MonthlyBillRes;
import com.asia.service.impl.openApi.InvoiceServiceImpl;

/**
 * 发票一致性接口
 * ClassName: InvoiceController <br/>
 * date: 2019年4月29日 上午10:40:00 <br/>
 * @author yinyanzhen
 */
@RequestMapping(value="/invoice",produces="application/json;charset=UTF-8")
@RestController
public class InvoiceController{
	@Autowired
	private InvoiceServiceImpl invoiceService;
	/**
	 * monthlyBill:(月结账单查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@GetMapping("/monthlyBill")
	public String monthlyBill(@RequestParam Map<String,String> paraMap,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/openApi/monthlyBill","body>>"+JSON.toJSONString(paraMap)+" header>>"+JSON.toJSONString(headers), this.getClass());
		MonthlyBillRes returnInfo=new MonthlyBillRes();
		try {
			returnInfo=invoiceService.monthlyBill(paraMap, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/openApi/monthlyBill服务调用失败", e, this.getClass());
		}
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * invoice:(发票查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@GetMapping("/invoice")
	public String invoice(@RequestParam Map<String,String> paraMap,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/openApi/invoice","body>>"+JSON.toJSONString(paraMap)+" header>>"+JSON.toJSONString(headers), this.getClass());
		InvoiceRes returnInfo=new InvoiceRes();
		try {
			returnInfo=invoiceService.invoice(paraMap, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/openApi/invoice服务调用失败", e, this.getClass());
		}
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
	}
	
	/**
	 * issueInvoice:(发票开具). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @param response
	 * @return
	 * @since V1.0.0
	 */
	@PostMapping("/issueInvoice")
	public String issueInvoice(@RequestBody String body,
			@RequestHeader Map<String,String> headers,HttpServletResponse response){
		//记录业务日志
		LogUtil.opeLog("/openApi/issueInvoice","body>>"+body+" header>>"+JSON.toJSONString(headers), this.getClass());
		IssueInvoiceRes returnInfo=new IssueInvoiceRes();
		try {
			returnInfo.setResultCode(Constant.ResultCode.OPENAPI_OK);
			
//			returnInfo=invoiceService.issueInvoice(body, headers);
			headers.forEach((key,val)->{response.setHeader(key, val);});
		} catch (Exception e) {
			LogUtil.error("/openApi/issueInvoice服务调用失败", e, this.getClass());
		}
		return JSON.toJSONString(returnInfo,SerializerFeature.WriteMapNullValue);
	}

}