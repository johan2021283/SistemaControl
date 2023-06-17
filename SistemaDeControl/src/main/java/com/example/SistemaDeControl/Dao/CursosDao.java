package com.example.SistemaDeControl.Dao;

import com.example.SistemaDeControl.Entity.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CursosDao extends JpaRepository<Cursos, Long> {

}
