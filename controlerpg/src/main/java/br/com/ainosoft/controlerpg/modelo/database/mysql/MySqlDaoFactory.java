package br.com.ainosoft.controlerpg.modelo.database.mysql;

import br.com.ainosoft.controlerpg.modelo.database.ArmaDao;
import br.com.ainosoft.controlerpg.modelo.database.DaoFactory;
import br.com.ainosoft.controlerpg.modelo.database.ItemDao;
import br.com.ainosoft.controlerpg.modelo.database.PersonagemDao;
import br.com.ainosoft.controlerpg.modelo.database.UsuarioDao;

/**
 * Fábrica de objetos de acesso a dados para bancos de dados MySQL.
 * 
 * @author pedrobrigatto
 */
public class MySqlDaoFactory extends DaoFactory {
	
	public MySqlDaoFactory() {
		super(DaoFactory.MYSQL);
	}

	@Override
	public UsuarioDao getUsuarioDao() {
		return new MySqlUsuarioDao();
	}

	@Override
	public ArmaDao getArmaDao() {
		return new MySqlArmaDao();
	}

	@Override
	public PersonagemDao getPersonagemDao() {
		return new MySqlPersonagemDao();
	}

	@Override
	public ItemDao getItemDao() {
		return new MySqlItemDao();
	}
}
