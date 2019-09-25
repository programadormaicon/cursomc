package com.maicon.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maicon.cursomc.domain.Categoria;
import com.maicon.cursomc.repository.CategoriaRepository;
import com.maicon.cursomc.service.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado Id: "+id+", Tipo: "+ Categoria.class.getName()));
	}
	
}
