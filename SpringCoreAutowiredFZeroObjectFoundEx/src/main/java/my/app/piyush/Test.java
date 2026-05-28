package my.app.piyush;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import my.app.MyAppConfig;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac =
                new AnnotationConfigApplicationContext(MyAppConfig.class);

        Object o = ac.getBean("oa");

        System.out.println(o);
    }
}