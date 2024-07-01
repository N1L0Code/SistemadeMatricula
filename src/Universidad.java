
import java.util.HashSet;
import java.util.Iterator;


public class Universidad {
    private String denominacion;
    private String ruc;
    
    private HashSet<Alumno> alumnos = new HashSet<Alumno>();
    private HashSet<Contrato> contratos = new HashSet<Contrato>();
    private HashSet<Facultad> facultades = new HashSet<Facultad>();
    private HashSet<Profesor> profesores = new HashSet<Profesor>();    
    private Profesor profesor;
    private Alumno alumno;
    private Universidad universidad;
    
    public Universidad(String denominacion, String ruc) {
        this.denominacion = denominacion;
        this.ruc = ruc;
        this.alumnos = alumnos;
    }
    public Universidad(){
        
    }
    public Iterator<Alumno> getIterator(){
        return alumnos.iterator();
    }
    

    public Universidad getUniversidad() {
        return universidad;
    }

    public HashSet<Alumno> getAlumnos() {
        return alumnos;
    }
    public HashSet<Profesor> getProfesores(){
        return profesores;
    }
    public HashSet<Facultad> getFacultades(){
        return facultades;
    }

    
    public String getDenominacion() {
        return denominacion;
    }

    public String getRuc() {
        return ruc;
    }
    
    public void setNombre(String nombre) {
        this.denominacion = nombre;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public void setFacultad(Facultad facultad){
        facultades.add(facultad);
    }
    
    public void contratarDocente(Profesor profesor, String sueldo){
        System.out.println("Soy la "+denominacion+" y estoy contratando docentes");
        
        Contrato contrato = new Contrato(this, profesor, 0);
        contratos.add(contrato);
    }
    public void contratar(Profesor profesor){
        System.out.println("Soy la "+denominacion+" y estoy contratando docentes");
        profesores.add(profesor);
    }    
    public void solicitarInforme(){
        System.out.println("Soy la "+denominacion+" y estoy solicitando informe");
    }
    
    public void revisarMatriculas(Alumno alumno, Facultad facultad){
       
       facultad.setAlumnos(alumno);
        System.out.println("------"+facultad.getNombre());
       alumno.setFacultad(facultad);
       alumnos.add(alumno);
        
    }

    public void asignarFacultades(Facultad facultades){
        this.facultades.add(facultades);
        facultades.asignarUniversidad(this);
    }
    
    public void matricularAlumno(Alumno alumno, String nombre){
        System.out.println("Soy la "+denominacion+" y estoy matriculando alumnos");
        Universidad universidad = new Universidad(denominacion, ruc);
        alumnos.add(alumno);
    }
    
    public void matricular(Alumno alumno){    
        alumnos.add(alumno);
    }
    public void despedirProfesor(Universidad universidad){
        System.out.println("Soy la "+denominacion+" y estoy despidiendo a docentes");
    }
  
    public Profesor buscarProfesor(String dni){
        boolean encontrado = false;
        Contrato contrato;
        Profesor profesor=null;
        Iterator<Contrato> iterador = contratos.iterator();
        while(iterador.hasNext() && encontrado == false){
            contrato = iterador.next();
            profesor = contrato.getProfesor();
            if(dni== profesor.getDni()){
                encontrado=true;
            }
        }
        if(encontrado==false){
            profesor=null;
    }        
        return profesor;
    }
    public HashSet mostrarProfesor(){
        return profesores;
    }

    public Alumno buscarAlumno(String codigo){
        boolean encontrado = false;
        Alumno alumno = null;
        Iterator<Alumno> iterador = alumnos.iterator();
        while(iterador.hasNext() && encontrado == false){
            alumno = iterador.next();
            if(codigo == alumno.getCodigo()){
                encontrado=true;
            }
        }
        if(encontrado==false){
        alumno=null;
    }        
        return alumno;
    }
    
    public String obtenerDatosDelAlumno(){
        String datos="UNIVERSIDAD "+this.denominacion+"\n";
        boolean encontrado = false;
        Alumno alumno = null;
        Iterator<Alumno> iterador = alumnos.iterator();
        while(iterador.hasNext() && encontrado == false){
            alumno = iterador.next();
            datos = datos + alumno.obtenerDatosDelAlumno();
        }        
        System.out.println(datos);
            return datos;
        }
    
    public String obtenerDatosDelProfesor(){
        String datos="UNIVERSIDAD "+this.denominacion+"\n";
        boolean encontrado = false;
        Profesor profesor = null;
        Iterator<Profesor> iterador = profesores.iterator();
        while(iterador.hasNext() && encontrado == false){
            profesor = iterador.next();
            datos = datos + profesor.obtenerDatosDelProfesor();
        }        
            return datos;
        }
    
    public Facultad buscarFacultad(String nombre){
        Facultad f=null;
            Iterator<Facultad> iterador = facultades.iterator();
            while(iterador.hasNext()){ 
            f = iterador.next();
            if(f.getNombre().equals(nombre)){
                  return f;
                }
            }
            f = null;
            return f;
    }
    
    

       
}
