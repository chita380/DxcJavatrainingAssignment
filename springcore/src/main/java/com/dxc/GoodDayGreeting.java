package com.dxc;

import org.springframework.stereotype.Component;

@Component("good day greeting")
public class GoodDayGreeting implements Greeting{

	String greeting = "Have a Good Day" ;
	
	public String greet() {
		// TODO Auto-generated method stub
		return greeting;
	}

	public GoodDayGreeting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
