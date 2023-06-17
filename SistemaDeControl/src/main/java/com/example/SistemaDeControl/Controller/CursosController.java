package com.example.SistemaDeControl.Controller;

import com.example.SistemaDeControl.Dao.CursosDao;
import com.example.SistemaDeControl.Entity.Cursos;
import com.example.SistemaDeControl.Entity.Estudiantes;
import com.example.SistemaDeControl.Service.ServiceCursos;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursosController {
    private final ServiceCursos serviceCursos;

    public CursosController(ServiceCursos serviceCursos) {
        this.serviceCursos = serviceCursos;
    }

    @GetMapping
    public List<Cursos> obtenertodosEstudiantes(){
        return serviceCursos.obtenerTodosLosCursos();
    }

    @GetMapping("/{id}")
    public Cursos obtnerPoId(@PathVariable Long id){
        return serviceCursos.obtenerCursostePorId(id);
    }
    @PostMapping
    public void guardarEstudiante(@RequestBody Cursos cursos){
        serviceCursos.guardarCursos(cursos);
    }

    @PutMapping("/{id}")
    public void actualizarEstuidiante(@PathVariable Long id, @RequestBody Cursos cursos){
        serviceCursos.actualizarCursos(id, cursos);
    }


    @DeleteMapping("/{id}")
    public void elimiarEstudiante(@PathVariable Long id){
        serviceCursos.eliminarCursos(id);
    }
}
