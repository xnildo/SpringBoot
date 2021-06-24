package br.com.generation.exercicios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio02")
public class Exercicio2Controller {
	@GetMapping
	public String exec02() {
	return "Meu objetivo essa Semana é começar  SPRING BOOT  ";
	}

}
