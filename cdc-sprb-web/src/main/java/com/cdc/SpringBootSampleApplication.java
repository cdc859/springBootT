package com.cdc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cdc")
@SpringBootApplication
public class SpringBootSampleApplication {

	public static void main(String []args) {
		
		SpringApplication.run(SpringBootSampleApplication.class, args);
		
	}
	
}
