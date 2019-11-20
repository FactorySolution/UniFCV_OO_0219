package br.edu.unifcv.interfaces;

import java.util.List;

import br.edu.unifcv.lista.ListaGenerica;
import br.edu.unifcv.model.Endereco;

public class MetodosImplEndereco extends ListaGenerica<Endereco> implements EnderecoInterface {

	@Override
	public List<Endereco> todosLivros() {
		return super.getAll();
	}

	@Override
	public Endereco get(int index) {
		return super.get(index);
	}

	@Override
	public void insert(Endereco endereco) {
		super.insert(endereco);

	}

}
