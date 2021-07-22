package br.com.fiap.pagcarne.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiap.pagcarne.domain.Crediario;
import br.com.fiap.pagcarne.repository.CrediarioRepository;

@Service
public class CrediarioService {

	private CrediarioRepository crediarioRepository;

	@Autowired
	public CrediarioService(CrediarioRepository cr) {
		this.crediarioRepository = cr;
	}

	@Transactional
	public List<Crediario> getCrediariosByClienteId(long clienteId) {
		return crediarioRepository.findByClienteId(clienteId);
	}
	
	@Transactional
	public Crediario getCrediarioById(long id) {
		return crediarioRepository.findById(id);
	}
	
	@Transactional
	public Crediario add(String descricao, double valor, double taxaJuros, long parcelas, LocalDate proximoVencimento, long clienteId) {
		return crediarioRepository.save(new Crediario()
				.setDescricao(descricao)
				.setValorTotal(valor)
				.setTaxaJuros(taxaJuros)
				.setQtdeParcelas(parcelas)
				.setProximoVencimento(proximoVencimento)
				.setClienteId(clienteId));
	}
}
