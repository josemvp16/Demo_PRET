/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author J.Israel
 */
public class Monitor extends javax.swing.JFrame {

    /**
     * Creates new form Monitor
     */
    public Monitor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        labelALIANZA = new javax.swing.JLabel();
        labelPRD = new javax.swing.JLabel();
        labelVERDE = new javax.swing.JLabel();
        labelPT = new javax.swing.JLabel();
        labelPAN = new javax.swing.JLabel();
        labelPRI = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 50, 50));

        labelALIANZA.setForeground(new java.awt.Color(255, 255, 255));
        labelALIANZA.setText("200");
        getContentPane().add(labelALIANZA, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 60, -1));

        labelPRD.setForeground(new java.awt.Color(255, 255, 255));
        labelPRD.setText("25,000");
        getContentPane().add(labelPRD, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 60, -1));

        labelVERDE.setForeground(new java.awt.Color(255, 255, 255));
        labelVERDE.setText("1,800");
        getContentPane().add(labelVERDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 60, -1));

        labelPT.setForeground(new java.awt.Color(255, 255, 255));
        labelPT.setText("3,500");
        getContentPane().add(labelPT, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 60, -1));

        labelPAN.setForeground(new java.awt.Color(255, 255, 255));
        labelPAN.setText("34,000");
        getContentPane().add(labelPAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 60, -1));

        labelPRI.setForeground(new java.awt.Color(255, 255, 255));
        labelPRI.setText("25,000");
        getContentPane().add(labelPRI, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 60, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Leyenda.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 300, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Hidalgo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelALIANZA;
    private javax.swing.JLabel labelPAN;
    private javax.swing.JLabel labelPRD;
    private javax.swing.JLabel labelPRI;
    private javax.swing.JLabel labelPT;
    private javax.swing.JLabel labelVERDE;
    // End of variables declaration//GEN-END:variables
}
