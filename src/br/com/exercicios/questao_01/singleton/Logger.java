package br.com.exercicios.questao_01.singleton;

public class Logger {

	public static Logger instancia;
	private boolean ativo = false;

	protected Logger() {

	}

	public void log(String s) {
		if (this.ativo) {
			System.out.println("LOG :: " + s);
		}
	}

	public static Logger getInstancia() {
		if (instancia == null) {
			instancia = new Logger();
		}
		return instancia;
	}

	public boolean isAtivo() {
		return this.ativo;
	}

	public void setAtivo(boolean b) {
		this.ativo = b;
	}

}
