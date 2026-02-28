package sv.edu.udb.desafio_pract_1_jb251834;

import sv.edu.udb.desafio_pract_1_jb251834.entity.Alumno;
import sv.edu.udb.desafio_pract_1_jb251834.entity.Materia;
import sv.edu.udb.desafio_pract_1_jb251834.entity.Profesor;
import sv.edu.udb.desafio_pract_1_jb251834.repository.AlumnoRepository;
import sv.edu.udb.desafio_pract_1_jb251834.repository.MateriaRepository;
import sv.edu.udb.desafio_pract_1_jb251834.repository.ProfesorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
class DesafioPract1Jb251834ApplicationTests {

    @Autowired
    private ProfesorRepository profesorRepo;

    @Autowired
    private MateriaRepository materiaRepo;

    @Autowired
    private AlumnoRepository alumnoRepo;

    @Test
    @Transactional
    @Commit
    void cargarDatosIniciales() {
        // 1. Contratando a los profesores
        Profesor docenteFisica = new Profesor();
        docenteFisica.setNombre("Roberto Salazar");

        Profesor docentePSC = new Profesor();
        docentePSC.setNombre("Carmen Hernandez");

        profesorRepo.saveAll(List.of(docenteFisica, docentePSC));

        // 2. Creando las materias
        Materia fisica = new Materia();
        fisica.setNombre("Física");
        fisica.setProfesor(docenteFisica);

        Materia psc = new Materia();
        psc.setNombre("Pensamiento Social Cristiano");
        psc.setProfesor(docentePSC);

        materiaRepo.saveAll(List.of(fisica, psc));

        // 3. Inscribiendo alumnos en sus respectivas materias
        Alumno estudianteUno = new Alumno();
        estudianteUno.setNombre("Odaly");
        estudianteUno.setApellido("Martinez");
        estudianteUno.setMaterias(List.of(fisica));

        Alumno estudianteDos = new Alumno();
        estudianteDos.setNombre("Manuel");
        estudianteDos.setApellido("Guzman");
        // Manuel lleva 2 materias para romper la simetría
        estudianteDos.setMaterias(List.of(psc, fisica));

        Alumno estudianteTres = new Alumno();
        estudianteTres.setNombre("Giovanni");
        estudianteTres.setApellido("Lopez");
        estudianteTres.setMaterias(List.of(psc));

        Alumno estudianteCuatro = new Alumno();
        estudianteCuatro.setNombre("Elisabet");
        estudianteCuatro.setApellido("Cruz");
        estudianteCuatro.setMaterias(List.of(fisica));

        // Guardamos todo de una vez
        alumnoRepo.saveAll(List.of(estudianteUno, estudianteDos, estudianteTres, estudianteCuatro));

        System.out.println(">>> Registros de Física y PSC insertados correctamente en H2 <<<");
    }
}