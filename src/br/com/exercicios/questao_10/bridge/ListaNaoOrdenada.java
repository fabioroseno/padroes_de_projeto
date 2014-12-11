package br.com.exercicios.questao_10.bridge;

public class ListaNaoOrdenada extends Lista {

	public ListaNaoOrdenada(Impressora imp) {
		super(imp);
	}

	@Override
	public void adicionar(String item) {
		itens.add(item);
	}

}
