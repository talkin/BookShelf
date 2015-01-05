package com.app.Aspect;

import org.aspectj.lang.annotation.Before;

public aspect doAspect {

    // 定义切点 并且指明在哪个方法
//    pointcut deliverMessage1(): call(* Hello.say());
    pointcut deliverMessage2(): call(* com.app.Test.Hello.run());

    // 方法前拦截
    @Before("call (* Hello.say())")
    public void deliverMessage1() {
        System.out.println("6666");
    }

    after(): deliverMessage2() {
        System.out.println("after");
    }

}