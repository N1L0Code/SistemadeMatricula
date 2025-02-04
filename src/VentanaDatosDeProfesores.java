
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class VentanaDatosDeProfesores extends javax.swing.JInternalFrame {
    private VentanaPrincipal ventanaPrincipal;
    private HashSet<Universidad> uni= new HashSet<Universidad>();

    /**
     * Creates new form VentanaDatosDeProfesores
     */
    public VentanaDatosDeProfesores(VentanaPrincipal ventanaPrincipal) {
        initComponents();
        this.ventanaPrincipal = new VentanaPrincipal();
    }
    public void guardarUniversidad(HashSet<Universidad> uni){
        this.uni=uni;
        mostrarDatos();
    }
    public void mostrarDatos(){
        String ruc=JOptionPane.showInputDialog("Ingresar Ruc: ");  
        Profesor profesor;
        Universidad universidad;
        boolean encontrado=false;
        DefaultTableModel modelo = new DefaultTableModel();
        
        
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Sueldo");
        HashSet<Profesor> profesores = new HashSet<Profesor>();
        Object[] datos = new Object[3];
        Iterator<Universidad> iterador = uni.iterator();
        while(iterador.hasNext() && encontrado == false){
            universidad = iterador.next();
            if(ruc.equals(universidad.getRuc())){
                  System.out.println(universidad.getRuc());
                encontrado = true;
                System.out.println(universidad.obtenerDatosDelProfesor());
                profesores = universidad.getProfesores();
                System.out.println(universidad.getRuc());
            }
            }
            if(profesores != null){
              Iterator<Profesor> iterator = profesores.iterator();
            while(iterator.hasNext()){
            profesor = iterator.next();
            datos[0] = profesor.getDni();
            System.out.println(profesor.getDni());
            datos[1] = profesor.getNombre();
            datos[2] = profesor.getSueldo();
            modelo.addRow(datos);
            }
            }
            
     
        
        tblProfesores.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProfesores = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Datos de Profesores");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        tblProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProfesores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
        mostrarDatos();
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProfesores;
    // End of variables declaration//GEN-END:variables
}
