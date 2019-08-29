package com.asia.domain.bon3;

import java.util.ArrayList;
import java.util.List;

import com.asia.common.baseObj.BaseBonResDomain;
import com.asia.common.baseObj.BaseDomain;
import com.asia.domain.bon3.child.ProductOffInfo;
/**
 * 
 * ClassName: stdCcaUserResourceQuery <br/>
 * date: 2019年4月24日 上午11:23:16 <br/>
 * @author yinyanzhen
 */
@Deprecated
public class StdCcaUserResourceQuery extends BaseBonResDomain{
	/*public static void main(String[] args) {
		StdCcaUserResourceQuery a = new StdCcaUserResourceQuery();
		System.out.println(a.toString());
	}*/
	private static final long serialVersionUID = 1913261985601095344L;
	//
	private Bon3StdCcaUserResourceQuery stdCcaUserResourceQuery = new Bon3StdCcaUserResourceQuery();
	
	public Bon3StdCcaUserResourceQuery getStdCcaUserResourceQuery() {
		return stdCcaUserResourceQuery;
	}

	public void setStdCcaUserResourceQuery(Bon3StdCcaUserResourceQuery stdCcaUserResourceQuery) {
		this.stdCcaUserResourceQuery = stdCcaUserResourceQuery;
	}

	/**
	 * 内部类
	 * ClassName: Bon3StdCcaUserResourceQuery <br/>
	 * date: 2019年4月24日 上午11:22:56 <br/>
	 * @author yinyanzhen
	 */
	public static class Bon3StdCcaUserResourceQuery extends BaseDomain{
		private static final long serialVersionUID = 1L;
		private List<ProductOffInfo> productOffInfo = new ArrayList<>();
		
		public List<ProductOffInfo> getProductOffInfo() {
			return productOffInfo;
		}

		public void setProductOffInfo(List<ProductOffInfo> productOffInfo) {
			this.productOffInfo = productOffInfo;
		}
	}
}