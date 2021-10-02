package com.example.fernandez.notas.service;

import com.example.fernandez.notas.model.Estudiante;
import com.example.fernandez.notas.model.Nota;
import com.example.fernandez.notas.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {

    @Autowired
    EstudianteRepository estudianteRepository;


    public void save(Estudiante estudiante){
        estudianteRepository.save(estudiante);
    }

    public Estudiante getEstudianteById(int id) {
        return estudianteRepository.findById(id).get();
    }
}
