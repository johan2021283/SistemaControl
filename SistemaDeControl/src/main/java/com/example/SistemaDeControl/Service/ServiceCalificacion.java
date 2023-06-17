package com.example.SistemaDeControl.Service;

import com.example.SistemaDeControl.Entity.Calificacion;

import java.util.List;

public interface ServiceCalificacion {

    Calificacion ingresarCalificacion(Calificacion calificacion);
    List<Calificacion> obtenerCalificacionesEstudianteCurso(Long studentId, Long courseId);
    List<Calificacion> obtenerCalificacionesEstudiante(Long studentId);
}
