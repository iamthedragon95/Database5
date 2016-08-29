package com.niit.database.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.database.model.Login;
import com.niit.database.service.LoginService;

@Controller
public class LoginController
{
	
	@ModelAttribute("log")
	public Login lg()
	{
		System.out.println("called");
		return new Login();
	}
	
	@RequestMapping(value={"loginpage"})
	public ModelAndView login()
	{
		
		ModelAndView model= new ModelAndView("login");
				return model;
	}
	@RequestMapping(value="loginpages")
	public String log()
	{
		return "login";
	}
	
	@Autowired
	LoginService ls;
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String log1()
	{
		return "login";
	}

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView loginuser(@ModelAttribute("log") Login login) {
		boolean isvaliduser = false;
		isvaliduser = ls.checkUser(login);
		ls.save(login);
		ModelAndView mv = null;
		if (isvaliduser == true) {
			 mv = new ModelAndView("success");
			mv.addObject("msg", "Welcome");
			mv.addObject("name", login.getUserName());
		}
		return mv;
	}

}
