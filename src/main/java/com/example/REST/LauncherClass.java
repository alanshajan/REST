package com.example.REST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages="com.example.REST.repository")
@SpringBootApplication
public class LauncherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(LauncherClass.class, args);

	}

}
