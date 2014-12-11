package br.com.exercicios.questao_14.memento;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	public static double calculate(List<Memento> sts) {
		List<Memento> states = new ArrayList<Memento>();
		int j = 0;
		while (j < sts.size()) {
			Memento m = sts.get(j);
			State s = m.getState();
			states.add(new Memento(s.clone()));
			j++;
		}

		while (states.size() > 1) {
			int i = 0;
			while (i < states.size()) {
				Memento m = states.get(i);
				State s = m.getState();

				if (Operador.class.isInstance(s)) {
					double result = 0;

					Memento m1 = states.get(i - 1);
					Operando s1 = (Operando) m1.getState();

					Memento m2 = states.get(i + 1);
					Operando s2 = (Operando) m2.getState();

					if (Multiplicacao.class.isInstance(s)
							|| Divisao.class.isInstance(s)) {
						if (Multiplicacao.class.isInstance(s)) {
							result = s1.getValor() * s2.getValor();
						} else {
							result = s1.getValor() / s2.getValor();
						}
					}
					if (Soma.class.isInstance(s)
							|| Subtracao.class.isInstance(s)) {
						if (Soma.class.isInstance(s)) {
							result = s1.getValor() + s2.getValor();
						} else {
							result = s1.getValor() - s2.getValor();
						}
					}

					s1.setValor(result);
					states.remove(m2);
					states.remove(m);
				}
				i++;
			}
		}
		Memento m = states.get(0);
		Operando s = (Operando) m.getState();
		return s.getValor();
	}

}
