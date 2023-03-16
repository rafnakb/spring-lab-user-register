package br.unesp.rc.springtutorial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringtutorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringtutorialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
