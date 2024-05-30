package com.taizo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages ="com.taizo")
@EnableJpaRepositories
public class TaizoJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaizoJavaApplication.class, args);
	}

}
