
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class VentanaContratarDocente extends javax.swing.JInternalFrame {
    private VentanaPrincipal ventanaPrincipal;
    private VentanaCrearUniversidad ventanaCrearUniversidad;
    private Universidad u;
    private HashSet<Universidad> uni= new HashSet<Universidad>();
   
    

    public VentanaContratarDocente(VentanaPrincipal ventanaPrincipal) {
        initComponents();
        this.ventanaPrincipal = ventanaPrincipal;
        this.ventanaCrearUniversidad  = ventanaCrearUniversidad;
    }
    public void guardarUniversidad(HashSet<Universidad> uni){
        this.uni=uni;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jruc = new javax.swing.JLabel();
        jdni2 = new javax.swing.JLabel();
        jdni3 = new javax.swing.JLabel();
        txtsueldo = new javax.swing.JTextField();
        txtruc = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jbtnguardar = new javax.swing.JButton();
        jdni4 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Contratar Docentes");
        setOpaque(true);
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jruc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jruc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jruc.setText("Buscar RUC:");
        getContentPane().add(jruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 120, 20));

        jdni2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jdni2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jdni2.setText("Nombre:");
        getContentPane().add(jdni2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, 20));

        jdni3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jdni3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jdni3.setText("Sueldo:");
        getContentPane().add(jdni3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 110, 20));

        txtsueldo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtsueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsueldoActionPerformed(evt);
            }
        });
        txtsueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsueldoKeyTyped(evt);
            }
        });
        getContentPane().add(txtsueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 270, 30));

        txtruc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtruc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtrucFocusLost(evt);
            }
        });
        txtruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrucActionPerformed(evt);
            }
        });
        txtruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrucKeyTyped(evt);
            }
        });
        getContentPane().add(txtruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 270, 30));

        txtnombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 270, 30));

        jbtnguardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnguardar.setText("GUARDAR");
        jbtnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 130, 40));

        jdni4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jdni4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jdni4.setText("DNI:");
        getContentPane().add(jdni4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 20));

        txtdni.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdniActionPerformed(evt);
            }
        });
        txtdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdniKeyTyped(evt);
            }
        });
        getContentPane().add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 270, 30));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrucActionPerformed

    private void jbtnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnguardarActionPerformed
        // TODO add your handling code here:
       
        String sueldo;
        String ruc;
        String nombre;
        String dni;
        Universidad universidad;
        boolean encontrado=false;
        
    if(txtruc.getText().length()!=0){    
        ruc = String.valueOf(txtruc.getText());
        Iterator<Universidad> iterador = uni.iterator();
        while(iterador.hasNext() && encontrado == false){
            universidad = iterador.next();
            if(ruc.equals(universidad.getRuc())){
                encontrado = true;
                sueldo= txtsueldo.getText();
                nombre=txtnombre.getText();
                dni=txtdni.getText();
                Profesor profe =new Profesor(dni, nombre, sueldo);
                System.out.println(profe.getNombre());
                universidad.contratar(profe);
                JOptionPane.showMessageDialog(this, "Se registro los datos");
            txtruc.setText("");
            txtnombre.setText("");
            txtdni.setText("");
            txtsueldo.setText("");
            System.out.println(universidad.obtenerDatosDelProfesor());
            }
        
        }
    }
            else{
                JOptionPane.showMessageDialog(this, "Ingrese RUC");
            }
    }//GEN-LAST:event_jbtnguardarActionPerformed

    private void txtrucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrucKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
        }
    }//GEN-LAST:event_txtrucKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdniActionPerformed

    private void txtdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdniKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
        }
    }//GEN-LAST:event_txtdniKeyTyped

    private void txtrucFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrucFocusLost
        // TODO add your handling code here:
         String ruc;
        Universidad universidad;
        Reporte r;
        r = ventanaPrincipal.getReporte();
        
    if(txtruc.getText().length()!=0){    
        ruc = String.valueOf(txtruc.getText());
        universidad = r.buscarUniversidad(ruc);
            if(universidad != null){
                    JOptionPane.showMessageDialog(this, "La Universidad con ruc "+ruc+" se registro");
                        }
    }
            else{
                JOptionPane.showMessageDialog(this, "Ingrese RUC");
            }
                 
    }//GEN-LAST:event_txtrucFocusLost

    private void txtsueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsueldoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtsueldoActionPerformed

    private void txtsueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsueldoKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
        }
    }//GEN-LAST:event_txtsueldoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnguardar;
    private javax.swing.JLabel jdni2;
    private javax.swing.JLabel jdni3;
    private javax.swing.JLabel jdni4;
    private javax.swing.JLabel jruc;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtruc;
    private javax.swing.JTextField txtsueldo;
    // End of variables declaration//GEN-END:variables
}
