package com.example.examen02.service;



import com.example.examen02.entity.Tipo;

import java.util.List;
import java.util.Optional;

public interface TipoService {
    public Tipo create(Tipo Tipo);
    public Tipo update(Tipo Tipo);
    public void delete(Long id);
    public Optional<Tipo> read(Long id);
    public List<Tipo> readAll();
}
