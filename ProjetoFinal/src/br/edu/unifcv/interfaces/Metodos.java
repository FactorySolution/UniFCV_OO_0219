package br.edu.unifcv.interfaces;

import java.util.List;

public interface Metodos<T> {

	List<T> todosLivros();

	T get(int index);

	void insert(T t);

}
