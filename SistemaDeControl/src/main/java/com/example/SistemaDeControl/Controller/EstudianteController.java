package com.example.SistemaDeControl.Controller;

import com.example.SistemaDeControl.Entity.Estudiantes;
import com.example.SistemaDeControl.Service.ServiceEstudiante;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    private final ServiceEstudiante serviceEstudiante;

    public EstudianteController(ServiceEstudiante serviceEstudiante) {
        this.serviceEstudiante = serviceEstudiante;
    }

    @GetMapping
    public List<Estudiantes> obtenertodosEstudiantes(){
        return serviceEstudiante.obtenerTodosLosEstudiantes();
    }

    @GetMapping("/{id}")
    public Estudiantes obtnerPoId(@PathVariable Long id){
        return serviceEstudiante.obtenerEstudiantePorId(id);
    }
    @PostMapping
    public void guardarEstudiante(@RequestBody Estudiantes estudiantes){
        serviceEstudiante.guardarEstudiante(estudiantes);
    }

    @PutMapping("/{id}")
    public void actualizarEstuidiante(@PathVariable Long id, @RequestBody Estudiantes estudiantes){
        serviceEstudiante.actualizarEstudiante(id, estudiantes);
    }


    @DeleteMapping("/{id}")
    public void elimiarEstudiante(@PathVariable Long id){
        serviceEstudiante.eliminarEstudiante(id);
    }
}

