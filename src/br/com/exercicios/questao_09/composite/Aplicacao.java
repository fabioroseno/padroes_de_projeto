package br.com.exercicios.questao_09.composite;

public class Aplicacao {

	public static void main(String[] args) {

		ParticipanteComponent uece = new Instituicao("UECE");
		ParticipanteComponent dceUnifor = new Instituicao("Dce da Unifor");
		ParticipanteComponent unifor = new Instituicao("Unifor");

		ParticipanteComponent sandrinha = new Individuo("Sandrina", 26);
		ParticipanteComponent jurema = new Individuo("Jurema", 27);

		unifor.adicionar(dceUnifor);

		dceUnifor.adicionar(new Individuo("Sheila", 19));
		dceUnifor.adicionar(new Individuo("Priscila", 20));
		dceUnifor.adicionar(new Individuo("Camila", 21));

		Congresso congresso = new Congresso();

		congresso.setTotalAssentos(6);

		congresso.adicionarParticipante(unifor);
		congresso.adicionarParticipante(sandrinha);
		congresso.adicionarParticipante(jurema);

		congresso.imprimeParticipantes();

	}

}