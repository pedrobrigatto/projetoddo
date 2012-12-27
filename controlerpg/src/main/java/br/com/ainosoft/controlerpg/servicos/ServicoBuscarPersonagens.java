package br.com.ainosoft.controlerpg.servicos;

import java.util.List;

import br.com.ainosoft.controlerpg.modelo.Arma;
import br.com.ainosoft.controlerpg.modelo.Model;
import br.com.ainosoft.controlerpg.modelo.Personagem;

/**
 * Classe de objetos que representa um serviço de identificação dos personagens
 * de um jogador que já possuem uma dada arma.
 * 
 * @author pedrobrigatto
 */
public class ServicoBuscarPersonagens extends Servico {
	
	private Arma arma;

	public ServicoBuscarPersonagens(Arma arma) {
		this.arma = arma;
	}

	public List<Personagem> executar() {
		return Model.getModel().verificarPersonagensArmados(arma);
	}
}
