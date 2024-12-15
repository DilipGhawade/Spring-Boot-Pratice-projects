package com.dilipghawade.GavaGame;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Address(String firstLine,String city) {}
record Person(String nameString , int age, Address address) {}

@Configuration
public class HelloWordConfiguration {
	
	@Bean
	public String name() {
		return "Dilip";
	}
	
	@Bean
	public int age() {
		return 31;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Ravi", 38, new Address("Delhi", "Mumbai"));
		return person;
	}

	@Bean
	public Address address() {
//		var address  = new Address("Parande nagar Dighi", "Pimpri Chinchwad");
		return new Address("Parande nagar Dighi", "Pimpri Chinchwad");
	}
	
	@Bean 
	public Person personToMethodCall() {
		
		return new Person(name(), age(), address());
		
	}
	
	@Bean 
	public Person person3Parameter(String name, int age, Address address) {
		return new Person(name, age, address);
	}
}
