package com.app.piyush;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("a")
@Primary
public class A implements I {

    @Override
    public void m1() {
        System.out.println("A");
    }
}