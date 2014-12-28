package br.com.funcionarios;

import br.com.enums.TipoPermissao;
import br.com.interfaces.Autenticavel;

/**
 * 
 * @author Teles
 *
 * 30 linhas de código
 * dit 2; AVG(CC) 3,5; WMC 7
 * 
 */
public class Diretor extends Funcionario implements Autenticavel{

	/*
	 * 2 métodos 
	 */
	
	/*
	 * (non-Javadoc)
	 * @see br.com.interfaces.Autenticavel#autentica(java.lang.String, int)
	 */
	
	//CC 1
	@Override
	public boolean autentica(String login, int senha) {
		// TODO Auto-generated method stub
		return false;
	}

	//CC 6
	@Override
	public char permissao(String matricula) {
		
		if (matricula.substring(0,1) == "1"){
			return TipoPermissao.DIRETOR.getDescricao().charAt(0);
		}
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
		
		return 0;
	}
}
