package br.com.exercicios.questao_09.composite;

public class Individuo extends ParticipanteComponent {

	private int assento;

	public Individuo(String nome, int assento) {
		this.nome = nome;
		this.assento = assento;
	}

	public int getAssento() {
		return assento;
	}

}
