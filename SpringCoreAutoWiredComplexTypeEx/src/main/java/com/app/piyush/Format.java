package com.app.piyush;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Format {

    @Autowired
    @Qualifier("a")   // change to "b" to test other bean
    private I i1;

    public void show() {
        i1.m1();
        System.out.println("Format class executed");
    }
}