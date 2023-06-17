package com.example.SistemaDeControl.Entity;

import javax.persistence.*;

@Entity
@Table
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long estudiantetId;
    private Long cursoId;
    private double score;

    public Calificacion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEstudiantetId() {
        return estudiantetId;
    }

    public void setEstudiantetId(Long estudiantetId) {
        this.estudiantetId = estudiantetId;
    }

    public Long getCursoId() {
        return cursoId;
    }

    public void setCursoId(Long cursoId) {
        this.cursoId = cursoId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
