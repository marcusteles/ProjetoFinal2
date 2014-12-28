package br.com.contas;

import br.com.clientes.Cliente;
import br.com.enums.TipoConta;

/**
 * 
 * @author Teles
 *
 * 22 linhas de código
 * dit 2 CE 1; AVG(CC) 1; WMC 5
 * 
 */
public class ContaCorrente extends Conta {
	
	/*
	 * 1 atributo
	 */
	private String tipoConta;

	/*
	 * 5 métodos
	 */
	/**
	 * 
	 * @param titular
	 * 
	 * CC 1
	 */
	public ContaCorrente(Cliente titular) {
		super(titular);
		this.tipoConta = TipoConta.CC.getDescricao();
	}

	/**
	 * 
	 * @param valor
	 * 
	 * CC 1
	 */
	public void deposita(double valor) {
		this.setSaldo(valor - 0.10);
	}

	/**
	 * 
	 * @param taxa
	 * 
	 * CC 1
	 */
	public double atualiza(double taxa) {
		this.setSaldo(this.getSaldo() * taxa * 2);
		return this.getSaldo() * taxa * 2;
	}

	/**
	 * @return the tipoConta
	 * 
	 * CC 1
	 */
	public String getTipoConta() {
		return this.tipoConta;
	}

	/**
	 * @param tipoConta the tipoConta to set
	 * 
	 * CC 1
	 */
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
}