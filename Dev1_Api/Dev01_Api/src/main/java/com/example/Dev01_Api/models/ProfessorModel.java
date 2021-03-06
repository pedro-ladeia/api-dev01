package com.example.Dev01_Api.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name = "professores")
public class ProfessorModel {
	@Id
	private Integer matricula;
	@Column
	private String nome;
	@Column
	private Float salario;
	@Column
	private String senha;
	@Column
	private String cpf;
	@OneToMany(mappedBy = "professorModel") //Ligação do tipo Um para muitos (um professor para muitas notas) mapeado por professorModel
	@JsonIgnore // Ignorar as propriedades de avaliacaoProfessor presentes no professor
	private List<AvaliacaoProfessorModel> avaliacaoProfessorModel;
	
	@OneToMany(mappedBy = "professorModel")
	@JsonIgnore
	private List<MateriaModel> materiaModel;
	
	public List<AvaliacaoProfessorModel> getAvaliacaoProfessorModel() {
		return avaliacaoProfessorModel;
	}
	public void setAvaliacaoProfessorModel(List<AvaliacaoProfessorModel> avaliacaoProfessorModel) {
		this.avaliacaoProfessorModel = avaliacaoProfessorModel;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getSalario() {
		return salario;
	}
	public void setSalario(Float salario) {
		this.salario = salario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public List<MateriaModel> getMateriaModel() {
		return materiaModel;
	}
	public void setMateriaModel(List<MateriaModel> materiaModel) {
		this.materiaModel = materiaModel;
	}
	
	
	
	
	
}
