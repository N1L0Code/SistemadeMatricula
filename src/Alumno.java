
import java.util.HashSet;
import java.util.Iterator;


public class Alumno {
    private String nombre;
    private String codigo;
    private String celular;
    private Universidad universidad;
    private Facultad facultad=null;
    private HashSet<Universidad> universidades = new HashSet<Universidad>();
    private HashSet<Alumno> alumnos = new HashSet<Alumno>();
    private HashSet<Facultad> facultades = new HashSet<Facultad>();

    private Alumno alumno;
        
    
    public Alumno(String nombre, String codigo, String celular,Universidad universidad) {
        this.nombre = nombre;
        System.out.println("nombre");
        this.codigo = codigo;
        this.celular = celular;
        this.universidad = universidad;
        System.out.println("creando alumno");
    }
    
    public Iterator<Alumno> getIterator(){
        return alumnos.iterator();
    }
    
    
    public Alumno() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCelular() {
        return celular;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public String getFacultad() {
        return facultad.getNombre();
    }

    public HashSet<Universidad> getUniversidades() {
        return universidades;
    }
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setUniversidades(HashSet<Universidad> universidades) {
        this.universidades = universidades;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public String obtenerDatosDelAlumno(){
    return "codigo = " + codigo+ "\n"+ "nombre = " + nombre+
                "\nfacultad = "/*+thisfacultad.getNombre()*/+"\ncelular= "+celular;
    } 
   

}
