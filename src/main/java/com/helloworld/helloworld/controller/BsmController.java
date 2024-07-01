package com.helloworld.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmController {

	@GetMapping
	public List<String> listBsm() {
		return Arrays.asList(
				"Proatividade",
				"Orientação ao detalhe",
				"Comunincação",
				"Responsabilidade Pessoal",
				"Persistência",
				"Mentalidade de Crescimento",
				"Trabalho em equipe",
				"Orientação ao futuro"
				);
	}
}
