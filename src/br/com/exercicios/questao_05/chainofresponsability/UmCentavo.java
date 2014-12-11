package br.com.exercicios.questao_05.chainofresponsability;

public class UmCentavo extends MoedaChain {

	public UmCentavo() {
		super(Moeda.UmCentavo);
	}

	@Override
	protected float obterValorDecimal() {
		return 0.01f;
	}

}
