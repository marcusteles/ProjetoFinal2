package br.com.interfaces;

/**
 * 
 * @author Teles
 *
 * 5 linhas de c�digo
 * CA 3; 
 * 
 */
public interface Autenticavel {

	public boolean autentica(String login, int senha);
	
	public char permissao(String matricula);
}
