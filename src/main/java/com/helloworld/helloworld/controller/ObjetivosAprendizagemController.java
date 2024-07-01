package com.helloworld.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-aprendizagem")
public class ObjetivosAprendizagemController {

	@GetMapping
	public List<String> listObjetivos() {
		return Arrays.asList(
				"Aprender Spring",
				"Aprender Rest-API",
				"Dominar banco de dados e front-end"
				);
	}
}
