package br.com.exercicios.questao_10.bridge;

import java.util.ArrayList;
import java.util.List;

public abstract class Lista {

	List<String> itens;
	Impressora impressora;

	public Lista(Impressora imp) {
		itens = new ArrayList<String>();
		this.impressora = imp;
	}

	public abstract void adicionar(String item);

	public void imprimir() {
		impressora.imprimir(itens);
	}

}
