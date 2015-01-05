package com.app.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class doBeforeAspect {
    @Before("execution(* Hello.walk())")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("***AspectJ*** DoBefore() is running!! intercepted : " + joinPoint.getSignature().getName());
    }

}
