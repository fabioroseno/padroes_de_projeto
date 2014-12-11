package br.com.exercicios.questao_12.abstractfactory;

public abstract class Pizza {
	String[] ingredientes;

	public Pizza(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public void print() {
		System.out.print("Ingredientes: ");
		System.out.print("(");
		for (int i = 0; i < ingredientes.length; i++) {
			System.out.print(ingredientes[i]);
			if (i < ingredientes.length - 1)
				System.out.print(", ");
		}
		System.out.print(")");
	}
}
