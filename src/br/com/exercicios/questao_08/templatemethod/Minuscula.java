package br.com.exercicios.questao_08.templatemethod;

public class Minuscula extends ClasseAbstrata {

	@Override
	protected void maiusculizar(String texto) {
	}

	@Override
	protected void minusculizar(String texto) {
		System.out.println(texto.toLowerCase());
	}

	@Override
	protected void duplicar(String texto) {
	}

	@Override
	protected void inverter(String texto) {
	}

}
