package com.trivadis;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TankRestServiceApplication {

	@Autowired
	private TankRepository tankRepository;

	public static void main(String[] args) {
		SpringApplication.run(TankRestServiceApplication.class, args);
	}

	@PostConstruct
	public void init() {
		tankRepository.save(new Tank(50_000, 30_000));
	}

}
