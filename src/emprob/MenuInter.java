
package emprob;

public class MenuInter extends javax.swing.JFrame {

    public MenuInter() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        supervisores = new javax.swing.JButton();
        problemasmenu = new javax.swing.JButton();
        tiendasmenu = new javax.swing.JButton();
        fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenreportes.jpg"))); // NOI18N
        jButton1.setText("REPORTES");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 250, 100));

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salida.png"))); // NOI18N
        Salir.setBorderPainted(false);
        Salir.setContentAreaFilled(false);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 80, 70));

        supervisores.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        supervisores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/supervisormeniimagen_opt.jpg"))); // NOI18N
        supervisores.setText("SUPERVISOR");
        supervisores.setContentAreaFilled(false);
        getContentPane().add(supervisores, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 240, 100));

        problemasmenu.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        problemasmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/problemasimagen_opt.png"))); // NOI18N
        problemasmenu.setText("PROBLEMAS");
        problemasmenu.setContentAreaFilled(false);
        getContentPane().add(problemasmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 350, -1, 100));

        tiendasmenu.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        tiendasmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tiendasicon_opt.png"))); // NOI18N
        tiendasmenu.setText("TIENDAS");
        tiendasmenu.setContentAreaFilled(false);
        getContentPane().add(tiendasmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 240, 100));

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JLabel fondo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton problemasmenu;
    private javax.swing.JButton supervisores;
    private javax.swing.JButton tiendasmenu;
    // End of variables declaration//GEN-END:variables
}
