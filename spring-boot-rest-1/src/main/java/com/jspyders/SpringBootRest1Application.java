package com.jspyders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootRest1Application {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context = SpringApplication.run(SpringBootRest1Application.class, args);
	}  

}
