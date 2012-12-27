package br.com.ainosoft.controlerpg.modelo.database.mariadb;

import java.util.List;

import br.com.ainosoft.controlerpg.modelo.Item;
import br.com.ainosoft.controlerpg.modelo.database.ItemDao;

public class MariaDbItemDao implements ItemDao {

	public boolean salvar(Item elemento) {
		return false;
	}

	public boolean atualizar(Item elemento) {
		return false;
	}

	public boolean excluir(Item elemento) {
		return false;
	}

	public List<Item> listar(String... criterios) {
		return null;
	}
}
