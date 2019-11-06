package br.edu.unifcv.pilha;

public class Pilha {

	private int max, topo;
	private int[] elementos;

	public Pilha(int max) {
		this.topo = -1;
		this.max = max;
		this.elementos = new int[max];
	}

	public void push(int e) {
		if (topo < (max - 1))
			elementos[++topo] = e;
	}

	public int pop() {
		if (topo >= 0)
			return elementos[topo--];
		return -1;
	}

}
