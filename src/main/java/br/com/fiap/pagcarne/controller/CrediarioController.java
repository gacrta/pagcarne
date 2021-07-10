package br.com.fiap.pagcarne.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.pagcarne.domain.Crediario;
import br.com.fiap.pagcarne.service.CrediarioService;

@RestController
public class CrediarioController {
	
	@Autowired
	private CrediarioService crediarioService;

	public CrediarioController() {}

	@GetMapping("/crediarios")
	public List<Crediario> crediarioList(@RequestParam(value="clienteid") long id) {
		List<Crediario> credList = crediarioService.getCrediariosByClienteId(id);
		return credList;
	}
	
	@GetMapping("/crediario")
	public Crediario crediario(@RequestParam(value="id") long id) {
		return crediarioService.getCrediarioById(id);
	}

}
