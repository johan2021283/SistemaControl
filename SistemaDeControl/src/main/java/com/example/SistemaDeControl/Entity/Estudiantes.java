package com.example.SistemaDeControl.Entity;

import javax.persistence.*;

@Entity
@Table (name = "estudiantes")
public class Estudiantes {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nombre;

    private String apellido;

    private String getGmail;

    private int telefono;

    private  String direccion;

    private  String Grado;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, String apellido, String getGmail, int telefono, String direccion, String grado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.getGmail = getGmail;
        this.telefono = telefono;
        this.direccion = direccion;
        Grado = grado;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGetGmail() {
        return getGmail;
    }

    public void setGetGmail(String getGmail) {
        this.getGmail = getGmail;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String grado) {
        Grado = grado;
    }
}
