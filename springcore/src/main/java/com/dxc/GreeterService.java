package com.dxc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class GreeterService {

	
	@Autowired
	@Qualifier("good day greeting")
	Greeting greet;
	
	public GreeterService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GreeterService(Greeting greet) {
		super();
		this.greet = greet;
	}
	
	public Greeting getGreet() {
		return greet;
	}

	public void setGreet(Greeting greet) {
		this.greet = greet;
	}

	
	  public void printGreeting() { 
		  
		System.out.println(greet.greet());
	  
	  }
	 
}
