
import java.util.HashSet;
import java.util.Iterator;


public class Reporte {
    
    HashSet<Universidad> universidades = new HashSet<Universidad>();
    HashSet<Alumno> alumnos = new HashSet<Alumno>();
    HashSet<Profesor> profesores = new HashSet<Profesor>(); 
    
    public void agregarUniversidad(Universidad universidad){
        universidades.add(universidad);
    }
    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    public void agregarprofesor(Profesor profesor){
        profesores.add(profesor);
    }
    
    public Iterator<Universidad> getIterator(){
        return universidades.iterator();
    }

    
    
    public Universidad buscarUniversidad(String ruc){
        boolean encontrado = false;        
        Universidad universidad=null;
        Iterator<Universidad> iterador = universidades.iterator();
        while(iterador.hasNext() && encontrado == false){
            universidad = iterador.next();
            if(ruc.equals(universidad.getRuc())){
                encontrado = true;
            }
        }
        if(encontrado==false){
            universidad=null;
        }
        
        return universidad;
    }
    
    public Alumno buscarAlumnoEnUniversidad(String codigo){
       boolean encontrado = false;        
       Universidad universidad = null;
       Alumno alumno = null;
       Iterator<Universidad> iterador = universidades.iterator();
       while(iterador.hasNext() && encontrado == false){
           universidad = iterador.next();
           alumno = universidad.buscarAlumno(codigo);
           if(alumno!=null){
               encontrado = true;
           }
       }        
       return alumno;
    }  
    
    public Profesor buscarProfesorEnUniversidad(String dni){
       boolean encontrado = false;        
       Universidad universidad=null;
       Profesor profesor=null;
       Iterator<Universidad> iterador = universidades.iterator();
       while(iterador.hasNext() && encontrado == false){
           universidad = iterador.next();
           profesor = universidad.buscarProfesor(dni);
           if(profesor!=null){
               encontrado = true;
           }
       }        
       return profesor;
    }
    
}
