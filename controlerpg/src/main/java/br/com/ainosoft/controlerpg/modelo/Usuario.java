package br.com.ainosoft.controlerpg.modelo;

/**
 * Representação de um jogador.
 * 
 * @author pedrobrigatto
 */
public class Usuario {
	
	private String usuario;
	private String senha;
	private Conta conta;
	
	public Usuario() {}

	public Usuario(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
