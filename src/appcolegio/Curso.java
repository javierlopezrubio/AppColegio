/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcolegio;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Javier
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
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
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
