package br.com.ainosoft.controlerpg.servicos;

import java.util.List;

import br.com.ainosoft.controlerpg.modelo.Arma;
import br.com.ainosoft.controlerpg.modelo.Item;
import br.com.ainosoft.controlerpg.modelo.database.DaoFactory;

/**
 * Classe de objetos que representa um serviço que busca por uma
 * arma que esteja associada ao item adquirido pelo jogador.
 * 
 * @author pedrobrigatto
 */
public class ServicoBuscarArma extends Servico {
	
	private Item item;

	public ServicoBuscarArma(Item item) {
		this.item = item;
	}

	public Arma executar() {
		List<Arma> armas = DaoFactory.
				pegarFabrica(propriedades.getProperty("DB_SELECIONADO"))
				.getArmaDao().listar(ARMA_POR_ITEM, item.getNome());
		if (armas.size() > 0) {
			return armas.get(0);
		}
		return null;
	}
}
