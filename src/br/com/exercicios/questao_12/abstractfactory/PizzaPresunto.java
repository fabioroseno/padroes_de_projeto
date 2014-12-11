package br.com.exercicios.questao_12.abstractfactory;

public class PizzaPresunto extends Pizza {

	public PizzaPresunto() {
		super(new String[] { "Queijo", "Presunto", "Tomate" });
	}

	@Override
	public void print() {
		System.out.println("Pizza de Presunto");
		super.print();
	}

}
