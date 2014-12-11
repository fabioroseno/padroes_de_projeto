package br.com.exercicios.questao_12.abstractfactory;

public class PizzaioloB extends Pizzaiolo {

	@Override
	public Pizza makePizza() {
		return new PizzaPresunto();
	}

}
