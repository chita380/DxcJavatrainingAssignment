package com.dxc;

import org.springframework.stereotype.Component;

@Component("morning greeting")
public class MorningGreeting implements Greeting {

	String greeting = "Good Morning";
	
	public String greet() {
		// TODO Auto-generated method stub
		return greeting;
	}

	public MorningGreeting() {
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
