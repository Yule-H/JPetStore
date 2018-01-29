package com.yul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yul.dao.CartDao;
import com.yul.entity.Cart;
import com.yul.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDao cartDao;
	
	@Override
	public void addItem(Integer userid, String itemid, int num) {
		cartDao.addItem(userid,itemid,num);
	}

	@Override
	public List<Cart> findByUserid(Integer userid) {
		return cartDao.findByUserid(userid);
	}

}
