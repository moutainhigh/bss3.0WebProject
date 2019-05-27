package com.asia.domain.bon3_drop;

import java.util.ArrayList;
import java.util.List;

import com.asia.common.baseObj.BaseBonResDomain;
import com.asia.common.baseObj.BaseDomain;
import com.asia.domain.bon3_drop.child.ProductOffInfo;

/**
 * 
 * ClassName: StdCcaUserResourceQueryDetail <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2019年4月24日 下午1:46:21 <br/>
 * @author yinyanzhen
 */
@Deprecated
public class StdCcaUserResourceQueryDetail extends BaseBonResDomain {
	/*public static void main(String[] args) {
		StdCcaUserResourceQueryDetail a = new StdCcaUserResourceQueryDetail();
		System.out.println(a.toString());
	}*/
	private static final long serialVersionUID = -4092083235689168366L;
	private Bon3StdCcaUserResourceQueryDetail stdCcaUserResourceQueryDetail = new Bon3StdCcaUserResourceQueryDetail();
	
	public Bon3StdCcaUserResourceQueryDetail getStdCcaUserResourceQueryDetail() {
		return stdCcaUserResourceQueryDetail;
	}

	public void setStdCcaUserResourceQueryDetail(Bon3StdCcaUserResourceQueryDetail stdCcaUserResourceQueryDetail) {
		this.stdCcaUserResourceQueryDetail = stdCcaUserResourceQueryDetail;
	}

	/**
	 * 内部类
	 * ClassName: Bon3StdCcaUserResourceQueryDetail <br/>
	 * date: 2019年4月24日 下午1:46:33 <br/>
	 * @author yinyanzhen
	 */
	public static class Bon3StdCcaUserResourceQueryDetail extends BaseDomain {
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