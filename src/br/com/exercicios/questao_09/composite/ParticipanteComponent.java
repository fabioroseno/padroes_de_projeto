package br.com.exercicios.questao_09.composite;

public abstract class ParticipanteComponent {

	protected String nome;
	private int assento;

	public void adicionar(ParticipanteComponent newParticipanteComponent) {
		throw new UnsupportedOperationException();
	}

	public void remover(ParticipanteComponent newParticipanteComponent) {
		throw new UnsupportedOperationException();
	}

	public String getNomeParticipante() {
		return nome;
	}

	public int getAssentoParticipante() {
		return assento;
	}
}
