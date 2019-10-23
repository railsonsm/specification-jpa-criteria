package specificationjpacriteria.specificationjpacriteria.repositories.specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import specificationjpacriteria.specificationjpacriteria.models.Lancamento;
import specificationjpacriteria.specificationjpacriteria.models.Usuario;

public class LancamentoSpecificaton {


	public static Specification<Lancamento> findByCriteria(String obs) {

		return new Specification<Lancamento>() {
			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<Lancamento> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicates = new ArrayList<>();
				
				if(Objects.nonNull(obs)) {
					predicates.add(cb.equal(root.get("observacao"), obs));
				}
					
				return cb.and(predicates.toArray(new Predicate[predicates.size()]));
			}
		};
	}

	public static Specification<Lancamento> withUsuario(String nome) {
		return (root, query, cb) -> {
			Join<Lancamento, Usuario> usuario = root.join("usuario", JoinType.INNER);
			
			if(Objects.nonNull(nome)) {
				return cb.equal(usuario.get("nome"), nome);
			}
				
			return null;
		};
	}

}
