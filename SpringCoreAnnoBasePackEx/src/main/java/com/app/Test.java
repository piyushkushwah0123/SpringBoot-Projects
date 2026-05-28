package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac =
                new AnnotationConfigApplicationContext(MyAppConfig.class);

        // Object obj1 = ac.getBean("cob");
        // Object obj2 = ac.getBean("eobj");

        Object obj3 = ac.getBean("vr");
        System.out.println(obj3);
    }
}