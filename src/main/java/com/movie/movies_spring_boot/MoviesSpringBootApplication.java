package com.movie.movies_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesSpringBootApplication.class, args);
	}

//	@GetMapping("/")
//	public String apiRoot() {
//		return "Hello World!";
//	}

}


