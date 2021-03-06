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

import com.example.Dev01_Api.models.AlunoModel;
import com.example.Dev01_Api.services.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	AlunoService alunoService;

	@GetMapping("/todos-alunos")
	public List<AlunoModel> findAll() {
		return alunoService.findAll();
	}
	
	@PostMapping("/cadastrar-aluno")
	public ResponseEntity<AlunoModel> cadastrarAluno(@RequestBody AlunoModel alunoModel) {
		return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.saveAluno(alunoModel));
	}
}