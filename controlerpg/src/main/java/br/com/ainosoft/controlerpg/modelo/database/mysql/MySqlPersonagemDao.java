package br.com.ainosoft.controlerpg.modelo.database.mysql;

import java.util.List;

import br.com.ainosoft.controlerpg.modelo.Personagem;
import br.com.ainosoft.controlerpg.modelo.database.PersonagemDao;

public class MySqlPersonagemDao implements PersonagemDao {

	public boolean salvar(Personagem elemento) {
		return false;
	}

	public boolean atualizar(Personagem elemento) {
		return false;
	}

	public boolean excluir(Personagem elemento) {
		return false;
	}

	public List<Personagem> listar(String... criterios) {
		return null;
	}
}
