package com.app.piyush;

import org.springframework.stereotype.Component;

@Component("b")
public class B implements I {

    @Override
    public void m1() {
        System.out.println("B");
    }
}