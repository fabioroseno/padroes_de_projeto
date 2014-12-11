package br.com.exercicios.questao_11.adapter;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter implements Somador {

	SomadorQueDeveSerAdaptado somadorQueDeveSerAdaptado;

	public SomadorAdapter(SomadorQueDeveSerAdaptado somadorQueDeveSerAdaptado) {
		this.somadorQueDeveSerAdaptado = somadorQueDeveSerAdaptado;
	}

	@Override
	public int somar(int[] vetor) {

		List<Integer> lista = new ArrayList<Integer>();

		for (int i = 0; i < vetor.length; i++) {
			lista.add(vetor[i]);
		}

		return somadorQueDeveSerAdaptado.somaLista(lista);
	}

}
