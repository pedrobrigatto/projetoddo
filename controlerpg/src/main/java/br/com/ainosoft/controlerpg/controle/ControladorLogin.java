package br.com.ainosoft.controlerpg.controle;

import br.com.ainosoft.controlerpg.modelo.Model;
import br.com.ainosoft.controlerpg.modelo.Usuario;
import br.com.ainosoft.controlerpg.servicos.ServicoCarregamentoCache;
import br.com.ainosoft.controlerpg.servicos.ServicoLogin;
import br.com.ainosoft.controlerpg.view.TelaLogin;

/**
 * Controlador de eventos de login e logout de usuário. 
 * 
 * @author pedrobrigatto
 */
public class ControladorLogin {
	
	private static ControladorLogin controlador;
	private TelaLogin telaLogin;
	
	private ControladorLogin() {}
	
	public static ControladorLogin getControlador() {
		if (controlador == null) {
			controlador = new ControladorLogin();
		}
		return controlador;
	}
	
	void init() {
		telaLogin = new TelaLogin();
		telaLogin.setVisible(true);
	}
	
	public void realizarLogin(Usuario usuario) {
		if (usuarioPreenchido(usuario) && new ServicoLogin(usuario).executar()) {
			Model.getModel().setJogador(usuario);
			new ServicoCarregamentoCache(usuario).executar();
			ControladorHome.getControlador().exibirHomeView();
		}
	}

	private boolean usuarioPreenchido(Usuario usuario) {
		return (usuario != null && usuario.getUsuario() != null &&
				!"".equals(usuario.getUsuario()) && usuario.getSenha() != null &&
				!"".equals(usuario.getSenha()));
	}
}
