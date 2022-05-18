package com.example.Dev01_Api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "avaliacoes_professor")
public class AvaliacaoProfessorModel {
	
	@Id
	private Integer id;
	@Column
	private Double valor;
	
	@ManyToOne // Ligação do tipo muitos para um (Muitas notas para um professor)
	@JoinColumn(name = "id_professor") //Ligando a chave estrangeira com a coluna criada para a chave estrangeira (id_professor)
	private ProfessorModel professorModel;
	
	public ProfessorModel getProfessorModel() {
		return professorModel;
	}
	public void setProfessorModel(ProfessorModel professorModel) {
		this.professorModel = professorModel;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}

		
	
}
