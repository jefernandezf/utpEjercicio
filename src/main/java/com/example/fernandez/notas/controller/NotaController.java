package com.example.fernandez.notas.controller;

import com.example.fernandez.notas.model.Estudiante;
import com.example.fernandez.notas.model.Nota;
import com.example.fernandez.notas.repository.EstudianteRepository;
import com.example.fernandez.notas.repository.NotaRepository;
import com.example.fernandez.notas.service.EstudianteService;
import com.example.fernandez.notas.service.NotaService;
import com.example.fernandez.notas.util.Mensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
public class NotaController {

    @Autowired
    NotaService notaService;

    @Autowired
    EstudianteRepository estudianteRepository;

    @Autowired
    EstudianteService estudianteService;

    @GetMapping("/listarNota")
    private List getNota(){
        return notaService.getNotas();
    }


    @PostMapping(value = "/nota")
    public ResponseEntity<Nota> updateTipoCambio(@RequestBody Nota nota) {
        Optional<Estudiante> estudiante = estudianteRepository.findById(nota.getIdUsuario());
        if (estudiante.isPresent()) {
            return new ResponseEntity<>(notaService.save(nota), HttpStatus.OK);
        } else {
            return new ResponseEntity(new Mensaje("Id de Usuario no existe : " + nota.getIdUsuario()), HttpStatus.NOT_FOUND);
        }
    }



    @PostMapping("/crearEstudiante")
    private int saveNota(@RequestBody Estudiante estudiante){
        estudianteService.save(estudiante);
        return estudiante.getId();
    }

    @GetMapping("/estudiante/{id}")
    private Estudiante getMovie(@PathVariable("id") int id) {
        return estudianteService.getEstudianteById(id);
    }




}
