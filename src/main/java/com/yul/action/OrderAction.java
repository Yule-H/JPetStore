package com.yul.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("struts-default")
@Namespace("/order")
@Results({ @Result(name = "success", location = "/catalog/Main.jsp"),
		@Result(name = "error", location = "/common/Error.jsp") })
@ExceptionMappings({ @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })
public class OrderAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8164397767113059L;

	/**
	 * 创建订单
	 */
	@Action(value = "/newOrder", results = { @Result(name = "success", location = "/order/NewOrderForm.jsp") })
	public String newOrder() {
		return SUCCESS;
	}
	
	/**
	 * 查看订单
	 */
	@Action(value = "/view", results = { @Result(name = "success", location = "/order/ViewOrder.jsp") })
	public String view() {
		return SUCCESS;
	}
}
