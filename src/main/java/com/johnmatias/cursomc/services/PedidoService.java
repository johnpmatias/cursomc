package com.johnmatias.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johnmatias.cursomc.domain.Pedido;
import com.johnmatias.cursomc.repositories.PedidoRepository;
import com.johnmatias.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID:" + id +", Tipo:" + Pedido.class.getName()));
	}
	
}
