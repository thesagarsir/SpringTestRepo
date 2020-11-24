package com.javabysagar.SpringBootWithJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class SpringBootWithJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithJdbcApplication.class, args);
	}

}
