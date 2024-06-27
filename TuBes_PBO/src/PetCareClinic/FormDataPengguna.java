/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PetCareClinic;

/**
 *
 * @author Kelompok 4 S1IF-10-N
 */

import java.io.*;
import java.sql.*;
import java.util.HashMap;
import javax.swing.table.*;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class FormDataPengguna extends javax.swing.JFrame {

    public Statement st;
    public ResultSet rs;
    Connection cn;
    
    public FormDataPengguna() {
        try {
            cn = PetCareClinic.KoneksiDB.koneksiDB();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Connection Error", JOptionPane.ERROR_MESSAGE);
        }
        initComponents();
        TampilData();
    }
    
    private void Bersih(){
        id.setText("");
        nama.setText("");
        jenis.setText("");
        telepon.setText("");
    }
    
    private void TampilData(){
        try{
           st = cn.createStatement();
           rs = st.executeQuery("SELECT * FROM datauser");
           
           DefaultTableModel model = new DefaultTableModel();
           model.addColumn("ID Pengguna");
           model.addColumn("Nama Pengguna");
           model.addColumn("Jenis Hewan");
           model.addColumn("No Telp Pengguna");
           
           model.getDataVector().removeAllElements();
           model.fireTableDataChanged();
           model.setRowCount(0);
           
           while(rs.next()){
               Object[] data = {
                   rs.getString("id"),
                   rs.getString("nama"),
                   rs.getString("jenis"),
                   rs.getString("telepon")
               };
               model.addRow(data);
               
           }
           datauser.setModel(model);
        }catch (Exception e){

        }
    }
    
    private void CetakPDF(){
        try {
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("id_pengguna", id.getText()); 
            String NamaFile = "src/PetCareClinic/DataUser.jasper";
            JasperPrint jasperPrint = JasperFillManager.fillReport(NamaFile, parameters, cn);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Cetak PDF Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void CariData(){
        try{
           st = cn.createStatement();
           rs = st.executeQuery("SELECT * FROM datauser WHERE " + cmbCari.getSelectedItem().toString() + " LIKE '%" + txtCari.getText() + "%'");
           
           DefaultTableModel model = new DefaultTableModel();
           model.addColumn("ID Pengguna");
           model.addColumn("Nama Pengguna");
           model.addColumn("Jenis Hewan");
           model.addColumn("No Telp Pengguna");
           
           model.getDataVector().removeAllElements();
           model.fireTableDataChanged();
           model.setRowCount(0);
           
           while(rs.next()){
               Object[] data = {
                   rs.getString("id"),
                   rs.getString("nama"),
                   rs.getString("jenis"),
                   rs.getString("telepon")
               };
               model.addRow(data);
               
           }
           datauser.setModel(model);
        }catch (Exception e){

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelID = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        labelJenis = new javax.swing.JLabel();
        labelNoTelp = new javax.swing.JLabel();
        jenis = new javax.swing.JTextField();
        telepon = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        cetak = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        datauser = new javax.swing.JTable();
        labelNama1 = new javax.swing.JLabel();
        cmbCari = new javax.swing.JComboBox<>();
        txtCari = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(227, 218, 201));
        jPanel2.setPreferredSize(new java.awt.Dimension(660, 500));

        judul.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul.setText("DATA PENGGUNA");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        labelID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelID.setText("ID Pengguna");

        labelNama.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelNama.setText("Nama Pengguna");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        labelJenis.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelJenis.setText("Jenis Hewan");

        labelNoTelp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelNoTelp.setText("No Telp Pengguna");

        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });

        telepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleponActionPerformed(evt);
            }
        });

        simpan.setBackground(new java.awt.Color(0, 200, 0));
        simpan.setForeground(new java.awt.Color(255, 255, 255));
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(200, 0, 0));
        hapus.setForeground(new java.awt.Color(255, 255, 255));
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        cetak.setText("Cetak");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });

        datauser.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        datauser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Pengguna", "Nama Pengguna", "Jenis Hewan", "No Telp Pengguna"
            }
        ));
        datauser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datauserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(datauser);

        labelNama1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelNama1.setText("Cari Data");

        cmbCari.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nama", "Jenis" }));

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariKeyPressed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(simpan)
                        .addGap(51, 51, 51)
                        .addComponent(ubah))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(labelID)
                            .addGap(44, 44, 44)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(labelNama)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelJenis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelNoTelp)
                        .addGap(18, 18, 18)
                        .addComponent(telepon)))
                .addGap(40, 40, 40))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(hapus)
                .addGap(62, 62, 62)
                .addComponent(cetak)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(labelNama1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(exit)
                .addGap(149, 149, 149)
                .addComponent(judul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refresh)
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh)
                    .addComponent(exit))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelJenis)
                    .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNoTelp)
                    .addComponent(telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(ubah)
                    .addComponent(hapus)
                    .addComponent(cetak))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNama1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisActionPerformed

    private void teleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleponActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        try {
            st = cn.createStatement();
            if (id.getText().equals("") || nama.getText().equals("") || jenis.getText().equals("") || telepon.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            String cek = "SELECT * FROM datauser WHERE id = '" + id.getText() + "'";
            rs = st.executeQuery(cek);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "ID sudah ada");
            } else {
                String sql = "INSERT INTO datauser (id, nama, jenis, telepon) VALUES ('" + id.getText() + "','" + nama.getText() + "','" + jenis.getText() + "','" + telepon.getText() + "')";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                Bersih();
                TampilData();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        try{
            st = cn.createStatement();
            String sql = "UPDATE datauser SET nama = '" + nama.getText() + "', jenis = '" + jenis.getText()+ "', telepon = '" + telepon.getText()+ "' WHERE id = '" + id.getText()+ "'";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog (null, "Data Berhasil Diubah");
            Bersih();
            TampilData();
            id.setEditable(false);
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_ubahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        String idToDelete = id.getText();
        if (idToDelete.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih data yang akan dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            int jawab = JOptionPane.showConfirmDialog (null, "Data ini akan dihapus, lanjutkan?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (jawab == JOptionPane.YES_OPTION) {
                try {
                    st = cn.createStatement();
                    String sql = "DELETE FROM datauser WHERE id = '" + idToDelete + "'";
                    int rowsAffected = st.executeUpdate(sql);
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                        TampilData();
                        Bersih();
                    } else {
                        JOptionPane.showMessageDialog(null, "Data dengan ID tersebut tidak ditemukan", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menghapus data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
        CetakPDF();
    }//GEN-LAST:event_cetakActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        Bersih();
        TampilData();
        id.setEditable(true);
        txtCari.setText("");
    }//GEN-LAST:event_refreshActionPerformed

    private void txtCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyPressed
        CariData();
    }//GEN-LAST:event_txtCariKeyPressed

    private void datauserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datauserMouseClicked
        id.setText(datauser.getValueAt(datauser.getSelectedRow(), 0).toString());
        nama.setText(datauser.getValueAt(datauser.getSelectedRow(), 1).toString());
        jenis.setText(datauser.getValueAt(datauser.getSelectedRow(), 2).toString());
        telepon.setText(datauser.getValueAt(datauser.getSelectedRow(), 3).toString());
        
        id.setEditable(false);
    }//GEN-LAST:event_datauserMouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FormDataPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataPengguna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cetak;
    private javax.swing.JComboBox<String> cmbCari;
    private javax.swing.JTable datauser;
    private javax.swing.JButton exit;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField id;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jenis;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelJenis;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNama1;
    private javax.swing.JLabel labelNoTelp;
    private javax.swing.JTextField nama;
    private javax.swing.JButton refresh;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField telepon;
    private javax.swing.JTextField txtCari;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
