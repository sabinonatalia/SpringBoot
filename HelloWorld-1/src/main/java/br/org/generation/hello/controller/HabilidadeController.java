package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HabilidadeController {
	
	@GetMapping("/habilidade")
	public String sayhabilidade(){
		return "Mentalidade: Persistência e Habilidade: Atenção aos detalhes ";
}
}