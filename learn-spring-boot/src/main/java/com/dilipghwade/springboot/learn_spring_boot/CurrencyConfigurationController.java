package com.dilipghwade.springboot.learn_spring_boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
	@Autowired
	private CurrencyServiceConfiguration configuration;

	
      @RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration getConfiguration() {
		return configuration;
	}

}
