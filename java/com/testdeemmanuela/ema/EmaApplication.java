package com.testdeemmanuela.ema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan({"com.testdeemmanuela.ema"})
public class EmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmaApplication.class, args);
	}
}
