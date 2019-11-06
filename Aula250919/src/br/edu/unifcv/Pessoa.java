package br.edu.unifcv;

public abstract class Pessoa {

	private String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	protected abstract void somar();
	
	public void teste() {
		this.somar();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
