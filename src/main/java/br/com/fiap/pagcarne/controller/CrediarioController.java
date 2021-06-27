package br.com.fiap.pagcarne.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.pagcarne.domain.Crediario;

@RestController
public class CrediarioController {

	private List<Crediario> crediarioList;
	private final AtomicLong counter = new AtomicLong();
	private final static String template = "Crediario %d"; 

	public CrediarioController() {
		crediarioList = new ArrayList<Crediario>();
		for(int i = 0; i < 5; i++) {
			crediarioList.add(new Crediario(counter.incrementAndGet(),
					String.format(template, counter.get())));
		}
	}

	@GetMapping("/crediarios")
	public List<Crediario> crediarioList() {
		return crediarioList;
	}
	
	@GetMapping("/crediario")
	public Crediario crediario(@RequestParam(value="id") long id) {
		return crediarioList.get((int) id);
	}

}
