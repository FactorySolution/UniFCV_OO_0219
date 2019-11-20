package br.edu.unifcv;

import br.edu.unifcv.interfaces.MetodosImplEndereco;
import br.edu.unifcv.interfaces.MetodosImplPessoa;
import br.edu.unifcv.model.Pessoa;

public class Principal {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		p.setID(1);
		p.setNome("Andre");
		p.setSobreNome("Oliveira");

		MetodosImplPessoa m = new MetodosImplPessoa();
		
		m.insert(p);
		m.get(0);
		m.getAll();

		m.buscaPeloSobreNome("");
		System.out.println(m.get(0).getNome());
		
		MetodosImplEndereco e = new MetodosImplEndereco();
		e.insert(null);

	}

}
