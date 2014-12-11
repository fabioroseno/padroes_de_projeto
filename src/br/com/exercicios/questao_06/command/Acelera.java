package br.com.exercicios.questao_06.command;

public class Acelera implements ICommand {

	JogoCorrida corrida;

	public Acelera(JogoCorrida corrida) {
		corrida._local = "Corrida";
		this.corrida = corrida;
	}

	@Override
	public void executar() {
		corrida.acelerar();
	}

}
