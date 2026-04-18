package sv.edu.udb.desafio_pract_1_jb251834.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.desafio_pract_1_jb251834.entity.Alumno;
import sv.edu.udb.desafio_pract_1_jb251834.repository.AlumnoRepository;

import java.util.List;
import java.util.Optional;

@Service // Le indicamos a Spring que esta clase maneja la lógica de negocio
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    // Método para obtener todos (GET)
    public List<Alumno> obtenerTodos() {
        return alumnoRepository.findAll();
    }

    // Método para buscar por ID (GET específico)
    public Optional<Alumno> obtenerPorId(Long id) {
        return alumnoRepository.findById(id);
    }

    // Método para guardar o actualizar (POST / PUT)
    public Alumno guardar(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    // Método para borrar (DELETE)
    public void eliminar(Long id) {
        alumnoRepository.deleteById(id);
    }
}