package com.rflores.locadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.rflores.locadora.domain")
@SpringBootApplication
public class LocadoraApp {
	public static void main(String[] args) {
		SpringApplication.run(LocadoraApp.class, args);
	}

}
