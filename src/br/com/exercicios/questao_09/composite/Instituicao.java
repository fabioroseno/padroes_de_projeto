package br.com.exercicios.questao_09.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Instituicao extends ParticipanteComponent {

	private ArrayList membros = new ArrayList();

	public Instituicao(String nome) {
		this.nome = nome;
	}

	public void imprimeMembros() {

		Iterator membroIterator = membros.iterator();

		while (membroIterator.hasNext()) {

			ParticipanteComponent membroInfo = (ParticipanteComponent) membroIterator
					.next();

			if (membroInfo instanceof Instituicao) {
				System.out.println("\n" + "Instituição: "
						+ membroInfo.getNomeParticipante());
				((Instituicao) membroInfo).imprimeMembros();
			} else if (membroInfo instanceof Individuo) {
				System.out.println("Nome: "
						+ ((Individuo) membroInfo).getNomeParticipante()
						+ " - " + "Assento: "
						+ ((Individuo) membroInfo).getAssento());
			}
		}

	}

	public void adicionar(ParticipanteComponent newParticipanteComponent) {
		membros.add(newParticipanteComponent);
	}

	public void remover(ParticipanteComponent newParticipanteComponent) {
		membros.remove(newParticipanteComponent);
	}

	public ArrayList getMembros() {
		return membros;
	}

}
