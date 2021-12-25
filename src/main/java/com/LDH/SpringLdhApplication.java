package com.LDH;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringLdhApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLdhApplication.class, args);
	}

	@GetMapping(value="/")
	public String helloworld(){
		return "helloworld";
	}

}

