package br.edu.unifcv.lista;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifcv.model.Base;

public abstract class ListaGenerica<T extends Base> {

	private List<T> lista;

	public ListaGenerica() {
		this.lista = new ArrayList<>();
	}

	public List<T> getAll() {
		return lista;
	}

	public T get(int i) {
		return lista.get(i);
	}

	public void insert(T t) {
		lista.add(t);
	}

}
