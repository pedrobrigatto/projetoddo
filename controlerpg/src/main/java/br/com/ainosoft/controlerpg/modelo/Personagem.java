package br.com.ainosoft.controlerpg.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe de objetos que representa personagens de um jogo.
 * 
 * @author pedrobrigatto
 */
public class Personagem {
	
	private String nome;
	private List<Arma> armas;
	private List<Item> itens;
	
	public Personagem() {}
	
	public Personagem(String nome) {
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void adicionarArma(Arma arma) {
		getArmas().add(arma);
	}
	
	public void adicionarItem(Item item) {
		getItens().add(item);
	}
	
	public void removerItem (Item item) {
		getItens().remove(item);
	}
	
	public void removerArma(Arma arma) {
		getArmas().remove(arma);
	}
	
	public List<Item> getItens() {
		if (this.itens == null) {
			this.itens = new ArrayList<Item>();
		}
		return this.itens;
	}
	
	public List<Arma> getArmas() {
		if (this.armas == null) {
			this.armas = new ArrayList<Arma>();
		}
		return this.armas;
	}
	
	/**
	 * Usado para determinar o número de itens disponíveis de um 
	 * determinado tipo, para uma determinada arma.
	 * 
	 * @param tipo Tipo de item em observação
	 * @param arma Arma com a qual o item se relaciona
	 * @return
	 */
	public int getItensDisponiveis(byte tipo, Arma arma) {
		
		int nroItens = 0;
		
		for (Item item : getItens()) {
			if (item.getTipo() == tipo && item.getArma().equals(arma)) {
				nroItens++;
			}
		}
		return nroItens;
	}
	
	/**
	 * Utilizado para verificar se um determinado item pode resultar 
	 * na transformação de uma arma em épica.
	 * 
	 * @param item Item em avaliação 
	 * 
	 * @return <code>true</code> caso a arma possa se tornar épica.
	 *         <code>false</code> caso contrário.
	 */
	public boolean verificarEpic (Item item) {
		
		int nroArmas = 0;
		
		for (Arma arma : getArmas()) {
			if (item.getArma().equals(arma) && arma.epicPossivel(item)) {
				nroArmas++;
			}
		}
		return (nroArmas > 0);
	}
	
}
