package br.com.exercicios.questao_02.strategy;

public class Logger {

	private final ILogger logger;

	public Logger(ILogger log) {
		logger = log;
	}

	public void log() {
		logger.log();
	}

}
