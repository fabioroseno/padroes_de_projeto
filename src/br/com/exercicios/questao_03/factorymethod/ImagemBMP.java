package br.com.exercicios.questao_03.factorymethod;

public class ImagemBMP extends Imagem {

	@Override
	public void carregar() {
		System.out.println("Imagem BMP.");
		System.out.println("Carregando imagem BMP...");
	}

	@Override
	public void exibir() {
		System.out.println("Exibindo imagem BMP por 20 segundos.");
	}

	@Override
	public void fechar() {
		System.out.println("Fechando imagem BMP.");
	}

}
