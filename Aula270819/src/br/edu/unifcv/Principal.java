package br.edu.unifcv;

public class Principal {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		
		//gato.nome = "Tom";
		gato.miar();
		gato.mamar();
		
		Cachorro cachorro = new Cachorro("Bilu");
		cachorro.latir();
		cachorro.mamar();
		
	}

}
