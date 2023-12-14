package com.alvarobenito.archivarius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.alvarobenito.archivarius")
public class ArchivariusApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArchivariusApplication.class, args);
	}

}
