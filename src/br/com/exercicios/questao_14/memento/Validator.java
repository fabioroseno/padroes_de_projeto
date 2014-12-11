package br.com.exercicios.questao_14.memento;

import java.util.Iterator;
import java.util.List;

public class Validator {

	public static boolean isValid(List<Memento> states) throws Exception {
		int count = 0;
		Iterator<Memento> it = states.iterator();
		while (it.hasNext()) {
			Memento m = it.next();
			State s = m.getState();
			if (Operando.class.isInstance(s))
				count++;
			if (Operador.class.isInstance(s))
				count--;
			if (Math.abs(count) >= 2)
				throw new Exception("Expressão Irregular.[1]");
		}
		if (count == 1)
			return true;
		throw new Exception("Expressão Irregular.[2]");
	}

}
