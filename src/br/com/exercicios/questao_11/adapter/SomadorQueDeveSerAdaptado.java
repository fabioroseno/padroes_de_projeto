package br.com.exercicios.questao_11.adapter;

import java.util.List;

public class SomadorQueDeveSerAdaptado {

	public int somaLista(List<Integer> lista) {
		int resultado = 0;
		for (int i : lista)
			resultado += i;

		return resultado;
	}

}
