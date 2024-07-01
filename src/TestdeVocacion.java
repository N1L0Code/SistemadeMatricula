
import org.jpl7.Query;


public class TestdeVocacion {
    public static void main(String[] args){
     try{
    String  conexion="consult('Test de vocacion.pl')";
    Query con=new Query(conexion);
    System.out.println(conexion+" "+(con.hasSolution()? "ACEPTADO":"FALLADO"));
    String  t2="consult('opciones(Carrera)')";
    Query q2=new Query(t2);
    System.out.println(t2+" "+(con.hasSolution()? "ACEPTADO":"FALLADO"));
    String  t3="consult('verificar(programacion)')";
    Query q3=new Query(t3);
    System.out.println(t3+" "+(con.hasSolution()? "ACEPTADO":"FALLADO"));
    System.out.println("Iniciando test");
    String consul =("evaluar.");
    Query ejecutar=new Query(consul);
    if(ejecutar.hasSolution()){
        System.out.println("¡Buena Suerte!");
    }
    }catch (Exception e){
        e.printStackTrace();
    }
    }   

}
