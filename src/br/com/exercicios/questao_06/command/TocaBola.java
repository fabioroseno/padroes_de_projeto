package br.com.exercicios.questao_06.command;

public class TocaBola implements ICommand {

	JogoFutebol futebol;

	public TocaBola(JogoFutebol futebol) {
		futebol._local = "Futebol";
		this.futebol = futebol;
	}

	@Override
	public void executar() {
		futebol.tocarBola();
	}

}
