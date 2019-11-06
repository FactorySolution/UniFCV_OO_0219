package br.edu.unifcv.impl;

import br.edu.unifcv.interfaces.MinhaInterface;

public class ClasseMaster extends Helper implements MinhaInterface {

	@Override
	public void resultado() {
		//System.out.println("Estou chamando de Classe Master");
		imprimir("Estou chamando de Classe Master");
	}

}
