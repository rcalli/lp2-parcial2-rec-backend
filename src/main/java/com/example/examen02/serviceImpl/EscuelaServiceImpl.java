package com.example.examen02.serviceImpl;

import com.example.examen02.entity.Escuela;
import com.example.examen02.repository.EscuelaRepository;
import com.example.examen02.service.EscuelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EscuelaServiceImpl implements EscuelaService {

    @Autowired
    private EscuelaRepository escuelaRepository;

    @Override
    public Escuela create(Escuela escuela) {
        return escuelaRepository.save(escuela);
    }

    @Override
    public Escuela update(Escuela escuela) {
        return escuelaRepository.save(escuela);
    }

    @Override
    public void delete(Long id) {
        escuelaRepository.deleteById(id);
    }

    @Override
    public Optional<Escuela> read(Long id) {
        return escuelaRepository.findById(id) ;
    }

    @Override
    public List<Escuela> readAll() {
        return escuelaRepository.findAll();
    }
}
