package br.com.gof.factoryMethod;

public class FabricaWolks implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Gol();
	}

}
