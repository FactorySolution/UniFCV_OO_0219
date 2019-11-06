package br.edu.unifcv;

import br.edu.unifcv.pilha.Pilha;
import br.edu.unifcv.pilha.PilhaGenerica;

public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha(10);
		
		p.push(10);
		p.push(15);
		
		System.out.println(p.pop());
		
		System.out.println("-------------------");
		
		PilhaGenerica<Integer> p1 = new PilhaGenerica<Integer>(10);
		p1.push(10);
		p1.push(30);
		
		System.out.println(p1.pop());
		
		System.out.println("-------------------");
		
		
		PilhaGenerica<String> p2 = new PilhaGenerica<String>(10);
		p2.push("Andre");
		p2.push("Oliveira");
		
		System.out.println(p2.pop());
		
	}

}
