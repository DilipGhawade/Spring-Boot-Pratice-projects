package com.dilip.ghawade.h1;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class XmlConfigurationLauncherApp {
	
	public static void main(String[] args) {
		
		try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("name"));
		}
	}

}
