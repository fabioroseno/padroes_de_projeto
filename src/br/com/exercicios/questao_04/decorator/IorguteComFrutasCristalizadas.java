package br.com.exercicios.questao_04.decorator;

public class IorguteComFrutasCristalizadas extends IorguteDecorator {

	public IorguteComFrutasCristalizadas(Iorgute iorguteDecorado) {
		super(iorguteDecorado);
		custo = 2.00;
		produtos = "Frutas Cristalizadas";
	}

	@Override
	public String getProdutos() {
		return super.getProdutos() + ", " + produtos;
	}

	@Override
	public String getDescricao() {
		return super.getDescricao();
	}

	@Override
	public double getCusto() {
		return super.getCusto() + custo;
	}

}
