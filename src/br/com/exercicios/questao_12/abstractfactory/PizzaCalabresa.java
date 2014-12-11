package br.com.exercicios.questao_12.abstractfactory;

public class PizzaCalabresa extends Pizza {

	public PizzaCalabresa() {
		super(new String[] { "Queijo", "Calabresa", "Tomate" });
	}

	@Override
	public void print() {
		System.out.println("Pizza de Calabresa");
		super.print();
	}

}
