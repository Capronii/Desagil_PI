package br.edu.insper.desagil.prova;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPI {

	
	@Test

	void test1() {
		Vendedor Guilherme= new Vendedor("Guilherme");
		Vendedor Hashi = new Vendedor("Hahi");
		Vendedor Pedro = new Vendedor("Pedro");
		Produto escova = new Produto("Escova",12.9);
		
		Video videoone = new Video(1,Guilherme,escova);
		
		videoone.adicionaAvaliacao(Hashi,0);
		videoone.adicionaAvaliacao(Pedro,7);
		videoone.adicionaAvaliacao(Guilherme,4);
		
		assertEquals(0,Guilherme.totatAvaliacoes());
	}
	
	void test2() {
		Vendedor Guilherme= new Vendedor("Guilherme");
		Vendedor Hashi = new Vendedor("Hahi");
		Produto escova = new Produto("Escova",12.9);
		
		Video videoone = new Video(1,Guilherme,escova);
		
		videoone.adicionaAvaliacao(Hashi,3);
		
		assertEquals(3,Guilherme.totatAvaliacoes());
	}
	void test3() {
		Vendedor Guilherme= new Vendedor("Guilherme");
		Vendedor Hashi = new Vendedor("Hahi");
		Vendedor Pedro = new Vendedor("Pedro");
		Produto escova = new Produto("Escova",12.9);
		
		Video videoone = new Video(1,Guilherme,escova);
		
		videoone.adicionaAvaliacao(Hashi,3);
		videoone.adicionaAvaliacao(Pedro,5);
		
		assertEquals(8,Guilherme.totatAvaliacoes());
		
	}
	
	void test4() {
		Vendedor Guilherme= new Vendedor("Guilherme");
		Vendedor Hashi = new Vendedor("Hahi");
		Vendedor Pedro = new Vendedor("Pedro");
		Vendedor Jorge = new Vendedor("Jorge");
		Produto escova = new Produto("Escova",12.9);
		
		Video videoone= new Video(1,Guilherme,escova);
		
		videoone.adicionaAvaliacao(Hashi,3);
		videoone.adicionaAvaliacao(Pedro,5);
		videoone.adicionaAvaliacao(Jorge,4);
		
		assertEquals(13,Guilherme.totatAvaliacoes());
		
	}
	
	void teste5() {

		Vendedor Guilherme= new Vendedor("Guilherme");
		Vendedor Hashi = new Vendedor("Hahi");
		Vendedor Pedro = new Vendedor("Pedro");
		Vendedor Jorge = new Vendedor("Jorge");
		Produto escova = new Produto("Escova",12.9);
		Produto pasta = new Produto ("Pasta",8);
		
		Video videoone = new Video(1,Guilherme,escova);
		Video videotwo = new Video(1,Guilherme,pasta);
		
		videoone.adicionaAvaliacao(Hashi,3);
		videoone.adicionaAvaliacao(Pedro,5);
		videotwo.adicionaAvaliacao(Jorge,4);
		
		assertEquals(13,Guilherme.totatAvaliacoes());
		
	}

}
