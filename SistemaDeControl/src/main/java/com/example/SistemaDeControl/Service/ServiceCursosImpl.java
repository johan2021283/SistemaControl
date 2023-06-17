package com.example.SistemaDeControl.Service;

import com.example.SistemaDeControl.Dao.CursosDao;
import com.example.SistemaDeControl.Entity.Cursos;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceCursosImpl implements ServiceCursos{

    private final CursosDao cursosDao;

    public ServiceCursosImpl(CursosDao cursosDao) {
        this.cursosDao = cursosDao;
    }

    @Override
    public List<Cursos> obtenerTodosLosCursos() {
        return cursosDao.findAll();
    }

    @Override
    public Cursos obtenerCursostePorId(Long id) {
        return cursosDao.findById(id).orElse(null);
    }

    @Override
    public void guardarCursos(Cursos cursos) {
        cursosDao.save(cursos);

    }

    @Override
    public void actualizarCursos(Long id, Cursos cursos) {
        if (cursosDao.existsById(id)){
            cursos.setId(id);
            cursosDao.save(cursos);
        }

    }

    @Override
    public void eliminarCursos(Long id) {
        cursosDao.deleteById(id);
    }
}
