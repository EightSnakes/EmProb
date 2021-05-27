package emprob;
public class submenu_Reportes extends javax.swing.JFrame {

    /**
     * Creates new form submenu_Reportes
     */
    public submenu_Reportes() {
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
        IDReporte = new javax.swing.JTextField();
        IDTienda = new javax.swing.JTextField();
        Fecha = new javax.swing.JFormattedTextField();
        IDProblema = new javax.swing.JTextField();
        resueltoSi = new javax.swing.JCheckBox();
        resueltoNo = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        Observaciones = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        fechaSub = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloReportes.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        TituloReportes.setText("REPORTES");
        TituloReportes.setBorder(null);
        getContentPane().add(TituloReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 220, 40));

        SubtituloReportes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SubtituloReportes.setText("Ingresa los datos:");
        SubtituloReportes.setBorder(null);
        getContentPane().add(SubtituloReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

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
        getContentPane().add(IDReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 180, -1));
        getContentPane().add(IDTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 180, -1));

        Fecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 90, -1));
        getContentPane().add(IDProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 180, -1));

        resueltoSi.setText("Si");
        resueltoSi.setBorder(null);
        getContentPane().add(resueltoSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        resueltoNo.setText("No");
        resueltoNo.setBorder(null);
        getContentPane().add(resueltoNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jScrollPane1.setViewportView(Observaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 170, 100));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salida.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 50, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Regreso.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 50, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 60, 50));

        fechaSub.setEditable(false);
        fechaSub.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        fechaSub.setText("(dd/mm/aaaa)");
        fechaSub.setBorder(null);
        getContentPane().add(fechaSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoSUB_opt.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(submenu_Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(submenu_Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(submenu_Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(submenu_Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new submenu_Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Fecha;
    private javax.swing.JTextField IDProblema;
    private javax.swing.JTextField IDReporte;
    private javax.swing.JTextField IDTienda;
    private javax.swing.JTextPane Observaciones;
    private javax.swing.JTextField SubtituloReportes;
    private javax.swing.JTextField TextoFecha;
    private javax.swing.JTextField TextoIDProblema;
    private javax.swing.JTextField TextoIDReporte;
    private javax.swing.JTextField TextoIDTienda;
    private javax.swing.JTextField TextoObservaciones;
    private javax.swing.JTextField TextoResuelto;
    private javax.swing.JTextField TituloReportes;
    private javax.swing.JTextField fechaSub;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox resueltoNo;
    private javax.swing.JCheckBox resueltoSi;
    // End of variables declaration//GEN-END:variables
}
