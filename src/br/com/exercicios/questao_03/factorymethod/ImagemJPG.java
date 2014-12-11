package br.com.exercicios.questao_03.factorymethod;

public class ImagemJPG extends Imagem {

	@Override
	public void carregar() {
		System.out.println("Imagem JPG.");
		System.out.println("Carregando imagem JPG...");
	}

	@Override
	public void exibir() {
		System.out.println("Exibindo imagem JPG por 20 segundos.");
	}

	@Override
	public void fechar() {
		System.out.println("Fechando imagem JPG.");
	}

}
