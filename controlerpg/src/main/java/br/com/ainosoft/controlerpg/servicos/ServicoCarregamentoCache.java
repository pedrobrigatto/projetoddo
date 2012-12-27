package br.com.ainosoft.controlerpg.servicos;

import br.com.ainosoft.controlerpg.modelo.Model;
import br.com.ainosoft.controlerpg.modelo.Usuario;
import br.com.ainosoft.controlerpg.modelo.database.DaoFactory;

/**
 * Classe de objetos responsável por carregar em memória dados iniciais
 * importantes para que o jogador comece a utilizar o aplicativo.
 * 
 * @author pedrobrigatto
 */
public class ServicoCarregamentoCache extends Servico {
	
	private Usuario usuario;
	
	public ServicoCarregamentoCache(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void executar() {
		DaoFactory fabrica = DaoFactory.
				pegarFabrica(propriedades.getProperty("DB_SELECIONADO"));
		Model.getModel().setArmasJogo(fabrica.getArmaDao().listar(TODOS));
		Model.getModel().setItensJogo(fabrica.getItemDao().listar(TODOS));
		Model.getModel().setPersonagensJogo(
				fabrica.getPersonagemDao().listar(TODOS));
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
}
