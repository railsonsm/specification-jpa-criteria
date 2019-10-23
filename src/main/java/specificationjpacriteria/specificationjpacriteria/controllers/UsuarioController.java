package specificationjpacriteria.specificationjpacriteria.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import specificationjpacriteria.specificationjpacriteria.models.Usuario;
import specificationjpacriteria.specificationjpacriteria.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;

	@PostMapping
	public void salvar(@Valid @RequestBody Usuario usuario) {
		usuarioService.salvar(usuario);
	}
	
	@GetMapping
	public ResponseEntity<?> teste(String nome, String email, Long id) {
		return ResponseEntity.ok(usuarioService.get(nome, email, id));
	}

}
