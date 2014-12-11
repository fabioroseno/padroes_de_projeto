package br.com.exercicios.questao_11.adapter;

public class Aplicacao {

	public static void main(String args[]) {

		int[] vetor = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		SomadorQueDeveSerAdaptado somadorQueDeveSerAdaptado = new SomadorQueDeveSerAdaptado();

		Somador somador = new SomadorAdapter(somadorQueDeveSerAdaptado);

		System.out.println(somador.somar(vetor));

	}

}
