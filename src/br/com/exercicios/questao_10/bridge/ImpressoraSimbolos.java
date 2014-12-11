package br.com.exercicios.questao_10.bridge;

import java.util.List;

public class ImpressoraSimbolos implements Impressora {

	@Override
	public void imprimir(List<String> itens) {
		int i = 0;
		while (i < itens.size()) {
			String str = itens.get(i);
			System.out.println("- " + str);
			i++;
		}
	}

}
