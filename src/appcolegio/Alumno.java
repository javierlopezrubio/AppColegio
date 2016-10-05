package appcolegio;

import java.io.File;
import java.util.Date;

/**
 *
 * @author Grupo 5
 */
public class Alumno {
    private final Date fechaNacimiento;
    private final String nombre;
    private static int codigoAlumno;
    private final Curso curso;
    private final File foto;
    
    /**
     * Constructor de la clase alumno recibe:
     * @param date
     * @param name
     * @param curso
     * @param file
     * El código de alumno se autoasignará.
     */
    public Alumno(Date date, String name, Curso curso, File file){
        this.fechaNacimiento = date;
        this.nombre = name;
        this.foto = file;
        this.curso = curso;
        this.codigoAlumno++;
    }
    
    /**
     * @return the edad
     */
    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    /**
     * @return the foto
     */
    public File getFoto(){
        return foto;
    }
    
    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the codigo
     */
    public int getCodigoAlumno() {
        return codigoAlumno;
    }
}
