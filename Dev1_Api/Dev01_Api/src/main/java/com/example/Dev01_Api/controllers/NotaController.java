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

import com.example.Dev01_Api.models.NotaModel;
import com.example.Dev01_Api.services.NotaService;

@RestController
@RequestMapping("/notas")
public class NotaController {

	@Autowired
	NotaService notaService;
	
	@GetMapping("/todas-notas")
	public ResponseEntity<List<NotaModel>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(notaService.findAll());
	}
	@PostMapping("/cadastrar-nota")
	public ResponseEntity<NotaModel> save(@RequestBody NotaModel notaModel) {
		return ResponseEntity.status(HttpStatus.CREATED).body(notaService.save(notaModel));
	}
}
