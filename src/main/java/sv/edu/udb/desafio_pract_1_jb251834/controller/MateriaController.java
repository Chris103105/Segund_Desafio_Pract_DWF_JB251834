package sv.edu.udb.desafio_pract_1_jb251834.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.desafio_pract_1_jb251834.entity.Materia;
import sv.edu.udb.desafio_pract_1_jb251834.service.MateriaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @GetMapping
    public List<Materia> listarTodas() {
        return materiaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Optional<Materia> buscarPorId(@PathVariable Long id) {
        return materiaService.obtenerPorId(id);
    }

    @PostMapping
    public Materia crear(@RequestBody Materia materia) {
        return materiaService.guardar(materia);
    }

    @PutMapping("/{id}")
    public Materia actualizar(@PathVariable Long id, @RequestBody Materia materia) {
        materia.setId(id);
        return materiaService.guardar(materia);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        materiaService.eliminar(id);
    }
}