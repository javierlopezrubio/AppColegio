package appcolegio;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Grupo 5
 */
public class Profesor {
    private String nombre;
    private ArrayList<Asignatura> asignaturas;
    private Curso curso;
    private static int codigoProfesor;

    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the asignaturas
     */
    public Iterable<Asignatura> getAsignaturas() {
        return Collections.unmodifiableList(asignaturas);
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @return the codigoProfesor
     */
    public int getCodigoProfesor() {
        return codigoProfesor;
    }
}
