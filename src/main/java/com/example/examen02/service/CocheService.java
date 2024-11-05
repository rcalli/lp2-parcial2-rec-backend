package com.example.examen02.service;

import com.example.examen02.entity.Coche;

import java.util.List;
import java.util.Optional;

public interface CocheService {
    public Coche create(Coche coche);
    public Coche update(Coche coche);
    public void delete(Long id);
    public Optional<Coche> read(Long id);
    public List<Coche> readAll();
}
