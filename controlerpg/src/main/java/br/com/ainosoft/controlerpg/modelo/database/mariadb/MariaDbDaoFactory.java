package br.com.ainosoft.controlerpg.modelo.database.mariadb;

import br.com.ainosoft.controlerpg.modelo.database.ArmaDao;
import br.com.ainosoft.controlerpg.modelo.database.DaoFactory;
import br.com.ainosoft.controlerpg.modelo.database.ItemDao;
import br.com.ainosoft.controlerpg.modelo.database.PersonagemDao;
import br.com.ainosoft.controlerpg.modelo.database.UsuarioDao;

public class MariaDbDaoFactory extends DaoFactory {

	public MariaDbDaoFactory() {
		super(DaoFactory.MARIADB);
	}

	@Override
	public UsuarioDao getUsuarioDao() {
		return new MariaDbUsuarioDao();
	}

	@Override
	public ArmaDao getArmaDao() {
		return new MariaDbArmaDao();
	}

	@Override
	public PersonagemDao getPersonagemDao() {
		return new MariaDbPersonagemDao();
	}

	@Override
	public ItemDao getItemDao() {
		return new MariaDbItemDao();
	}

}
