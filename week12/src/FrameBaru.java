/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author D2K
 */
public class FrameBaru extends javax.swing.JFrame {

    /**
     * Creates new form FrameBaru
     */
    public FrameBaru() {
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

        angka1 = new javax.swing.JTextField();
        angka2 = new javax.swing.JTextField();
        jumlahBt = new javax.swing.JButton();
        Hasil = new javax.swing.JLabel();
        kurangBt = new javax.swing.JButton();
        kaliBt = new javax.swing.JButton();
        bagiBt = new javax.swing.JButton();
        modulusBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 102));
        setForeground(new java.awt.Color(255, 51, 102));

        jumlahBt.setText("+");
        jumlahBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahBtActionPerformed(evt);
            }
        });

        kurangBt.setText("-");
        kurangBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangBtActionPerformed(evt);
            }
        });

        kaliBt.setText("x");
        kaliBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliBtActionPerformed(evt);
            }
        });

        bagiBt.setText("/");
        bagiBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiBtActionPerformed(evt);
            }
        });

        modulusBt.setText("%");
        modulusBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modulusBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jumlahBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kurangBt)
                        .addGap(18, 18, 18)
                        .addComponent(kaliBt)
                        .addGap(18, 18, 18)
                        .addComponent(bagiBt)
                        .addGap(18, 18, 18)
                        .addComponent(modulusBt))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahBt)
                    .addComponent(kurangBt)
                    .addComponent(kaliBt)
                    .addComponent(bagiBt)
                    .addComponent(modulusBt))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        Hasil.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jumlahBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahBtActionPerformed
        // TODO add your handling code here:
        double hasil = Double.parseDouble(angka1.getText())+ Double.parseDouble(angka2.getText());
        Hasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_jumlahBtActionPerformed

    private void kurangBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangBtActionPerformed
        // TODO add your handling code here:
        double hasil = Double.parseDouble(angka1.getText())- Double.parseDouble(angka2.getText());
        Hasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_kurangBtActionPerformed

    private void kaliBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliBtActionPerformed
        // TODO add your handling code here:
        double hasil = Double.parseDouble(angka1.getText())* Double.parseDouble(angka2.getText());
        Hasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_kaliBtActionPerformed

    private void bagiBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiBtActionPerformed
        // TODO add your handling code here:
        try{
             double hasil = Double.parseDouble(angka1.getText())/ Double.parseDouble(angka2.getText());
             Hasil.setText(Double.toString(hasil));
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
       
    }//GEN-LAST:event_bagiBtActionPerformed

    private void modulusBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modulusBtActionPerformed
        // TODO add your handling code here:
        double hasil = Double.parseDouble(angka1.getText())% Double.parseDouble(angka2.getText());
        Hasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_modulusBtActionPerformed

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
            java.util.logging.Logger.getLogger(FrameBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBaru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hasil;
    private javax.swing.JTextField angka1;
    private javax.swing.JTextField angka2;
    private javax.swing.JButton bagiBt;
    private javax.swing.JButton jumlahBt;
    private javax.swing.JButton kaliBt;
    private javax.swing.JButton kurangBt;
    private javax.swing.JButton modulusBt;
    // End of variables declaration//GEN-END:variables
}
