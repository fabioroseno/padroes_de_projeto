package br.com.exercicios.questao_06.command;

public class JogoCorrida {

	public String _local = "";

	public JogoCorrida() {
	}

	public void acelerar() {
		System.out.println(_local + ": acelerou o carro.");
	}

	public void freiar() {
		System.out.println(_local + ": freiou o carro.");
	}

}
