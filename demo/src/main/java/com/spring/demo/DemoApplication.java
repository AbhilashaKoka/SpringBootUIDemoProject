package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(DemoApplication.class, args);
		var car=applicationContext.getBean(Car.class);
		car.getCar();
	}

}
