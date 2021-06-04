package br.com.gof.comportamentais.iteratorInterno;

import br.com.gof.comportamentais.iteratorExterno.Canal;
import br.com.gof.comportamentais.iteratorExterno.IteradorInterface;

public class IteradorPrint extends IteradorInterno {

	public IteradorPrint(IteradorInterface it) {
		this.it = it;
	}

	@Override
	protected void operacao(Canal canal) {
		System.out.println(canal.nome);
	}

}
