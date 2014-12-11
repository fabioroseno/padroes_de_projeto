package br.com.exercicios.questao_06.command;

public class ChutaAGol implements ICommand {

	JogoFutebol futebol;

	public ChutaAGol(JogoFutebol futebol) {
		futebol._local = "Futebol";
		this.futebol = futebol;
	}

	@Override
	public void executar() {
		futebol.chutarAGol();
	}

}
