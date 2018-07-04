package com.catikco.makepo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.catikco.makepo.mapper")
public class MakepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MakepoApplication.class, args);
	}
}
