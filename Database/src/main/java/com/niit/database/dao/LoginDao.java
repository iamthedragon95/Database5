package com.niit.database.dao;

import com.niit.database.model.Login;

public interface LoginDao {

	boolean checkUser(Login login);
	void saveOrUpadate(Login login);

}
