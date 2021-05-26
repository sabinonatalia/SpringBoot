package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObjetivoController {
	
	@GetMapping("/objetivo")
	public String sayobjetivo() {
		return " Os objetivos de aprendizagem para essa semana é aprimorar os conhecimentos,"
				+ "ter bastante atenção ao detalhes e persistência";
		
	}

}
