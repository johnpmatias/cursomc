package com.johnmatias.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johnmatias.cursomc.domain.Cliente;
import com.johnmatias.cursomc.repositories.ClienteRepository;
import com.johnmatias.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID:" + id +", Tipo:" + Cliente.class.getName()));
	}
	
}
