package br.com.ainosoft.controlerpg.servicos;

import br.com.ainosoft.controlerpg.modelo.Item;

/**
 * Classe de objetos responsável por adicionar um novo item 
 * a um personagem de um jogador.
 * 
 * @author pedrobrigatto
 */
public class ServicoAdicionarItem extends Servico {
	
	private Item item;
	
	public ServicoAdicionarItem() {
		super();
	}
	
	public ServicoAdicionarItem(Item item) {
		this.item = item;
	}
	
	public void executar() {
		
	}
	
	public Item getItem() {
		return this.item;
	}
}
