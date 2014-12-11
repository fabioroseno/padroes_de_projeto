package br.com.exercicios.questao_07.observer;

public interface Alarme {

	public void register(Observer o);

	public void unregister(Observer o);

	public void notifyObserver();

}
