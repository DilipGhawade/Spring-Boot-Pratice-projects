package com.dilipghawade.example.lazy.e1.e2;


import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;




@Component
class SomeClass{
	SomeDependency someDependency;
	public SomeClass (SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		
	}
	
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
		
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("Cleanup!!");
	}
	
}

@Component 
class SomeDependency{

	public void getReady() {
		System.out.println("Some logic using some dependency");
		
	}
	
}
@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncherApplication {
	

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApplication.class)){
			
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}


	}

}
