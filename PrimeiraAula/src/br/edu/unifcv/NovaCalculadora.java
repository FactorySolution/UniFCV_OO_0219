package br.edu.unifcv;

public class NovaCalculadora {
	
	public void Somar(int valorA, int valorB) {
		int resultado = valorA + valorB;
		System.out.println("Soma = " + resultado);
	}

	public void Subtrair(int valorA, int valorB) {
		int resultado = valorA - valorB;
		System.out.println("Subtracao = " + resultado);
	}

	public void Dividir(int valorA, int valorB) {
		double resultado = valorA / valorB;
		System.out.println("Divisao = " + resultado);
	}

	public void Multiplicar(int valorA, int valorB) {
		int resultado = valorA * valorB;
		System.out.println("Multiplicacao = " + resultado);
	}

}
