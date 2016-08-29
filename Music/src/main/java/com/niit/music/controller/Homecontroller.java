package com.niit.music.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.music.model.Newuser;
import com.niit.music.service.RegisterService;

@Controller
public class Homecontroller {
	@Autowired
	RegisterService rs;

	@RequestMapping(value ={"/","/home","admin/home"})
	public String home() {
		return "index";
	}
	@RequestMapping(value="/admin/abc")
	public String valid()
	{
		return "Admin";
	}
	@RequestMapping(value = {"/login","/admin/login","/user/login"},method = RequestMethod.GET)
	public String getlogin(ModelMap map,HttpServletRequest req) {
		return "login";
	}
	}
