package com.example.fernandez.notas.service;

import com.example.fernandez.notas.model.Nota;
import com.example.fernandez.notas.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotaService {

    @Autowired
    NotaRepository notaRepository;


    /*public void save(Nota nota){
        notaRepository.save(nota);
    }*/

    public Nota save(Nota nota) {
        return notaRepository.save(nota);
    }

    public List getNotas(){
        List notas = new ArrayList();
        notaRepository.findAll().forEach(nota -> notas.add(nota));
        return notas;
    }
}
