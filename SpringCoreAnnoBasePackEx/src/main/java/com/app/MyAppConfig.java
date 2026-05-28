package com.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Directly use can write a sinngle package name
// or base package = 
// in the curly bracket multiple package name 
// @component Scan 


@ComponentScan({"com.app", "my.one.format"})
public class MyAppConfig {

}