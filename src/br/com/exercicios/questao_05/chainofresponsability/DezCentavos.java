package br.com.exercicios.questao_05.chainofresponsability;

public class DezCentavos extends MoedaChain {

	public DezCentavos() {
		super(Moeda.DezCentavos);
	}

	@Override
	protected float obterValorDecimal() {
		return 0.10f;
	}

}
