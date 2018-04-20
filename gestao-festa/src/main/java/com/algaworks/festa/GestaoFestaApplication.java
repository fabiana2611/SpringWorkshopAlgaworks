package com.algaworks.festa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestaoFestaApplication {

	/*
	 * o Spring Boot sugere o uso de um container embarcado (por
	 * padrão é o Tomcat) para facilitar o desenvolvimento, então, 
	 * para iniciar nossa aplicação, basta executarmos o método 
	 * main , da classe GestaoFestaApplication .
	 */
	public static void main(String[] args) {
		SpringApplication.run(GestaoFestaApplication.class, args);
	}
}
