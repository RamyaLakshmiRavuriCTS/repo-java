package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="details.properties")
public class AppConfig {
	@Value("${name}")
	private String name;
	@Value("${email}")
	private String email;
	@Value("${address}")
	private String address;
	@Bean
	public Student studentname() {
		var student=new Student(name, email, address);
		return student;
	}
}
