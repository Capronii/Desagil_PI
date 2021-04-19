package br.edu.insper.desagil.prova;

public class Produto {
	private String name;
	private double preco;
	
	public Produto(String name,double preco) {
		this.name=name;
		this.preco=preco;
	}
	
	
	
	public String getName() {
		return this.name;
	}
	public double getPreco() {
		return this.preco;
	}

	
}
