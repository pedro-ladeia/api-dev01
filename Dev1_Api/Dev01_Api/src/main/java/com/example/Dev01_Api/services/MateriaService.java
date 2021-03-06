package com.example.Dev01_Api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dev01_Api.models.MateriaModel;
import com.example.Dev01_Api.repositories.MateriaRepository;

@Service
public class MateriaService {

	@Autowired
	MateriaRepository materiaRepository;
	
	public List<MateriaModel> findAll() {
		return materiaRepository.findAll();
	}
	
	public MateriaModel save(MateriaModel materiaModel) {
		return materiaRepository.save(materiaModel);
	}
}
