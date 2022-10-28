package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass =false)
public class ProductAppFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductAppFinalApplication.class, args);
		System.out.println("$$$$Project Begin$$$");
	}

}
