package com.ctime.controller;

import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ctime.entity.User;
import com.ctime.service.UserService;
import com.ctime.user.CtimeUser;



@Controller
@RequestMapping("/register")
public class RegistrationController {
	
	@Autowired
    private UserService userService;
	
    private Logger logger = Logger.getLogger(getClass().getName());
    
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}	
	
		
	@GetMapping("/showRegistrationForm")
	public String showLoginPage(Model theModel) {
		
		theModel.addAttribute("ctimeUser", new CtimeUser());
		
		return "registration-form";
		
	}	
	
	@PostMapping("/processRegistrationForm")
	public String processRegistrationForm(
				@Valid @ModelAttribute("ctimeUser") CtimeUser ctimeUser, 
				BindingResult theBindingResult, 
				Model theModel) {
						
		String username = ctimeUser.getUsername();

	
		
        User existing = userService.findByUsername(username);
        if (existing != null){
        	theModel.addAttribute("ctimeUser", new CtimeUser());
			theModel.addAttribute("registrationError", "Username already exists.");

			logger.warning("Username already exists.");
        	return "registration-form";
        }

	    userService.save(ctimeUser);
	    
	    logger.info("Successfully created user: " + username);
	    
	    return "main";		
	}
}
