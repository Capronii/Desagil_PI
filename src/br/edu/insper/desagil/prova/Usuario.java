package br.edu.insper.desagil.prova;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Video> videos;
	
	
	public Usuario(String nome) {
		super();
		this.nome=nome;	
		this.videos =new ArrayList<>();
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	
	public void postaVideo(int id,Produto produto){
		Video nuevovideo= new Video(id,this,produto);
		this.videos.add(nuevovideo);
	}
	
	public int totatAvaliacoes() {
		int soma=0;
		
		for (Video video : this.videos) {
			soma+=video.mediaAvaliacoes();
			
		}
		return soma;
	}
}
