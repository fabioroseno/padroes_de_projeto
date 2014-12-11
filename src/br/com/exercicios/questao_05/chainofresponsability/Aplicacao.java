package br.com.exercicios.questao_05.chainofresponsability;

public class Aplicacao {

	public static float precoDoProduto = 2.50f;
	public static float soma = 0;

	public static void main(String[] args) {

		MoedaChain moedas = new UmReal();
		moedas.setProxima(new CinquentaCentavos());
		moedas.setProxima(new VinteECincoCentavos());
		moedas.setProxima(new DezCentavos());
		moedas.setProxima(new CincoCentavos());
		moedas.setProxima(new UmCentavo());

		try {

			System.out.print("Valor do Produto: ");
			System.out.printf("%.2f", precoDoProduto);
			System.out.println();

			// Uso do CHAIN OF RESPONSABILITY
			inserirMoedas(moedas.processarValor(Moeda.UmReal));
			inserirMoedas(moedas.processarValor(Moeda.DezCentavos));
			inserirMoedas(moedas.processarValor(Moeda.CincoCentavos));
			inserirMoedas(moedas.processarValor(Moeda.UmCentavo));
			inserirMoedas(moedas.processarValor(Moeda.CinquentaCentavos));
			inserirMoedas(moedas.processarValor(Moeda.VinteECincoCentavos));
			inserirMoedas(moedas.processarValor(Moeda.DezCentavos));
			inserirMoedas(moedas.processarValor(Moeda.CinquentaCentavos));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void inserirMoedas(float moeda) {
		System.out
				.println("-------------------------------------------------------");
		System.out.print("Valor inserido: ");
		System.out.printf("%.2f", moeda);
		System.out.println();
		soma = soma + moeda;

		if (soma == precoDoProduto) {
			System.out.println("Não há troco! LIBERANDO PRODUTO...");
		} else if (soma > precoDoProduto) {
			System.out.println("LIBERANDO PRODUTO...");
			System.out.print("Valor do Troco: ");
			System.out.printf("%.2f", soma - precoDoProduto);
			System.out.println();
		} else if (soma < precoDoProduto) {
			System.out.println("Valor Incompleto! Insira mais moedas...");
		}
		System.out.print("Total Pago: ");
		System.out.printf("%.2f", soma);
		System.out.println();

	}

}
