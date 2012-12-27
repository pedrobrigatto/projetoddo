package br.com.ainosoft.controlerpg.servicos;

import java.io.IOException;
import java.util.Properties;

public class Servico {
	
	public static final String TODOS = "todos";
	public static final String ARMA_POR_ITEM = "arma_por_item";
	public static final String LOGIN = "login";
	
	private static final String PROPRIEDADES_APLICATIVO = "app_settings.properties";
	
	protected Properties propriedades;
	
	protected Servico() {
		propriedades = new Properties();
		try {
			propriedades.load(Servico.class.getResourceAsStream(PROPRIEDADES_APLICATIVO));
		} catch (IOException e) {
			Logger.logar(Logger.ERRO, Servico.class.getName(), 
					"Erro ao recuperar propriedades da aplicação.");
		}
	}
}
