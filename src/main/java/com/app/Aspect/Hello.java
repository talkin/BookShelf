package com.app.Aspect;

public class Hello {

    public static void main(String[] args) throws Exception {
        Hello hello = new Hello();
        hello.walk();
        System.out.println("-------");
        hello.say();
    }

    public void walk() {
        System.out.println("walking");
    }
    public void say() {
        System.out.println("saying");
    }


}
