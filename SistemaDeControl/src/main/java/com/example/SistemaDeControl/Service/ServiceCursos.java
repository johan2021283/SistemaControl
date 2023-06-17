package com.example.SistemaDeControl.Service;

import com.example.SistemaDeControl.Entity.Cursos;
import com.example.SistemaDeControl.Entity.Estudiantes;

import java.util.List;

public interface ServiceCursos {
    List<Cursos> obtenerTodosLosCursos();
    Cursos obtenerCursostePorId(Long id);
    void guardarCursos(Cursos cursos);
    void actualizarCursos(Long id, Cursos cursos);
    void eliminarCursos(Long id);
}
