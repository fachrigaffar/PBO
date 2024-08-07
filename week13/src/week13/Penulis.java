/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package week13;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import models.ModelPenulis;
/**
 *
 * @author D2K
 */
public class Penulis extends javax.swing.JFrame {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/perpustakaan";
    static final String USER = "root";
    static final String PASS = "";
    
    List<ModelPenulis> items = new ArrayList<>();
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    /**
     * Creates new form Penulis
     */
    public Penulis() {
        initComponents();
        showTableData();
        edit.setEnabled(false);
    }
    
    public void showTableData(){
       try{ 
       Class.forName(JDBC_DRIVER);
       conn = DriverManager.getConnection(DB_URL, USER, PASS);
       DefaultTableModel model = new DefaultTableModel();
       model.addColumn("ID");
       model.addColumn("Nama Penulis");
       
       stmt = conn.createStatement();
       String sql = "SELECT * from penulis";
       int i= 1;
       rs = stmt.executeQuery(sql);
       items.clear();
       while(rs.next()){
            items.add(new ModelPenulis(rs.getInt("id"), rs.getString("nama_penulis")));
            
       }
       for(ModelPenulis p : items){
           model.addRow(new Object[]{
              p.getId(),
              p.getNama()
            });
       }
       rs.close();
       conn.close();
       stmt.close();
       
       tabelPenulis.setModel(model);
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    
    public void insertTable(String nama){
       try{ 
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "INSERT INTO penulis(nama_penulis) values (?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nama);
            ps.execute();

            stmt.close();
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
       
    public void getData(){
        int baris = tabelPenulis.getSelectedRow();
        nmPenulis.setText(items.get(baris).getNama());
        txtID.setVisible(true);
        txtID.setText(Integer.toString(items.get(baris).getId()));
        
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JLabel();
        labelTextBar = new javax.swing.JLabel();
        nmPenulis = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPenulis = new javax.swing.JTable();
        txtID = new javax.swing.JLabel();
        hapus = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        penulis = new javax.swing.JMenuItem();
        buku = new javax.swing.JMenuItem();
        keluar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        heading.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        heading.setText("Master Penulis");
        heading.setToolTipText("");

        labelTextBar.setText("Nama Penulis");

        nmPenulis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nmPenulisMouseClicked(evt);
            }
        });

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        tabelPenulis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Title 2"
            }
        ));
        tabelPenulis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPenulisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPenulis);

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        jMenu1.setText("Master");

        penulis.setText("Penulis");
        jMenu1.add(penulis);

        buku.setText("Buku");
        jMenu1.add(buku);

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jMenu1.add(keluar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTextBar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nmPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtID))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hapus))
                    .addComponent(heading))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(heading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTextBar)
                    .addComponent(nmPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(edit)
                    .addComponent(hapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_keluarActionPerformed
    private void penulisActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        new Penulis().setVisible(true);
    }                                       

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        String nama = nmPenulis.getText();
        insertTable(nama);//belum selesai
        showTableData();
    }//GEN-LAST:event_simpanActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        String nama = nmPenulis.getText();
        int id = Integer.parseInt(txtID.getText());
        try{ 
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String sql = "UPDATE penulis SET nama_penulis=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, nama);
            ps.setInt(2, id);
            
            ps.execute();
            stmt.close();
            conn.close();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        showTableData();
    }//GEN-LAST:event_editActionPerformed

    private void tabelPenulisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPenulisMouseClicked
        // TODO add your handling code here:
        getData();
        simpan.setEnabled(false);
        edit.setEnabled(true);
        
        
        
    }//GEN-LAST:event_tabelPenulisMouseClicked

    private void nmPenulisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nmPenulisMouseClicked
        // TODO add your handling code here:
        simpan.setEnabled(true);
    }//GEN-LAST:event_nmPenulisMouseClicked

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtID.getText());
        try{ 
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "DELETE from penulis WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            stmt.close();
            conn.close();
            showTableData();
        }
        catch(Exception e){
             e.printStackTrace();
        }
    }//GEN-LAST:event_hapusActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem buku;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel heading;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem keluar;
    private javax.swing.JLabel labelTextBar;
    private javax.swing.JTextField nmPenulis;
    private javax.swing.JMenuItem penulis;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabelPenulis;
    private javax.swing.JLabel txtID;
    // End of variables declaration//GEN-END:variables
}
