package br.com.exercicios.questao_05.chainofresponsability;

public abstract class MoedaChain {

	protected MoedaChain proxima;
	protected Moeda checaMoeda;

	public MoedaChain(Moeda valor) {
		proxima = null;
		checaMoeda = valor;
	}

	public void setProxima(MoedaChain moeda) {
		if (proxima == null)
			proxima = moeda;
		else
			proxima.setProxima(moeda);
	}

	public float processarValor(Moeda valor) throws Exception {
		if (checaMoeda == valor) {
			return obterValorDecimal();
		} else {
			if (proxima == null) {
				throw new Exception("Moeda Inexistente!");
			}
			return proxima.processarValor(valor);
		}
	}

	protected abstract float obterValorDecimal();

}
