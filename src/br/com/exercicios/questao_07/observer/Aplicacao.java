package br.com.exercicios.questao_07.observer;

public class Aplicacao {

	public static void main(String[] args) {

		SistemaAlarme sistema = new SistemaAlarme();

		new Delegacia(sistema);

		Sensor sensor = new Sensor(-1, 5);

		sistema.setSensor(sensor);

		new Seguradora(sistema);

		Sensor sensor2 = new Sensor(-10, 50);

		sistema.setSensor(sensor2);

	}

}
