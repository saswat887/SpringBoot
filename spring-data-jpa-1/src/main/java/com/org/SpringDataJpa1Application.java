package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
@OpenAPIDefinition(info=@Info(
		title="My SpringBoot Person Student Rest Service",
		description="Person Student API",
		version="v1.0",
		contact=@Contact(
				name="Saswat Nayak",
				email="saswat887@gmail.com",
				url="https://www.linkedin.com/in/saswat-nayak-3b65a4153/"
				)
			)
		)
@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpa1Application.class, args);
	}

}
