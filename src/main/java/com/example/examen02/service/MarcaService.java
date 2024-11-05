package com.example.examen02.service;



import com.example.examen02.entity.Marca;

import java.util.List;
import java.util.Optional;

public interface MarcaService {
    public Marca create(Marca Marca);
    public Marca update(Marca Marca);
    public void delete(Long id);
    public Optional<Marca> read(Long id);
    public List<Marca> readAll();
}
