package com.putact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = "com")
@SpringBootApplication
public class MicroServiceUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceUserApplication.class, args);
	}

}
