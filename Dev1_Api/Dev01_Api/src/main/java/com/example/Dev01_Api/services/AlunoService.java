package com.example.Dev01_Api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dev01_Api.models.AlunoModel;
import com.example.Dev01_Api.repositories.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	AlunoRepository alunoRepository;
	
	public List<AlunoModel> findAll() {
		return alunoRepository.findAll();
	}
	
	public AlunoModel saveAluno(AlunoModel alunoModel) {
		return alunoRepository.save(alunoModel);
	}
}
