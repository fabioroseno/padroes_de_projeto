package br.com.exercicios.questao_08.templatemethod;

public class Inverte extends ClasseAbstrata {

	@Override
	protected void maiusculizar(String texto) {
	}

	@Override
	protected void minusculizar(String texto) {
	}

	@Override
	protected void duplicar(String texto) {
	}

	@Override
	protected void inverter(String texto) {
		StringBuffer sb = new StringBuffer(texto);
		sb.reverse();
		System.out.println(sb);
	}

}
