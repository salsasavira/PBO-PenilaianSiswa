/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        nilai = new javax.swing.JTextField();
        no = new javax.swing.JTextField();
        mapel = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        proses = new javax.swing.JButton();
        nama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(nilai);
        nilai.setBounds(190, 200, 150, 30);
        getContentPane().add(no);
        no.setBounds(190, 120, 150, 30);

        mapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapelActionPerformed(evt);
            }
        });
        getContentPane().add(mapel);
        mapel.setBounds(190, 160, 150, 30);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(null);

        proses.setText("Proses");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });
        jPanel2.add(proses);
        proses.setBounds(167, 247, 90, 37);

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jPanel2.add(nama);
        nama.setBounds(190, 80, 150, 30);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(100, 300, 240, 130);

        jLabel1.setFont(new java.awt.Font("Dancing Script OT", 0, 36)); // NOI18N
        jLabel1.setText("Penilaian Siswa");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(110, 10, 250, 60);

        jLabel3.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        jLabel3.setText("Nama");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(70, 80, 120, 29);

        jLabel4.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        jLabel4.setText("No Absen");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(70, 120, 120, 29);

        jLabel5.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        jLabel5.setText("Mapel");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(70, 160, 120, 29);

        jLabel2.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        jLabel2.setText("Nilai");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(70, 200, 120, 29);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 480, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
      String Nama = nama.getText();
      String Mapel = mapel.getText();
      int Absen = Integer.parseInt(String.valueOf(no.getText()));
      int Nilai = Integer.parseInt(String.valueOf(nilai.getText()));

      TA.setText("Nama Siswa :"+Nama+"\n"+"No. Aben :"+Absen+"\n"+"Nilai :"+Nilai+"\n"+"Mapel : "+Mapel);
        // TODO add your handling code here:
    }//GEN-LAST:event_prosesActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void mapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mapelActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mapel;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nilai;
    private javax.swing.JTextField no;
    private javax.swing.JButton proses;
    // End of variables declaration//GEN-END:variables
}
