/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vendaval
 */
import java.util.HashSet;
import javax.swing.JFrame;
public class VentanaPrincipal extends javax.swing.JFrame {
    private VentanaCrearUniversidad ventanaCrearUniversidad = null;
    private VentanaDatosdeUniversidad ventanaDatosdeUniversidad = null;
    private VentanaMatricularAlumno ventanamatricularAlumno = null;
    private VentanaContratarDocente ventanaContratarDocente = null;
    private VentanaDatosDeAlumnos ventanaDatosDeAlumnos = null;
    private VentanaDatosDeProfesores ventanaDatosDeProfesores = null;
    private Reporte r=new Reporte();
    private Universidad u = new Universidad();
    private Profesor p = new Profesor("00", "wdwd", "000");
    private Alumno a=new Alumno("nombre", "000","000", u);//
    private HashSet<Universidad> universidades = new HashSet<Universidad>();//

    /**
     * Creates new form Interfaz
     */
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    public Reporte getReporte(){
        return r;
    }
    public Alumno getAlumno(){
        return a;
    }
    
    public Universidad getUniversidad(){
        return u;
    }
    
    public Profesor getProfesor(){
        return p;
    }
    //refencia de universidad
    public void AgregarUniversidad(Universidad universidad){
        this.universidades.add(universidad);
    }
    
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        Barrademenu = new javax.swing.JMenuBar();
        menuitemregistro = new javax.swing.JMenu();
        itemCrearUniversidad = new javax.swing.JMenuItem();
        itemMatricularAlumno = new javax.swing.JMenuItem();
        itemcontratar = new javax.swing.JMenuItem();
        menureporte = new javax.swing.JMenu();
        ItemdatosU = new javax.swing.JMenuItem();
        itemdatosA = new javax.swing.JMenuItem();
        itemdatosP = new javax.swing.JMenuItem();
        jsalir = new javax.swing.JMenu();
        itemdatosE = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Universitario");

        jPanel1.setToolTipText("");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        menuitemregistro.setText("Registrar");

        itemCrearUniversidad.setText("Crear Universidad");
        itemCrearUniversidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearUniversidadActionPerformed(evt);
            }
        });
        menuitemregistro.add(itemCrearUniversidad);

        itemMatricularAlumno.setText("Matricular Alumno");
        itemMatricularAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMatricularAlumnoActionPerformed(evt);
            }
        });
        menuitemregistro.add(itemMatricularAlumno);

        itemcontratar.setText("Contratar Docente");
        itemcontratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemcontratarActionPerformed(evt);
            }
        });
        menuitemregistro.add(itemcontratar);

        Barrademenu.add(menuitemregistro);

        menureporte.setText("Reporte");

        ItemdatosU.setText("Datos de la universidad");
        ItemdatosU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemdatosUActionPerformed(evt);
            }
        });
        menureporte.add(ItemdatosU);

        itemdatosA.setText("Datos del Alumno");
        itemdatosA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemdatosAActionPerformed(evt);
            }
        });
        menureporte.add(itemdatosA);

        itemdatosP.setText("Datos de Profesor");
        itemdatosP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemdatosPActionPerformed(evt);
            }
        });
        menureporte.add(itemdatosP);

        Barrademenu.add(menureporte);

        jsalir.setText("Salir");

        itemdatosE.setText("EXIT");
        itemdatosE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemdatosEActionPerformed(evt);
            }
        });
        jsalir.add(itemdatosE);

        Barrademenu.add(jsalir);

        setJMenuBar(Barrademenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemCrearUniversidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearUniversidadActionPerformed
        // TODO add your handling code here:
        if(ventanaCrearUniversidad==null){
        ventanaCrearUniversidad =new VentanaCrearUniversidad(this);
        escritorio.add(ventanaCrearUniversidad);
        ventanaCrearUniversidad.show();
        }
        else{
        ventanaCrearUniversidad.show();
        }
    }//GEN-LAST:event_itemCrearUniversidadActionPerformed

    private void ItemdatosUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemdatosUActionPerformed
        if(ventanaDatosdeUniversidad==null){
        ventanaDatosdeUniversidad =new VentanaDatosdeUniversidad(this);
        ventanaDatosdeUniversidad.show();
        escritorio.add(ventanaDatosdeUniversidad);
        }
        else{
        ventanaDatosdeUniversidad.show();
        }
    }//GEN-LAST:event_ItemdatosUActionPerformed

    private void itemdatosAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemdatosAActionPerformed
        // TODO add your handling code here:
        if(ventanaDatosDeAlumnos==null){
        ventanaDatosDeAlumnos =new VentanaDatosDeAlumnos(this);
        ventanaDatosDeAlumnos.guardarUniversidad(universidades);
        escritorio.add(ventanaDatosDeAlumnos);
        ventanaDatosDeAlumnos.show();
        }
        else{
        ventanaDatosDeAlumnos.guardarUniversidad(universidades);
        ventanaDatosDeAlumnos.show();
        }
    }//GEN-LAST:event_itemdatosAActionPerformed

    private void itemdatosPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemdatosPActionPerformed
        // TODO add your handling code here:
        if(ventanaDatosDeProfesores==null){
        ventanaDatosDeProfesores = new VentanaDatosDeProfesores(this);
        ventanaDatosDeProfesores.guardarUniversidad(universidades);
        escritorio.add(ventanaDatosDeProfesores);
        ventanaDatosDeProfesores.show();
        }
        else{
        ventanaDatosDeProfesores.guardarUniversidad(universidades);   
        ventanaDatosDeProfesores.show();
        }
    }//GEN-LAST:event_itemdatosPActionPerformed

    private void itemMatricularAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMatricularAlumnoActionPerformed
        // TODO add your handling code here:
        
        if(ventanamatricularAlumno==null){
        ventanamatricularAlumno =new VentanaMatricularAlumno(this);
        ventanamatricularAlumno.guardarUniversidad(universidades);
        escritorio.add(ventanamatricularAlumno);
        ventanamatricularAlumno.show();
        }
        else{
        ventanamatricularAlumno.guardarUniversidad(universidades);
        ventanamatricularAlumno.show();
        }
    }//GEN-LAST:event_itemMatricularAlumnoActionPerformed

    private void itemcontratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemcontratarActionPerformed
        // TODO add your handling code here:
        if(ventanaContratarDocente==null){
        ventanaContratarDocente =new VentanaContratarDocente(this);
        ventanaContratarDocente.guardarUniversidad(universidades);
        escritorio.add(ventanaContratarDocente);
        ventanaContratarDocente.show();
        }
        else{
        ventanaContratarDocente.guardarUniversidad(universidades);
        ventanaContratarDocente.show();
        }
    }//GEN-LAST:event_itemcontratarActionPerformed

    private void itemdatosEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemdatosEActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_itemdatosEActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Barrademenu;
    private javax.swing.JMenuItem ItemdatosU;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemCrearUniversidad;
    private javax.swing.JMenuItem itemMatricularAlumno;
    private javax.swing.JMenuItem itemcontratar;
    private javax.swing.JMenuItem itemdatosA;
    private javax.swing.JMenuItem itemdatosE;
    private javax.swing.JMenuItem itemdatosP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jsalir;
    private javax.swing.JMenu menuitemregistro;
    private javax.swing.JMenu menureporte;
    // End of variables declaration//GEN-END:variables
}
