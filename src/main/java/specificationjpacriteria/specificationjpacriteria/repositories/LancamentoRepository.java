package specificationjpacriteria.specificationjpacriteria.repositories;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import specificationjpacriteria.specificationjpacriteria.models.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, JpaSpecificationExecutor<Lancamento>{

	List<Lancamento> findAll(Specification<Lancamento> findByCriteriaDTO);
	
};
