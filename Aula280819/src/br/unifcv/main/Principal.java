package br.unifcv.main;

public class Principal {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.nome = "André";
		gerente.sobreNome = "Oliveira";
		
		gerente.departamento = "TI";
		gerente.email = "andre@andre.com";
		gerente.idade = 33;
		gerente.turno = "Noite";
		
		gerente.numMatricula = 123456;
		gerente.setor = "Vendas";
		
		gerente.comandar();
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.nome = "André";
		funcionario.sobreNome = "Oliveira";
		
		//funcionario.departamento = "TI";
		funcionario.email = "andre@andre.com";
		funcionario.idade = 33;
		//funcionario.turno = "Noite";
		
		funcionario.numMatricula = 123456;
		funcionario.setor = "Vendas";
		
		funcionario.trabalhando();

	}

}
