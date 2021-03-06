package com.example.Dev01_Api.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name = "materias")
public class MateriaModel {

	@Id
	private Integer id;
	@Column
	private String name;
	@ManyToOne
	@JoinColumn (name = "id_professor")
	private ProfessorModel professorModel;
	
	@OneToMany(mappedBy = "materiaModel")
	@JsonIgnore
	private List<NotaModel> notaModel;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProfessorModel getProfessorModel() {
		return professorModel;
	}
	public void setProfessorModel(ProfessorModel professorModel) {
		this.professorModel = professorModel;
	}
	
	
}
