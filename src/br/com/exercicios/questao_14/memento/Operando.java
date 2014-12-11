package br.com.exercicios.questao_14.memento;

public class Operando extends State {

	double valor;

	public Operando(double valor) {
		super();
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String getDescricao() {
		return String.valueOf(valor);
	}

	@Override
	public State clone() {
		return new Operando(valor);
	}

}
