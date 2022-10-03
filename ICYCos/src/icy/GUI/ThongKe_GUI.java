/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package icy.GUI;

import ICY.BUS.QLNV_BUS;
import ICY.DTO.QLNV_DTO;
import icy.*;
import icy.BUS.DoanhThu_BUS;
import icy.BUS.HoaDon_BUS;
import icy.BUS.KhachHang_BUS;
import icy.BUS.SanPham_BUS;
import icy.DTO.HoaDon_DTO;
import static icy.GUI.BanHang_GUI.BH;
import static icy.GUI.DangNhap_GUI.DN;
import static icy.GUI.DoanhThu_GUI.DT;
import static icy.GUI.HoSoNV_GUI.HS;
import icy.GUI.HoTro_GUI;
import static icy.GUI.HuongDan_GUI.HD;
import static icy.GUI.KhachHang_GUI.KH;
import static icy.GUI.KhuyenMai_GUI.KM;
import icy.GUI.NhapHang_GUI;
import static icy.GUI.QLNV_GUI.NV;
import icy.GUI.SanPham_GUI;
import static icy.GUI.TKKhachHang_GUI.TKKH;
import static icy.GUI.TKNV.tknv;
import static icy.GUI.TKSP_GUI.TKSP;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ThongKe_GUI extends javax.swing.JFrame {
    public static ThongKe_GUI TK=new ThongKe_GUI();
    SanPham_BUS bussp=new SanPham_BUS();
    KhachHang_BUS buskh = new KhachHang_BUS();
    QLNV_BUS busnv = new QLNV_BUS();
    SanPham_GUI sp=new SanPham_GUI();
    static NhapHang_GUI nh=new NhapHang_GUI();
    static HoTro_GUI ht=new HoTro_GUI();
    DoanhThu_BUS bus = new DoanhThu_BUS();
    public ThongKe_GUI() {
        initComponents();
        try {
            TK.btnThongKe.setSelected(true);
        } catch (Exception ex) {
        }
        docThongKe();
    }
    public void docThongKe(){
        if(KhachHang_BUS.dskh == null) buskh.DocDSKH();
        if(QLNV_BUS.dsnv == null) busnv.docDSNV();
        btnSLSP.setText(String.valueOf(bussp.dssp.size()) + " Sản phẩm");
        btnSLNV.setText(String.valueOf(busnv.dsnv.size()) + " Nhân viên");
        btnSLKH.setText(String.valueOf(buskh.dskh.size()) + " Khách hàng");
        if (DoanhThu_BUS.dsdt == null) {
            bus.DocDSDT();
        }
        Float sum1=0f;
        Float sum2=0f;
        Float sum3=0f;
        Float sum4=0f;
        for (HoaDon_DTO dt : DoanhThu_BUS.dsdt) {
            if (dt.NgayLap.substring(5, 7).equals("01") 
                || dt.NgayLap.substring(5, 7).equals("02")
                || dt.NgayLap.substring(5, 7).equals("03")) {
                sum1 = sum1 + Float.parseFloat(dt.TongTien);
            }
            if (dt.NgayLap.substring(5, 7).equals("04") 
                || dt.NgayLap.substring(5, 7).equals("05")
                || dt.NgayLap.substring(5, 7).equals("06")) {
                sum2 = sum2 + Float.parseFloat(dt.TongTien);
            }
            if (dt.NgayLap.substring(5, 7).equals("07") 
                || dt.NgayLap.substring(5, 7).equals("08")
                || dt.NgayLap.substring(5, 7).equals("09")) {
                sum3 = sum3 + Float.parseFloat(dt.TongTien);
            }
            if (dt.NgayLap.substring(5, 7).equals("10") 
                || dt.NgayLap.substring(5, 7).equals("11")
                || dt.NgayLap.substring(5, 7).equals("12")) {
                sum4 = sum4 + Float.parseFloat(dt.TongTien);
            }
        }
        txtQ1.setText(String.valueOf(sum1));
        txtQ2.setText(String.valueOf(sum2));
        txtQ3.setText(String.valueOf(sum3));
        txtQ4.setText(String.valueOf(sum4));
        txtTong.setText(String.valueOf(sum1+sum2+sum3+sum4));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jOptionPane1 = new javax.swing.JOptionPane();
        btnSLSP2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnDangNhap = new javax.swing.JToggleButton();
        btnSanPham = new javax.swing.JToggleButton();
        btnkhuyenMai = new javax.swing.JToggleButton();
        btnNhanVien = new javax.swing.JToggleButton();
        btnKhachHang = new javax.swing.JToggleButton();
        btnDonHang = new javax.swing.JToggleButton();
        btnNhapHang = new javax.swing.JToggleButton();
        btnThongKe = new javax.swing.JToggleButton();
        btnDoanhThu = new javax.swing.JToggleButton();
        btnHoTro = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        btnThoat = new javax.swing.JButton();
        btnLienHe = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnSLSP = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSLKH = new javax.swing.JButton();
        btnSLNV = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtQ1 = new javax.swing.JLabel();
        txtQ2 = new javax.swing.JLabel();
        txtQ3 = new javax.swing.JLabel();
        txtQ4 = new javax.swing.JLabel();
        txtTong = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        btnSLSP2.setBackground(new java.awt.Color(204, 204, 255));
        btnSLSP2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        btnSLSP2.setForeground(new java.awt.Color(255, 153, 153));
        btnSLSP2.setText("SL Sản phẩm");
        btnSLSP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSLSP2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ THỐNG QUẢN LÝ CỬA HÀNG MỸ PHẨM");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/HinhAnhICY.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/SLogan_ICY.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(197, 223, 234));

        btnDangNhap.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnDangNhap);
        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/NguoiDung.png"))); // NOI18N
        btnDangNhap.setText(" Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnSanPham.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnSanPham);
        btnSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/SanPham.png"))); // NOI18N
        btnSanPham.setText("Sản phẩm");
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });

        btnkhuyenMai.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnkhuyenMai);
        btnkhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnkhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/KhuyenMai.png"))); // NOI18N
        btnkhuyenMai.setText("   Khuyến mãi");
        btnkhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkhuyenMaiActionPerformed(evt);
            }
        });

        btnNhanVien.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnNhanVien);
        btnNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/NhanVien.png"))); // NOI18N
        btnNhanVien.setText("Nhân viên");
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnKhachHang.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnKhachHang);
        btnKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/KhachHang.png"))); // NOI18N
        btnKhachHang.setText("  Khách hàng");
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });

        btnDonHang.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnDonHang);
        btnDonHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDonHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/DonHang.png"))); // NOI18N
        btnDonHang.setText("Đơn hàng");
        btnDonHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonHangActionPerformed(evt);
            }
        });

        btnNhapHang.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnNhapHang);
        btnNhapHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/NhapHang.png"))); // NOI18N
        btnNhapHang.setText(" Nhập hàng");
        btnNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapHangActionPerformed(evt);
            }
        });

        btnThongKe.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnThongKe);
        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/ThongKe.gif"))); // NOI18N
        btnThongKe.setText("Thống kê");

        btnDoanhThu.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnDoanhThu);
        btnDoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/DoanhThu.png"))); // NOI18N
        btnDoanhThu.setText(" Doanh thu");
        btnDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoanhThuActionPerformed(evt);
            }
        });

        btnHoTro.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnHoTro);
        btnHoTro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHoTro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/HoTro.png"))); // NOI18N
        btnHoTro.setText("Hỗ trợ");
        btnHoTro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoTroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnkhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(btnDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHoTro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnkhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnHoTro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(197, 223, 234));

        btnThoat.setBackground(new java.awt.Color(204, 204, 204));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnLienHe.setBackground(new java.awt.Color(204, 204, 204));
        btnLienHe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLienHe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/LienHe.png"))); // NOI18N
        btnLienHe.setText("Liên hệ");
        btnLienHe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLienHeActionPerformed(evt);
            }
        });

        btnHuongDan.setBackground(new java.awt.Color(204, 204, 204));
        btnHuongDan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/HuongDan.png"))); // NOI18N
        btnHuongDan.setText("Hướng dẫn");
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHuongDan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLienHe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThoat)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThoat)
                    .addComponent(btnLienHe)
                    .addComponent(btnHuongDan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));

        btnSLSP.setBackground(new java.awt.Color(255, 255, 204));
        btnSLSP.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnSLSP.setForeground(new java.awt.Color(255, 153, 153));
        btnSLSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/SanPham.png"))); // NOI18N
        btnSLSP.setText("SL Sản phẩm");
        btnSLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSLSPActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("ICY THỐNG KÊ");

        btnSLKH.setBackground(new java.awt.Color(255, 255, 204));
        btnSLKH.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnSLKH.setForeground(new java.awt.Color(255, 153, 153));
        btnSLKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/KhachHang.png"))); // NOI18N
        btnSLKH.setText("SL Khách hàng");
        btnSLKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSLKHActionPerformed(evt);
            }
        });

        btnSLNV.setBackground(new java.awt.Color(255, 255, 204));
        btnSLNV.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnSLNV.setForeground(new java.awt.Color(255, 153, 153));
        btnSLNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/NhanVien.png"))); // NOI18N
        btnSLNV.setText("SL Nhân viên");
        btnSLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSLNVActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 153));
        jLabel4.setText("QUÝ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 153));
        jLabel5.setText("Doang thu");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 153));
        jLabel6.setText("Tổng");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 153));
        jLabel7.setText("Quý 1");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 153));
        jLabel8.setText("Quý 2");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 153));
        jLabel9.setText("Quý 3");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 153));
        jLabel10.setText("Quý 4");

        txtQ1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtQ1.setText("1");

        txtQ2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtQ2.setText("2");

        txtQ3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtQ3.setText("3");

        txtQ4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtQ4.setText("4");

        txtTong.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTong.setText("Tong");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnSLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnSLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btnSLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jLabel2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtQ1))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtQ2))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(txtQ3)))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQ4)
                                    .addComponent(jLabel10)))
                            .addComponent(txtTong))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtQ1)
                    .addComponent(txtQ2)
                    .addComponent(txtQ3)
                    .addComponent(txtQ4))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTong))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        if (btnDangNhap.getText().equals(" Đăng nhập")) {
            DN.setVisible(true);
            DN.setLocationRelativeTo(null);
        } else {
            HS.setVisible(true);
            HS.setLocationRelativeTo(null);
        }
        QLNV_BUS busnv = new QLNV_BUS();
        for (QLNV_DTO nv : busnv.dsnv) {
            if (btnDangNhap.getText().equals(nv.Ten)) {
                HS.setTextHo(nv.Ho);

                HS.setTextTen(nv.Ten);
                HS.setTextGT(nv.GioiTinh);
                HS.setTextMaNV(nv.Ma);
                HS.setTextChucVu(nv.ChucVu);
                HS.setTextAnh(nv.anh);
            }
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed
public boolean checkQuyenQLGD() {
        for (QLNV_DTO nv : QLNV_BUS.dsnv) {
            if (btnDangNhap.getText().equals(nv.Ten)) {
                if (nv.ChucVu.equals("Quản lý") || nv.ChucVu.equals("Giám đốc")) {
                    return true;
                }
            }
        }
        return false;
    }
    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập")) {
            if (btnSanPham.isSelected() == true) {
                TK.setVisible(false);
                sp.SP.setVisible(true);
                sp.SP.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapHangActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập") && checkQuyenQLGD() == true) {
            if (btnNhapHang.isSelected() == true) {
                TK.setVisible(false);
                nh.NH.setVisible(true);
                nh.NH.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnNhapHangActionPerformed

    private void btnHoTroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoTroActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập")) {
            if (btnHoTro.isSelected() == true) {
                TK.setVisible(false);
                ht.HT.setVisible(true);
                ht.HT.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnHoTroActionPerformed
    
    private void btnSLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSLSPActionPerformed
        TKSP.setVisible(true);
        TKSP.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSLSPActionPerformed

    private void btnSLKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSLKHActionPerformed
        TKKH.setVisible(true);
        TKKH.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSLKHActionPerformed

    private void btnSLSP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSLSP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSLSP2ActionPerformed

    private void btnSLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSLNVActionPerformed
        tknv.setVisible(true);
        tknv.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSLNVActionPerformed

    private void btnkhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhuyenMaiActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập")) {
            if (btnkhuyenMai.isSelected() == true) {
                TK.setVisible(false);
                KM.setVisible(true);
                KM.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnkhuyenMaiActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập")) {
            if (btnKhachHang.isSelected() == true) {
                TK.setVisible(false);
                KH.setVisible(true);
                KH.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoanhThuActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập") && checkQuyenQLGD() == true) {
            if (btnDoanhThu.isSelected() == true) {
                DT.setVisible(true);
                DT.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnDoanhThuActionPerformed

    private void btnLienHeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLienHeActionPerformed
        JOptionPane.showMessageDialog(this,"Bạn vui lòng chọn chức năng hỗ trợ để liên hệ!");
    }//GEN-LAST:event_btnLienHeActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        TK.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
         if(btnHuongDan.isSelected()==true){
            HD.setVisible(true);
            HD.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnHuongDanActionPerformed

    private void btnDonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonHangActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập")) {
            if (btnDonHang.isSelected() == true) {
                TK.setVisible(false);
                BH.setVisible(true);
                BH.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnDonHangActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập") && checkQuyenQLGD() == true) {
            if (btnNhanVien.isSelected() == true) {
                TK.setVisible(false);
                NV.setVisible(true);
                NV.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnNhanVienActionPerformed
    public void HienSL(){
        if (SanPham_BUS.dssp == null) {
            sp.bus.DocSP();
        }
        btnSLSP.setText(String.valueOf(SanPham_BUS.dssp.size())+" Sản phẩm");
    }
    public void setTextTenDN(String s){
        btnDangNhap.setText(s);
    }
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
            java.util.logging.Logger.getLogger(ThongKe_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKe_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKe_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKe_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TK.setVisible(true);
                TK.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDangNhap;
    private javax.swing.JToggleButton btnDoanhThu;
    private javax.swing.JToggleButton btnDonHang;
    private javax.swing.JToggleButton btnHoTro;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JToggleButton btnKhachHang;
    private javax.swing.JButton btnLienHe;
    private javax.swing.JToggleButton btnNhanVien;
    private javax.swing.JToggleButton btnNhapHang;
    private javax.swing.JButton btnSLKH;
    private javax.swing.JButton btnSLNV;
    private javax.swing.JButton btnSLSP;
    private javax.swing.JButton btnSLSP2;
    private javax.swing.JToggleButton btnSanPham;
    private javax.swing.JButton btnThoat;
    private javax.swing.JToggleButton btnThongKe;
    private javax.swing.JToggleButton btnkhuyenMai;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txtQ1;
    private javax.swing.JLabel txtQ2;
    private javax.swing.JLabel txtQ3;
    private javax.swing.JLabel txtQ4;
    private javax.swing.JLabel txtTong;
    // End of variables declaration//GEN-END:variables
}
