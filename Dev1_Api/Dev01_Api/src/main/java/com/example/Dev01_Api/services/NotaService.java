package com.example.Dev01_Api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dev01_Api.models.NotaModel;
import com.example.Dev01_Api.repositories.NotaRepository;

@Service
public class NotaService {

	@Autowired
	NotaRepository notaRepository;
	
	public List<NotaModel> findAll() {
		return notaRepository.findAll();
	}
	
	public NotaModel save(NotaModel notaModel) {
		return notaRepository.save(notaModel);
	}
}
