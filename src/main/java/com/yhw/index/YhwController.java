package com.yhw.index;

import com.yhw.common.model.YhwProduct;
import com.yhw.service.YhwProductService;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

/**
 *
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * 
 * YhwController
 */
public class YhwController extends Controller {
	YhwProductService service = YhwProductService.me;

	public void index() {
		render("index.html");
	}





	// 我的参标商后台页面

	public void mybidder() {
		String webPath = getPara("webPath", "exBidRegister/bidderRegistList");

		setAttr("curWebPage",webPath);

	//	render("nav.html");
		renderJsp("nav.html");
	}


	// 投标人报名项目列表

	public void bidderRegistList() {



	}
	// 投标人产品信息列表
	public void bidderProductList() {
		Page<YhwProduct> paginate = service.paginate(getParaToInt(0, 1), 10);
		System.err.println("paginate:"+paginate);

		setAttr("productPage",paginate );
		renderJsp("/yhw/bidderProductList.jsp");

	}
	// 投标人我的公司信息

	public void bidderCompanyInfo() {

	}
}



