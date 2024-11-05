package com.example.examen02.serviceImpl;

import com.example.examen02.entity.Coche;
import com.example.examen02.repository.CocheRepository;
import com.example.examen02.service.CocheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CocheServiceImpl implements CocheService {

    @Autowired
    private CocheRepository cocheRepository;

    @Override
    public Coche create(Coche coche) {
        return cocheRepository.save(coche);
    }

    @Override
    public Coche update(Coche coche) {
        return cocheRepository.save(coche);
    }

    @Override
    public void delete(Long id) {
        cocheRepository.deleteById(id);
    }

    @Override
    public Optional<Coche> read(Long id) {
        return cocheRepository.findById(id) ;
    }

    @Override
    public List<Coche> readAll() {
        return cocheRepository.findAll();
    }
}
