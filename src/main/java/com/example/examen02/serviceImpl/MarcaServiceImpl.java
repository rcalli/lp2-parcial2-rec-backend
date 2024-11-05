package com.example.examen02.serviceImpl;

import com.example.examen02.entity.Marca;
import com.example.examen02.entity.Marca;
import com.example.examen02.repository.MarcaRepository;
import com.example.examen02.repository.MarcaRepository;
import com.example.examen02.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaServiceImpl implements MarcaService {
    @Autowired
    private MarcaRepository marcaRepository;


    @Override
    public Marca create(Marca marca) {
        return marcaRepository.save(marca);
    }

    @Override
    public Marca update(Marca marca) {
        return marcaRepository.save(marca);
    }

    @Override
    public void delete(Long id) {
        marcaRepository.deleteById(id);
    }

    @Override
    public Optional<Marca> read(Long id) {
        return marcaRepository.findById(id) ;
    }

    @Override
    public List<Marca> readAll() {
        return marcaRepository.findAll();
    }
}