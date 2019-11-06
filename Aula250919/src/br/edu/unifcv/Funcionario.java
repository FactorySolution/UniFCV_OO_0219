package br.edu.unifcv;

public class Funcionario extends Pessoa {
	

	public Funcionario(String nome) {
		super(nome);

	}

	@Override
	protected void somar() {
		System.out.println("Funcionario");
		
	}

}
