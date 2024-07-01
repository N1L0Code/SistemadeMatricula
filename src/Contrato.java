
import java.util.Iterator;


public class Contrato {
    private float sueldo;
    
    private Universidad universidad;
    private Profesor profesor;

    public Contrato(Universidad universidad, Profesor profesor, float sueldo) {
        this.sueldo = sueldo;
        
        this.profesor = profesor;
        this.universidad = universidad;
        
        profesor.setContrato(this);
        
    }
    
    public float getSueldo() {
        return sueldo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

}
