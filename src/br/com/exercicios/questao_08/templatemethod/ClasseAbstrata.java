package br.com.exercicios.questao_08.templatemethod;

public abstract class ClasseAbstrata {

	public final void metodoModelo(String texto) {
		maiusculizar(texto);
		minusculizar(texto);
		duplicar(texto);
		inverter(texto);
	}

	protected abstract void maiusculizar(String texto);

	protected abstract void minusculizar(String texto);

	protected abstract void duplicar(String texto);

	protected abstract void inverter(String texto);

}
