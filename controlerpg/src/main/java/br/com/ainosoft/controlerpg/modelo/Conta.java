package br.com.ainosoft.controlerpg.modelo;

/**
 * Representação de uma conta de um jogador.
 * 
 * @author pedrobrigatto
 */
public class Conta {
	
	private static final int MAXIMO_PERSONAGENS = 10;
	
	private Personagem[] personagens;
	
	public Conta () {
		personagens = new Personagem[MAXIMO_PERSONAGENS];
	}

	public Personagem[] getPersonagens() {
		return personagens;
	}

	public void setPersonagens(Personagem[] personagens) {
		this.personagens = personagens;
	}
}
