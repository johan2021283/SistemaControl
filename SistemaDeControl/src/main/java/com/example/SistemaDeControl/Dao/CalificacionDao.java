package com.example.SistemaDeControl.Dao;

import com.example.SistemaDeControl.Entity.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalificacionDao extends JpaRepository<Calificacion, Long> {
}
