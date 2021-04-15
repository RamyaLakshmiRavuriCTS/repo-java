package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//replacing XML with this annotation
@Configuration

//assigning path to properties file
@PropertySource(value="details.properties")

public class AppConfig {
	//setting values from property file
	@Value("${name}")
	private String name;
	@Value("${email}")
	private String email;
	@Value("${address}")
	private String address;
	@Bean
	public Student studentname() {
		var student= new Student(name, email, address);
		return student;
	}
}
