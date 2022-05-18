package com.example.Dev01_Api.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name = "alunos")
public class AlunoModel extends UsuarioModel{
	@Id
	private Integer matricula;
	@Column
	private String nome;
	@Column
	private String senha;
	@Column
	private String cpf;
	@OneToMany(mappedBy = "alunoModel")
	@JsonIgnore
	private List<NotaModel> notaModel;
	
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
	public List<NotaModel> getNotaModel() {
		return notaModel;
	}
	public void setNotaModel(List<NotaModel> notaModel) {
		this.notaModel = notaModel;
	}
	
	
}
