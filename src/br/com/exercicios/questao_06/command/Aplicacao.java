package br.com.exercicios.questao_06.command;

public class Aplicacao {

	public static void main(String[] args) {

		Joystick c1 = new Joystick();
		JogoFutebol futebol = new JogoFutebol();
		c1.SetaComando(new TocaBola(futebol), new ChutaAGol(futebol));
		c1.botaoA();
		c1.botaoB();

		// --------------------------------------------

		Joystick c2 = new Joystick();
		JogoCorrida corrida = new JogoCorrida();
		c2.SetaComando(new Acelera(corrida), new Freia(corrida));
		c2.botaoA();
		c2.botaoB();

		// --------------------------------------------

		Joystick c3 = new Joystick();
		JogoLuta luta = new JogoLuta();
		c3.SetaComando(new SocaOponente(luta), new ChutaOponente(luta));
		c3.botaoA();
		c3.botaoB();

	}

}
