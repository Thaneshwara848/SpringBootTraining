package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringBootDemo09EurekaCleintApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo09EurekaCleintApplication.class, args);
		System.out.println("Eureka Cleint is Running....!");
	}
	 @GetMapping("/hello")
	  public String hello() {
	        return "Hello from Eureka Client!";
	  }

}
