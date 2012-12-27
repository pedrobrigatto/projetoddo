package br.com.ainosoft.controlerpg.servicos;

import br.com.ainosoft.controlerpg.modelo.Usuario;
import br.com.ainosoft.controlerpg.modelo.database.DaoFactory;

/**
 * Classe de objetos responsável por coordenar a operação de login 
 * junto ao banco de dados, para um dado usuário.
 * 
 * @author pedrobrigatto
 */
public class ServicoLogin extends Servico {
	
	private Usuario usuario;
	
	public ServicoLogin(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public boolean executar() {
		return (DaoFactory.pegarFabrica(propriedades.getProperty("DB_SELECIONADO")).
				getUsuarioDao().listar(ServicoLogin.LOGIN, 
						usuario.getUsuario(), usuario.getSenha()).size() > 0);
	}

}
