package com.example.SistemaDeControl.Service;

import com.example.SistemaDeControl.Entity.Estudiantes;

import java.util.List;

public interface ServiceEstudiante {

    List<Estudiantes> obtenerTodosLosEstudiantes();
    Estudiantes obtenerEstudiantePorId(Long id);
    void guardarEstudiante(Estudiantes estudiantes);
    void actualizarEstudiante(Long id, Estudiantes estudiantes);
    void eliminarEstudiante(Long id);
}
