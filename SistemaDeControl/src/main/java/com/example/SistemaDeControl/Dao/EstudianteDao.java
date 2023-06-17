package com.example.SistemaDeControl.Dao;

import com.example.SistemaDeControl.Entity.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteDao extends JpaRepository <Estudiantes, Long> {
}
