package br.com.exercicios.questao_12.abstractfactory;

public class PizzaioloA extends Pizzaiolo {

	@Override
	public Pizza makePizza() {
		return new PizzaCalabresa();
	}

}
