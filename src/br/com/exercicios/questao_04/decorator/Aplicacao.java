package br.com.exercicios.questao_04.decorator;

public class Aplicacao {

	public static void main(String[] args) {

		Iorgute morango = new IorguteDeMorango();
		System.out.println("Produto: " + morango.getProdutos());
		System.out.println("Preço: R$ " + morango.getCusto());

		morango = new IorguteComCaldaDeChocolate(morango);
		morango = new IorguteComCastanha(morango);

		System.out.println("Produto: " + morango.getProdutos());
		System.out.println("Preço: R$ " + morango.getCusto());

		Iorgute manga = new IorguteDeManga();
		System.out.println("Produto: " + manga.getProdutos());
		System.out.println("Preço: R$ " + manga.getCusto());

		manga = new IorguteComFrutasCristalizadas(manga);

		System.out.println("Produto: " + manga.getProdutos());
		System.out.println("Preço: R$ " + manga.getCusto());

	}

}
