package br.com.exercicios.questao_14.memento;

public class Aplicacao {

	public static void main(String[] args) {

		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();

		originator.addState(new Operando(10));
		caretaker.save(originator);

		originator.addState(new Soma());
		caretaker.save(originator);

		originator.addState(new Operando(5));
		caretaker.save(originator);
		caretaker.calc();

		originator.addState(new Subtracao());
		caretaker.save(originator);

		originator.addState(new Operando(7));
		caretaker.save(originator);
		caretaker.calc();

		originator.addState(new Multiplicacao());
		caretaker.save(originator);

		originator.addState(new Operando(2));
		caretaker.save(originator);
		caretaker.calc();

	}

}
