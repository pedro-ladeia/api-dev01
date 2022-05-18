package com.example.Dev01_Api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dev01_Api.models.AvaliacaoProfessorModel;
import com.example.Dev01_Api.services.AvaliacaoProfessorService;

@RestController
@RequestMapping("/avaliacao-professor")
public class AvaliacaoProfessorController {

	@Autowired
	AvaliacaoProfessorService avaliacaoProfessorService;
	
	@GetMapping("/todas-avaliacoes")
	public ResponseEntity<List<AvaliacaoProfessorModel>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(avaliacaoProfessorService.findAll());
	}
	
	@PostMapping("cadastrar-avaliacao")
	public ResponseEntity<AvaliacaoProfessorModel> save(@RequestBody AvaliacaoProfessorModel avaliacaoProfessorModel) {
		return ResponseEntity.status(HttpStatus.CREATED).body(avaliacaoProfessorService.save(avaliacaoProfessorModel));
	}

}
