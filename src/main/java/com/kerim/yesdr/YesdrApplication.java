package com.kerim.yesdr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class YesdrApplication {

	public static void main(String[] args) {
		SpringApplication.run(YesdrApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello Spring Boot!";
	}
}
