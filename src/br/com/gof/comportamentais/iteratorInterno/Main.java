package br.com.gof.comportamentais.iteratorInterno;

import br.com.gof.comportamentais.iteratorExterno.AgregadoDeCanais;
import br.com.gof.comportamentais.iteratorExterno.CanaisEsportes;
import br.com.gof.comportamentais.iteratorExterno.CanaisFilmes;

public class Main {
	public static void main(String[] args) {
		AgregadoDeCanais canaisDeEsportes = new CanaisEsportes();
		System.out.println("Canais de Esporte:");
		IteradorInterno it = new IteradorPrint(canaisDeEsportes.criarIterator());
		it.percorrerLista();

		AgregadoDeCanais canaisDeFilmes = new CanaisFilmes();
		System.out.println("\nCanais de Filmes:");
		it = new IteradorPrint(canaisDeFilmes.criarIterator());
		it.percorrerLista();
	}
}
