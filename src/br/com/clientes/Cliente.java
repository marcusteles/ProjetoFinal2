//5 pacotes
package br.com.clientes;

import br.com.contas.Conta;
import br.com.contas.ContaCorrente;
import br.com.contas.ContaPoupanca;
import br.com.enums.TipoPermissao;
import br.com.interfaces.Autenticavel;



/**
 * 
 * @author Teles
 *
 * 81 linhas de código incluindo anotações
 * dit 1; CA 3; CE 3; CC 1,294; WMC 22
 * 
 */
public class Cliente implements Autenticavel {

	//6 atributos
	
	private String login;
	
	private int senha;
	
	private String nome;
	
	private String endereco;
	
	private String cpf;
	
	private int idade;
	
	private static final double TAXA = 2.00;
	
	
	//17 métodos; CC 1
	public Cliente(String nome, String endereco, String cpf, int idade, String login, int senha){
		
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	//CC 2
	private void validaCPF(String cpf) {
		
		if (this.cpf.replaceAll(".", "").replace("-", "").length() == 11){
			// regras para validação de um cpf
		}
	}

	//CC 2
	public void mudaCPF(String cpf) {
	
		if (this.idade <= 60) {
			//cria novo cpf
			validaCPF(cpf);
		}
		this.cpf = cpf;
	}


	//CC 3
	@Override
	public boolean autentica(String login, int senha) {

		if (this.login.equals(login)){ //$SUP-SU$
			if (this.senha == senha){
				return true;
			}
		}
		return false;
	}

//	//CC 2
	@Override
	public char permissao(String matricula) {
		
		if (matricula.substring(0,1) == "4"){
			return TipoPermissao.CLIENTE.getDescricao().charAt(0);
		}
		return 0;
	}
	
	public void verificaTipoConta(Conta conta){
		
		if (conta instanceof ContaCorrente){
			Conta contaCorrente = new ContaCorrente(this);
			System.out.print("Esta conta sofreu uma atualização de "+ contaCorrente.atualiza(TAXA));
		}else{	
			if (conta instanceof ContaPoupanca){
				Conta contaPoupanca = new ContaPoupanca(this);
				System.out.print("Esta conta sofreu uma atualização de "+contaPoupanca.atualiza(TAXA));
			}
		}
	}
	
	/**
	 * 
	 * @return nome
	 * 
	 * CC 1
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @param nome
	 * 
	 * CC 1
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * 
	 * @return endereco
	 * 
	 * CC 1
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * 
	 * @param endereco
	 * 
	 * CC 1
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * 
	 * @return cpf
	 * 
	 * CC 1
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * 
	 * @param cpf
	 * 
	 * CC 1
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * 
	 * @return idade
	 * 
	 * CC 1
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * 
	 * @param idade
	 * 
	 * CC 1
	 */
	public void setIdade(int idade) {
		this.idade = idade;
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

	/**
	 * @return the senha
	 * 
	 * CC 1
	 */
	public int getSenha() {
		return this.senha;
	}

	/**
	 * @param senha the senha to set
	 * 
	 * CC 1
	 */
	public void setSenha(int senha) {
		this.senha = senha;
	}
}