package com.yhw.service;

import com.yhw.common.model.YhwProduct;
import com.jfinal.plugin.activerecord.Page;

/**
 *
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * 
 * BlogService
 * 所有 sql 与业务逻辑写在 Service 中，不要放在 Model 中，更不
 * 要放在 Controller 中，养成好习惯，有利于大型项目的开发与维护
 */
public class YhwProductService {
	
	/**
	 * 线程安全的 Service 可以开放一个 static me 变量，方便随处使用
	 * 如果要使用业务层 AOP，可以使用如下代码代替 new 创建：
	 * Enhancer.enhance(BlogService.class);
	 */
	public static final YhwProductService me = new YhwProductService();
	
	/**
	 * 所有的 dao 对象也放在 Service 中，并且声明为 private，避免 sql 满天飞
	 * sql 只放在业务层，或者放在外部 sql 模板，用模板引擎管理：
	 * 			http://www.jfinal.com/doc/5-13
	 */
	private YhwProduct dao = new YhwProduct().dao();
	
	public Page<YhwProduct> paginate(int pageNumber, int pageSize) {
		return dao.paginate(pageNumber, pageSize, "select *", "from yhw_product order by id asc");
	}
	
	public YhwProduct findById(int id) {
		return dao.findById(id);
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
}
