package com.yul.service;

import com.yul.entity.Account;

public interface AccountService {

	public Account findByNameAndPwd(String username, String password);
	
}
