package com.example.awscloudfunction;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AwsCloudFunctionApplication {

	public static void main(String[] args) {
		FunctionalSpringApplication.run(AwsCloudFunctionApplication.class, args);
	}





	/* @Bean
	public Function<String, String> uppercase() {
		return value -> {
			if (value.equals("exception")) {
				throw new RuntimeException("Intentional exception");
			}
			else {
				return value.toUpperCase();
			}
		};
	}*/


}
