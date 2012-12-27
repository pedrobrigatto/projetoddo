package br.com.ainosoft.controlerpg.modelo.database.mariadb;

import java.util.List;

import br.com.ainosoft.controlerpg.modelo.Usuario;
import br.com.ainosoft.controlerpg.modelo.database.UsuarioDao;

public class MariaDbUsuarioDao implements UsuarioDao {

	public boolean salvar(Usuario elemento) {
		return false;
	}

	public boolean atualizar(Usuario elemento) {
		return false;
	}

	public boolean excluir(Usuario elemento) {
		return false;
	}

	public List<Usuario> listar(String... criterios) {
		return null;
	}
}
