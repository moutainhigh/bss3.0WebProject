package com.asia.service.openApi;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.asia.common.baseObj.Constant;
import com.asia.common.utils.HttpUtil;
import com.asia.common.utils.HttpUtil.HttpResult;
import com.asia.domain.openApi.InvoiceRes;
import com.asia.domain.openApi.InvoiceRes.Invoice;
import com.asia.domain.openApi.IssueInvoiceRes;
import com.asia.domain.openApi.MonthlyBillRes;
import com.asia.domain.openApi.MonthlyBillRes.MonthlyBill;

/**
 * 服务调用层,但本处不涉及事务
 * ClassName: OpenAPIServiceImpl <br/>
 * date: 2019年4月23日 下午8:29:42 <br/>
 * @author yinyanzhen
 */
@Service
public class InvoiceServiceImpl{
	/**
	 * monthlyBill:(月结账单查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @return
	 * @since V1.0.0
	 */
	public MonthlyBillRes monthlyBill(Map<String,String> paraMap,Map<String,String> headers) 
			throws ClientProtocolException, IOException, URISyntaxException{
		HttpResult result = HttpUtil.doGet(Constant.OpenApiInvoice.monthlyBill, paraMap, headers); 
		MonthlyBillRes monthlyBillRes =new MonthlyBillRes();
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			monthlyBillRes.setResultCode(Constant.ResultCode.OPENAPI_OK);
			monthlyBillRes.setMonthlyBills(JSON.parseArray(result.getData(), MonthlyBill.class));
		}else{
			monthlyBillRes.setResultCode(Constant.ResultCode.ERROR);
		}
		return monthlyBillRes;
	}
	
	/**
	 * invoice:(发票信息查询). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @return
	 * @since V1.0.0
	 */
	public InvoiceRes invoice(Map<String,String> paraMap,Map<String,String> headers) 
			throws ClientProtocolException, IOException, URISyntaxException{
		HttpResult result = HttpUtil.doGet(Constant.OpenApiInvoice.invoice, paraMap, headers); 
		InvoiceRes invoiceRes = new InvoiceRes();
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			invoiceRes.setResultCode(Constant.ResultCode.OPENAPI_OK);
			invoiceRes.setInvoice(JSON.parseObject(result.getData(), Invoice.class));
		}else{
			invoiceRes.setResultCode(Constant.ResultCode.ERROR);
		}
		return  invoiceRes;
	}
	
	/**
	 * issueInvoice:(发票开具接口). <br/>
	 * @author yinyanzhen
	 * @param body
	 * @param headers
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @since V1.0.0
	 */
	public IssueInvoiceRes issueInvoice(String body,Map<String,String> headers) 
			throws ClientProtocolException, IOException{
		IssueInvoiceRes issueInvoiceRes = new IssueInvoiceRes();
		HttpResult result = HttpUtil.doPostJson(Constant.OpenApiInvoice.issueInvoice, body, headers);
		//状态码为请求成功
		if(result.getCode() == HttpStatus.SC_OK){
			headers.clear();
			headers.putAll(result.getHeaders());
			issueInvoiceRes.setResultCode(Constant.ResultCode.OPENAPI_OK);
		}else{
			issueInvoiceRes.setResultCode(Constant.ResultCode.ERROR);
		}
		return issueInvoiceRes;
	}
}