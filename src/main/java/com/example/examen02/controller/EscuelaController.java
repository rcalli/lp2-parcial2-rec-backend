package com.example.examen02.controller;

import com.example.examen02.entity.Escuela;
import com.example.examen02.service.EscuelaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/escuelas")
@CrossOrigin(origins = "http://localhost:4200")
public class EscuelaController {
    @Autowired
    private EscuelaService escuelaService;

    @GetMapping
    public ResponseEntity<List<Escuela>> readAll(){
        try {
            List<Escuela> escuelas = escuelaService.readAll();
            if(escuelas.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(escuelas, HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PostMapping
    public ResponseEntity<Escuela> crear(@Valid @RequestBody Escuela escuela) {
        try {
            Escuela c = escuelaService.create(escuela);
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @GetMapping("/{id}")
    public ResponseEntity<Escuela> getEscuelaId(@PathVariable("id") Long id){
        try {
            Escuela c = escuelaService.read(id).get();
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Escuela> delEscuela(@PathVariable("id") Long id){
        try {
            escuelaService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateEscuela(@PathVariable("id") Long id, @Valid @RequestBody Escuela escuela){

        Optional<Escuela> c = escuelaService.read(id);
        if(c.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(escuelaService.update(escuela), HttpStatus.OK);
        }

    }
}
