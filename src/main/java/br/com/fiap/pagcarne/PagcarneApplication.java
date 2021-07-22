package br.com.fiap.pagcarne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.fiap.pagcarne.domain.Crediario;
import br.com.fiap.pagcarne.service.CrediarioService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.time.LocalDate;

@SpringBootApplication
public class PagcarneApplication implements CommandLineRunner{

	@Autowired
	private CrediarioService crediarioService;
	
	private final static String template = "Crediario %d";
	
	public static void main(String[] args) {
		SpringApplication.run(PagcarneApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("PagcarneApplication running");
		
		System.out.println("PagcarneApplication: create fake data");
		LocalDate date = LocalDate.now().plusDays(15);

		for(int i = 1; i < 6; i++) {
			Crediario c = crediarioService.add(String.format(template, i), i*1000, i, i*10, date.plusDays(i*2) ,1);
			System.out.println(c);			
		}
	}
}

