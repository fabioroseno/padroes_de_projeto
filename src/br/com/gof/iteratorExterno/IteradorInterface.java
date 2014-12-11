package br.com.gof.iteratorExterno;

public interface IteradorInterface {
	void first();

	void next();

	boolean isDone();

	Canal currentItem();
}
