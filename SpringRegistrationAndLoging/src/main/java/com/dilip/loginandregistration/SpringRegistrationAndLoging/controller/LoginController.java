package com.dilip.loginandregistration.SpringRegistrationAndLoging.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@GetMapping("myapp/logindetails")
	public String getLoginDetailString() {
		return "Dilip Ghawade";
		
	}

}
