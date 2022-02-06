package com.laoh2.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	//  Usefull links
	//  https://www.baeldung.com/spring-boot-h2-database
	//  https://www.javatpoint.com/spring-boot-h2-database

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		// after run, goto to -> http://localhost:8080/h2-console
		// Fill form with ...
		// USER NAME = sa
		// PASSWORD = abc
		// JDBC URL = jdbc:h2:mem:mydb

		// To change from memory to store in local file just add this ...
		// spring.datasource.url=jdbc:h2:file:/data/demo
	}

}
