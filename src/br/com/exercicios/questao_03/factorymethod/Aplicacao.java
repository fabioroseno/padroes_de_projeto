package br.com.exercicios.questao_03.factorymethod;

public class Aplicacao {

	public static void main(String[] args) {

		Imagem bmp = new FactoryImagem().getImagem("BMP");

		bmp.carregar();
		bmp.exibir();
		bmp.fechar();

		Imagem jpg = new FactoryImagem().getImagem("JPG");

		jpg.carregar();
		jpg.exibir();
		jpg.fechar();

	}

}
