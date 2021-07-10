package br.com.fiap.pagcarne.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Crediario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String descricao;
	private double valorTotal;
	private double taxaJuros;
	private long qtdeParcelas;
	private long clienteId;

	public Crediario() {}

	public Crediario(long id, String descricao, double valorTotal, double taxaJuros, long qtdeParcelas, long clienteId) {
		this.id = id;
		this.descricao = descricao;
		this.valorTotal = valorTotal;
		this.taxaJuros = taxaJuros;
		this.qtdeParcelas = qtdeParcelas;
		this.clienteId = clienteId;
	}
	
	@Override
	public String toString() {
		return "Crediario{" +
				"id=" + id +
				", descricao=" + descricao +
				"}";
	}
	
	public long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public Crediario setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public Crediario setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
		return this;
	}
	
	public double getTaxaJuros() {
		return taxaJuros;
	}

	public Crediario setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
		return this;
	}
	
	public long getQtdeParcelas() {
		return qtdeParcelas;
	}

	public Crediario setQtdeParcelas(long qtdeParcelas) {
		this.qtdeParcelas = qtdeParcelas;
		return this;
	}
	
	public long getClienteId() {
		return clienteId;
	}

	public Crediario setClienteId(long clienteId) {
		this.clienteId = clienteId;
		return this;
	}
}
