package br.com.exercicios.questao_14.memento;

public class Subtracao extends Operador {

	@Override
	public String getDescricao() {
		return "-";
	}

	@Override
	public State clone() {
		return new Subtracao();
	}

}
