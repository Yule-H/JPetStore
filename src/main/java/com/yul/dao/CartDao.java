package com.yul.dao;

import java.util.List;

import com.yul.entity.Cart;

public interface CartDao {

	public void addItem(Integer userid, String itemid, int num);

	public List<Cart> findByUserid(Integer userid);

}
