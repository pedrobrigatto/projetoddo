package br.com.ainosoft.controlerpg.controle;

public class InitController {
	
	/**
	 * Ponto de entrada da aplicação.
	 * 
	 * @param initArgs Argumentos de inicialização do programa.
	 */
	public static void main (String [] initArgs) {
		ControladorLogin.getControlador().init();
	}
}
