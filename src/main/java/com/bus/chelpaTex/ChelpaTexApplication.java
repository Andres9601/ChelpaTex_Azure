package com.bus.chelpaTex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bus.chelpaTex.Entity","com.bus.chelpaTex.Controller","com.bus.chelpaTex.DTO","com.bus.chelpaTex.Repo","com.bus.chelpaTex.Service","com.bus.chelpaTex.ServiceImpl","com.bus.chelpaTex.Security"})
public class ChelpaTexApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChelpaTexApplication.class, args);
	}

}
