package com.abhinav.sbtestapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbtestappApplication {
	
	@GetMapping("/message")
	public String message() {
		System.out.println("TEST TEST TEST TESt TEST TEST TEST TEST");
		return "Dockerizing sbtestapp ......";
	}

	public static void main(String[] args) {
		SpringApplication.run(SbtestappApplication.class, args);
	}

}
