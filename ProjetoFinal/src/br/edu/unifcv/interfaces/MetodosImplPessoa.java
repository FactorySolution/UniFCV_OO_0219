package br.edu.unifcv.interfaces;

import java.util.List;

import br.edu.unifcv.lista.ListaGenerica;
import br.edu.unifcv.model.Pessoa;

public class MetodosImplPessoa 
extends ListaGenerica<Pessoa> implements PessoaInterface {

	@Override
	public List<Pessoa> todosLivros() {

		return super.getAll();
	}

	@Override
	public Pessoa get(int index) {
		// TODO Auto-generated method stub
		return super.get(index);
	}

	@Override
	public void insert(Pessoa pessoa) {
		super.insert(pessoa);

	}

	@Override
	public Pessoa buscaPeloSobreNome(String sobrenome) {
		
		return null;
	}

}
