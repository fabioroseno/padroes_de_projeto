package br.com.gof.comportamentais.iteratorInterno;

import br.com.gof.comportamentais.iteratorExterno.Canal;
import br.com.gof.comportamentais.iteratorExterno.IteradorInterface;

public abstract class IteradorInterno {

	IteradorInterface it;

	public void percorrerLista() {
		for (it.first(); !it.isDone(); it.next()) {
			operacao(it.currentItem());
		}
	}

	protected abstract void operacao(Canal canal);
}
