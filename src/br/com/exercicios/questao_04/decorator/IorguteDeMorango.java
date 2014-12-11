package br.com.exercicios.questao_04.decorator;

public class IorguteDeMorango implements Iorgute {

	private double custo = 2.00;
	private String produtos = "Iorgute de Morango";
	private String descricao = "Excelente Iorgute de Sabor de Morango";

	@Override
	public double getCusto() {
		return custo;
	}

	@Override
	public String getDescricao() {
		return produtos;
	}

	@Override
	public String getProdutos() {
		return descricao;
	}

}
