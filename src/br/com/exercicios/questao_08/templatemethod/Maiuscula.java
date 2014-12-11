package br.com.exercicios.questao_08.templatemethod;

public class Maiuscula extends ClasseAbstrata {

	@Override
	protected void maiusculizar(String texto) {
		System.out.println(texto.toUpperCase());
	}

	@Override
	protected void minusculizar(String texto) {
	}

	@Override
	protected void duplicar(String texto) {
	}

	@Override
	protected void inverter(String texto) {
	}

}
