package br.com.ainosoft.controlerpg.controle;

import br.com.ainosoft.controlerpg.servicos.ServicoCarregamentoCache;
import br.com.ainosoft.controlerpg.view.TelaJogo;

/**
 * Controlador de eventos gerados a partir da tela principal do sistema.
 * 
 * @author pedrobrigatto
 */
public class ControladorHome {
	
	private static ControladorHome controlador;
	private TelaJogo homeView;
	
	private ControladorHome() {}
	
	public static ControladorHome getControlador() {
		if (controlador == null) {
			controlador = new ControladorHome();
		}
		return controlador;
	}

	public void exibirHomeView() {
		if (homeView == null) {
			new ServicoCarregamentoCache(null).executar();
			homeView = new TelaJogo();
			homeView.setVisible(true);
		}
	}
}
