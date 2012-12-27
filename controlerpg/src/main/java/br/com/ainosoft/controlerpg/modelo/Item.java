package br.com.ainosoft.controlerpg.modelo;

/**
 * Item de um personagem.
 * 
 * @author pedrobrigatto
 */
public class Item {
	
	public static final byte SELO = 0;
	public static final byte SCROLL = 1;
	public static final byte SHARD = 2;
	
	private String nome;
	private byte tipo;
	private Arma arma;
	
	public Item() {}
	
	public Item(Arma arma) {
		this.arma = arma;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getTipo() {
		return tipo;
	}

	public void setTipo(byte tipo) {
		this.tipo = tipo;
	}

	public Arma getArma() {
		return arma;
	}
}
