package br.edu.unifcv;

public class DelphiEhVida {

	public void NodeEhBom(boolean bom) {
		if (bom == true) {
			System.out.println("Eh bom!!!!");
		} else {
			System.out.println("Nao eh bom  kkkk");
		}
	}

	public void QualEhMaior(int valorA, int valorB) {
		if (valorA > valorB) {
			System.out.println("'valorA' eh maior que 'valorB'");
		} else if (valorA < valorB) {
			System.out.println("'valorB' eh maior que 'valorA'");
		} else {
			System.out.println("São iguais");
		}
	}

	public void Decrementar(int valor) {
		while (valor >= 0) {
			System.out.println(valor);
			valor--;
		}

	}

}
