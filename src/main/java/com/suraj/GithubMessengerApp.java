package com.suraj;

import java.nio.file.Path;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubMessengerApp {

	public static void main(String[] args) {
		SpringApplication.run(GithubMessengerApp.class, args);
	}
	
	@Bean
	public CqlSessionBuilderCustomizer sessionBuildedrCustomizer(DataStaxAstraProperties astraProperties) {
		
		Path bundle = astraProperties.getSecureConnectBundle().toPath();
		return builder -> builder.withCloudSecureConnectBundle(bundle);
		
	}
} 
