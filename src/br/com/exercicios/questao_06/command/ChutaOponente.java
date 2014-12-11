package br.com.exercicios.questao_06.command;

public class ChutaOponente implements ICommand {

	JogoLuta luta;

	public ChutaOponente(JogoLuta luta) {
		luta._local = "Luta";
		this.luta = luta;
	}

	@Override
	public void executar() {
		luta.chutar();
	}

}
