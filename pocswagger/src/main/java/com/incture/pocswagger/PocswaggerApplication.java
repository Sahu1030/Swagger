package com.incture.pocswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PocswaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocswaggerApplication.class, args);
		System.out.println("Welcome to Swagger POC.");
	}

}
