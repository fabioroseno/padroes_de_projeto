package br.com.exercicios.questao_05.chainofresponsability;

public class VinteECincoCentavos extends MoedaChain {

	public VinteECincoCentavos() {
		super(Moeda.VinteECincoCentavos);
	}

	@Override
	protected float obterValorDecimal() {
		return 0.25f;
	}

}
