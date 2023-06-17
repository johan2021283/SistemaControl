package com.example.SistemaDeControl.Entity;

import javax.persistence.*;

@Entity
@Table  (name = "cursos")
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String materia;

    private String nombreProfesor;

    public Cursos() {
    }

    public Cursos(String materia, String nombreProfesor) {
        this.materia = materia;
        this.nombreProfesor = nombreProfesor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }
}
