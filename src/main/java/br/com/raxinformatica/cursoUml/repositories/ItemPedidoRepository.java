package br.com.raxinformatica.cursoUml.repositories;

import br.com.raxinformatica.cursoUml.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
