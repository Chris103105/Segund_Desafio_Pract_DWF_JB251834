package sv.edu.udb.desafio_pract_1_jb251834.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.desafio_pract_1_jb251834.entity.Profesor;
import sv.edu.udb.desafio_pract_1_jb251834.service.ProfesorService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/profesores")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    @GetMapping
    public List<Profesor> listarTodos() {
        return profesorService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Profesor> buscarPorId(@PathVariable Long id) {
        return profesorService.obtenerPorId(id);
    }

    @PostMapping
    public Profesor crear(@RequestBody Profesor profesor) {
        return profesorService.guardar(profesor);
    }

    @PutMapping("/{id}")
    public Profesor actualizar(@PathVariable Long id, @RequestBody Profesor profesor) {
        profesor.setId(id);
        return profesorService.guardar(profesor);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        profesorService.eliminar(id);
    }
}