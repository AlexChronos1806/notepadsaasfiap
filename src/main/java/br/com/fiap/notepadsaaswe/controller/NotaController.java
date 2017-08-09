package br.com.fiap.notepadsaaswe.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.notepadsaaswe.model.Nota;
import br.com.fiap.notepadsaaswe.repository.NotaRepository;

@RestController
public class NotaController {

	private NotaRepository notaRepository;
	
	public NotaController(NotaRepository notaRepository) {
		this.notaRepository = notaRepository;
	}
	
	@GetMapping(value = "/")
	public List<Nota> findAll() {
		return notaRepository.findAll();
	}
	
	@PostMapping(value = "/")
	public void save(@RequestBody Nota nota) {
		notaRepository.save(nota);
	}
}
