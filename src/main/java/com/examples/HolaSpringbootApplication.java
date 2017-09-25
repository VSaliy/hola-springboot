package com.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author Vitaliy Saliy
 */
@SpringBootApplication
@EnableConfigurationProperties
public class HolaSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaSpringbootApplication.class, args);
	}
}
