package com.johnkalbac.sb.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SbPlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbPlaygroundApplication.class, args);
	}

	@RestController
	public class SampleController {

		@GetMapping("/")
		public ResponseEntity<String> sayHey() {
			return ResponseEntity.ok("Hey!");
		}

	}

}
