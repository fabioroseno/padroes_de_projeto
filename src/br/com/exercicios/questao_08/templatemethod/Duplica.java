package br.com.exercicios.questao_08.templatemethod;

public class Duplica extends ClasseAbstrata {

	@Override
	protected void maiusculizar(String texto) {
	}

	@Override
	protected void minusculizar(String texto) {
	}

	@Override
	protected void duplicar(String texto) {
		System.out.println(texto + " | " + texto);
	}

	@Override
	protected void inverter(String texto) {
	}

}
