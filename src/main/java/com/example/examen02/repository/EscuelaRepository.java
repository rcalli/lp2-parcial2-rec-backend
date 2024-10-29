package com.example.examen02.repository;

import com.example.examen02.entity.Escuela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscuelaRepository extends JpaRepository<Escuela, Long> {
}
