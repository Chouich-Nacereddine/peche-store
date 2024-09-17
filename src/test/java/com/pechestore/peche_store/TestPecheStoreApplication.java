package com.pechestore.peche_store;

import org.springframework.boot.SpringApplication;

public class TestPecheStoreApplication {

	public static void main(String[] args) {
		SpringApplication.from(PecheStoreApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
