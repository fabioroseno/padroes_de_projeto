package br.com.exercicios.questao_06.command;

public class Freia implements ICommand {

	JogoCorrida corrida;

	public Freia(JogoCorrida corrida) {
		corrida._local = "Corrida";
		this.corrida = corrida;
	}

	@Override
	public void executar() {
		corrida.freiar();
	}

}
