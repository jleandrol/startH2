package com.laoh2.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

		// app:		http://localhost:8080/v1

		// h2:  	http://localhost:8080/h2-console/login.do

	}

}
