package br.com.generation.exercicios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio01")
public class Exercicio01Controller {
	
	@GetMapping
	public String exec01() {
		return "Para realizar essa atividade eu utilizei, "
				+ "Proatividade , Persitência, a Mentalidade de Crescimento "
				+ "e também Comunicação";
	}

}
