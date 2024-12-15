package com.dilipghawade.example.lazy;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
 class A{}
@Component
@Lazy
 class B{
	A a = new A();
	B(A a){
		System.out.println("The a class has been initialized!!");
		this.a = a;
	}
	
	public void doSomethidn() {
		System.out.println("Do something called !");
	}
}
@Configuration
@ComponentScan
public class LazyApplicationLaucher {
	

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(LazyApplicationLaucher.class)){
			
			
			System.out.println("The initialization of context is completeed!!");
			context.getBean(B.class).doSomethidn();;
			
		}


	}

}
