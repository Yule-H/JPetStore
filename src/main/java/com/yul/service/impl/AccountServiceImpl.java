package com.yul.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yul.dao.AccountDao;
import com.yul.entity.Account;
import com.yul.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;
	@Override
	public Account findByNameAndPwd(String username, String password) {
		return accountDao.findByNameAndPwd(username,password);
	}

}
