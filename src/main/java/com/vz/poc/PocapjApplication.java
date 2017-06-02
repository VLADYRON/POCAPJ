package com.vz.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.vz.poc")
@ComponentScan(basePackages = {"com.vz"}) 
public class PocapjApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocapjApplication.class, args);
	}
}
