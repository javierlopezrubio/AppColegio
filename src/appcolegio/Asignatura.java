/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcolegio;

/**
 *
 * @author Javier
 */
public class Asignatura {
    private String nombre;
    private Curso curso;
    private Profesor profesor;
    private int codigoAsignatura;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @return the profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * @return the codigoAsignatura
     */
    public int getCodigoAsignatura() {
        return codigoAsignatura;
    }
}
