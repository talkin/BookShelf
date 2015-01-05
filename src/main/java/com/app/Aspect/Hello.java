package com.app.Aspect;

public class Hello {

    public static void main(String[] args) throws Exception {
        Hello hello = new Hello();
        hello.say();
        System.out.println("-------");
        hello.run();

        doBeforeAspect doBeforeAspect = new com.app.Aspect.doBeforeAspect();
        doBeforeAspect.
    }

    protected void say() {
        System.out.println("saying");
    }

    private void run() {
        System.out.println("running");
    }

}
