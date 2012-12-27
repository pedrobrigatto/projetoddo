package br.com.ainosoft.controlerpg.servicos;

import java.util.logging.Level;

public class Logger {
	
	public static final byte ERRO = 0;
	public static final byte INFO = 1;
	public static final byte AVISO = 2;
	
	public static void logar(byte tipo, String fonte, String mensagem) {		
		switch (tipo) {
		case ERRO:
			java.util.logging.Logger.getLogger(fonte).log(Level.SEVERE, mensagem);
			break;
		case INFO:
			java.util.logging.Logger.getLogger(fonte).log(Level.INFO, mensagem);
			break;
		case AVISO:
			java.util.logging.Logger.getLogger(fonte).log(Level.WARNING, mensagem);
			break;
		}
	}
}
