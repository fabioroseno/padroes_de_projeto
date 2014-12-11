package br.com.exercicios.questao_02.strategy;

public class Aplicacao {

	public static void main(String[] args) {

		Logger bd = new Logger(new LoggerDatabase());
		Logger ev = new Logger(new LoggerEventViewer());
		Logger fl = new Logger(new LoggerFile());

		bd.log();
		ev.log();
		fl.log();

	}

}
