package br.edu.unifcv.collection;

public class Pessoa {

	private String nome;
	private String sobreNome;
	private Integer idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + 
				" sobrenome: " + sobreNome + 
				" idade: " + idade.toString();
	}

}
