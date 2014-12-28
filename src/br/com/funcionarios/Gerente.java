package br.com.funcionarios;

import br.com.enums.TipoPermissao;
import br.com.interfaces.Autenticavel;


/**
 *
 * @author Teles
 * 
 * 56 linhas de código
 * dit 2; AVG(CC) 1,56; WMC 14
 * 
 */
public class Gerente extends Funcionario implements Autenticavel   {
	
	/*
	 * 3 atributos
	 */
	private String login;
	
	private int senha;
	
	private int numeroDeFuncionariosGerenciados;

	/*
	 * 10 métodos
	 */
	
	
	//CC 1
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
		}

	/**
	 * 
	 * @return senha
	 * CC 1
	 */
	public int getSenha() {
		return senha;
	}

	/**
	 * 
	 * @param senha
	 * CC 1
	 */
	public void setSenha(int senha) {
		this.senha = senha;
	}

	/**
	 * 
	 * @return numeroDeFuncionariosGerenciados
	 * 
	 * CC 1
	 */
	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	/**
	 * 
	 * @param numeroDeFuncionariosGerenciados
	 * 
	 * CC 1
	 */
	public void setNumeroDeFuncionariosGerenciados(
			int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public char permissao2(String matricula) {
		
		boolean ok = false;
		char sucesso = '0';
		
		if (matricula.substring(0,1) == "2"){
			ok = true;
			return TipoPermissao.GERENTE.getDescricao().charAt(0);			
		}else{
				if (matricula.substring(0,1) == "3"){
					ok = true;
					return TipoPermissao.ANALISTA.getDescricao().charAt(0);					
				}else{
					if (matricula.substring(0,1) == "4"){
						ok = true;
						return TipoPermissao.SECRETARIO.getDescricao().charAt(0);						
					}else{
						if (matricula.substring(0,1) == "4"){
							ok = true;
							return TipoPermissao.CLIENTE.getDescricao().charAt(0);							
						}
					}
				}
		}
		
		for (TipoPermissao tp: TipoPermissao.values()) {
			System.out.println("Lista de usuários: "+tp);
		}
		
		while (!ok){ //$SUP-IL$
			//TO DO
		}
		
		return sucesso; //$SUP-SU$
	}
	
	/**
	 * @return the login
	 * 
	 * CC 1
	 */
	public String getLogin() {
		return this.login;
	}

	/**
	 * @param login the login to set
	 * 
	 * CC 1 
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public boolean autentica(String login, int senha) {
		
		if ((this.login.equals(login)) && (this.senha == senha)) {
			System.out.println("Acesso Permitido!");
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
		return true;
	}

	@Override
	public char permissao(String matricula) {
		
		boolean ok = false;
		
		for (TipoPermissao tp: TipoPermissao.values()) {
			System.out.println("Tipos de usuários: "+tp);
		}
		
		do{
			if (matricula.substring(0,1) == "2"){
				return TipoPermissao.GERENTE.getDescricao().charAt(0);
			}
			if (matricula.substring(0,1) == "3"){
				return TipoPermissao.ANALISTA.getDescricao().charAt(0);
			}
			if (matricula.substring(0,1) == "4"){
				return TipoPermissao.SECRETARIO.getDescricao().charAt(0);
			}
			if (matricula.substring(0,1) == "4"){
				return TipoPermissao.CLIENTE.getDescricao().charAt(0);
			}
		}while(ok == false); //$SUP-CSR$
		
		for (TipoPermissao tp: TipoPermissao.values()) { //$SUP-SU$
			System.out.println("Lista de usuários: "+tp);
		}
				
		while (!ok){
					
				}
		return 0;
	}
}