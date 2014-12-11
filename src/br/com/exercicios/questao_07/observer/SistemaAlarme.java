package br.com.exercicios.questao_07.observer;

import java.util.ArrayList;

public class SistemaAlarme implements Alarme {

	private ArrayList<Observer> observers;
	private Sensor sensor;

	public SistemaAlarme() {
		observers = new ArrayList<Observer>();
	}

	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	public void unregister(Observer deleteObserver) {
		int observerIndex = observers.indexOf(deleteObserver);
		System.out.println("Observer " + (observerIndex + 1) + " deleted");
		observers.remove(observerIndex);
	}

	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(sensor);
		}
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
		notifyObserver();
	}

}