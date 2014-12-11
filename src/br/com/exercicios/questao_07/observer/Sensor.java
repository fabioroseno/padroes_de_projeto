package br.com.exercicios.questao_07.observer;

public class Sensor {

	private double temperatura;
	private double presenca;

	public Sensor(double temperatura, double presenca) {
		super();
		this.temperatura = temperatura;
		this.presenca = presenca;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getPresenca() {
		return presenca;
	}

	public void setPresenca(double presenca) {
		this.presenca = presenca;
	}

}
