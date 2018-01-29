package com.yul.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yul.dao.AccountDao;
import com.yul.entity.Account;

@SuppressWarnings("unchecked")
@Repository
public class AccountDaoImpl implements AccountDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public Account findByNameAndPwd(String username, String password) {
		Session session = sessionFactory.openSession();
		List<Account> accountList = session.createQuery("from Account where username=? and password=?").setParameter(0, username).setParameter(1, password).list();
		session.close();
		return accountList.get(0);
	}

}
