package br.com.exercicios.questao_06.command;

public class JogoFutebol {

	public String _local = "";

	public JogoFutebol() {
	}

	public void tocarBola() {
		System.out.println(_local + ": tocou a bola.");
	}

	public void chutarAGol() {
		System.out.println(_local + ": chutou a bola a Gol.");
	}

}
