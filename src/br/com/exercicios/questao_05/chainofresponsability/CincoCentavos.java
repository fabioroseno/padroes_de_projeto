package br.com.exercicios.questao_05.chainofresponsability;

public class CincoCentavos extends MoedaChain {

	public CincoCentavos() {
		super(Moeda.CincoCentavos);
	}

	@Override
	protected float obterValorDecimal() {
		return 0.05f;
	}

}
