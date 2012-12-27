package br.com.ainosoft.controlerpg.modelo.database;

import java.util.List;

/**
 * @author pedrobrigatto
 */
public interface Dao<T> {
	
	boolean salvar(T elemento);
	boolean atualizar(T elemento);
	boolean excluir(T elemento);
	List<T> listar(String ... criterios);
}
