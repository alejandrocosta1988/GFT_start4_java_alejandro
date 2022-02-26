package dev.alejandrocosta.springbootweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String mensagem()
	{
		return "Show! Primeiro projeto Spring Boot Web funcionando!";
	}
}
