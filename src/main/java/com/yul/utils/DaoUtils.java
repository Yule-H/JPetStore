package com.yul.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DaoUtils {

	@Autowired
	private static SessionFactory sessionFactory;

	public static Session getSession() {
		return sessionFactory.openSession();
	}
}
