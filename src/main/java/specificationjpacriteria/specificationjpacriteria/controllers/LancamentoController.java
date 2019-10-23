package specificationjpacriteria.specificationjpacriteria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import specificationjpacriteria.specificationjpacriteria.models.Lancamento;
import specificationjpacriteria.specificationjpacriteria.services.LancamentoService;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {
	@Autowired
	private LancamentoService lancamentoService;

	@PostMapping
	public void lancar(@RequestBody Lancamento lancamento) {
		lancamentoService.lancar(lancamento);
	}
	
	@GetMapping
	public ResponseEntity<?> teste(String nome, String obs) {
		return ResponseEntity.ok(lancamentoService.get(nome, obs));
	}
	

	
}
