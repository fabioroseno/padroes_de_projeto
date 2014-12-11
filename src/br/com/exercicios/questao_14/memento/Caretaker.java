package br.com.exercicios.questao_14.memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Caretaker {
	List<Memento> states;

	public Caretaker() {
		states = new ArrayList<Memento>();
	}

	public void save(Originator orig) {
		states.add(orig.createMemento());
		print();
	}

	public void undo(Originator orig) {
		states.remove(states.size() - 1);
		orig.setMemento(states.get(states.size() - 1));
		print();
	}

	public void print() {
		System.out.println();
		Iterator<Memento> it = states.iterator();
		while (it.hasNext()) {
			Memento m = it.next();
			State s = m.getState();
			System.out.print(s.getDescricao());
			if (it.hasNext())
				System.out.print(' ');
		}
	}

	public void calc() {
		try {
			Validator.isValid(states);
			System.out.print(" = " + Calculator.calculate(states));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
