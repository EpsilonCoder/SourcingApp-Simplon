package com.epsilon.com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SourcingAppSimplonApplication implements CommandLineRunner {

	
	
	public static void main(String[] args) {
		SpringApplication.run(SourcingAppSimplonApplication.class);
	}
	

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("application start");
		System.out.println("application end");		
	}

}
