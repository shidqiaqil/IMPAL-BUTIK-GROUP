/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author HP
 */
public class inputLaporanTransaksi extends javax.swing.JFrame {

    /**
     * Creates new form stokBahan
     */
    public inputLaporanTransaksi() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputnolaporan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputnotransaksi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputnamabaju = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputjumlah = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        inputnobaju = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(190, 186, 177));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/WhatsNewIcon.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 190, -1));

        back.setText("Back");
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(56, 56, 56));
        jLabel5.setText("TRANSAKSI");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 160, -1));

        logout.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 140, 60));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(56, 56, 56));
        jLabel6.setText("INPUT LAPORAN ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 250, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 700));

        jPanel2.setBackground(new java.awt.Color(56, 56, 56));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("No Laporan    :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 160, -1));

        inputnolaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputnolaporanActionPerformed(evt);
            }
        });
        jPanel2.add(inputnolaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 430, 40));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No Transaksi :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 160, -1));

        inputnotransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputnotransaksiActionPerformed(evt);
            }
        });
        jPanel2.add(inputnotransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 430, 40));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 32)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama baju   :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 160, -1));

        inputnamabaju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputnamabajuActionPerformed(evt);
            }
        });
        jPanel2.add(inputnamabaju, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 430, 40));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 32)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jumlah         :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 160, -1));

        inputjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputjumlahActionPerformed(evt);
            }
        });
        jPanel2.add(inputjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 430, 40));

        submit.setText("Submit");
        jPanel2.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 100, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("No baju      :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 140, 40));

        inputnobaju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputnobajuActionPerformed(evt);
            }
        });
        jPanel2.add(inputnobaju, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 430, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 850, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputnolaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputnolaporanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputnolaporanActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void inputnotransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputnotransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputnotransaksiActionPerformed

    private void inputnamabajuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputnamabajuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputnamabajuActionPerformed

    private void inputjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputjumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputjumlahActionPerformed

    private void inputnobajuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputnobajuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputnobajuActionPerformed

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
            java.util.logging.Logger.getLogger(inputLaporanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputLaporanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputLaporanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputLaporanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputLaporanTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField inputjumlah;
    private javax.swing.JTextField inputnamabaju;
    private javax.swing.JTextField inputnobaju;
    private javax.swing.JTextField inputnolaporan;
    private javax.swing.JTextField inputnotransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
    public void addListener (ActionListener e) {
        back.addActionListener(e);
        logout.addActionListener(e);
        submit.addActionListener(e);
    }
    public void reset(){
    inputnobaju.setText("");
    inputnamabaju.setText("");
    inputjumlah.setText("");
    inputnotransaksi.setText("");
    inputnolaporan.setText("");
}
    public JButton getstombolinput(){
        return submit;
    }
    public JButton getstombollogout(){
        return logout;
    }
    public JButton getstombolback(){
        return back;
    }
    public int getjumlah(){
    try {
            return Integer.parseInt(inputjumlah.getText());
        } catch (Exception e) {
            return 0;
        }
    }
    public String getno_laporan(){
        return inputnolaporan.getText();
    }
    public String getno_baju(){
        return inputnobaju.getText();
    }
    public String getno_transaksi(){
        return inputnotransaksi.getText();
    }
   public String getnama_baju(){
       return inputnamabaju.getText();
   }
   
}
    

