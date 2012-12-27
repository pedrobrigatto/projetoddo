package br.com.ainosoft.controlerpg.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Representação do modelo da aplicação, responsável por manter dados críticos para
 * sua execução. Todo o cache de dados relevante para uso da aplicação também será
 * mantido por este objeto.
 * 
 * @author pedrobrigatto
 */
public class Model {
	
	private Usuario jogador;
	private List<Arma> armas;
	private static Model model;
	
	private List<Arma> armasJogo;
	private List<Personagem> personagensJogo;
	private List<Item> itensJogo;
	
	private Model() {}
	
	public static Model getModel() {
		if (model == null) {
			model = new Model();
		}
		return model;
	}
	
	public List<Arma> getArmas() {
		if (armas == null) {
			armas = new ArrayList<Arma>();
		}
		return armas;
	}

	public List<Personagem> verificarPersonagensArmados(Arma arma) {
		List<Personagem> personagens = new ArrayList<Personagem>();
		
		for (Personagem personagem : getJogador().getConta().getPersonagens()) {
			for (Arma cadaArma : personagem.getArmas()) {
				if (cadaArma.equals(arma)) {
					personagens.add(personagem);
					break;
				}
			}
		}
		return personagens;
	}

	public Usuario getJogador() {
		return jogador;
	}

	public void setJogador(Usuario jogador) {
		this.jogador = jogador;
	}

	public List<Arma> getArmasJogo() {
		return armasJogo;
	}

	public void setArmasJogo(List<Arma> armasJogo) {
		this.armasJogo = armasJogo;
	}

	public List<Personagem> getPersonagensJogo() {
		return personagensJogo;
	}

	public void setPersonagensJogo(List<Personagem> personagensJogo) {
		this.personagensJogo = personagensJogo;
	}

	public List<Item> getItensJogo() {
		return itensJogo;
	}

	public void setItensJogo(List<Item> itensJogo) {
		this.itensJogo = itensJogo;
	}
}
