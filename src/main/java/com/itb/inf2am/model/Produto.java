package com.itb.inf2am.model;

public class Produto {
	
	private Long id;
	private String nome;
	private String descricao;
	private String CodigoBarras;
	private double preco;
	private boolean codStatus;
	
	// public : Acesso liberado para todas as classes.
	
	// private : Acesso permitido apenas para os membros
	// 			 (atributos e ou métodos) da própria classe.

	
	// Métodos Setter's e Getter's : Atribuir e recuperar dados
	// dos atributos "RESPECTIVAMENTE"
	// Cada atributo possui o seu método set e o seu método get
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Long getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	
	
	public void setCodigoBarras(String CodigoBarras) {
		this.CodigoBarras = CodigoBarras;
	}
	
	
	public String getCodigoBarras() {
		return CodigoBarras;
	}
	
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	public double getPreco() {
		return preco;	
	}


	public boolean getCodStatus() {
		return codStatus;
	}


	public void setCodStatus(boolean codStatus) {
		this.codStatus = codStatus;
	}
	
	
	
}
