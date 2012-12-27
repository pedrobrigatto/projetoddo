package br.com.ainosoft.controlerpg.modelo;

/**
 * Arma de um personagem.
 * 
 * @author pedrobrigatto
 */
public class Arma {
	
	private static final int MAXIMO_ITENS = 3;
	
	private String nome;
	private Item[] itens;
	
	public Arma() {
		itens = new Item[MAXIMO_ITENS];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Item[] getItens() {
		return itens;
	}

	public void setItens(Item[] itens) {
		this.itens = itens;
	}

	public boolean isEpic() {
		return (contemItem(Item.SELO) && contemItem(Item.SCROLL) && 
				contemItem(Item.SHARD));
	}
	
	public void adicionarItem(Item item) {
		if (!contemItem(item.getTipo())) {
			itens[item.getTipo()] = item;
		}
	}
	
	private boolean contemItem(byte tipo) {
		return (itens[tipo] != null);
	}

	/*
	 * Basta que o nome das armas seja igual para que duas
	 * instâncias de armas sejam consideradas iguais no sistema.
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Arma) {
			Arma arma = (Arma) obj;
			return (arma.getNome().equals(this.nome));
		}
		return false;
	}
	
	/**
	 * Método capaz de determinar se uma arma possui ou não condições
	 * de se tornar épica quando na adição de um determinado item.
	 * 
	 * @param item Item que pode ser adicionado à arma
	 * 
	 * @return <code>true</code> caso a arma possa se tornar épica.
	 *         <code>false</code> caso contrário.
	 */
	public boolean epicPossivel (Item item) {
		
		boolean epic = false;
		
		switch (item.getTipo()) {
		case Item.SELO:
			epic = (!contemItem(item.getTipo()) && 
					contemItem(Item.SCROLL) && contemItem(Item.SHARD));
		case Item.SCROLL:
			epic = (!contemItem(Item.SELO) && 
					contemItem(item.getTipo()) && contemItem(Item.SHARD));
		case Item.SHARD:
			epic = (!contemItem(Item.SELO) && 
					contemItem(Item.SCROLL) && contemItem(item.getTipo()));
		}
		return epic;
	}
}
