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
public class ContaPoupanca extends Conta {

	/*
	 * 1 atributo
	 */
	private String tipoConta;
	
	/*
	 * 5 métodos
	 */
	
	/**
	 * 
	 * @param numero
	 * @param titular
	 * 
	 * CC 1
	 */
	public ContaPoupanca(Cliente titular) {
		super(titular);
		this.tipoConta = TipoConta.CP.getDescricao();
	}

	//CC 1
	public String getTipoConta() {
		return this.tipoConta;
	}

	//CC 1
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	/**
	 * 
	 * @param valor
	 * 
	 * CC 1
	 */
	public void deposita(double valor) {
		this.setSaldo(valor - 0.05);
	}

	/**
	 * 
	 * @param taxa
	 * 
	 * CC 1
	 */
	public double atualiza(double taxa) {
		this.setSaldo(this.getSaldo() * taxa * 3);
		return this.getSaldo() * taxa * 3;
	}
}