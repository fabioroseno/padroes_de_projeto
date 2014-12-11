package br.com.exercicios.questao_13.builder;

import java.util.ArrayList;
import java.util.List;

public class AtendentePedido {

	private List<String> pedido = new ArrayList<String>();

	public void montarPedido(String coisaPedida) {
		pedido.add(coisaPedida);
	}

	public List<String> repassarPedido() {
		return pedido;
	}
}
