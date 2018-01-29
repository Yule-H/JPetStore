package com.yul.action;

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

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yul.entity.Account;
import com.yul.service.AccountService;

@ParentPackage("struts-default")
@Namespace("/account")
@Results({ @Result(name = "success", location = "/catalog/Main.jsp"),
		@Result(name = "error", location = "/common/Error.jsp") })
@ExceptionMappings({ @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })
public class AccountAction extends ActionSupport implements ModelDriven<Account> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4020587073231048937L;

	@Autowired
	private AccountService accountService;

	private Account account = new Account();

	/**
	 * 跳转至登录
	 */
	@Action(value = "/tologin", results = { @Result(name = "success", location = "/account/SignonForm.jsp") })
	public String tologin() {

		return SUCCESS;
	}

	/**
	 * 登录
	 */
	@Action(value = "/login", results = { @Result(name = "success", location = "/catalog/Main.jsp") })
	public String login() {
		System.out.println();
		if (account != null) {
			Account loginAccount = accountService.findByNameAndPwd(account.getUsername(), account.getPassword());
			if (loginAccount != null) {
				HttpServletRequest request = ServletActionContext.getRequest();
				request.getSession().setAttribute("login", loginAccount);
				return SUCCESS;
			}
		}
		return ERROR;
	}

	/**
	 * 登出
	 */
	@Action(value = "/logout", results = { @Result(name = "success", location = "/catalog/Main.jsp") })
	public String logout() {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().invalidate();
		return SUCCESS;
	}
	/**
	 * 编辑
	 */
	@Action(value = "/edit", results = { @Result(name = "success", location = "/account/EditAccountForm.jsp") })
	public String edit() {
		return SUCCESS;
	}

	/**
	 * 注册
	 */
	@Action(value = "/register", results = { @Result(name = "success", location = "/account/NewAccountForm.jsp") })
	public String register() {
		return SUCCESS;
	}

	@Override
	public Account getModel() {
		return account;
	}

}
