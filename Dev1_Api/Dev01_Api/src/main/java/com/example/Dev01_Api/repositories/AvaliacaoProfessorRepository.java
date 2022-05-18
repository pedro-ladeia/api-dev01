package com.example.Dev01_Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Dev01_Api.models.AvaliacaoProfessorModel;

@Repository
public interface AvaliacaoProfessorRepository extends JpaRepository<AvaliacaoProfessorModel, Integer>{

}
