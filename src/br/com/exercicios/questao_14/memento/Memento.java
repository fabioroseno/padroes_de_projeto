package br.com.exercicios.questao_14.memento;

public class Memento {
	State state;

	public Memento(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}
}
