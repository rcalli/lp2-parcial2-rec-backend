package com.example.examen02.repository;

import com.example.examen02.entity.Marca;
import com.example.examen02.entity.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {
}