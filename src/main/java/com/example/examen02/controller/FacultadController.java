package com.example.examen02.controller;

import com.example.examen02.entity.Escuela;
import com.example.examen02.entity.Facultad;
import com.example.examen02.service.EscuelaService;
import com.example.examen02.service.FacultadService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/facultades")
@CrossOrigin(origins = "http://localhost:4200")
public class FacultadController {
    @Autowired
    private FacultadService facultadService;

    @GetMapping
    public ResponseEntity<List<Facultad>> readAll(){
        try {
            List<Facultad> facultades = facultadService.readAll();
            if(facultades.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(facultades, HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PostMapping
    public ResponseEntity<Facultad> crear(@Valid @RequestBody Facultad facultad) {
        try {
            Facultad c = facultadService.create(facultad);
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @GetMapping("/{id}")
    public ResponseEntity<Facultad> getFacultadId(@PathVariable("id") Long id){
        try {
            Facultad c = facultadService.read(id).get();
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Escuela> delFacultad(@PathVariable("id") Long id){
        try {
            facultadService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateFacultad(@PathVariable("id") Long id, @Valid @RequestBody Facultad facultad){

        Optional<Facultad> c = facultadService.read(id);
        if(c.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(facultadService.update(facultad), HttpStatus.OK);
        }

    }
}
