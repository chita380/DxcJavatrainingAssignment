package com.dxc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		   
		GoodDayGreeting gdg = context.getBean( GoodDayGreeting.class);	
		MorningGreeting mg = context.getBean( MorningGreeting.class);	
		GreeterService  gs = context.getBean( GreeterService.class);
		gs.printGreeting();
	}

}
