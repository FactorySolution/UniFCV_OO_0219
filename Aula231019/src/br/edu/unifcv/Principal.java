package br.edu.unifcv;

import br.edu.unifcv.impl.ClasseMaster;
import br.edu.unifcv.interfaces.MinhaInterface;

public class Principal {

	public static void main(String[] args) {
		MinhaInterface minhaInterface = new ClasseMaster();
		qualquerCoisa(minhaInterface);
	}

	public static void qualquerCoisa(MinhaInterface minhaInterface) {
		minhaInterface.resultado();
	}

}
