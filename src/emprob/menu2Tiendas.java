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
public class menu2Tiendas extends javax.swing.JFrame {

    /**
     * Creates new form menu2
     */
    TipoConsulta tc = new TipoConsulta();
    public menu2Tiendas() {
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

        agregarboton = new javax.swing.JButton();
        modificarboton = new javax.swing.JButton();
        consultarboton = new javax.swing.JButton();
        eliminarboton = new javax.swing.JButton();
        salirmenu2 = new javax.swing.JButton();
        fondo2menu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregarboton.setBackground(new java.awt.Color(255, 255, 255));
        agregarboton.setFont(new java.awt.Font("HP Simplified", 1, 24)); // NOI18N
        agregarboton.setForeground(new java.awt.Color(255, 255, 255));
        agregarboton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregaricon.jpg"))); // NOI18N
        agregarboton.setText("Agregar");
        agregarboton.setBorderPainted(false);
        agregarboton.setContentAreaFilled(false);
        agregarboton.setDefaultCapable(false);
        agregarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarbotonActionPerformed(evt);
            }
        });
        getContentPane().add(agregarboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 320, 160));

        modificarboton.setFont(new java.awt.Font("HP Simplified", 1, 24)); // NOI18N
        modificarboton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificaricon (1).jpg"))); // NOI18N
        modificarboton.setText("Modificar");
        modificarboton.setBorderPainted(false);
        modificarboton.setContentAreaFilled(false);
        getContentPane().add(modificarboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 330, 170));

        consultarboton.setFont(new java.awt.Font("HP Simplified", 1, 24)); // NOI18N
        consultarboton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultar icon (1)_1.jpg"))); // NOI18N
        consultarboton.setText("Consultar");
        consultarboton.setBorderPainted(false);
        consultarboton.setContentAreaFilled(false);
        consultarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarbotonActionPerformed(evt);
            }
        });
        getContentPane().add(consultarboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 310, 180));

        eliminarboton.setFont(new java.awt.Font("HP Simplified", 1, 24)); // NOI18N
        eliminarboton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminaricon (1).jpg"))); // NOI18N
        eliminarboton.setText("Eliminar");
        eliminarboton.setBorderPainted(false);
        eliminarboton.setContentAreaFilled(false);
        eliminarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarbotonActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 373, 310, 170));

        salirmenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salida2.png"))); // NOI18N
        salirmenu2.setBorderPainted(false);
        salirmenu2.setContentAreaFilled(false);
        salirmenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirmenu2ActionPerformed(evt);
            }
        });
        getContentPane().add(salirmenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 180, 140));

        fondo2menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondomenu2.jpg"))); // NOI18N
        getContentPane().add(fondo2menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 594));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarbotonActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new submenu().setVisible(true);
            }
        });
            this.dispose();
    }//GEN-LAST:event_agregarbotonActionPerformed

    private void consultarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarbotonActionPerformed
        // TODO add your handling code here:
        //0 = individual, 1 = general
        if (tc.consulta() == 0){
            //Ir a ventana para consulta individual
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultarTiendas().setVisible(true);
            }
        });
            this.dispose();
        } else {
            //Ir a ventana para consulta general
        }
        
    }//GEN-LAST:event_consultarbotonActionPerformed

    private void eliminarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarbotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarbotonActionPerformed

    private void salirmenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirmenu2ActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInter().setVisible(true);
            }
        });
            this.dispose();
    }//GEN-LAST:event_salirmenu2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarboton;
    private javax.swing.JButton consultarboton;
    private javax.swing.JButton eliminarboton;
    private javax.swing.JLabel fondo2menu;
    private javax.swing.JButton modificarboton;
    private javax.swing.JButton salirmenu2;
    // End of variables declaration//GEN-END:variables
}
