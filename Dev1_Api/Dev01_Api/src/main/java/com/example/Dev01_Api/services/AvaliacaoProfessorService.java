package com.example.Dev01_Api.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dev01_Api.models.AvaliacaoProfessorModel;
import com.example.Dev01_Api.models.ProfessorModel;
import com.example.Dev01_Api.repositories.AvaliacaoProfessorRepository;

@Service
public class AvaliacaoProfessorService {

	@Autowired
	AvaliacaoProfessorRepository avaliacaoProfessorRepository;
	
	public List<AvaliacaoProfessorModel> findAll() {
		return avaliacaoProfessorRepository.findAll();
	}
	@Transactional
	public AvaliacaoProfessorModel save(AvaliacaoProfessorModel avaliacaoProfessorModel) {
		ProfessorModel professorModelfromdb = new ProfessorModel();
		//professorModelFromdb = avaliacaoProfessorRepository.findById()
		return avaliacaoProfessorRepository.save(avaliacaoProfessorModel);
	}
}