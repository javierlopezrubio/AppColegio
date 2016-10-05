package appcolegio;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Grupo 5
 */
public class Curso {
    private final String nombre;
    private final Profesor profesor;
    private final ArrayList<Alumno> alumnos;
    private final ArrayList<Asignatura> asignaturas;
    private static int codigoCurso;

    /**
     * Constructor de Curso recibe:
     * @param profesor
     * @param alumnos
     * @param asignaturas
     * El código de curso se asigna solo.
     */
    public Curso(String name, Profesor profesor, ArrayList<Alumno> alumnos, ArrayList<Asignatura> asignaturas){
        this.alumnos = alumnos;
        this.nombre = name;
        this.profesor = profesor;
        this.asignaturas = asignaturas;
        this.codigoCurso++;
    }
    
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
     * @return the nombre
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * @return the codigoCurso
     */
    public int getCodigoCurso() {
        return codigoCurso;
    }
    
}
