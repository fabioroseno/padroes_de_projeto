package br.com.exercicios.questao_09.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Congresso {

	String nome;
	int totalAssentos = 4;
	int totalParticipantes;
	ArrayList participantes = new ArrayList();

	public void imprimeParticipantes() {

		Iterator participanteIterator = participantes.iterator();

		while (participanteIterator.hasNext()) {

			ParticipanteComponent participanteInfo = (ParticipanteComponent) participanteIterator
					.next();

			if (participanteInfo instanceof Instituicao) {
				System.out.println("Instituição: "
						+ participanteInfo.getNomeParticipante());
				((Instituicao) participanteInfo).imprimeMembros();
			} else if (participanteInfo instanceof Individuo) {
				System.out.println("\n" + "Nome: "
						+ ((Individuo) participanteInfo).getNomeParticipante()
						+ " - " + "Assento: "
						+ ((Individuo) participanteInfo).getAssento());
			}

		}
	}

	private void calcularTotalParticipantes() {
		totalParticipantes = 0;

		for (int i = 0; i < participantes.size(); i++) {
			ParticipanteComponent participanteIterator = (ParticipanteComponent) participantes
					.get(i);
			if (participanteIterator instanceof Instituicao) {
				if (((Instituicao) participanteIterator).getMembros().size() == 1) {
					Instituicao instituicao = (Instituicao) ((Instituicao) participanteIterator)
							.getMembros().get(0);

					totalParticipantes += (!instituicao.getMembros().isEmpty() ? instituicao
							.getMembros().size() : 0);

				}

			} else if (participanteIterator instanceof Individuo) {
				totalParticipantes += 1;
			}
		}
	}

	public void adicionarParticipante(
			ParticipanteComponent newParticipanteComponent) {
		calcularTotalParticipantes();

		if (getTotalParticipantes() < totalAssentos) {
			participantes.add(newParticipanteComponent);
		} else {
			System.out.println("Não existe mais assentos disponíveis.");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTotalAssentos() {
		return totalAssentos;
	}

	public void setTotalAssentos(int totalAssentos) {
		this.totalAssentos = totalAssentos;
	}

	public int getTotalParticipantes() {
		return totalParticipantes;
	}

}
