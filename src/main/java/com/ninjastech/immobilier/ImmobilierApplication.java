package com.ninjastech.immobilier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class ImmobilierApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImmobilierApplication.class, args);
	}


	@RequestMapping("/home")
	public String hello() {
		return "Hello buddy!";
	}


}
