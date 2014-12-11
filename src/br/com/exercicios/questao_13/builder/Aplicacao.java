package br.com.exercicios.questao_13.builder;

public class Aplicacao {
	
	public static void main(String[] args){
		
		PedidoProntoBuilder pedidoPronto = new PedidoProntoPersonalizadoBuilder();
		
		AtendentePedido atendente = new AtendentePedido();
		
		atendente.montarPedido("media");
		atendente.montarPedido("hamburguer");
		atendente.montarPedido("carrinho");
		atendente.montarPedido("guarana");
		
		EntregadorPedido entregador = new EntregadorPedido(pedidoPronto);
		
		entregador.setPedidos(atendente.repassarPedido());
		
		entregador.makePedidoPronto();
		
		PedidoPronto pedidoEntregue = entregador.getPedidoPronto();
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("Seu pedido:\n");
		buffer.append("Dentro da caixa:\n");
		buffer.append("\t" + pedidoEntregue.getPedidoDentroCaixa().getBatata() + "\n");
		buffer.append("\t" + pedidoEntregue.getPedidoDentroCaixa().getBrinquedo() + "\n");
		buffer.append("\t" + pedidoEntregue.getPedidoDentroCaixa().getSanduiche() + "\n");
		
		buffer.append("Fora da caixa:\n");
		buffer.append("\t" + pedidoEntregue.getPedidoForaCaixa().getRefrigerante() + "\n");
		
		System.out.println(buffer);
		
	}
	
}