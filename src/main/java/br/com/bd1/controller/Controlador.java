package br.com.bd1.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean // Para ser usada nas tela jsf
public class Controlador {

	private Double primeiroValor;
	private Double segundoValor;
	private Double resultado;
	private String palavraEntrada;
	private Integer valorOpcao;
	private Double real;
	private String realFormatado;
	private EstadosDoSul uf;
	
	public Integer getValorOpcao() {
		return valorOpcao;
	}

	public void setValorOpcao(Integer valorOpcao) {
		this.valorOpcao = valorOpcao;
	}

	public String getPalavraEntrada() {
		return palavraEntrada;
	}

	public void setPalavraEntrada(String palavraEntrada) {
		this.palavraEntrada = palavraEntrada;
	}

	public String getPalavraAlterada() {
		return palavraAlterada;
	}

	public void setPalavraAlterada(String palavraAlterada) {
		this.palavraAlterada = palavraAlterada;
	}

	private String palavraAlterada;

	public Double getPrimeiroValor() {
		return primeiroValor;
	}

	public void setPrimeiroValor(Double primeiroValor) {
		this.primeiroValor = primeiroValor;
	}

	public Double getSegundoValor() {
		return segundoValor;
	}

	public void setSegundoValor(Double segundoValor) {
		this.segundoValor = segundoValor;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	
	public void somar() {
		resultado = this.primeiroValor + this.segundoValor;
	}
	
	public void subtrair() {
		resultado = this.primeiroValor - this.segundoValor;
	}
	
	public void multiplicar() {
		resultado = this.primeiroValor * this.segundoValor;
	}
	
	public void dividir() {
		resultado = this.primeiroValor / this.segundoValor;
	}
	
	public void maiusculo() {
		palavraAlterada = palavraEntrada.toUpperCase();
	}
	
	public void minusculo() {
		palavraAlterada = palavraEntrada.toLowerCase();
	}
	

	public Double getReal() {
		return real;
	}

	public void setReal(Double real2) {
		real = real2;
	}
	
	public void formataReal() {
		realFormatado = "R$ " + String.format("%.2f", real);
	}

	public String getRealFormatado() {
		return realFormatado;
	}

	public void setRealFormatado(String realFormatado) {
		this.realFormatado = realFormatado;
	}
	
	public EstadosDoSul[] getListaEstados() {
		return uf.values();
	}
	
	public EstadosDoSul getUf() {
		return uf;
	}

	public void setUf(EstadosDoSul uf) {
		this.uf = uf;
	}
	

}
