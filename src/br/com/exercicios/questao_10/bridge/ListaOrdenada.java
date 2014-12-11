package br.com.exercicios.questao_10.bridge;

public class ListaOrdenada extends Lista {
	public ListaOrdenada(Impressora imp) {
		super(imp);
	}

	@Override
	public void adicionar(String item) {
		int i = 0;
		while (i < itens.size()) {
			String str = itens.get(i);
			if (item.compareToIgnoreCase(str) < 0) {
				itens.add(i, item);
				return;
			}
			i++;
		}
		itens.add(item);
	}

}
