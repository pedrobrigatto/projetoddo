package br.com.ainosoft.controlerpg.modelo.database;

import java.io.IOException;
import java.util.Properties;

import br.com.ainosoft.controlerpg.modelo.database.mariadb.MariaDbDaoFactory;
import br.com.ainosoft.controlerpg.modelo.database.mysql.MySqlDaoFactory;
import br.com.ainosoft.controlerpg.servicos.Logger;

/**
 * Fábrica de objetos de acesso a dados.
 * 
 * @author pedrobrigatto
 */
public abstract class DaoFactory {
	
	protected static final String MYSQL = "mysql";
	protected static final String MARIADB = "mariadb";
	
	private static final String DB_MYSQL = "mysql/db_mysql.properties";
	private static final String DB_MARIADB = "mariadb/db_mariadb.properties";
	
	protected Properties propriedades;
	
	protected DaoFactory(String tipo) {
		carregarPropriedades(tipo);
	}
	
	private void carregarPropriedades(String tipo) {
		if (propriedades == null) {
			propriedades = new Properties();
			try {
				if (MYSQL.equals(tipo)) {
					propriedades.load(DaoFactory.class.getResourceAsStream(DB_MYSQL));
				} else if (MARIADB.equals(tipo)) {
					propriedades.load(DaoFactory.class.getResourceAsStream(DB_MARIADB));
				}
			} catch (IOException e) {
				Logger.logar(Logger.ERRO, "DaoFactory", 
						"Problema ao carregar arquivo de propriedades");
			}
		}
	}

	public static DaoFactory pegarFabrica (String tipo) {
		if (MYSQL.equals(tipo)) {
			return new MySqlDaoFactory();
		}else if (MARIADB.equals(tipo)) {
			return new MariaDbDaoFactory();
		}
		return null;
	}
	
	public String lerPropriedade(String chave) {
		return propriedades.getProperty(chave);
	}
	
	public abstract UsuarioDao getUsuarioDao();
	public abstract ArmaDao getArmaDao();
	public abstract PersonagemDao getPersonagemDao();
	public abstract ItemDao getItemDao();
}
