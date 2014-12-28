package br.com.contas;

import br.com.clientes.Cliente;


/**
 * 
 * @author Teles
 *
 * 54 linhas de código
 * dit 1 CA 3 CE 1; AVG(CC) 1,0769; WMC 14
 */
public class Conta {

	/*
	 * 4 atributos
	 */
	private int numero;

	private Cliente titular;

	private double saldo;

	private double limite;

	/*
	 * 13 métodos
	 * 
	 * CC 1
	 */
	public Conta() {		
	}

	/**
	 * 
	 * @param titular
	 * 
	 * CC 1
	 */
	public Conta(Cliente titular) {
		this.titular = titular;
	}

	/**
	 * 
	 * @param numero
	 * @param titular
	 * 
	 * CC 1
	 */
	public Conta(int numero, Cliente titular) {

		this(titular);
		this.numero = numero;
	}

	/**
	 * 
	 * @param valor
	 * 
	 * CC 2
	 */
	public void saca(double valor) {

		if (valor > this.saldo + this.limite) {
			System.out.println(this.titular.getNome()+ ", o senhor não pode sacar fora do limite!");
		} else {
			this.saldo = this.saldo - valor;
			System.out.println(titular.getNome()+ ", Saque realizado com sucesso");
			System.out.println("Seu saldo é " + this.saldo);
			System.out.println("Seu saldo total é "	+ (this.saldo + this.limite));
		}
	}

	/**
	 * 
	 * @param taxa
	 * 
	 * CC 1
	 */
	public double atualiza(double taxa) {
		return this.saldo += this.saldo * taxa;
	}

	/**
	 * 
	 * @return numero
	 * 
	 * CC 1
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * 
	 * @param numero
	 * 
	 * CC 1
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * 
	 * @return titular
	 * 
	 * CC 1
	 */
	public Cliente getTitular() {
		return titular;
	}

	/**
	 * 
	 * @param titular
	 * 
	 * CC 1
	 */
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	/**
	 * 
	 * @return saldo
	 * 
	 * CC 1
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * 
	 * @param saldo
	 * 
	 * CC 1
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * 
	 * @return limite
	 * 
	 * CC 1
	 */
	public double getLimite() {
		return limite;
	}

	/**
	 * 
	 * @param limite
	 * 
	 * CC 1
	 */
	public void setLimite(double limite) {
		this.limite = limite;
	}
}