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
public class Profesor {
    private String nombre;
    private ArrayList<Asignatura> asignaturas;
    private Curso curso;
    private int codigoProfesor;

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
