/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliminacionModificacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import manejoBD.Conexion;
import emprob.*;



public class modificarProblemas extends javax.swing.JFrame {

    /**
     * Creates new form submenu_Problemas
     */
    int iDP;
    String nombre, desc, solu;
    public modificarProblemas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloProblemas = new javax.swing.JTextField();
        SubtituloProblemas = new javax.swing.JTextField();
        TextoIDProblema = new javax.swing.JTextField();
        TextoNombreProblema = new javax.swing.JTextField();
        TextoDescripcion = new javax.swing.JTextField();
        TextoSolucion = new javax.swing.JTextField();
        IDProblema = new javax.swing.JTextField();
        NombreProblema = new javax.swing.JTextField();
        Descripcion = new javax.swing.JTextField();
        Solucion = new javax.swing.JTextField();
        back1 = new javax.swing.JButton();
        save1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        menuProblemas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloProblemas.setEditable(false);
        TituloProblemas.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        TituloProblemas.setText("PROBLEMAS");
        TituloProblemas.setBorder(null);
        getContentPane().add(TituloProblemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 52, -1, 40));

        SubtituloProblemas.setEditable(false);
        SubtituloProblemas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SubtituloProblemas.setText(" Ingresa los datos:");
        SubtituloProblemas.setBorder(null);
        getContentPane().add(SubtituloProblemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 130, -1));

        TextoIDProblema.setEditable(false);
        TextoIDProblema.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoIDProblema.setText("ID Problema:");
        TextoIDProblema.setBorder(null);
        getContentPane().add(TextoIDProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        TextoNombreProblema.setEditable(false);
        TextoNombreProblema.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoNombreProblema.setText("Nombre del Problema:");
        TextoNombreProblema.setBorder(null);
        getContentPane().add(TextoNombreProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        TextoDescripcion.setEditable(false);
        TextoDescripcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoDescripcion.setText("Descripcion:");
        TextoDescripcion.setBorder(null);
        getContentPane().add(TextoDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        TextoSolucion.setEditable(false);
        TextoSolucion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoSolucion.setText("Solucion sugerida:");
        TextoSolucion.setBorder(null);
        TextoSolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoSolucionActionPerformed(evt);
            }
        });
        getContentPane().add(TextoSolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 20));
        getContentPane().add(IDProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 170, -1));

        NombreProblema.setEditable(false);
        getContentPane().add(NombreProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, -1));

        Descripcion.setEditable(false);
        Descripcion.setText(" ");
        getContentPane().add(Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 170, 80));

        Solucion.setEditable(false);
        getContentPane().add(Solucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 170, 80));

        back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Regreso.png"))); // NOI18N
        back1.setBorderPainted(false);
        back1.setContentAreaFilled(false);
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        getContentPane().add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 50, 50));

        save1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar.png"))); // NOI18N
        save1.setBorderPainted(false);
        save1.setContentAreaFilled(false);
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        getContentPane().add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 60, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        menuProblemas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoSUB_opt.jpg"))); // NOI18N
        getContentPane().add(menuProblemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoSolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoSolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoSolucionActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu2Problemas().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_back1ActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        // TODO add your handling code here:
        try{
            iDP = Integer.parseInt(IDProblema.getText());
        }catch(NumberFormatException  ex){
            JOptionPane.showMessageDialog(null, "Ingrese valores num??ricos en los id");
            return;
        }
        if(existeClave(iDP)){
            try {
                Statement sql = Conexion.getConexion().createStatement();
                ResultSet rs;
                rs= sql.executeQuery("SELECT * FROM Problema where ID_Problema = " + iDP);
                while(rs.next()){
                    nombre = rs.getString("Nombre_P");
                    desc = rs.getString("Descripcion");
                    solu = rs.getString("Solucion_Sugerida");
                 }
                NombreProblema.setText(nombre);
                Descripcion.setText(desc);
                Solucion.setText(solu);
                IDProblema.setEditable(false);
                NombreProblema.setEditable(true);
                Descripcion.setEditable(true);
                Solucion.setEditable(true);
                save1.setEnabled(false);
                jButton1.setEnabled(true);
                
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "La tienda con el Id ingresado no existe");
        }
    }//GEN-LAST:event_save1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nueNom, nueDesc, nueSol;
        if(NombreProblema.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Tiene que ingresar el nombre");
        }
        else{
            nueNom = NombreProblema.getText();
            nueDesc = Descripcion.getText();
            nueSol = Solucion.getText();
            try{
                Statement sql = Conexion.getConexion().createStatement();
                sql.executeUpdate("UPDATE Problema Set Nombre_P = '"+nueNom+"', Descripcion = '"+ nueDesc +"', Solucion_Sugerida = '" + nueSol +"' WHERE ID_Problema ="+ iDP +";");
                JOptionPane.showMessageDialog(null, "Datos guardados con ??xito.");
                IDProblema.setText(null);
                NombreProblema.setText(null);
                Descripcion.setText(null);
                Solucion.setText(null);
                IDProblema.setEditable(true);
                NombreProblema.setEditable(false);
                Descripcion.setEditable(false);
                Solucion.setEditable(false);
                save1.setEnabled(true);
                jButton1.setEnabled(false);
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Descripcion;
    private javax.swing.JTextField IDProblema;
    private javax.swing.JTextField NombreProblema;
    private javax.swing.JTextField Solucion;
    private javax.swing.JTextField SubtituloProblemas;
    private javax.swing.JTextField TextoDescripcion;
    private javax.swing.JTextField TextoIDProblema;
    private javax.swing.JTextField TextoNombreProblema;
    private javax.swing.JTextField TextoSolucion;
    private javax.swing.JTextField TituloProblemas;
    private javax.swing.JButton back1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel menuProblemas;
    private javax.swing.JButton save1;
    // End of variables declaration//GEN-END:variables

    private boolean existeClave(int nombre){
        boolean existe = false;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conect = new Conexion();
        Connection con = conect.getConexion();
        String consulta = "SELECT ID_Problema FROM Problema WHERE ID_Problema = ?";
        try {
            ps = con.prepareStatement(consulta);
            ps.setInt(1, nombre);
            rs = ps.executeQuery();
            
            if(rs.next()){
               existe = true;
            }
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
            existe = false;
        }
        return existe;
    }
}
