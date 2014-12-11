package br.com.exercicios.questao_13.builder;

public class PedidoProntoPersonalizadoBuilder implements PedidoProntoBuilder {

	private PedidoPronto pedidoPronto;

	public PedidoProntoPersonalizadoBuilder() {
		this.pedidoPronto = new PedidoPronto();
	}

	@Override
	public void buildPedidoDentroCaixa(PedidoDentroCaixa pedidoDentroCaixa) {
		this.pedidoPronto.setPedidoDentroCaixa(pedidoDentroCaixa);
	}

	@Override
	public void buildPedidoForaCaixa(PedidoForaCaixa pedidoForaCaixa) {
		this.pedidoPronto.setPedidoForaCaixa(pedidoForaCaixa);
	}

	@Override
	public PedidoPronto getPedidoPronto() {
		return pedidoPronto;
	}

}
