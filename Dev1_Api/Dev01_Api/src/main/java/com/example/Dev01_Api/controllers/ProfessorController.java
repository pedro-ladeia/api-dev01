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

import com.example.Dev01_Api.models.ProfessorModel;
import com.example.Dev01_Api.services.ProfessorService;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
	
	@Autowired
	ProfessorService professorService;
	
	@GetMapping
	public String teste() {
		return "Teste Professor";
	}
	
	@GetMapping("/todos-professores")
	public List<ProfessorModel> findAll() {
		return professorService.findAll();
	}
	
	@PostMapping("/cadastrar-professores")
	public ResponseEntity<ProfessorModel> cadastrarProfessor(@RequestBody ProfessorModel professorModel) {
		return ResponseEntity.status(HttpStatus.CREATED).body(professorService.cadastrarProfessor(professorModel));
	}
}

