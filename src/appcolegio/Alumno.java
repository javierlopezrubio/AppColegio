package appcolegio;

import java.io.File;
import java.util.Date;

/**
 *
 * @author Javier
 */
public class Alumno {
    private Date fechaNacimiento;
    private String nombre;
    private int codigoAlumno;
    private Curso curso;
    private File foto;

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
