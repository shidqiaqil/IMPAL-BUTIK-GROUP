/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import Model.barang;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;


/**
 *
 * @author HP
 */
public class stokBaju extends javax.swing.JFrame {

    /**
     * Creates new form stokBahan
     */
    private Object[] rowbarang={"no_baju","nama_baju","jumlah_baju","model"};
    private DefaultTableModel tablebarang= new DefaultTableModel(null,rowbarang);
        public stokBaju() {
            initComponents();
            tabelstokbaju.setModel(tablebarang);
            /*Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
            setLocation((screensize.width / 2) - (getSize().width / 2), 
                    (screensize.height / 2) - (getSize().height / 2)); */ 
        }
        
        public void tampilstok(ArrayList<barang> a){
            int z=tablebarang.getRowCount();
            for (int i=0; i<z ; i++) {
                tablebarang.removeRow(0);
            }
            for (barang x: a){
                String no_baju =x.getNo_baju();
                String nama_baju= x.getNama_baju();
                int jumlah_baju= x.getJumlah_baju();
                String model= x.getModel();
                Object[] data={no_baju,nama_baju,jumlah_baju,model};
                tablebarang.addRow(data);
            }
        }
 /*   Connection koneksi = null;
    ResultSet hasil = null;
    PreparedStatement proses = null;
    
    public void tampilData(){
        try{
           String query= "select * from barang;" ;
           proses = koneksi.prepareStatement(query);
           hasil = proses.executeQuery();
           tabelstokbaju.setModel(DbUtils.resultSetToTableModel(hasil));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "gagal menampilkan data");
        }
    }
 */   


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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelstokbaju = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

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
        jLabel5.setText("STOK BAJU");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 200, -1));

        logout.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 140, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 700));

        jPanel2.setBackground(new java.awt.Color(56, 56, 56));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelstokbaju.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelstokbaju.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelstokbajuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelstokbaju);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 660, 450));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cari Nama Baju  :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 180, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 320, 40));

        jButton3.setText("Submit");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 100, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 850, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void tabelstokbajuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelstokbajuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelstokbajuMouseClicked

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
            java.util.logging.Logger.getLogger(stokBaju.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stokBaju.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stokBaju.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stokBaju.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stokBaju().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton logout;
    private javax.swing.JTable tabelstokbaju;
    // End of variables declaration//GEN-END:variables
public void addListener(ActionListener e){
        back.addActionListener(e);
        logout.addActionListener(e);
        
    }
public JButton getsback(){
    return back;
}
public JButton getstombollogout(){
    return logout;
}

}
