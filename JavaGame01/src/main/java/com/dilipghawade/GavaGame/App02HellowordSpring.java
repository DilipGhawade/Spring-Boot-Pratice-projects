package com.dilipghawade.GavaGame;

import java.net.Socket;
import java.util.Arrays;

import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HellowordSpring {
	
	public static void main(String[] args) {
		// Launch the spring Context 
		// Configure the things we went to spring to manage @Configuration
		var context = new AnnotationConfigApplicationContext(HelloWordConfiguration.class);
		var name = context.getBean("name");
		System.out.println(name);
		
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean("personToMethodCall"));
		System.out.println("person3Parameter => "+context.getBean("person3Parameter"));
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
