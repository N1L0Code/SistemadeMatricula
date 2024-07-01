 
import javax.swing.JOptionPane;


public class Principal {

    public static void main(String[] args) {
        VentanaPrincipal i=new VentanaPrincipal();
        i.setVisible(true);
        
        Universidad universidad; 
        
        Reporte r = new Reporte();
        String menu = "****************************SITEMA UNIVERSITARIO****************************\n"+
                      "1. Agregar Universidad\n"+
                      "2. Matricular Alumno\n"+
                      "3. Mostrar Datos del Alumno en Universidad\n"+
                      "4. Contratar Docente\n"+
                      "5. Mostrar Datos del Docente en Universidad\n"+
                      "6. Salir\n\n"+
                      "Ingrese opcion: ";
                        
        int opcion=0;
        
        //Universidad universidad;
        String ruc;
        String denominacion;
        String nombre2;
        Profesor profesor;
        String dni;       
        String sueldo;
        
        
        while(opcion!=6){            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch(opcion){
                case 1: 
                        String nombre1;
                        ruc = String.valueOf(JOptionPane.showInputDialog("Ingrese el ruc"));
                        universidad = r.buscarUniversidad(ruc);
                            if(universidad == null){
                                denominacion = JOptionPane.showInputDialog("Ingrese denominación");
                                universidad = new Universidad(denominacion, ruc);                                  
                                r.agregarUniversidad(universidad);
                                //asignamos facultades a la universidad 
                                universidad.setFacultad(new Facultad("DERECHO")); 
                                universidad.setFacultad(new Facultad("CIENCIAS FISICAS Y MATEMATICAS"));
                                universidad.setFacultad(new Facultad("CIENCIAS SOCIALES"));
                                universidad.setFacultad(new Facultad("CIENCIAS ECONOMICAS")); 
                                                        
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "La Universidad con ruc "+ruc+" ya está registrada");
                            }
                           

                        break;
                        //registrar alumnos
                case 2: 
                         Alumno alumno;
                          String codigo;
                          String celular;
                        String nombre;
                        ruc = String.valueOf(JOptionPane.showInputDialog("Ingrese el ruc"));
                        universidad = r.buscarUniversidad(ruc);
                        if(universidad != null){
                            codigo = JOptionPane.showInputDialog("Ingrese el codigo");
                            alumno = r.buscarAlumnoEnUniversidad(codigo);
                            if(alumno==null){
                                nombre = JOptionPane.showInputDialog("Ingrese el nombre del Alumno");
                                celular =JOptionPane.showInputDialog("Ingrese su celular: ");
                                //pedir numero de celular
                                alumno =new Alumno(nombre, celular, codigo, universidad);
                                //pasar alumno y no solo sus datos
                                universidad.matricular(alumno/*codigo, nombre*/);
                                                                
                                              
                                nombre1=JOptionPane.showInputDialog(null,"\n\nIngresar facultad a matricular:");
                                nombre1=nombre1.toUpperCase();
                                Facultad facultad = universidad.buscarFacultad(nombre1);
                                System.out.println(facultad.getNombre());
                                    if(facultad == null){
                                        JOptionPane.showMessageDialog(null,"La facultad ingresada no existe");
                                    break;
                                    }else{
                                        alumno.setFacultad(facultad);
                                      //  System.out.println(alumno.getNombre());
                                        universidad.revisarMatriculas(alumno, facultad);
                                        JOptionPane.showMessageDialog(null,"Matricula exitosa"); 
                                    }
                            }
                            else{
                                nombre = JOptionPane.showInputDialog("Ingrese el nombre del Alumno");
                                universidad.matricularAlumno(alumno, nombre);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "La universidad con ruc "+ruc+" no está registrada");
                        }                    
                        break;
                 
                case 3:
                        ruc = String.valueOf(JOptionPane.showInputDialog("Ingrese el ruc"));
                        universidad = r.buscarUniversidad(ruc);
                        if(universidad != null){
                            JOptionPane.showMessageDialog(null, universidad.obtenerDatosDelAlumno());
                        }else{
                            JOptionPane.showMessageDialog(null, "La Universidad con ruc "+ruc+" no está registrada");
                        }
                        break; 

                case 4: ruc = String.valueOf(JOptionPane.showInputDialog("Ingrese el ruc"));
                        universidad = r.buscarUniversidad(ruc);
                        if(universidad != null){
                            dni = JOptionPane.showInputDialog("Ingrese el dni");
                            profesor = r.buscarProfesorEnUniversidad(dni);
                            if(profesor==null){
                                nombre2 = JOptionPane.showInputDialog("Ingrese el nombre del Docente");
                                sueldo = (JOptionPane.showInputDialog("Ingrese el sueldo"));
                                universidad.contratar(profesor);

                            }
                            else{
                                sueldo = (JOptionPane.showInputDialog("Ingrese el sueldo"));
                                universidad.contratarDocente(profesor, sueldo);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "La universidad con ruc "+ruc+" no está registrada");
                        }                    
                    
                        break;                        
                case 5: ruc = String.valueOf(JOptionPane.showInputDialog("Ingrese el ruc"));
                        universidad = r.buscarUniversidad(ruc);
                        if(universidad != null){
                            JOptionPane.showMessageDialog(null, universidad.obtenerDatosDelProfesor());
                        }else{
                            JOptionPane.showMessageDialog(null, "La Universidad con ruc "+ruc+" no está registrada");
                        }
                        break;
                case 6: System.exit(0);
                        break;
                        
            }
        }
    }
}