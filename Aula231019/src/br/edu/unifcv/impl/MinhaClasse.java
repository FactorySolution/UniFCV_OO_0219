package br.edu.unifcv.impl;

import br.edu.unifcv.interfaces.MinhaInterface;

public class MinhaClasse extends Helper implements MinhaInterface {

	@Override
	public void resultado() {
		//System.out.println("Estou chamando de Minha Classe");
		imprimir("Estou chamando de Minha Classe");
	}

}
