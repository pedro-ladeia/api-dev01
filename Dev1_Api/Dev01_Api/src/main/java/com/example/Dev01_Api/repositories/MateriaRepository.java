package com.example.Dev01_Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Dev01_Api.models.MateriaModel;

@Repository
public interface MateriaRepository extends JpaRepository<MateriaModel, Integer>{

}
