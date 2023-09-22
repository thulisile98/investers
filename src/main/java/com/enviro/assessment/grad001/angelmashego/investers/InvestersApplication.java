package com.enviro.assessment.grad001.angelmashego.investers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.enviro.assessment.grad001.angelmashego.investers.model")
@ComponentScan(basePackages = "com.enviro.assessment.grad001.angelmashego.investers.service")
public class InvestersApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestersApplication.class, args);
	}

}
