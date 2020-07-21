package com.sai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PhoneBookApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(PhoneBookApp1Application.class, args);
	}

}
