package com.dilipghawade.restapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@RequestMapping("employee/getmessage")
	public String getMessage() {
		return "This message from employee controller";
	}

}
