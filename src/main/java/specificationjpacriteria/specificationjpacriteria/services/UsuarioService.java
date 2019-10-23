package specificationjpacriteria.specificationjpacriteria.services;

import static org.springframework.data.jpa.domain.Specification.where;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import specificationjpacriteria.specificationjpacriteria.models.Usuario;
import specificationjpacriteria.specificationjpacriteria.repositories.UsuarioRepository;
import specificationjpacriteria.specificationjpacriteria.repositories.specification.UsuarioSpecification;



@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void salvar(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	public Page<Usuario> get(String nome, String email, Long id) {
		PageRequest p = PageRequest.of(0, 5, Direction.DESC, "nome");
		return usuarioRepository.findAll(where(UsuarioSpecification.withEmail(email)
				.or(UsuarioSpecification.withNome(nome)))
				.and(UsuarioSpecification.maiorIgual(id))
				.and(UsuarioSpecification.menorIgual(id))
				, p);
	}
	
	
}
