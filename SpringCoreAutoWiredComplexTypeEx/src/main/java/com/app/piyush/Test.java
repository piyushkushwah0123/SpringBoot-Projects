package com.app.piyush;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ac  = new AnnotationConfigApplicationContext(MyAppConfig.class);

        Object o = ac.getBean("a");

        System.out.println(o);
    }
}