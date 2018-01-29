package com.yul.dao;

import java.util.List;

import com.yul.entity.Item;
import com.yul.entity.Product;

public interface ItemDao {

	/**
	 * 获取商品列表 
	 */
	public List<Item> list();

	public List<Product> prodList(String cate);

	public Item findItemById(String itemid);

	public List<Item> findItemByProductId(String productid);

}
