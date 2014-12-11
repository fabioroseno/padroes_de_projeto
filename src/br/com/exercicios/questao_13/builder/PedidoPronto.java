package br.com.exercicios.questao_13.builder;

public class PedidoPronto {

	private PedidoDentroCaixa pedidoDentroCaixa;
	private PedidoForaCaixa pedidoForaCaixa;

	public PedidoDentroCaixa getPedidoDentroCaixa() {
		return pedidoDentroCaixa;
	}

	public void setPedidoDentroCaixa(PedidoDentroCaixa pedidoDentroCaixa) {
		this.pedidoDentroCaixa = pedidoDentroCaixa;
	}

	public PedidoForaCaixa getPedidoForaCaixa() {
		return pedidoForaCaixa;
	}

	public void setPedidoForaCaixa(PedidoForaCaixa pedidoForaCaixa) {
		this.pedidoForaCaixa = pedidoForaCaixa;
	}

}
