package com.yul.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.yul.entity.Account;
import com.yul.entity.Cart;
import com.yul.service.CartService;

@ParentPackage("struts-default")
@Namespace("/cart")
@Results(value = { @Result(name = "success", location = "/catalog/Main.jsp"),
		@Result(name = "error", location = "/common/Error.jsp") })
@ExceptionMappings({ @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })
public class CartAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5630156799487028577L;

	@Autowired
	private CartService cartService;
	private List<Cart> cartList;
	private String itemid;
	private Integer inStock;
	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public List<Cart> getCartList() {
		return cartList;
	}

	/**
	 * 显示购物车列表
	 */
	@Action(value = "/cartList", results = { @Result(name = "success", location = "/cart/Cart.jsp"),
			@Result(name = "login", location = "/account/SignonForm.jsp") })
	public String cart() {
		HttpServletRequest request = ServletActionContext.getRequest();
		Account account = (Account) request.getSession().getAttribute(LOGIN);
		if (account == null) {
			return LOGIN;
		}
		cartList = cartService.findByUserid(account.getUserid());
		return SUCCESS;
	}

	/**
	 * 添加到购物车
	 */
	@Action(value = "/cartAdd", results = {
			@Result(name = "success", location = "/cart/cartList.action", type = "redirectAction"),
			@Result(name = "login", location = "/account/SignonForm.jsp") })
	public String cartAdd() {
		HttpServletRequest request = ServletActionContext.getRequest();
		Account account = (Account) request.getSession().getAttribute(LOGIN);
		if (account == null) {
			return LOGIN;
		}
		cartList = cartService.findByUserid(account.getUserid());
		if (cartList == null) {
			cartService.addItem(account.getUserid(), itemid, 1);
		} else {
			cartService.updateItem(account.getUserid(), itemid, 1);
		}
		return SUCCESS;
	}

	@Action(value = "/cartUpdate", results = {
			@Result(name = "success", location = "/cart/cartList.action", type = "redirectAction"),
			@Result(name = "login", location = "/account/SignonForm.jsp") })
	public String cartUpdate() {
		HttpServletRequest request = ServletActionContext.getRequest();
		Account account = (Account) request.getSession().getAttribute(LOGIN);
		if (account == null) {
			return LOGIN;
		}
		cartService.addItem(account.getUserid(), itemid, inStock);
		return SUCCESS;
	}

	/**
	 * 结算
	 */
	@Action(value = "/checkout", results = { @Result(name = "success", location = "/cart/Checkout.jsp") })
	public String checkout() {
		return SUCCESS;
	}

	public Integer getInStock() {
		return inStock;
	}

	public void setInStock(Integer inStock) {
		this.inStock = inStock;
	}
}
