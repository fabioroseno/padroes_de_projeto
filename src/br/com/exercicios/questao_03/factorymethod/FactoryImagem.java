package br.com.exercicios.questao_03.factorymethod;

public class FactoryImagem {

	public Imagem getImagem(String imagem) {
		if (imagem.equals("BMP")) {
			return new ImagemBMP();
		} else if (imagem.equals("JPG")) {
			return new ImagemJPG();
		}
		return null;
	}

}
