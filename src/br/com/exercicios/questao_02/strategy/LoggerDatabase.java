package br.com.exercicios.questao_02.strategy;

public class LoggerDatabase implements ILogger {

	@Override
	public void log() {
		System.out.println("LOG :: Log Salvo no Banco de Dados!");
	}

}
