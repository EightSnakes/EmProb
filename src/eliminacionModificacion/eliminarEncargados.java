
package eliminacionModificacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import manejoBD.Conexion;
import emprob.*;


public class eliminarEncargados extends javax.swing.JFrame {
    
    
    int iDE;
    String nombre,tel;
    public eliminarEncargados() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloEncargados = new javax.swing.JTextField();
        subtituloEncargado = new javax.swing.JTextField();
        TextoID_Encargado = new javax.swing.JTextField();
        TextoNombre = new javax.swing.JTextField();
        TextoCelularE = new javax.swing.JTextField();
        ID_Encargado = new javax.swing.JTextField();
        NombreEncar = new javax.swing.JTextField();
        Telefono_E = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        save = new javax.swing.JButton();
        menuEncargados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloEncargados.setEditable(false);
        TituloEncargados.setFont(new java.awt.Font("Arial Black", 0, 34)); // NOI18N
        TituloEncargados.setText("ENCARGADOS");
        TituloEncargados.setBorder(null);
        TituloEncargados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloEncargadosActionPerformed(evt);
            }
        });
        getContentPane().add(TituloEncargados, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 260, 30));

        subtituloEncargado.setEditable(false);
        subtituloEncargado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtituloEncargado.setText("Ingresa los datos:");
        subtituloEncargado.setBorder(null);
        subtituloEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtituloEncargadoActionPerformed(evt);
            }
        });
        getContentPane().add(subtituloEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 120, -1));

        TextoID_Encargado.setEditable(false);
        TextoID_Encargado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoID_Encargado.setText("ID Encargado:");
        TextoID_Encargado.setBorder(null);
        getContentPane().add(TextoID_Encargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        TextoNombre.setEditable(false);
        TextoNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoNombre.setText("Nombre:");
        TextoNombre.setBorder(null);
        TextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 50, 20));

        TextoCelularE.setEditable(false);
        TextoCelularE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoCelularE.setText("Telefono-Celular: ");
        TextoCelularE.setBorder(null);
        getContentPane().add(TextoCelularE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, -1));
        getContentPane().add(ID_Encargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 190, -1));

        NombreEncar.setEditable(false);
        getContentPane().add(NombreEncar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 190, -1));

        Telefono_E.setEditable(false);
        getContentPane().add(Telefono_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 190, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Regreso.png"))); // NOI18N
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 50, 50));

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Borrar.png"))); // NOI18N
        save.setBorderPainted(false);
        save.setContentAreaFilled(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 60, 50));

        menuEncargados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoSUB_opt.jpg"))); // NOI18N
        getContentPane().add(menuEncargados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TituloEncargadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloEncargadosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TituloEncargadosActionPerformed

    private void subtituloEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtituloEncargadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtituloEncargadoActionPerformed

    private void TextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNombreActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        try{
            iDE = Integer.parseInt(ID_Encargado.getText());
        }catch(NumberFormatException  ex){
            JOptionPane.showMessageDialog(null, "Ingrese valores num??ricos en los id");
            return;
        }
        if(existeClaveE()){
            try {
                Statement sql = Conexion.getConexion().createStatement();
                ResultSet rs;
                rs= sql.executeQuery("SELECT * FROM Encargados where ID_Encargado = " + iDE);
                while(rs.next()){
                    nombre = rs.getString("Nombre_E");
                    tel = rs.getString("Telefono_E");
                 }
                NombreEncar.setText(nombre);
                Telefono_E.setText(tel);
                if(existeClaveET()){
                    JOptionPane.showMessageDialog(null, "Este registro esta ligado a otros registros, no se puede eliminar");
                }
                else{
                    int des = JOptionPane.showConfirmDialog(null, "??Estas seguro de querer borrar este registro?", "Confirmaci??n", JOptionPane.YES_NO_OPTION);
                     if(des==0){
                         try {
                
                        int d = sql.executeUpdate("DELETE FROM Encargados where ID_Encargado = " + iDE);
                         JOptionPane.showMessageDialog(null, "Registro eliminado con exito");
                         NombreEncar.setText(null);
                         Telefono_E.setText(null);
                         ID_Encargado.setText(null);
                         sql.close();
                         } catch (SQLException ex){
                            JOptionPane.showMessageDialog(null, ex.toString());
                        }
                    }
            else{
                NombreEncar.setText(null);
                Telefono_E.setText(null);
                ID_Encargado.setText(null);
            }
        }
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "El encargado con el Id ingresado no existe");
        }
        
        
        
    }//GEN-LAST:event_saveActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu2Encargados().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID_Encargado;
    private javax.swing.JTextField NombreEncar;
    private javax.swing.JTextField Telefono_E;
    private javax.swing.JTextField TextoCelularE;
    private javax.swing.JTextField TextoID_Encargado;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JTextField TituloEncargados;
    private javax.swing.JButton back;
    private javax.swing.JLabel menuEncargados;
    private javax.swing.JButton save;
    private javax.swing.JTextField subtituloEncargado;
    // End of variables declaration//GEN-END:variables

    private boolean existeClaveE(){
        boolean existe = false;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conect = new Conexion();
        Connection con = conect.getConexion();
        String consulta = "SELECT ID_Encargado FROM Encargados WHERE ID_Encargado = ?";
        try {
            ps = con.prepareStatement(consulta);
            ps.setInt(1, iDE);
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
    private boolean existeClaveET(){
        boolean existe = false;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conect = new Conexion();
        Connection con = conect.getConexion();
        String consulta = "SELECT ID_Encargado FROM Tiendas WHERE ID_Encargado = ?";
        try {
            ps = con.prepareStatement(consulta);
            ps.setInt(1, iDE);
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
