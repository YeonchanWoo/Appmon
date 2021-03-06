package com.admin.web.controller;


import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@GetMapping(value={"/", "/login"}, produces="text/html; charset=UTF-8")
	public String login(Locale locale, Model model){
		logger.debug("{}", "login page");
		
		return "login";
	}
	
}
