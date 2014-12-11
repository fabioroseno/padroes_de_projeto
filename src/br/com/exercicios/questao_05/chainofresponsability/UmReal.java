package br.com.exercicios.questao_05.chainofresponsability;

public class UmReal extends MoedaChain {

	public UmReal() {
		super(Moeda.UmReal);
	}

	@Override
	protected float obterValorDecimal() {
		return 1.00f;
	}

}
