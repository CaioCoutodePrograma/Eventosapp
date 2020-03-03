package com.eventosapp.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.eventosapp.models.Convidado;
import com.eventosapp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	Iterable<Convidado> findByEvento(Evento evento);
	
}
