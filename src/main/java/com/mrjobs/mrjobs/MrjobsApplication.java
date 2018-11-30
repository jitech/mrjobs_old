package com.mrjobs.mrjobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.mrjobs.controller"})
public class MrjobsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MrjobsApplication.class, args);
	}
}
