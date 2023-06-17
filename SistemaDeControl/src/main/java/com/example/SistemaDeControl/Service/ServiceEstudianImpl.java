package com.example.SistemaDeControl.Service;

import com.example.SistemaDeControl.Dao.EstudianteDao;
import com.example.SistemaDeControl.Entity.Estudiantes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEstudianImpl implements ServiceEstudiante {

    private final EstudianteDao estudianteDao;

    public ServiceEstudianImpl(EstudianteDao estudianteDao) {
        this.estudianteDao = estudianteDao;
    }

    @Override
    public List<Estudiantes> obtenerTodosLosEstudiantes() {
        return estudianteDao.findAll();
    }

    @Override
    public Estudiantes obtenerEstudiantePorId(Long id) {
        return estudianteDao.findById(id).orElse(null);
    }

    @Override
    public void guardarEstudiante(Estudiantes estudiantes) {
        estudianteDao.save(estudiantes);

    }

    @Override
    public void actualizarEstudiante(Long id, Estudiantes estudiantes) {
        if (estudianteDao.existsById(id)){
            estudiantes.setId(id);
            estudianteDao.save(estudiantes);
        }

    }

    @Override
    public void eliminarEstudiante(Long id) {
        estudianteDao.deleteById(id);

    }
}
