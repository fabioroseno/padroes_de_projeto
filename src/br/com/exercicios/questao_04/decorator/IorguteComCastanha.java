package br.com.exercicios.questao_04.decorator;

public class IorguteComCastanha extends IorguteDecorator {

	public IorguteComCastanha(Iorgute iorguteDecorado) {
		super(iorguteDecorado);
		custo = 1.5;
		produtos = "Castanha";
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
