/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprob;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import manejoBD.Conexion;
import java.sql.Statement;

/**
 *
 * @author LuisMa
 */
public class consultarReportes extends javax.swing.JFrame {

    /**
     * Creates new form submenu_Reportes
     */
    int idR, iDT, iDP;
    String resu, obse, fecha;
    public consultarReportes() {
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

        TituloReportes = new javax.swing.JTextField();
        SubtituloReportes = new javax.swing.JTextField();
        TextoIDReporte = new javax.swing.JTextField();
        TextoIDTienda = new javax.swing.JTextField();
        TextoIDProblema = new javax.swing.JTextField();
        TextoFecha = new javax.swing.JTextField();
        TextoResuelto = new javax.swing.JTextField();
        TextoObservaciones = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        back1 = new javax.swing.JButton();
        save1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloReportes.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        TituloReportes.setText("REPORTES");
        TituloReportes.setBorder(null);
        getContentPane().add(TituloReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 220, 40));

        SubtituloReportes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SubtituloReportes.setText("I Ingresa los datos:");
        SubtituloReportes.setBorder(null);
        SubtituloReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtituloReportesActionPerformed(evt);
            }
        });
        getContentPane().add(SubtituloReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 120, 20));

        TextoIDReporte.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoIDReporte.setText("ID_Reporte:");
        TextoIDReporte.setBorder(null);
        getContentPane().add(TextoIDReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        TextoIDTienda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoIDTienda.setText("ID Tienda:");
        TextoIDTienda.setBorder(null);
        getContentPane().add(TextoIDTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        TextoIDProblema.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoIDProblema.setText("ID Problema:");
        TextoIDProblema.setBorder(null);
        getContentPane().add(TextoIDProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        TextoFecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoFecha.setText("Fecha:");
        TextoFecha.setBorder(null);
        getContentPane().add(TextoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        TextoResuelto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoResuelto.setText("Resuelto:");
        TextoResuelto.setBorder(null);
        getContentPane().add(TextoResuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        TextoObservaciones.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoObservaciones.setText("Observaciones:");
        TextoObservaciones.setBorder(null);
        getContentPane().add(TextoObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 180, -1));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 180, -1));

        jFormattedTextField1.setEditable(false);
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 90, -1));

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 180, -1));

        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Si");
        jCheckBox1.setBorder(null);
        jCheckBox1.setEnabled(false);
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jTextPane1.setEditable(false);
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 170, 100));

        back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Regreso.png"))); // NOI18N
        back1.setBorderPainted(false);
        back1.setContentAreaFilled(false);
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        getContentPane().add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 50, 50));

        save1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar.png"))); // NOI18N
        save1.setBorderPainted(false);
        save1.setContentAreaFilled(false);
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        getContentPane().add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 60, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoSUB_opt.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu2Encargados().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_back1ActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        // TODO add your handling code here:
        try{
            idR = Integer.parseInt(jTextField5.getText());
        }catch(NumberFormatException  ex){
            JOptionPane.showMessageDialog(null, "Ingrese valores numéricos en los id");
        }
        if(existeClaveR(idR)){
            try {
                Statement sql = Conexion.getConexion().createStatement();
                ResultSet rs;
                rs= sql.executeQuery("SELECT * FROM Reportes where ID_Reporte = " + idR);
               
                while(rs.next()){
                    iDT = rs.getInt("ID_Tienda");
                    fecha = rs.getString("Fecha_R");
                }
                rs = sql.executeQuery("SELECT * FROM EncabezadosReportes where ID_Reporte = " + idR);
                while(rs.next()){
                    iDP = rs.getInt("ID_Problema");
                    resu = rs.getString("Resuelto");
                    obse = rs.getString("Observaciones");
                }
                jFormattedTextField1.setText(fecha);
                jTextPane1.setText(obse);
                jTextField1.setText(Integer.toString(iDT));
                jTextField2.setText(Integer.toString(iDP));
                if(resu.equals("S")){
                    jCheckBox1.setSelected(true);
                }    
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "La tienda con el Id ingresado no existe");
        }
    }//GEN-LAST:event_save1ActionPerformed

    private void SubtituloReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubtituloReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubtituloReportesActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SubtituloReportes;
    private javax.swing.JTextField TextoFecha;
    private javax.swing.JTextField TextoIDProblema;
    private javax.swing.JTextField TextoIDReporte;
    private javax.swing.JTextField TextoIDTienda;
    private javax.swing.JTextField TextoObservaciones;
    private javax.swing.JTextField TextoResuelto;
    private javax.swing.JTextField TituloReportes;
    private javax.swing.JButton back1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton save1;
    // End of variables declaration//GEN-END:variables
private boolean existeClaveR(int nombre){
        boolean existe = false;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conect = new Conexion();
        Connection con = conect.getConexion();
        String consulta = "SELECT ID_Reporte FROM Reportes WHERE ID_Reporte = ?";
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
