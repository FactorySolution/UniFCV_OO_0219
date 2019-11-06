package br.edu.unifcv;

public class Gerente extends Pessoa {

	public Gerente(String nome) {
		super(nome);
	}
	

	@Override
	protected void somar() {
		System.out.println("OLAAAAAA");

	}

}
