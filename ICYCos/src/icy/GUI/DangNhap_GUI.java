/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package icy.GUI;

import ICY.BUS.DangNhap_BUS;
import ICY.BUS.QLNV_BUS;
import ICY.DTO.DangKyDTO;
import ICY.DTO.QLNV_DTO;
import static icy.GUI.BanHang_GUI.BH;
import static icy.GUI.HoTro_GUI.HT;
import static icy.GUI.KhachHang_GUI.KH;
import static icy.GUI.KhuyenMai_GUI.KM;
import static icy.GUI.NhapHang_GUI.NH;
import static icy.GUI.QLNV_GUI.NV;
import static icy.GUI.SanPham_GUI.SP;
import static icy.GUI.ThongKe_GUI.TK;
import icy.TrangChu_ICY;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Quan Phat Vinh Thanh
 */
public class DangNhap_GUI extends javax.swing.JFrame {

    public static DangNhap_GUI DN = new DangNhap_GUI();
    public static TrangChu_ICY TC = new TrangChu_ICY();
    public static taoMatKhau MK = new taoMatKhau();
    QLNV_BUS busql = new QLNV_BUS();
    public static String txt;
    DangNhap_BUS bus = new DangNhap_BUS();
    DangKyDTO dk = new DangKyDTO();
    DangNhap_BUS busdk = new DangNhap_BUS();
    QLNV_DTO nv = new QLNV_DTO();
    static ArrayList<QLNV_DTO> dsnv = new ArrayList<>();
    static ArrayList<DangKyDTO> dsdk = new ArrayList<>();
    public DangNhap_GUI() {
        initComponents();
        if (QLNV_BUS.dsnv == null) {
            busql.docDSNV();
        }
        DocDuLieu();
    }

    public void DocDuLieu() {
        if (busdk.dsdk == null) {

            busdk.DocDSDN();
        }
    }
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtTaiKhoan = new javax.swing.JTextField();
        btnDangNhap = new javax.swing.JButton();
        btnQuenMK = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 204));

        btnDangNhap.setBackground(new java.awt.Color(255, 204, 255));
        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnQuenMK.setBackground(new java.awt.Color(255, 255, 204));
        btnQuenMK.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnQuenMK.setForeground(new java.awt.Color(255, 153, 153));
        btnQuenMK.setText("Quên mật khẩu ?");
        btnQuenMK.setBorder(null);
        btnQuenMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuenMKActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 255));
        jLabel1.setText("LOGIN NOW");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("User name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Password");

        jButton2.setText("Trở về");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnQuenMK, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(107, 107, 107)
                                            .addComponent(jLabel1))
                                        .addComponent(btnDangNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnQuenMK, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/ICY_Hinh_Dang_Nhap.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        if (txtTaiKhoan.getText().equals("")) {
            btnQuenMK.setVisible(false);
            JOptionPane.showConfirmDialog(null, "Bạn chưa nhập thông tin đăng nhập!!!");
        }
        else if (txtMatKhau.getText().equals("")) {
            btnQuenMK.setVisible(true);
            JOptionPane.showConfirmDialog(null, "Bạn chưa nhập mật khẩu!!!");
        } else if (txtMatKhau.getText().equals("") && txtTaiKhoan.getText().equals("")) {
            btnQuenMK.setVisible(true);
            JOptionPane.showConfirmDialog(null, "Bạn chưa nhập thông tin đăng nhập!!!");
        } else {
            bus.DangNhap(txtTaiKhoan.getText(), txtMatKhau.getText());
            if (bus.test.size() == 0) {
                JOptionPane.showConfirmDialog(null, "Mật khẩu hoặc tên đăng nhập sai,Xin vui lòng kiểm tra lại!!!");
                txtMatKhau.setText("");
            } else {

                if (bus.check(txtTaiKhoan.getText(), txtMatKhau.getText()) == true) {
                    for (QLNV_DTO nv : QLNV_BUS.dsnv) {
                        if (bus.checkTaiKhoan(nv.Ma) == true) {
                            //TrangChu_ICY.TC.setVisible(true);
                            TrangChu_ICY.TC.setTextTenDN(nv.Ten);
                            SP.setTextTenDN(nv.Ten);
                            BH.setTextTenDN(nv.Ten);
                            HT.setTextTenDN(nv.Ten);
                            KH.setTextTenDN(nv.Ten);
                            KM.setTextTenDN(nv.Ten);
                            NH.setTextTenDN(nv.Ten);
                            NV.setTextTenDN(nv.Ten);
                            TK.setTextTenDN(nv.Ten);
                            NH.setTextTenNV(nv.Ten);
                        }
                        txtTaiKhoan.setText("");
                        txtMatKhau.setText("");
                        DN.setVisible(false);
                    }
                }
            }
        }

    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnQuenMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuenMKActionPerformed
        // TODO add your handling code here:

        MK.setVisible(true);
        DN.setVisible(false);
    }//GEN-LAST:event_btnQuenMKActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DN.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnQuenMK;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
