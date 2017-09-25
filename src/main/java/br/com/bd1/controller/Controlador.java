package br.com.bd1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean // Para ser usada nas tela jsf
public class Controlador {

	private String nome;
	private Integer idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public void exibirDados() {
		setNome("Alfredo Frederico Pereira da Silva Junior");
		setIdade(199);
	}
}
