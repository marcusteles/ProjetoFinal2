package br.com.funcionarios;

import br.com.contas.ContaCorrente;
import br.com.contas.ContaPoupanca;



/**
 * 
 * @author Teles
 * 
 * 29 linhas de código
 * dit 1; AVG(CC) 1; WMC 7
 * 
 */
public abstract class Funcionario {

	/*
	 * 5 atributos
	 */
//	private String nome;
//
//	private String cpf;

	private double salario;
	
	protected ContaCorrente cc;
	
	protected ContaPoupanca cp;
	

	/*
	 * 7 métodos
	 * 
	 * CC 1
	 */
	public double getBonificacao() {
		return this.salario * 0.10;
	}

	
	/**
	 * @return nome
	 * 
	 * CC 1
	 */
//	public String getNome() {
//		return nome;
//	}
//	/**
//	 * 
//	 * @param nome
//	 * 
//	 * CC 1
//	 */
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//	/**
//	 * 
//	 * @return cpf
//	 * 
//	 * CC 1
//	 */
//	public String getCpf() {
//		return cpf;
//	}
//
//	/**
//	 * 
//	 * @param cpf
//	 * 
//	 * CC 1
//	 */
//	public void setCpf(String cpf) {
//		this.cpf = cpf;
//	}

	/**
	 * 
	 * @return salario
	 * 
	 * CC 1
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * 
	 * @param salario
	 * 
	 * CC 1
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
}