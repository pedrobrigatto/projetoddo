package br.com.ainosoft.controlerpg.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.ainosoft.controlerpg.controle.ControladorLogin;
import br.com.ainosoft.controlerpg.modelo.Usuario;

public class TelaLogin extends TelaBase {

	private static final long serialVersionUID = 5451915329039133778L;
	private static final String TITULO = "Tela de Entrada";
	
	private JTextField usuario;
	private JPasswordField senha;
	
	private JButton entrar;
	private JButton limpar;
	private JButton sair;

	public TelaLogin() {
		super(TITULO);
	}
	
	@Override
	public void montarTela() {
		
		// Inicializar os componentes, adicionar na tela.
		
		
		entrar = new JButton("Entrar");
		entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entrar(verificarCampos());
			}
		});
		
		limpar = new JButton("Limpar");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparTela();
			}
		});
		
		
		sair = new JButton("Sair");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	private Usuario verificarCampos() {
		if (usuario != null && !"".equals(usuario.getText()) &&
				senha != null && !"".equals(new String(senha.getPassword()))) {
			return new Usuario(usuario.getText(), new String(senha.getPassword()));
		}
		return null;
	}
	
	private void entrar (Usuario usuario) {
		ControladorLogin.getControlador().realizarLogin(usuario);
	}
	
	private void limparTela() {
		usuario.setText("");
		senha.setText("");
	}
}
