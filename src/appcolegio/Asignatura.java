package appcolegio;

/**
 *
 * @author Grupo 5
 */
public class Asignatura {
    private final String nombre;
    private final Curso curso;
    private final Profesor profesor;
    private static int codigoAsignatura;

    /**
     * Constructor de Asignatura recibe: 
     * @param name
     * @param curso
     * @param profesor
     * El código de asignatura se autogenera
     */
    public Asignatura(String name, Curso curso, Profesor profesor){
        this.nombre = name;
        this.curso = curso;
        this.profesor = profesor;
        this.codigoAsignatura++;
    }
    
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
