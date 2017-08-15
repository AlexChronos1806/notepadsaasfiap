package br.com.fiap.notepadsaaswe.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import br.com.fiap.notepadsaaswe.model.Nota;
import br.com.fiap.notepadsaaswe.repository.NotaRepository;

@RestController
@CrossOrigin
@RequestMapping(value = "/note")
public class NotaController {

	private NotaRepository notaRepository;
	
	public NotaController(NotaRepository notaRepository) {
		this.notaRepository = notaRepository;
	}
	
	@GetMapping(value = "/")
	public List<Nota> findAll() {
		return notaRepository.findAll();
	}

	@GetMapping(value = "titulo/{titulo}")
	private List<Nota> findByTitulo(@PathVariable(value = "titulo") String q) {
		return notaRepository.findByTitulo(q);
	}

	@PostMapping(value = "/")
	public void save(@RequestBody Nota nota) {
		notaRepository.save(nota);
	}
}
