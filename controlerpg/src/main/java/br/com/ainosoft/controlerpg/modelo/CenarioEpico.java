package br.com.ainosoft.controlerpg.modelo;

/**
 * Representação de um cenário de arma épica.
 * 
 * @author pedrobrigatto
 */
public class CenarioEpico {
	
	public static final byte EPICO_INTERNO = 0;
	public static final byte EPICO_ENTRE_PERSONAGENS = 1;
	
	private Personagem personagemDoador;
	private Personagem personagemReceptor;
	private Arma arma;
	private Item item;
	private byte tipo;

	public CenarioEpico() {
		super();
	}
	
	public CenarioEpico(byte tipo, Personagem personagemDoador, 
			Personagem personagemReceptor, Arma arma, Item item) {
		this();
		this.personagemDoador = personagemDoador;
		this.personagemReceptor = personagemReceptor;
		this.arma = arma;
		this.item = item;
	}

	public Personagem getPersonagemDoador() {
		return personagemDoador;
	}

	public void setPersonagemDoador(Personagem personagemDoador) {
		this.personagemDoador = personagemDoador;
	}

	public Personagem getPersonagemReceptor() {
		return personagemReceptor;
	}

	public void setPersonagemReceptor(Personagem personagemReceptor) {
		this.personagemReceptor = personagemReceptor;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	public void setTipo (byte tipo) {
		this.tipo = tipo;
	}
	
	public byte getTipo () {
		return this.tipo;
	}
}
