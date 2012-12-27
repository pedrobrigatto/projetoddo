package br.com.ainosoft.controlerpg.view;

public class TelaJogo extends TelaBase {
	
	/*
	 * premissa 1: personagens pré-cadastrados no sistema
	 * premissa 2: armas pré-cadastradas no sistema
	 * premissa 3: itens pré-cadastrados no sistema
	 * premissa 4: não haverá cadastro algum pelo sistema, itens são pré-definidos no jogo
	 * 
	 * adicionar personagem
	 * adicionar arma
	 * adicionar item em personagem (exibir status em dialogo indicando possiveis epics)
	 * logout
	 */
	
	private static final long serialVersionUID = 326956318449774928L;
	private static final String TITULO = "Tela Principal";
	
	public TelaJogo() {
		super(TITULO);
	}
	
	@Override
	public void montarTela() {
		
	}
}
