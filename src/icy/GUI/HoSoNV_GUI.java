/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package icy.GUI;

import ICY.BUS.DangNhap_BUS;
import ICY.BUS.QLNV_BUS;
import static icy.GUI.BanHang_GUI.BH;
import icy.GUI.DangNhap_GUI;
import static icy.GUI.HoTro_GUI.HT;
import static icy.GUI.KhachHang_GUI.KH;
import static icy.GUI.KhuyenMai_GUI.KM;
import static icy.GUI.NhapHang_GUI.NH;
import static icy.GUI.QLNV_GUI.NV;
import static icy.GUI.SanPham_GUI.SP;
import static icy.GUI.ThongKe_GUI.TK;
import icy.TrangChu_ICY;
import static icy.TrangChu_ICY.TC;

/**
 *
 * @author Quan Phat Vinh Thanh
 */
public class HoSoNV_GUI extends javax.swing.JFrame {

   QLNV_BUS qlnv = new QLNV_BUS();
    QLNV_GUI gui = new QLNV_GUI();
   public static TrangChu_ICY tc = new TrangChu_ICY();
    DangNhap_BUS qldn = new DangNhap_BUS();
    public static HoSoNV_GUI HS = new HoSoNV_GUI();
   public static DangNhap_GUI dn = new DangNhap_GUI();

    /**
     * Creates new form HoSoNV_GUI
     */
    public HoSoNV_GUI() {
        initComponents();
        qldn.DocDSDN();
        qldn.DocDSDN();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbAnh = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbMaNV = new javax.swing.JLabel();
        lbHo = new javax.swing.JLabel();
        lbGT = new javax.swing.JLabel();
        lbChucVu = new javax.swing.JLabel();
        btnDangXua = new javax.swing.JButton();
        btnPF = new javax.swing.JButton();
        btnTroVe1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbTen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Mã nhân viên");

        jLabel2.setText("Họ ");

        jLabel3.setText("Giới tính");

        jLabel4.setText("Chức vụ");

        btnDangXua.setBackground(new java.awt.Color(255, 153, 153));
        btnDangXua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangXua.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXua.setText("Đăng xuất");
        btnDangXua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuaActionPerformed(evt);
            }
        });

        btnPF.setBackground(new java.awt.Color(255, 153, 153));
        btnPF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPF.setForeground(new java.awt.Color(255, 255, 255));
        btnPF.setText("In Profile");
        btnPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPFActionPerformed(evt);
            }
        });

        btnTroVe1.setBackground(new java.awt.Color(255, 153, 153));
        btnTroVe1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTroVe1.setForeground(new java.awt.Color(255, 255, 255));
        btnTroVe1.setText("Trở về");
        btnTroVe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroVe1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Tên");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbHo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbTen, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                .addComponent(lbGT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTroVe1)
                        .addGap(26, 26, 26)
                        .addComponent(btnPF)
                        .addGap(27, 27, 27)
                        .addComponent(btnDangXua)
                        .addGap(66, 66, 66))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lbMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(lbHo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbTen, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbGT, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangXua)
                    .addComponent(btnPF)
                    .addComponent(btnTroVe1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void setTextMaNV(String s) {
        lbMaNV.setText(s);
    }

    public void setTextHo(String s) {
        lbHo.setText(s);
    }

    public void setTextTen(String s) {
        lbTen.setText(s);
    }

    public void setTextChucVu(String s) {
        lbChucVu.setText(s);
    }

    public void setTextGT(String s) {
        lbGT.setText(s);
    }

    public void setTextAnh(String s) {
        //lbAnh.setIcon(String.valueOf(s));
        lbAnh.setIcon(gui.ResizeImage(String.valueOf(s)));
    }

    private void btnTroVe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroVe1ActionPerformed
        HS.setVisible(false);


    }//GEN-LAST:event_btnTroVe1ActionPerformed

    private void btnDangXuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuaActionPerformed
        HS.setVisible(false);
        TC.setTextTenDN(" Đăng nhập");
        SP.setTextTenDN(" Đăng nhập");
        BH.setTextTenDN(" Đăng nhập");
        HT.setTextTenDN(" Đăng nhập");
        KH.setTextTenDN(" Đăng nhập");
        KM.setTextTenDN(" Đăng nhập");
        NH.setTextTenDN(" Đăng nhập");
        NV.setTextTenDN(" Đăng nhập");
        TK.setTextTenDN(" Đăng nhập");
        TC.setVisible(true);
        SP.setVisible(false);
        BH.setVisible(false);
        HT.setVisible(false);
        KH.setVisible(false);
        KM.setVisible(false);
        NH.setVisible(false);
        NV.setVisible(false);
        TK.setVisible(false);
    }//GEN-LAST:event_btnDangXuaActionPerformed

    private void btnPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPFActionPerformed

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
            java.util.logging.Logger.getLogger(HoSoNV_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoSoNV_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoSoNV_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoSoNV_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoSoNV_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXua;
    private javax.swing.JButton btnPF;
    private javax.swing.JButton btnTroVe1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lbAnh;
    private javax.swing.JLabel lbChucVu;
    private javax.swing.JLabel lbGT;
    private javax.swing.JLabel lbHo;
    private javax.swing.JLabel lbMaNV;
    private javax.swing.JLabel lbTen;
    // End of variables declaration//GEN-END:variables
}
