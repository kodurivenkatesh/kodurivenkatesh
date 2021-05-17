package com.springlabbook.app;

import org.springframework.context.annotation.*;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:employee.properties")
@ComponentScan("com.springlabbook.beans")
@Configuration

public class JavaConfig {
	
}

