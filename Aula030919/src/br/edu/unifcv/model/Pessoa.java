package br.edu.unifcv.model;

public class Pessoa {
	
	private String nome;
	private String sobreNome;
		
	public String getNome() {
		if (nome.isEmpty()) 
			return "Sem nome";
		return nome;
	}
	public void setNome(String nome) {
		if (!nome.isEmpty())
			this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
}
