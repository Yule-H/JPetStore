package com.yul.service;

import java.util.List;

import com.yul.entity.Item;
import com.yul.entity.Product;

public interface ItemService {
	public List<Item> list();

	public List<Product> prodList(String cate);

	public Item findItemById(String itemid);

	public List<Item> findItemByProductId(String productid);

}
