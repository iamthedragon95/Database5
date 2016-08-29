package com.niit.database.service;

import com.niit.database.model.Login;

public interface LoginService {

	boolean checkUser(Login login);

	void save(Login login);

}
