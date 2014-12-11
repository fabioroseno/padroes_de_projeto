package br.com.exercicios.questao_12.abstractfactory;

public class Aplicacao {

	public static void main(String[] args) {
		try {
			Pizzaiolo pizzaiolo = new Pizzaria().getPizzaiolo("15/03/2014");
			Pizza pizza = pizzaiolo.makePizza();
			pizza.print();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
