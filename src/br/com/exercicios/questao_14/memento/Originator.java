package br.com.exercicios.questao_14.memento;

public class Originator {

	State state;

	public Originator() {
		state = null;
	}

	public Memento createMemento() {
		return new Memento(state);
	}

	public void setMemento(Memento m) {
		state = m.getState();
	}

	public void addState(State state) {
		this.state = state;
	}

}
