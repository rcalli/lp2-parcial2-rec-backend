package com.example.examen02.service;

import com.example.examen02.entity.Escuela;

import java.util.List;
import java.util.Optional;

public interface EscuelaService {
    public Escuela create(Escuela escuela);
    public Escuela update(Escuela escuela);
    public void delete(Long id);
    public Optional<Escuela> read(Long id);
    public List<Escuela> readAll();
}
