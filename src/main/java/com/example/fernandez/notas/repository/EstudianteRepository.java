package com.example.fernandez.notas.repository;

import com.example.fernandez.notas.model.Estudiante;
import com.example.fernandez.notas.model.Nota;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteRepository extends CrudRepository<Estudiante, Integer> {
}
