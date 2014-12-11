package br.com.exercicios.questao_06.command;

public class JogoLuta {

	public String _local = "";

	public JogoLuta() {
	}

	public void socar() {
		System.out.println(_local + ": lutador socou.");
	}

	public void chutar() {
		System.out.println(_local + ": lutador chutou.");
	}

}
