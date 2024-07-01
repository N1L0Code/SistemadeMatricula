
import java.util.HashSet;
import java.util.Iterator;


public class Facultad {
    private String nombre1;
    private Universidad universidad;
    private Alumno alumno;
    private HashSet<Alumno> alumnos = new HashSet<Alumno>();
    
    public Facultad(String nombre) {
        this.nombre1 = nombre;
    }
   
    public String getNombre() {
        return nombre1;
    }

    public void setNombre(String nombre) {
        this.nombre1 = nombre;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public HashSet<Alumno> getAlumnos() {
        return alumnos;
    }


    public void setAlumnos(Alumno alumno){
       alumnos.add(alumno);
    }
    
    
    public void asignarUniversidad(Universidad universidad ){
       this.universidad=universidad; 
    }
    public void registrarAlumno(Alumno alumno){
        this.alumno=alumno;
    }

}
