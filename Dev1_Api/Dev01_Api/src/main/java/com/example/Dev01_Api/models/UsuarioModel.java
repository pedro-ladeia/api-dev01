package com.example.Dev01_Api.models;

import javax.persistence.Column;
import javax.persistence.Id;

public class UsuarioModel extends PessoaModel{
	
	private Integer matricula;
	private String senha;
	
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
