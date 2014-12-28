package br.com.enums;


/**
 * 
 * @author Teles
 *
 *  23 linhas de código
 *  CA 3; AVG(CC);
 */
public enum TipoPermissao {

	
	DIRETOR(1, "Diretor"), GERENTE(2, "Gerente"), ANALISTA(3, "Analista"),SECRETARIO(4, "Secretario"),
	CLIENTE(4, "Cliente");
	
	private int valor;
	private String descricao;
	
	TipoPermissao(int valor, String descricao){
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
