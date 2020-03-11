package com.ouath.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.ouath.mvc")
public class SpringbootOauthStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOauthStudyApplication.class, args);
	}

}
