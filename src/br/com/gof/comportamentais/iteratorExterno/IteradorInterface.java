package br.com.gof.comportamentais.iteratorExterno;

public interface IteradorInterface {
	void first();

	void next();

	boolean isDone();

	Canal currentItem();
}
