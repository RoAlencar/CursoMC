package br.com.raxinformatica.cursoUml.repositories;

import br.com.raxinformatica.cursoUml.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
