package br.com.ainosoft.controlerpg.servicos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.ainosoft.controlerpg.modelo.Arma;
import br.com.ainosoft.controlerpg.modelo.CenarioEpico;
import br.com.ainosoft.controlerpg.modelo.Item;
import br.com.ainosoft.controlerpg.modelo.Model;
import br.com.ainosoft.controlerpg.modelo.Personagem;

/**
 * Classe de objetos responsáveis pela análise de todos os cenários 
 * possíveis de combinação entre personagens e seus itens adquiridos
 * ao longo do jogo, para verificação da possibilidade de montagem de
 * armas épicas.
 * 
 * @author pedrobrigatto
 */
public class ServicoVerificarEpic {
	
	public ServicoVerificarEpic() {}
	
	/**
	 * Método que verifica, para cada personagem de um jogador, se há armas que
	 * podem se tornar épicas, dado o conjunto de itens da personagem.
	 * 
	 * @return A lista de personagens que contém armas candidatas a se tornarem épicas.
	 */
	public List<CenarioEpico> executar() {
		
		List<CenarioEpico> cenarios = new ArrayList<CenarioEpico>();
		
		List<Personagem> personagens = 
				Arrays.asList(Model.getModel().getJogador().getConta().getPersonagens());
		List<Item> itensPersonagem = null;
		List<Arma> armasPersonagem = null;
		
		// Verificando se a própria personagem não possui recursos autossuficientes para configuração épica.
		for (Personagem personagem : personagens) {
			itensPersonagem = personagem.getItens();
			armasPersonagem = personagem.getArmas();
			
			for (Arma arma : armasPersonagem) {
				for (Item item : itensPersonagem) {
					if (arma.epicPossivel(item)) {
						cenarios.add(new CenarioEpico(CenarioEpico.EPICO_INTERNO, 
								personagem, personagem, arma, item));
					}
				}
			}
		}
		
		// Verificando combinações entre personagens
		List<Personagem> outros = null;
		
		for (Personagem personagem : personagens) {
			
			itensPersonagem = personagem.getItens();
			outros = new ArrayList<Personagem>(personagens);
			outros.remove(personagem);
			
			// Verificando se outros personagens possuem itens que podem tornar a arma 
			// da personagem atual em armas épicas.
			for (Personagem outro : outros) {
				armasPersonagem = personagem.getArmas();
				itensPersonagem = outro.getItens();
				
				// Cenário épico: personagemDoador, personagemReceptor, arma, item
				for (Arma arma : armasPersonagem) {
					for (Item item : itensPersonagem) {
						if (arma.epicPossivel(item)) {
							cenarios.add(new CenarioEpico(CenarioEpico.EPICO_ENTRE_PERSONAGENS,
									outro, personagem, arma, item));
						}
					}
				}
			}
		}
		return cenarios;
	}
}
