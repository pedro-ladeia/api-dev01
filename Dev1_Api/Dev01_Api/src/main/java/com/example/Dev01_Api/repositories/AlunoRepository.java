package com.example.Dev01_Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Dev01_Api.models.AlunoModel;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel, Integer>{

}
