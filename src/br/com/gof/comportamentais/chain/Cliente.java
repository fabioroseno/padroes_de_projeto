package br.com.gof.comportamentais.chain;

public class Cliente {
	
	public static void main(String[] args) {
		
		BancoChain bancos = new BancoD();
		bancos.setNext(new BancoB());
		bancos.setNext(new BancoC());
		bancos.setNext(new BancoA());
		
		try {
			bancos.efetuarPagamento(IDBancos.bancoC);
			bancos.efetuarPagamento(IDBancos.bancoD);
			bancos.efetuarPagamento(IDBancos.bancoA);
			bancos.efetuarPagamento(IDBancos.bancoB);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
