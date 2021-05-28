
package emprob;


public class consultarEncargados extends javax.swing.JFrame {

    public consultarEncargados() {
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
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 50, 50));

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Borrar.png"))); // NOI18N
        save.setBorderPainted(false);
        save.setContentAreaFilled(false);
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

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultarEncargados().setVisible(true);
            }
        });
    }

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
}
