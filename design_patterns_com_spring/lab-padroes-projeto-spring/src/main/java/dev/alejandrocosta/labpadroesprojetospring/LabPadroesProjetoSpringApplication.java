package dev.alejandrocosta.labpadroesprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto de prática. O projeto foi inicializado utilizando o Spring Boot Initializr.
 * Módulos selecionados:
 * - Spring Data JPA;
 * - Spring Web;
 * - H2 Database;
 * - OpenFeign
 * Dependência adicionada manualmente no pom.xml:
 * - 
 * @author alejandro_costa
 */
//Anotação para habilitar o Feign dentro do projeto
@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
