package com.example.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo32716Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo32716Application.class, args);
	}

	@Bean
	public ApplicationRunner runner(MyRepository repository) {
		return args -> System.out.println(repository.hello());
	}

}
