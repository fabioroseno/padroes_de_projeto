package br.com.gof.factoryMethod;

public class FabricaFord implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Fiesta();
	}

}
