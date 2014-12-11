package br.com.exercicios.questao_04.decorator;

public abstract class IorguteDecorator implements Iorgute {

	protected Iorgute iorguteDecorado;
	protected double custo;
	protected String produtos;

	public IorguteDecorator(Iorgute iorguteDecorado) {
		this.iorguteDecorado = iorguteDecorado;
	}

	@Override
	public double getCusto() {
		return iorguteDecorado.getCusto();
	}

	@Override
	public String getDescricao() {
		return iorguteDecorado.getDescricao();
	}

	@Override
	public String getProdutos() {
		return iorguteDecorado.getProdutos();
	}

}
