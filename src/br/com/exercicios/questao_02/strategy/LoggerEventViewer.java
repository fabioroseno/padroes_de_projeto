package br.com.exercicios.questao_02.strategy;

public class LoggerEventViewer implements ILogger {

	@Override
	public void log() {
		System.out.println("LOG :: Log Salvo no Event Viewer!");
	}

}
