package br.com.ainosoft.controlerpg.modelo.database.mysql;

import java.util.List;

import br.com.ainosoft.controlerpg.modelo.Item;
import br.com.ainosoft.controlerpg.modelo.database.ItemDao;

public class MySqlItemDao implements ItemDao {

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
