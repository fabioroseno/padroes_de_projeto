package br.com.exercicios.questao_13.builder;

public interface PedidoProntoBuilder {

	public void buildPedidoDentroCaixa(PedidoDentroCaixa pedidoDentroCaixa);

	public void buildPedidoForaCaixa(PedidoForaCaixa pedidoForaCaixa);

	public PedidoPronto getPedidoPronto();

}
