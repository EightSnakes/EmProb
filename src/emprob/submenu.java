/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprob;

/**
 *
 * @author LuisMa
 */
public class submenu extends javax.swing.JFrame {

    /**
     * Creates new form submenu
     */
    public submenu() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TituloTiendas = new javax.swing.JTextField();
        subtituloTiendas = new javax.swing.JTextField();
        TextoID_Tienda = new javax.swing.JTextField();
        TextoIDEncargado = new javax.swing.JTextField();
        TextoTelefono = new javax.swing.JTextField();
        TextoCalle = new javax.swing.JTextField();
        TextoNumCalle = new javax.swing.JTextField();
        TextoColonia = new javax.swing.JTextField();
        TextoMunicipio = new javax.swing.JTextField();
        TextoEstado = new javax.swing.JTextField();
        ID_Tienda = new javax.swing.JTextField();
        ID_Encargado = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Calle = new javax.swing.JTextField();
        NumCalle = new javax.swing.JTextField();
        Colonia = new javax.swing.JTextField();
        Municipio = new javax.swing.JTextField();
        Estado = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        save = new javax.swing.JButton();
        menusub = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloTiendas.setEditable(false);
        TituloTiendas.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        TituloTiendas.setText("TIENDAS");
        TituloTiendas.setBorder(null);
        TituloTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloTiendasActionPerformed(evt);
            }
        });
        getContentPane().add(TituloTiendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 180, 40));

        subtituloTiendas.setEditable(false);
        subtituloTiendas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subtituloTiendas.setText("Ingresa los datos:");
        subtituloTiendas.setBorder(null);
        subtituloTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtituloTiendasActionPerformed(evt);
            }
        });
        getContentPane().add(subtituloTiendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 120, 30));

        TextoID_Tienda.setEditable(false);
        TextoID_Tienda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoID_Tienda.setText("ID Tienda:");
        TextoID_Tienda.setBorder(null);
        TextoID_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoID_TiendaActionPerformed(evt);
            }
        });
        getContentPane().add(TextoID_Tienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 20));

        TextoIDEncargado.setEditable(false);
        TextoIDEncargado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoIDEncargado.setText("ID Encargado:");
        TextoIDEncargado.setBorder(null);
        getContentPane().add(TextoIDEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        TextoTelefono.setEditable(false);
        TextoTelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoTelefono.setText("Teléfono:");
        TextoTelefono.setBorder(null);
        TextoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(TextoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 50, 20));

        TextoCalle.setEditable(false);
        TextoCalle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoCalle.setText("Calle:");
        TextoCalle.setBorder(null);
        getContentPane().add(TextoCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 40, -1));

        TextoNumCalle.setEditable(false);
        TextoNumCalle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoNumCalle.setText("Num. Calle:");
        TextoNumCalle.setBorder(null);
        getContentPane().add(TextoNumCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 70, 20));

        TextoColonia.setEditable(false);
        TextoColonia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoColonia.setText("Colonia:");
        TextoColonia.setToolTipText("");
        TextoColonia.setBorder(null);
        getContentPane().add(TextoColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 50, -1));

        TextoMunicipio.setEditable(false);
        TextoMunicipio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoMunicipio.setText("Municipio:");
        TextoMunicipio.setBorder(null);
        TextoMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoMunicipioActionPerformed(evt);
            }
        });
        getContentPane().add(TextoMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 60, -1));

        TextoEstado.setEditable(false);
        TextoEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextoEstado.setText("Estado:");
        TextoEstado.setToolTipText("");
        TextoEstado.setBorder(null);
        getContentPane().add(TextoEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 40, 20));
        getContentPane().add(ID_Tienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 190, -1));
        getContentPane().add(ID_Encargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 190, -1));
        getContentPane().add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 190, -1));
        getContentPane().add(Calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 190, -1));
        getContentPane().add(NumCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 190, -1));
        getContentPane().add(Colonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 190, -1));
        getContentPane().add(Municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 190, -1));
        getContentPane().add(Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 190, -1));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salida.png"))); // NOI18N
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 50, 50));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Regreso.png"))); // NOI18N
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 50, 50));

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar.png"))); // NOI18N
        save.setBorderPainted(false);
        save.setContentAreaFilled(false);
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 50, 50));

        menusub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoSUB_opt.jpg"))); // NOI18N
        getContentPane().add(menusub, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TituloTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloTiendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TituloTiendasActionPerformed

    private void subtituloTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtituloTiendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtituloTiendasActionPerformed

    private void TextoID_TiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoID_TiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoID_TiendaActionPerformed

    private void TextoMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoMunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoMunicipioActionPerformed

    private void TextoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoTelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(submenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(submenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(submenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(submenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new submenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField Calle;
    private javax.swing.JTextField Colonia;
    private javax.swing.JTextField Estado;
    private javax.swing.JTextField ID_Encargado;
    private javax.swing.JTextField ID_Tienda;
    private javax.swing.JTextField Municipio;
    private javax.swing.JTextField NumCalle;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField TextoCalle;
    private javax.swing.JTextField TextoColonia;
    private javax.swing.JTextField TextoEstado;
    private javax.swing.JTextField TextoIDEncargado;
    private javax.swing.JTextField TextoID_Tienda;
    private javax.swing.JTextField TextoMunicipio;
    private javax.swing.JTextField TextoNumCalle;
    private javax.swing.JTextField TextoTelefono;
    private javax.swing.JTextField TituloTiendas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel menusub;
    private javax.swing.JButton salir;
    private javax.swing.JButton save;
    private javax.swing.JTextField subtituloTiendas;
    // End of variables declaration//GEN-END:variables
}
