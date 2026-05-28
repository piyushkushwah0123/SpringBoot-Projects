package com.app.config;

import org.springframework.context.annotation.ComponentScan;

// common package for all
// Means go and search the classes in this package and sub package
// No Property file Nothing
// No default base package given by Spring Core You must mention one package
@ComponentScan(basePackages = "com.app")
public class MyAppConfig {

}