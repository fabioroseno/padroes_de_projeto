package br.com.exercicios.questao_10.bridge;

import java.util.List;

public class ImpressoraLetras implements Impressora {

	@Override
	public void imprimir(List<String> itens) {
		int i = 0;
		while (i < itens.size()) {
			String str = itens.get(i);
			char letra = (char) ('a' + (i % 26));
			System.out.println(letra + ". " + str);
			i++;
		}
	}

}
