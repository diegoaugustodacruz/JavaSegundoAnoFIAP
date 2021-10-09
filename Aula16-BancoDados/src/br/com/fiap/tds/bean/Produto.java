package br.com.fiap.tds.bean;

public class Produto {
	
	private int codigo;
	
	private String nome, descricao;
	
	private double valor;
	
	private String nomeFornecedor;
	
	public Produto() {
		
	}

	public Produto(int codigo, String nome, String descricao, double valor, String nomeFornecedor) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.nomeFornecedor = nomeFornecedor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}
	
	@Override
	public String toString() {
		return "Código: " + codigo + ", nome: " + nome + ", descricao: " + descricao + ", valor: " + valor + ", fornecedor" + nomeFornecedor;
	}


}
