package com.niit.music.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.music.dao.RegisterDAO;
import com.niit.music.model.Newuser;



@Service
@Transactional
public class RegisterServiceImpl implements RegisterService{
	@Autowired
	RegisterDAO registerDAO;
	
	

	@Override
	public void s(Newuser newuser) {
		// TODO Auto-generated method stub
		registerDAO.sa(newuser);
	}

}