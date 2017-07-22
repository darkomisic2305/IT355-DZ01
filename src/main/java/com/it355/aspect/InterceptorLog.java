package com.it355.aspect;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.MethodBeforeAdvice;

@Aspect
public class InterceptorLog implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("logBefore() je pokrenut!");
		System.out.println("Presretnut je " + arg0.getName());
		
	}

	@After("execution(*com.it355.dao.impl.SobaDaoImpl.dodajSobu(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("Metoda logAfter() je pozvana.");
		System.out.println("Presretnut je " + joinPoint.getSignature().getName());
	}
	
	@AfterThrowing(pointcut="execution(*com.it355.dao.impl.SobaDaoImpl.dodajSobuThrowException())", throwing="error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
		System.out.println("Metoda logAfterThrowing() je pozvana.");
		System.out.println("Presretnut je " + joinPoint.getSignature().getName());
		System.out.println("Exception je " + error);
	}
}
