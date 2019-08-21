package br.edu.unifcv;

public class Principal {

	public static void main(String[] args) {
		Cachorro bidu = new Cachorro();

		bidu.nome = "Tio Bila";
		bidu.idade = 1;
		bidu.corPelo = "Azul";
		bidu.peso = "6KG";
		bidu.tamanhoPelo = "Cabeludo";

		bidu.latir();
		bidu.comer();

		Cachorro pluto = new Cachorro();
		pluto.nome = "Mister X";
		pluto.idade = 1;
		pluto.corPelo = "Black";
		pluto.peso = "10kg";
		pluto.tamanhoPelo = "Curto";

		pluto.comer();
		pluto.latir();

		Gato link = new Gato();
		link.nome = "Ganondorf";
		link.idade = 5;
		link.corPelo = "Amarelo";

		link.dormir();
		link.miar();

	}
}
