package br.edu.unifcv.interfaces;

import br.edu.unifcv.model.Pessoa;

public interface PessoaInterface extends Metodos<Pessoa> {

	Pessoa buscaPeloSobreNome(String sobrenome);
}
