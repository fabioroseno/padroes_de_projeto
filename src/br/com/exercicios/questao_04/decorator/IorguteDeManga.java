package br.com.exercicios.questao_04.decorator;

public class IorguteDeManga implements Iorgute {

	private double custo = 2.50;
	private String produtos = "Iorgute de Manga";
	private String descricao = "Excelente Iorgute de Sabor de Manga";

	@Override
	public double getCusto() {
		return custo;
	}

	@Override
	public String getDescricao() {
		return descricao;
	}

	@Override
	public String getProdutos() {
		return produtos;
	}

}
