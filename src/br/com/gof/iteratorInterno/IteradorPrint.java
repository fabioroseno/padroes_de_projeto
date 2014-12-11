package br.com.gof.iteratorInterno;

import br.com.gof.iteratorExterno.Canal;
import br.com.gof.iteratorExterno.IteradorInterface;

public class IteradorPrint extends IteradorInterno {

	public IteradorPrint(IteradorInterface it) {
		this.it = it;
	}

	@Override
	protected void operacao(Canal canal) {
		System.out.println(canal.nome);
	}

}
