package com.app.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class doAspect {

    @Before("execution (* Hello.say())")
    public void deliverMessage1() {
        System.out.println("before say");
    }

    @After("execution (* Hello.walk())")
    public void deliverMessage2() {

        System.out.println("after walk");
    }

}