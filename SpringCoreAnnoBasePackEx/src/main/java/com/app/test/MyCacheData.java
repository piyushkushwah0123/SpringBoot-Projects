package com.app.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cob")
public class MyCacheData {

    @Value("radis")
    private String provider;

    @Override
    public String toString() {
        return "MyCacheData [provider=" + provider + "]";
    }
}