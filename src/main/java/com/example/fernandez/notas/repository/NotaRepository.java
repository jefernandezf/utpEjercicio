package com.example.fernandez.notas.repository;

import com.example.fernandez.notas.model.Nota;
import org.springframework.data.repository.CrudRepository;

public interface NotaRepository  extends CrudRepository<Nota, Integer> {

}
