package br.com.exercicios.questao_10.bridge;

public class Aplicacao {

	public static void main(String[] args) {

		Lista lista = new ListaOrdenada(new ImpressoraLetras());
		lista.adicionar("Fabiano");
		lista.adicionar("Alberto");
		lista.adicionar("Daniel");
		lista.adicionar("Roberto");
		lista.adicionar("Flavio");
		lista.imprimir();

	}

}
