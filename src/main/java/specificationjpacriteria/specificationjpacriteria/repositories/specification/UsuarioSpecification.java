package specificationjpacriteria.specificationjpacriteria.repositories.specification;

import java.util.Objects;

import org.springframework.data.jpa.domain.Specification;

import specificationjpacriteria.specificationjpacriteria.models.Usuario;

public class UsuarioSpecification {
	
	public static Specification<Usuario> withNome(String nome) {
		return (root, query, cb) -> {
			if(Objects.nonNull(nome))
				return cb.equal(root.get("nome"), nome);
			return null;
		};
	}
	
	public static Specification<Usuario> withEmail(String email) {
		return (root, query, cb) -> {
			if(Objects.nonNull(email))
				return cb.equal(root.get("email"), email);
			return null;
		};
	}
	
	public static Specification<Usuario> maiorIgual(Long id) {
		return (root, query, cb) -> {
			if(Objects.nonNull(id))
				return cb.lessThanOrEqualTo(root.get("id"), id);
			return null;
		};
	}
	
	public static Specification<Usuario> menorIgual(Long id) {
		return (root, query, cb) -> {
			if(Objects.nonNull(id))
				return cb.greaterThanOrEqualTo(root.get("id"), id);
			return null;
		};
	}
	
	


}
