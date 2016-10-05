package appcolegio;

/**
 *
 * @author Grupo 5
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
