package br.com.gof.estruturais.adapter;

public interface ImagemTarget {
	void carregarImagem(String nomeDoArquivo);

	void desenharImagem(int posX, int posY, int largura, int altura);
}
