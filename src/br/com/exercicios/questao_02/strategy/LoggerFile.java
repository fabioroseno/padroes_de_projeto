package br.com.exercicios.questao_02.strategy;

public class LoggerFile implements ILogger {

	@Override
	public void log() {
		System.out.println("LOG :: Log Salvo em Arquivo!");
	}

}
