
import java.util.HashSet;
import java.util.Iterator;


public class Profesor {
    private String nombre;
    private String dni;
    private String sueldo;
    
    private HashSet<Contrato> contratos = new HashSet<Contrato>(); 
    private HashSet<Universidad> universidades = new HashSet<Universidad>();
    private HashSet<Profesor> profesores = new HashSet<Profesor>();    
    private Profesor profesor;
    public Profesor(String dni, String nombre,String sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldo= sueldo;
        System.out.println("creando profesor");
    }
    public Iterator<Profesor> getIterator(){
        return profesores.iterator();
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getSueldo() {
        return sueldo;
    }
  
    
    public String getDni() {
        return dni;
    }    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }    
   
    void setContrato(Contrato contrato) {
        contratos.add(contrato);
    }   
    
    public void serContratado(Universidad universidad){
        System.out.println("Soy el docente "+nombre+" y estoy siendo contratado por la universidad "+universidad.getDenominacion());
    }

    public String obtenerDatosDelProfesor(){
        return "dni = " + dni +"\n"+ "nombre=" + nombre+"\n"+"sueldo"+ sueldo;
    }     
}
