package br.com.exercicios.questao_08.templatemethod;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		ClasseAbstrata abstrata;

		System.out.print("Digite seu texto: ");
		Scanner scanner = new Scanner(System.in);
		String texto = scanner.nextLine();

		System.out.print("-----> Mai�sculo: ");
		abstrata = new Maiuscula();
		abstrata.metodoModelo(texto);

		System.out.print("-----> Min�sculo: ");
		abstrata = new Minuscula();
		abstrata.metodoModelo(texto);

		System.out.print("-----> Duplicado: ");
		abstrata = new Duplica();
		abstrata.metodoModelo(texto);

		System.out.print("-----> Invertido: ");
		abstrata = new Inverte();
		abstrata.metodoModelo(texto);

		scanner.close();

	}

}
