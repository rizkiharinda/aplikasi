import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class buku extends javax.swing.JFrame {

    private Connection con;
    private Statement stat;
    private ResultSet res;
    
    public buku() {
        initComponents();
        setLocationRelativeTo(null);
        loadData();
    }
    
    private void loadData(){
    DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Buku");
        model.addColumn("Judul Buku");
        model.addColumn("Jenis Buku");
        model.addColumn("Penerbit");
        model.addColumn("Pengarang");
        model.addColumn("Tahun");
        
        try{
            String sql = "select * from buku";
            java.sql.Connection conn = (Connection) koneksi2.koneksiDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while (res.next()){
                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
            }
            table_buku.setModel(model);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_tahun = new javax.swing.JTextField();
        txt_idbuku = new javax.swing.JTextField();
        txt_judul = new javax.swing.JTextField();
        txt_jenis = new javax.swing.JTextField();
        txt_penerbit = new javax.swing.JTextField();
        txt_pengarang = new javax.swing.JTextField();
        btn_hapus = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_buku = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel1.setText("DAFTAR BUKU PERPUSTAKAAN");

        jButton1.setText("Kembali ke Menu Utama");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(289, 289, 289))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 100));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Data Buku"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Tahun");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel3.setText("ID Buku");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel4.setText("Judul");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel5.setText("Jenis");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel6.setText("Penerbit");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel7.setText("Pengarang");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txt_tahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tahunActionPerformed(evt);
            }
        });
        jPanel2.add(txt_tahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 170, -1));

        txt_idbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idbukuActionPerformed(evt);
            }
        });
        jPanel2.add(txt_idbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 170, -1));

        txt_judul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_judulActionPerformed(evt);
            }
        });
        jPanel2.add(txt_judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 170, -1));

        txt_jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jenisActionPerformed(evt);
            }
        });
        jPanel2.add(txt_jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 170, -1));

        txt_penerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_penerbitActionPerformed(evt);
            }
        });
        jPanel2.add(txt_penerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 170, -1));

        txt_pengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pengarangActionPerformed(evt);
            }
        });
        jPanel2.add(txt_pengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 170, -1));

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel2.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        jPanel2.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel2.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Cari Buku"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, -1));

        jLabel8.setText("ID Buku");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jButton4.setText("OK");
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 50, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 250, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 290, 320));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Buku"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_buku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_bukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_buku);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 500, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 520, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tahunActionPerformed

    private void txt_idbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idbukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idbukuActionPerformed

    private void txt_judulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_judulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_judulActionPerformed

    private void txt_jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jenisActionPerformed

    private void txt_penerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_penerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_penerbitActionPerformed

    private void txt_pengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pengarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pengarangActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        try{
            String sql="INSERT INTO buku (id_buku,nama_buku,jenis_buku,penerbit,pengarang,tahun_terbit)VALUES('"+txt_idbuku.getText()+"','"+txt_judul.getText()+"','"+txt_jenis.getText()+"','"+txt_penerbit.getText()+"','"+txt_pengarang.getText()+"','"+txt_tahun.getText()+"')";
            java.sql.Connection conn = (Connection) koneksi2.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Buku berhasil disimpan");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        loadData();
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        try{
                    String sql = "UPDATE buku SET id_buku='"+txt_idbuku.getText()+"', nama_buku = '"+ txt_judul.getText()+"', jenis_buku = '"+txt_jenis.getText()+"', penerbit = '"+txt_penerbit.getText()+"', pengarang = '"+txt_pengarang.getText()+"', tahun_terbit = '"+txt_tahun.getText()+"'where id_buku = '"+txt_idbuku.getText()+"'";
                    java.sql.Connection conn = (Connection) koneksi2.koneksiDB();
                    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                    pst.execute();
                    JOptionPane.showMessageDialog(null,"Data buku berhasil di-update");
                    
                    }catch (Exception e){
                    JOptionPane.showMessageDialog(null,e.getMessage());
                 }
                 loadData();
    }//GEN-LAST:event_btn_editActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new utama().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
         try{
            String sql="DELETE from buku WHERE id_buku="+txt_idbuku.getText();
            java.sql.Connection conn = (Connection) koneksi2.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data berhasil dihapus");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        loadData();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void table_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_bukuMouseClicked
       int baris = table_buku.rowAtPoint(evt.getPoint());
       String id_buku = table_buku.getValueAt(baris, 0).toString();
       txt_idbuku.setText(id_buku);
       String judul = table_buku.getValueAt(baris, 1).toString();
       txt_judul.setText(judul);
       String jenis = table_buku.getValueAt(baris, 2).toString();
       txt_jenis.setText(jenis);
       String penerbit = table_buku.getValueAt(baris, 3).toString();
       txt_penerbit.setText(penerbit);
       String pengarang = table_buku.getValueAt(baris, 4).toString();
       txt_pengarang.setText(pengarang);
       String tahun = table_buku.getValueAt(baris, 5).toString();
       txt_tahun.setText(tahun);
    }//GEN-LAST:event_table_bukuMouseClicked

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
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable table_buku;
    private javax.swing.JTextField txt_idbuku;
    private javax.swing.JTextField txt_jenis;
    private javax.swing.JTextField txt_judul;
    private javax.swing.JTextField txt_penerbit;
    private javax.swing.JTextField txt_pengarang;
    private javax.swing.JTextField txt_tahun;
    // End of variables declaration//GEN-END:variables
}
