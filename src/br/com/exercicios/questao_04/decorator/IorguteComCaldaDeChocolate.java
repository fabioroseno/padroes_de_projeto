package br.com.exercicios.questao_04.decorator;

public class IorguteComCaldaDeChocolate extends IorguteDecorator {

	public IorguteComCaldaDeChocolate(Iorgute iorguteDecorado) {
		super(iorguteDecorado);
		custo = 1.8;
		produtos = "Calda de Chocolate";
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
