package br.com.raxinformatica.cursoUml.repositories;

import br.com.raxinformatica.cursoUml.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
