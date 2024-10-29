package com.example.examen02.serviceImpl;

import com.example.examen02.entity.Facultad;
import com.example.examen02.repository.EscuelaRepository;
import com.example.examen02.repository.FacultadRepository;
import com.example.examen02.service.FacultadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultadServiceImpl implements FacultadService {
    @Autowired
    private FacultadRepository facultadRepository;
    @Autowired
    private EscuelaRepository escuelaRepository;

    @Override
    public Facultad create(Facultad Facultad) {
        return facultadRepository.save(Facultad);
    }

    @Override
    public Facultad update(Facultad Facultad) {
        return facultadRepository.save(Facultad);
    }

    @Override
    public void delete(Long id) {
        facultadRepository.deleteById(id);
    }

    @Override
    public Optional<Facultad> read(Long id) {
        return facultadRepository.findById(id);
    }

    @Override
    public List<Facultad> readAll() {
        return facultadRepository.findAll();
    }
}
