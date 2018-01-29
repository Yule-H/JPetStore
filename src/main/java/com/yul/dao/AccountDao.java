package com.yul.dao;

import com.yul.entity.Account;

public interface AccountDao {

	public Account findByNameAndPwd(String username, String password);

}
