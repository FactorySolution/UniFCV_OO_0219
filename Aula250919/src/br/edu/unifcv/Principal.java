package br.edu.unifcv;

import br.edu.unifcv.calculadora.Dividir;
import br.edu.unifcv.calculadora.Resultado;
import br.edu.unifcv.calculadora.Somar;
import br.edu.unifcv.calculadora.Subtrair;

public class Principal {

	public static void main(String[] args) {
		int operacao = 1;
		
		Resultado resultado = null;
		
		switch (operacao) {
		case 0:
			resultado = new Somar();
			break;
		case 1:
			resultado = new Subtrair();
			break;
		case 2: 
			resultado = new Dividir();
			break;
		}
		System.out.println(resultado.total());
	}
	
}
