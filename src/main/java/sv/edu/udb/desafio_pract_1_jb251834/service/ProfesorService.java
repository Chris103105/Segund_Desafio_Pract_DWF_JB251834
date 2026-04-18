package sv.edu.udb.desafio_pract_1_jb251834.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.desafio_pract_1_jb251834.entity.Profesor;
import sv.edu.udb.desafio_pract_1_jb251834.repository.ProfesorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    public List<Profesor> obtenerTodos() {
        return profesorRepository.findAll();
    }

    public Optional<Profesor> obtenerPorId(Long id) {
        return profesorRepository.findById(id);
    }

    public Profesor guardar(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    public void eliminar(Long id) {
        profesorRepository.deleteById(id);
    }
}