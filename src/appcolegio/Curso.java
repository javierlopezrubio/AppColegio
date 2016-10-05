package appcolegio;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Grupo 5
 */
public class Curso {
    private Profesor profesor;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Asignatura> asignaturas;
    private int codigoCurso;

    /**
     * @return the profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * @return the alumnos
     */
    public Iterable<Alumno> getAlumnos() {
        return Collections.unmodifiableList(alumnos);
    }

    /**
     * @return the asignaturas
     */
    public Iterable<Asignatura> getAsignaturas() {
        return Collections.unmodifiableList(asignaturas);
    }

    /**
     * @return the codigoCurso
     */
    public int getCodigoCurso() {
        return codigoCurso;
    }
    
}
