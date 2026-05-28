package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.MyAppConfig;

public class MyTest {

    public static void main(String[] args) {
        
        ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
        
        Object ob = ac.getBean("myService");
        
        // run ctrl + fn + f11
        System.out.println(ob);
        
        // Output : _MyService [repo=MyRepository [entity=SAMPLE]]
        // MyService is also Connected with My Repository
        // If I don't write Autowire What is the default Value => null
    }
}