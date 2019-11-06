package br.edu.unifcv.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Principal {

	public static void main(String[] args) {

		List<Pessoa> p = new ArrayList<Pessoa>();

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("andre");
		pessoa.setSobreNome("Oliveira");
		pessoa.setIdade(33);

		p.add(pessoa);

		p.size();

		Queue<String> a = new ArrayDeque<String>();

		// p.remove(0);

		// p.add(5, pessoa);

		// p.get(0);

		// p.indexOf(pessoa);

		for (int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i).toString());
		}

		for (Pessoa pe : p) {
			System.out.println(pe.toString());
		}

		// List<Map<String, String>> c = new ArrayList<Map<String,String>>()

//		Map<Integer, Pessoa> a  = new HashMap<Integer, Pessoa>();
//		
//		a.put(0, (Pessoa) p);
//		
//		
//		for (Iterator iterator = p.iterator(); iterator.hasNext();) {
//			Pessoa pessoa = (Pessoa) iterator.next();
//			
//		}

//		p.stream().forEach(c -> System.out.println(c.toString()));
//
//		p.stream().filter(c -> c.getNome().equalsIgnoreCase("andre"));
//		
		// String a[] = (String) new String[10]();

//		List<String> a = new ArrayList<String>();
//		a.add("andre");
//		a.add("");
//		a.add("");
//		
//		List<String> b = new LinkedList<String>();
//		b.add("");

	}

}
