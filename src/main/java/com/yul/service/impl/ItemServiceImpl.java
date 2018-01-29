package com.yul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yul.dao.ItemDao;
import com.yul.entity.Item;
import com.yul.entity.Product;
import com.yul.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao itemDao;
	@Override
	public List<Item> list() {
		return itemDao.list();
	}
	@Override
	public List<Product> prodList(String cate) {
		return itemDao.prodList(cate);
	}
	@Override
	public Item findItemById(String itemid) {
		return itemDao.findItemById(itemid);
	}
	@Override
	public List<Item> findItemByProductId(String productid) {
		return itemDao.findItemByProductId(productid);
	}
	
}
