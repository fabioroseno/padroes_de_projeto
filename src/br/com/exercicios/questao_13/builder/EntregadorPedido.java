package br.com.exercicios.questao_13.builder;

import java.util.ArrayList;
import java.util.List;

public class EntregadorPedido {

	private PedidoProntoBuilder pedidoProntoBuilder;
	private List<String> pedidos = new ArrayList<String>();
	PedidoDentroCaixa pedidoDentroCaixa = new PedidoDentroCaixa();
	PedidoForaCaixa pedidoForaCaixa = new PedidoForaCaixa();

	public EntregadorPedido(PedidoProntoBuilder pedidoProntoBuilder) {

		this.pedidoProntoBuilder = pedidoProntoBuilder;

	}

	public PedidoPronto getPedidoPronto() {
		return this.pedidoProntoBuilder.getPedidoPronto();
	}

	public void makePedidoPronto() {
		organizarPedido();

		this.pedidoProntoBuilder.buildPedidoDentroCaixa(pedidoDentroCaixa);
		this.pedidoProntoBuilder.buildPedidoForaCaixa(pedidoForaCaixa);
	}

	private void organizarPedido() {
		for (String pedido : getPedidos()) {
			if (pedido.equals("hamburguer") || pedido.equals("cheeseburger")) {
				pedidoDentroCaixa.setSanduiche(pedido);
			} else if (pedido.equals("pequena") || pedido.equals("media")
					|| pedido.equals("grande")) {
				pedidoDentroCaixa.setBatata(pedido);
			} else if (pedido.equals("carrinho") || pedido.equals("boneca")) {
				pedidoDentroCaixa.setBrinquedo(pedido);
			} else if (pedido.equals("guarana") || pedido.equals("coca")) {
				pedidoForaCaixa.setRefrigerante(pedido);
			}
		}
	}

	public List<String> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<String> pedidos) {
		this.pedidos = pedidos;
	}

}
