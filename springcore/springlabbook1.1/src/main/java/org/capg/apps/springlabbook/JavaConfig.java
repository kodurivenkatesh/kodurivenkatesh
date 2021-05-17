package org.capg.apps.springlabbook;
import org.springframework.context.annotation.*;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:app.properties")
@ComponentScan("org.capg.apps.springlabbook")
@Configuration

public class JavaConfig {
	
}