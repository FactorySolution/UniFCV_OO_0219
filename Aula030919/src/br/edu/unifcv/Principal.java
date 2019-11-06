package br.edu.unifcv;

import br.edu.unifcv.model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		// Passando valor
		p.setNome("Andre");
		p.setSobreNome("Oliveira");
		//p.idade = 33;
		
		// Recuperando
		System.out.println(p.getNome());
		System.out.println(p.getSobreNome());
	}

}
