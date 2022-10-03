/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package icy.GUI;

import icy.BUS.ThamSoChung_BUS;
import icy.DTO.ThamSoChung_DTO;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ThamSoChung_GUI extends javax.swing.JFrame {

    public static ThamSoChung_GUI TS = new ThamSoChung_GUI();
    ThamSoChung_BUS bus = new ThamSoChung_BUS();
    DefaultTableModel model = new DefaultTableModel();
    ThamSoChung_DTO ts = new ThamSoChung_DTO();

    /**
     * Creates new form ThamSoChung_GUI
     */
    public ThamSoChung_GUI() {
        initComponents();
        DocTS();
    }

    public void DocTS() {
        if (ThamSoChung_BUS.dsts == null) {
            bus.DocTS();
        }
        Vector hearder = new Vector();
        hearder.add("Tên kho");
        hearder.add("Tên Phiếu nhập");
        hearder.add("Thông tin SP");
        hearder.add("Thông tin PN");
        if (model.getRowCount() == 0) {
            model = new DefaultTableModel(hearder, 0);
        }
        for (ThamSoChung_DTO ts : ThamSoChung_BUS.dsts) {
            Vector row = new Vector();
            row.add(ts.TenKho);
            row.add(ts.TenPN);
            row.add(ts.TTSP);
            row.add(ts.TTPN);
            model.addRow(row);
            tblTS.setModel(model);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTS = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenKho = new javax.swing.JTextField();
        txtTenPN = new javax.swing.JTextField();
        txtTTPN = new javax.swing.JTextField();
        txtTTSP = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tham số chung");
        setBackground(new java.awt.Color(204, 204, 255));

        tblTS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên kho", "Tên phiếu nhập", "Thông tin SP", "Thông tin PN"
            }
        ));
        tblTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTS);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 102));
        jLabel1.setText("Tham số chung");

        jLabel2.setText("Tên kho");

        jLabel3.setText("Tên Phiếu nhập");

        jLabel4.setText("Thông tin SP");

        jLabel5.setText("Thông tin PN");

        btnSua.setBackground(new java.awt.Color(153, 153, 153));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTenKho)
                                    .addComponent(txtTenPN, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTTPN)
                                    .addComponent(txtTTSP, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtTenKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTTSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txtTenPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTTPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTSMouseClicked
        int i = tblTS.getSelectedRow();
        if (i >= 0) {
            ThamSoChung_DTO ts = new ThamSoChung_DTO();
            ts = bus.dsts.get(i);
            txtTenKho.setText(ts.TenKho);
            txtTenPN.setText(ts.TenPN);
            txtTTSP.setText(ts.TTSP);
            txtTTPN.setText(ts.TTPN);
        }
    }//GEN-LAST:event_tblTSMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (tblTS.getSelectedRow() >= 0) {
            ts.TenKho = txtTenKho.getText();
            ts.TenPN = txtTenPN.getText();
            ts.TTSP = txtTTSP.getText();
            ts.TTPN = txtTTPN.getText();
            bus.sua(ts);
            //cap nhập dssv
            model.setValueAt(ts.TenKho, tblTS.getSelectedRow(), 0);
            model.setValueAt(ts.TenPN, tblTS.getSelectedRow(), 1);
            model.setValueAt(ts.TTSP, tblTS.getSelectedRow(), 2);
            model.setValueAt(ts.TTPN, tblTS.getSelectedRow(), 3);
            tblTS.setModel(model);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

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
            java.util.logging.Logger.getLogger(ThamSoChung_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThamSoChung_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThamSoChung_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThamSoChung_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TS.setVisible(true);
                TS.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTS;
    private javax.swing.JTextField txtTTPN;
    private javax.swing.JTextField txtTTSP;
    private javax.swing.JTextField txtTenKho;
    private javax.swing.JTextField txtTenPN;
    // End of variables declaration//GEN-END:variables
}
