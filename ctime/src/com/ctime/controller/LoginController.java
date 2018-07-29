package com.ctime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ctime.service.UserService;
import com.ctime.user.CtimeUser;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired UserService userService;
	
	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage(Model theModel) {
		
		CtimeUser ctimeUser = new CtimeUser();
		theModel.addAttribute("ctimeUser", ctimeUser);
		return "registration-form";		
	}
	
	@GetMapping("/access-denied")
	public String showAccessDenied() {
		
		return "registration-form";
		
	}
}
