package com.example.Dev01_Api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "notas")
public class NotaModel {

	@Id
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "id_aluno")
	private AlunoModel alunoModel;
	
	@ManyToOne
	@JoinColumn(name = "id_materia")
	private MateriaModel materiaModel;
	
	@Column
	private Double valor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AlunoModel getAlunoModel() {
		return alunoModel;
	}

	public void setAlunoModel(AlunoModel alunoModel) {
		this.alunoModel = alunoModel;
	}

	public MateriaModel getMateriaModel() {
		return materiaModel;
	}

	public void setMateriaModel(MateriaModel materiaModel) {
		this.materiaModel = materiaModel;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
