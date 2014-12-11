package br.com.exercicios.questao_07.observer;

public class Seguradora implements Observer {

	private Sensor sensor;

	protected SistemaAlarme sistema;

	public Seguradora(SistemaAlarme sistema) {
		this.sistema = sistema;
		sistema.register(this);
	}

	public void update(Sensor sensor) {
		this.sensor = sensor;
		printThePrices();
	}

	public void printThePrices() {
		System.out.println("\n" + "Seguradora ");
		System.out.println("\n" + "\nTemperatura: " + sensor.getTemperatura()
				+ "\nPresença: " + sensor.getPresenca());
	}

}
