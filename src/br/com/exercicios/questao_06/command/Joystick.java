package br.com.exercicios.questao_06.command;

public class Joystick {

	private ICommand botaoA;
	private ICommand botaoB;

	public Joystick() {
		ICommand comando = new EnviaComando();
		this.botaoA = comando;
		this.botaoB = comando;
	}

	public void SetaComando(ICommand botaoA, ICommand botaoB) {
		this.botaoA = botaoA;
		this.botaoB = botaoB;
	}

	public void botaoA() {
		botaoA.executar();
	}

	public void botaoB() {
		botaoB.executar();
	}

}