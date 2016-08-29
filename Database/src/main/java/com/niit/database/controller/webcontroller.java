package com.niit.database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class webcontroller {
	@RequestMapping("home")
	public String home(){
		return "flow";
	}

}
