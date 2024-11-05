package com.example.examen02.serviceImpl;

import com.example.examen02.entity.Tipo;
import com.example.examen02.repository.TipoRepository;
import com.example.examen02.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoServiceImpl implements TipoService {
    @Autowired
    private TipoRepository tipoRepository;


    @Override
    public Tipo create(Tipo tipo) {
        return tipoRepository.save(tipo);
    }

    @Override
    public Tipo update(Tipo tipo) {
        return tipoRepository.save(tipo);
    }

    @Override
    public void delete(Long id) {
        tipoRepository.deleteById(id);
    }

    @Override
    public Optional<Tipo> read(Long id) {
        return tipoRepository.findById(id) ;
    }

    @Override
    public List<Tipo> readAll() {
        return tipoRepository.findAll();
    }
}