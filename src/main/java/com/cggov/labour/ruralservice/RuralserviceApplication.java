package com.cggov.labour.ruralservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;


//@ComponentScan("com.cggov")
@SpringBootApplication
@EnableCaching
public class RuralserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RuralserviceApplication.class, args);
	}

}
