package sv.edu.udb.desafio_pract_1_jb251834.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.desafio_pract_1_jb251834.entity.Alumno;
import sv.edu.udb.desafio_pract_1_jb251834.service.AlumnoService;

import java.util.List;
import java.util.Optional;

@RestController // Indica que esta clase responderá peticiones web (REST)
@RequestMapping("/api/alumnos") // Esta será la URL base
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    // GET: http://localhost:8080/api/alumnos
    @GetMapping
    public List<Alumno> listarTodos() {
        return alumnoService.obtenerTodos();
    }

    // GET: http://localhost:8080/api/alumnos/1
    @GetMapping("/{id}")
    public Optional<Alumno> buscarPorId(@PathVariable Long id) {
        return alumnoService.obtenerPorId(id);
    }

    // POST: http://localhost:8080/api/alumnos
    @PostMapping
    public Alumno crear(@RequestBody Alumno alumno) {
        return alumnoService.guardar(alumno);
    }

    // PUT: http://localhost:8080/api/alumnos/1
    @PutMapping("/{id}")
    public Alumno actualizar(@PathVariable Long id, @RequestBody Alumno alumno) {
        alumno.setId(id); // Aseguramos que se actualice el ID correcto
        return alumnoService.guardar(alumno);
    }

    // DELETE: http://localhost:8080/api/alumnos/1
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        alumnoService.eliminar(id);
    }
}