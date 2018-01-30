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

	@Override
	public void updateItem(Integer userid, String itemid, int i) {
		Cart cart = cartDao.findByIds(userid,itemid);
		i += cart.getAmount();
		cartDao.addItem(userid, itemid, i);
	}

	@Override
	public Double totleMoney(Integer userid) {
		List<Cart> cartList = cartDao.findByUserid(userid);
		Double totle = 0.0;
		for (Cart cart : cartList) {
			totle += cart.getAmount()*cart.getCartKey().getItem().getListprice();
		}
		System.out.println(totle);
		return totle;
	}

	@Override
	public void deleteByUserid(Integer userid) {
		List<Cart> cartList = cartDao.findByUserid(userid);
		for (Cart cart : cartList) {
			cartDao.delete(cart);
		}
	}

	@Override
	public void delete(Integer userid, String itemid) {
		Cart cart = cartDao.findByIds(userid, itemid);
		cartDao.delete(cart);
	}

}
