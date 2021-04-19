package br.edu.insper.desagil.prova;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Video{
	
	private int	id;
	private Usuario usuario;
	private Produto produto;
	private Map<String, Integer> avaliacoes;
	

	public Video (int id,Usuario usuario,Produto produto) {
		super();
		this.id=id;
		this.usuario= usuario;
		this.produto= produto;
		this.avaliacoes=new HashMap<>();
		
	}
	
	
	public int getId() {
		return this.id;
	}
	
	public Produto getProduto() {
		return this.produto;
	}
	
	public void adicionaAvaliacao(Usuario usuario,int valor) {
		if (this.usuario.getNome() != usuario.getNome() && ((valor>=1) && (valor<=5))) {
			this.avaliacoes.put(usuario.getNome(),valor);
		}
		
	}
	
	public int mediaAvaliacoes() {
		double quant=0;
		double soma=0.0;

		for (String nome: this.avaliacoes.keySet()) {
			soma+=this.avaliacoes.get(nome);
			quant+=1;
		}
		
		double med= quant/soma;
		long mediareal=Math.round(med);
		int MediaFinal = (int) mediareal;
		return MediaFinal;
	}
	
}
