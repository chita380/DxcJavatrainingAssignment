package com.dxc;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
	
	@Pointcut("execution(* Operation.t*(..))")
	public void all(){}//pointcut name
	
	 @Pointcut("execution(* Operation.c*(..))") 
	 public void other(){}//pointcut name
	
	//@Before("all()")//applying pointcut on before advice
	 @After("all()")//applying pointcut on after advice
	
	
	// @After("other()")//applying pointcut on after advice
	 	
	public void myadvice(JoinPoint jp)//it is advice
	{
		System.out.println("additional concern");
		
	}
}
