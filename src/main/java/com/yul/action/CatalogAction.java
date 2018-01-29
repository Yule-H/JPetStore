package com.yul.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.yul.entity.Item;
import com.yul.entity.Product;
import com.yul.service.ItemService;

@ParentPackage("struts-default")
@Namespace("/catalog")
@Results({ @Result(name = "success", location = "/catalog/Main.jsp"),
		@Result(name = "error", location = "/common/Error.jsp") })
@ExceptionMappings({ @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })
public class CatalogAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7278570356718951849L;

	@Autowired
	private ItemService itemService;

	private List<Item> itemList;
	private Item item;
	private List<Product> prodList;
	private String cate;
	private String itemid;
	private String id;

	/**
	 * 显示主页
	 */
	@Action(value = "/main", results = { @Result(name = "success", location = "/catalog/Main.jsp") })
	public String main() {
		return SUCCESS;
	}

	/**
	 * 显示产品列表
	 */
	@Action(value = "/list", results = { @Result(name = "success", location = "/catalog/Category.jsp") })
	public String list() {
		prodList = itemService.prodList(cate);
		return SUCCESS;
	}

	/**
	 * 进入商品购买页面
	 */
	@Action(value = "/prod", results = { @Result(name = "success", location = "/catalog/Product.jsp") })
	public String prod() {
		itemList = itemService.findItemByProductId(id);
		return SUCCESS;
	}

	/**
	 * 显示商品详情
	 */
	@Action(value = "/item", results = { @Result(name = "success", location = "/catalog/Item.jsp") })
	public String item() {
		item = itemService.findItemById(itemid);
		return SUCCESS;
	}

	public String getCate() {
		return cate;
	}

	public void setCate(String cate) {
		this.cate = cate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public List<Product> getProdList() {
		return prodList;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
}
