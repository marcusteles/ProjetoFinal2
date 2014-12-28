package br.com.enums;


/**
 * 
 * @author Teles
 *
 * 22 linhas de código
 * CA 2; AVG(CC) 0
 * 
 */
public enum TipoConta {

	CC(1,"Conta Corrente"), CP(2, "Conta Poupança");
	
	//2 atributos
	private int valor;
	private String descricao;
	
	TipoConta(int valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
