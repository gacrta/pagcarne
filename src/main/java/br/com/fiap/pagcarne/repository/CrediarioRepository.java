package br.com.fiap.pagcarne.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.fiap.pagcarne.domain.Cliente;
import br.com.fiap.pagcarne.domain.Crediario;

public interface CrediarioRepository extends PagingAndSortingRepository<Crediario, Long>{
	Crediario findById(long id);
	List<Crediario> findByClienteId(long clienteId);
}
