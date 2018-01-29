package com.yul.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yul.dao.ItemDao;
import com.yul.entity.Item;
import com.yul.entity.Product;

@SuppressWarnings("unchecked")
@Repository
public class ItemDaoImpl implements ItemDao {
	@Autowired
	private SessionFactory sessionFactory;
	/**
	 * 获取商品列表
	 */
	@Override
	public List<Item> list() {
		Session session = sessionFactory.openSession();
		List<Item> list = session.createQuery("from Item").list();
		session.close();
		return list;
	}

	@Override
	public List<Product> prodList(String cate) {
		Session session = sessionFactory.openSession();
		List<Product> list = session.createQuery("from Product where category = ?").setParameter(0,cate).list();
		session.close();
		return list;
	}

	@Override
	public Item findItemById(String itemid) {
		Session session = sessionFactory.openSession();
		String hql = "from Item where itemid = ?";
		List<Item> list = session.createQuery(hql).setParameter(0, itemid).list();
		session.close();
		return list.get(0);
	}

	@Override
	public List<Item> findItemByProductId(String productid) {
		Session session = sessionFactory.openSession();
		List<Item> list = session.createQuery("from Item where productid = ?").setParameter(0, productid).list();
		session.close();
		return list;
	}
}
