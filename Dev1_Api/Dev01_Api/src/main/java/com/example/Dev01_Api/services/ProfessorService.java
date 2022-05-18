package com.example.Dev01_Api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dev01_Api.models.ProfessorModel;
import com.example.Dev01_Api.repositories.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	ProfessorRepository professorRepository;
	
	public List<ProfessorModel> findAll() {
		return professorRepository.findAll();
	}
	
	public ProfessorModel cadastrarProfessor(ProfessorModel professorModel) {
		return professorRepository.save(professorModel);
	}
}
