package com.dilipghawade.example.lazy.e1;


import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
class NormalClass{
	
}

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototTypeClass{
	
	
}
@Configuration
@ComponentScan
public class BeanScopeApplicationLaucher {
	

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(BeanScopeApplicationLaucher.class)){
			
			
		System.out.println(context.getBean(NormalClass.class));		
		System.out.println(context.getBean(NormalClass.class));	
		
		System.out.println(context.getBean(PrototTypeClass.class));	
		System.out.println(context.getBean(PrototTypeClass.class));	
		System.out.println(context.getBean(PrototTypeClass.class));	
		}


	}

}
