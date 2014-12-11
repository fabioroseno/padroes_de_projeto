package br.com.gof.iteratorInterno;

import br.com.gof.iteratorExterno.Canal;
import br.com.gof.iteratorExterno.IteradorInterface;

public abstract class IteradorInterno {

	IteradorInterface it;

	public void percorrerLista() {
		for (it.first(); !it.isDone(); it.next()) {
			operacao(it.currentItem());
		}
	}

	protected abstract void operacao(Canal canal);
}
