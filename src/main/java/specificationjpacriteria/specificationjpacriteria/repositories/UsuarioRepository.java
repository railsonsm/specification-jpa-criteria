package specificationjpacriteria.specificationjpacriteria.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import specificationjpacriteria.specificationjpacriteria.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>, JpaSpecificationExecutor<Usuario>{

	Boolean existsByEmail(String value);

	@Query("select u from Usuario u")
	Page<Usuario> teste(Specification<Usuario> spec, Pageable pageable);
}
