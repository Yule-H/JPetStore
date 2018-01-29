package com.yul.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yul.dao.CartDao;
import com.yul.entity.Account;
import com.yul.entity.Cart;
import com.yul.entity.CartKey;
import com.yul.entity.Item;

@Repository
@SuppressWarnings("unchecked")
public class CartDaoImpl implements CartDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addItem(Integer userid, String itemid, int num) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Cart cart = new Cart();
		CartKey cartKey = new CartKey();
		cartKey.setAccount((Account) session.createQuery("from Account where userid=?").setParameter(0, userid).list().get(0));
		cartKey.setItem((Item) session.createQuery("from Item where itemid=?").setParameter(0, itemid).list().get(0));
		cart.setCartKey(cartKey);
		cart.setAmount(num);
		session.saveOrUpdate(cart);
		tx.commit();
		session.close();
	}

	@Override
	public List<Cart> findByUserid(Integer userid) {
		Session session = sessionFactory.openSession();
		List<Cart> cartList = session.createQuery("from Cart where userid=?").setParameter(0, userid).list();
		return cartList;
	}

}
