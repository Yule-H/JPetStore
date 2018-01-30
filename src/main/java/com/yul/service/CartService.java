package com.yul.service;

import java.util.List;

import com.yul.entity.Cart;

public interface CartService {

	public void addItem(Integer integer, String itemid, int i);

	public List<Cart> findByUserid(Integer userid);

	public void updateItem(Integer userid, String itemid, int i);

	public Double totleMoney(Integer userid);

	public void deleteByUserid(Integer userid);

	public void delete(Integer userid, String itemid);
	
}
