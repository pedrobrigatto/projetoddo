package br.com.ainosoft.controlerpg.modelo.database.mariadb;

import java.util.List;

import br.com.ainosoft.controlerpg.modelo.Arma;
import br.com.ainosoft.controlerpg.modelo.database.ArmaDao;

public class MariaDbArmaDao implements ArmaDao {

	public boolean salvar(Arma elemento) {
		return false;
	}

	public boolean atualizar(Arma elemento) {
		return false;
	}

	public boolean excluir(Arma elemento) {
		return false;
	}

	public List<Arma> listar(String... criterios) {
		return null;
	}
}
