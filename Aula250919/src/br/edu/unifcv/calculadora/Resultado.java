package br.edu.unifcv.calculadora;

public abstract class Resultado {
	
	protected abstract String resultado();
	
	public String total() {
		return this.resultado();
	}
	
	

}
