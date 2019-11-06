package br.edu.unifcv.pilha;

public class PilhaGenerica<T> {

	private int topo, max;
	private T[] elementos;

	public PilhaGenerica(int max) {
		this.topo = -1;
		this.max = max;
		this.elementos = (T[]) new Object[max];
	}

	public void push(T e) {
		if (topo < (max - 1))
			elementos[++topo] = e;
	}
	
	public T pop() throws Error {
		if (topo >= 0)
			return elementos[topo--];
		throw new Error();
	}
}
