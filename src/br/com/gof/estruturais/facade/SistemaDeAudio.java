package br.com.gof.estruturais.facade;

public class SistemaDeAudio {

	public void configurarFrequencia() {
		System.out.println("Frequencia configurada");
	}

	public void configurarVolume() {
		System.out.println("Volume configurado");
	}

	public void configurarCanais() {
		System.out.println("Canais configurados");
	}

	public void reproduzirAudio(String arquivo) {
		System.out.println("Reproduzindo: " + arquivo);
	}
}
