package specificationjpacriteria.specificationjpacriteria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import specificationjpacriteria.specificationjpacriteria.models.Lancamento;
import specificationjpacriteria.specificationjpacriteria.repositories.LancamentoRepository;
import specificationjpacriteria.specificationjpacriteria.repositories.specification.LancamentoSpecificaton;

@Service
public class LancamentoService {
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public void lancar(Lancamento lancamento) {
		lancamentoRepository.save(lancamento);
	}
	
	
	public List<Lancamento> get(String nome,String obs) {
		return lancamentoRepository.findAll(LancamentoSpecificaton.findByCriteria(obs).and(LancamentoSpecificaton.withUsuario(nome)));
	}


}
