package br.com.exercicios.questao_05.chainofresponsability;

public class CinquentaCentavos extends MoedaChain {

	public CinquentaCentavos() {
		super(Moeda.CinquentaCentavos);
	}

	@Override
	protected float obterValorDecimal() {
		return 0.50f;
	}

}
