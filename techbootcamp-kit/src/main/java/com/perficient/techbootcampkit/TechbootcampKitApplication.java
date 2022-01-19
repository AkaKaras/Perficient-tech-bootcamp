package com.perficient.techbootcampkit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechbootcampKitApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(TechbootcampKitApplication.class, args);
	}

	public int add5(int a) {
		return a+5;
	}
}
