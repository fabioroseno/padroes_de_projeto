package br.com.exercicios.questao_06.command;

public class SocaOponente implements ICommand {

	JogoLuta luta;

	public SocaOponente(JogoLuta luta) {
		luta._local = "Luta";
		this.luta = luta;
	}

	@Override
	public void executar() {
		luta.socar();
	}

}
