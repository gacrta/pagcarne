package br.com.fiap.pagcarne.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Crediario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String descricao;
	private double valorTotal;
	private double taxaJuros;
	private long qtdeParcelas;
	private LocalDate proximoVencimento;
	private long clienteId;

	public Crediario() {}

	public Crediario(long id, String descricao, double valorTotal, double taxaJuros, long qtdeParcelas, LocalDate  proximoVencimento, long clienteId) {
		this.id = id;
		this.descricao = descricao;
		this.valorTotal = valorTotal;
		this.taxaJuros = taxaJuros;
		this.qtdeParcelas = qtdeParcelas;
		this.proximoVencimento = proximoVencimento;
		this.clienteId = clienteId;
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

	public LocalDate  getProximoVencimento() {
		return proximoVencimento;
	}

	public Crediario setProximoVencimento(LocalDate  proximoVencimento) {
		this.proximoVencimento = proximoVencimento;
		return this;
	}
	
	public long getClienteId() {
		return clienteId;
	}

	public Crediario setClienteId(long clienteId) {
		this.clienteId = clienteId;
		return this;
	}

	@Override
	public String toString() {
		return "Crediario{" +
				"id=" + id +
				", descricao=" + descricao +
				", valorTotal=" + valorTotal +
				", taxaJuros=" + taxaJuros +
				", qtdeParcelas=" + qtdeParcelas +
				", proximoVencimento=" + proximoVencimento +
				", clienteId=" + clienteId +
				"}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, descricao, valorTotal, taxaJuros, qtdeParcelas, proximoVencimento, clienteId);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		final Crediario crediario = (Crediario) o;
		return id == crediario.id &&
				Objects.equals(descricao, crediario.descricao) &&
				Objects.equals(valorTotal, crediario.valorTotal) &&
				Objects.equals(taxaJuros, crediario.taxaJuros) &&
				Objects.equals(qtdeParcelas, crediario.qtdeParcelas) &&
				Objects.equals(proximoVencimento, crediario.proximoVencimento) &&
				Objects.equals(clienteId, crediario.clienteId);
	}
}
