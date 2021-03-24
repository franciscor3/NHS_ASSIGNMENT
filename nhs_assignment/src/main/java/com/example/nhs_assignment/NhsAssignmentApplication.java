package com.example.nhs_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class NhsAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(NhsAssignmentApplication.class, args);
	}

}
