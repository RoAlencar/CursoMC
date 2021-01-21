package br.com.raxinformatica.cursoUml.services;

import br.com.raxinformatica.cursoUml.domain.Categoria;
import br.com.raxinformatica.cursoUml.domain.Pedido;
import br.com.raxinformatica.cursoUml.repositories.CategoriaRepository;
import br.com.raxinformatica.cursoUml.repositories.PedidoRepository;
import br.com.raxinformatica.cursoUml.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		}
}
