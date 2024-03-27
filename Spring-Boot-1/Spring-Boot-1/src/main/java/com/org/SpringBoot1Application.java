package com.org;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context=SpringApplication.run(SpringBoot1Application.class, args);
		Student student=Context.getBean(Student.class);
		System.out.println(student);
		System.out.println(student.book);
		

	}

}

/*
 * Vehicle
 * 
 * 
 */
