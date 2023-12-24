package com.itwillbs.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class LoggingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		// 보조 기능을 구현 
		System.out.println("LogginAdvice༼ つ ◕_◕ ༽つ༼ つ ◕_◕ ༽つ"); // 보조 기능 
		
		Object obj = invocation.proceed(); // 주기능
		
		System.out.println("LogginAdvice༼ つ ◕_◕ ༽つ༼ つ ◕_◕ ༽つ"); // 보조 기능 
		
		return obj;
	}

	
}
