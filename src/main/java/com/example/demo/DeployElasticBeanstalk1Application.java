package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployElasticBeanstalk1Application {

	public static void main(String[] args) {
		SpringApplication.run(DeployElasticBeanstalk1Application.class, args);
	}
	
	
	@GetMapping("/message")
	public String display() {
		return "<h1>Welcome to my channel code with KT</h1>";
	}

}
