package com.example.examen02.service;



import com.example.examen02.entity.Facultad;

import java.util.List;
import java.util.Optional;

public interface FacultadService {
    public Facultad create(Facultad Facultad);
    public Facultad update(Facultad Facultad);
    public void delete(Long id);
    public Optional<Facultad> read(Long id);
    public List<Facultad> readAll();
}
