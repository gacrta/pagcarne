package br.com.fiap.pagcarne.domain;

public class Crediario {
	
	private long id;
	private String descricao;

	public Crediario(long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	} 

}
