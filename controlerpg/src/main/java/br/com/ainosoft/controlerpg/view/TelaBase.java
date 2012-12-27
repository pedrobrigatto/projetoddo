package br.com.ainosoft.controlerpg.view;

import javax.swing.JFrame;

public abstract class TelaBase extends JFrame {
	
	private static final long serialVersionUID = 8209452487857410998L;

	public TelaBase(String titulo) {
		super(titulo);
		montarTela();
	}
	
	public abstract void montarTela();
}
