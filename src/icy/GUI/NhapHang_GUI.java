/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package icy.GUI;

import ICY.BUS.QLNV_BUS;
import ICY.DTO.QLNV_DTO;
import icy.*;
import icy.BUS.ChiTietPhieuNhap_BUS;
import icy.BUS.NhaCungCap_BUS;
import icy.BUS.NhapHang_BUS;
import icy.BUS.PhieuNhap_BUS;
import icy.BUS.ThamSoChung_BUS;
import icy.DTO.ChiTietPhieuNhap_DTO;
import icy.DTO.NhaCungCap_DTO;
import icy.DTO.NhapHang_DTO;
import icy.DTO.PhieuNhap_DTO;
import icy.DTO.ThamSoChung_DTO;
import static icy.GUI.BanHang_GUI.BH;
import static icy.GUI.DangNhap_GUI.DN;
import static icy.GUI.DoanhThu_GUI.DT;
import static icy.GUI.HoSoNV_GUI.HS;
import static icy.GUI.HuongDan_GUI.HD;
import static icy.GUI.KhachHang_GUI.KH;
import static icy.GUI.KhuyenMai_GUI.KM;
import static icy.GUI.QLNV_GUI.NV;
import icy.GUI.SanPham_GUI;
import static icy.GUI.ThongKe_GUI.TK;
import static icy.TrangChu_ICY.TC;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.time.LocalTime;
/**
 *
 * @author HP
 */
public class NhapHang_GUI extends javax.swing.JFrame {
    DefaultTableModel modelKho=new DefaultTableModel();
    public static NhapHang_GUI NH=new NhapHang_GUI();
    NhapHang_BUS bus=new NhapHang_BUS();
    NhapHang_DTO sptk=new NhapHang_DTO();
    ChiTietPhieuNhap_BUS busPN=new ChiTietPhieuNhap_BUS();
    ChiTietPhieuNhap_DTO pn = new ChiTietPhieuNhap_DTO();
    DefaultTableModel modelPN=new DefaultTableModel();
    DefaultTableModel modelCTPN=new DefaultTableModel();
    DefaultTableModel modelPNH=new DefaultTableModel();
    PhieuNhap_BUS busPNH = new PhieuNhap_BUS();
    PhieuNhap_DTO pnh = new PhieuNhap_DTO();
    static NhaCungCap_GUI ncc_gui=new NhaCungCap_GUI();
    int d=0;//Biến dùng để khi nhập hàng sẽ tự động tăng lên (Mã PN) trong đó các spham nhập sẽ có cùng MãPN
    static int x=PhieuNhap_BUS.dspnh.size()+1;//Biến dùng gán Mã PN trong ds sản phẩm khi nhập
    static SanPham_GUI sp=new SanPham_GUI();
    static HoTro_GUI ht=new HoTro_GUI();
    public NhapHang_GUI() {
        initComponents();
        DocKho();
        DocCTPhieuNhap();
        DocPhieuNhapHang();
        try{
            btnNhapHang.setSelected(true);
        }catch(Exception ex){
        }
        DocTS();
    }
    public void DocTS(){
        ThamSoChung_BUS b = new ThamSoChung_BUS();
        ThamSoChung_DTO ts = new ThamSoChung_DTO();
        if(ThamSoChung_BUS.dsts==null){
            b.DocTS();
        }
        ts=b.dsts.get(0);
        lbKho.setText(ts.TenKho);
        lbPN.setText(ts.TenPN);
        lbTTSP.setText(ts.TTSP);
        lbTTPN.setText(ts.TTPN);
    }
    /*======================================KHO Hàng==================================*/
    public void DocKho(){
        if (NhapHang_BUS.dstk == null) {
            bus.DocSPTonKho();
        }
        //cập nhật Jtable
        Vector header = new Vector();
        header.add("Mã SP");//tên cột table
        header.add("Tên SP");
        header.add("Số lượng");
        header.add("Hình ảnh");
        if (modelKho.getRowCount() == 0) {
            modelKho = new DefaultTableModel(header, 0);
        }
        for (NhapHang_DTO sptk : NhapHang_BUS.dstk) {
            //nạp dữ liệu cho mỗi row
            Vector row = new Vector();
            row.add(sptk.MaSP);
            row.add(sptk.TenSP);
            row.add(sptk.SoLuong);
            row.add(sptk.HinhAnh);
            modelKho.addRow(row); //thêm row dữ liệu vào model
            tblKhoHang.setModel(modelKho);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        lbKho = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhoHang = new javax.swing.JTable();
        lbTTSP = new javax.swing.JLabel();
        lbelAnh = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        lbPN = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPhieuNhap = new javax.swing.JTable();
        lbTTPN = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNhaCungCap = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNhanVienPhuTrach = new javax.swing.JTextField();
        tbnXoa = new javax.swing.JButton();
        btnNhap = new javax.swing.JButton();
        btnNhaCungCap = new javax.swing.JButton();
        btnCapNhap = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtTongPhiNhap = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtMaPN = new javax.swing.JTextField();
        txtMaNCC = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        txtNgayLap = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPNH = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbleChiTietPN = new javax.swing.JTable();
        lbelAnhCTPN = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtMaSanPham = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtTenSanPham = new javax.swing.JTextField();
        txtSoLuongNhap = new javax.swing.JTextField();
        txtDonGiaNhap = new javax.swing.JTextField();
        txtThanhTien = new javax.swing.JTextField();
        btnCapNhapCTPN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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

        btnThongKe.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnThongKe);
        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/ThongKe.gif"))); // NOI18N
        btnThongKe.setText("Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

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

        lbKho.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbKho.setText("Kho hàng");

        tblKhoHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Số lượng", "Hình ảnh"
            }
        ));
        tblKhoHang.setGridColor(new java.awt.Color(255, 204, 204));
        tblKhoHang.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tblKhoHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhoHang);

        lbTTSP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTTSP.setText("Thông tin sản phẩm");

        lbelAnh.setText("           Hình ảnh");
        lbelAnh.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Mã SP");

        txtMaSP.setEditable(false);

        jLabel6.setText("Tên SP");

        txtTenSP.setEditable(false);

        jLabel7.setText("Số lượng nhập");

        txtSoLuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSoLuongKeyPressed(evt);
            }
        });

        jLabel8.setText("Đơn giá");

        btnThem.setBackground(new java.awt.Color(204, 204, 204));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setText("Thêm vào phiếu nhập");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        lbPN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPN.setText("Phiếu nhập hàng");

        tblPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã PN", "Mã SP", "Tên SP", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        tblPhieuNhap.setGridColor(new java.awt.Color(255, 204, 204));
        tblPhieuNhap.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tblPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhieuNhapMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblPhieuNhap);

        lbTTPN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTTPN.setText("Thông tin phiếu nhập");

        jLabel11.setText("Nhà cung cấp");

        txtNhaCungCap.setEditable(false);

        jLabel12.setText("Nhân viên phụ trách");

        txtNhanVienPhuTrach.setEditable(false);

        tbnXoa.setBackground(new java.awt.Color(204, 204, 204));
        tbnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbnXoa.setText("Xóa");
        tbnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnXoaActionPerformed(evt);
            }
        });

        btnNhap.setBackground(new java.awt.Color(204, 204, 204));
        btnNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNhap.setText("Nhập hàng");
        btnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapActionPerformed(evt);
            }
        });

        btnNhaCungCap.setBackground(new java.awt.Color(204, 204, 204));
        btnNhaCungCap.setText("...");
        btnNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhaCungCapActionPerformed(evt);
            }
        });

        btnCapNhap.setBackground(new java.awt.Color(204, 204, 204));
        btnCapNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCapNhap.setText("Cập nhập");
        btnCapNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhapActionPerformed(evt);
            }
        });

        jLabel13.setText("Tổng phí nhập");

        txtTongPhiNhap.setEditable(false);

        btnSua.setBackground(new java.awt.Color(204, 204, 204));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnCapNhap)
                        .addGap(184, 184, 184)
                        .addComponent(lbKho))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTTSP)
                        .addGap(120, 120, 120))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbelAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(16, 16, 16)))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTenSP, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(txtMaSP)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(txtDonGia)))
                            .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(27, Short.MAX_VALUE))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(lbPN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTTPN)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTongPhiNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(tbnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(btnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNhanVienPhuTrach)
                            .addComponent(txtNhaCungCap))
                        .addGap(18, 18, 18)
                        .addComponent(btnNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbKho)
                        .addComponent(lbTTSP))
                    .addComponent(btnCapNhap, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbelAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(btnThem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(lbPN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbTTPN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNhaCungCap))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNhanVienPhuTrach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtTongPhiNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNhap)
                            .addComponent(tbnXoa)
                            .addComponent(btnSua))
                        .addGap(27, 27, 27))))
        );

        jTabbedPane1.addTab("Nhập hàng", jPanel6);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Phiếu nhập");

        jLabel15.setText("Mã PN");

        jLabel16.setText("NCC");

        jLabel17.setText("NV PTrách");

        jLabel18.setText("Ngày lập");

        jLabel19.setText("Tổng tiền");

        txtMaPN.setEditable(false);

        txtMaNCC.setEditable(false);

        txtMaNV.setEditable(false);

        txtNgayLap.setEditable(false);

        txtTongTien.setEditable(false);

        tblPNH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã PN", "Ngày lập", "Tổng tiền"
            }
        ));
        tblPNH.setGridColor(new java.awt.Color(255, 204, 204));
        tblPNH.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tblPNH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPNHMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblPNH);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("Chi tiết phiếu nhập hàng");

        tbleChiTietPN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã PN", "Mã SP", "Tên SP", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        tbleChiTietPN.setGridColor(new java.awt.Color(255, 204, 204));
        tbleChiTietPN.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tbleChiTietPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbleChiTietPNMouseClicked(evt);
                CTPNKhiLocPhieuNhap(evt);
            }
        });
        jScrollPane5.setViewportView(tbleChiTietPN);

        lbelAnhCTPN.setText("                   Hình ảnh");
        lbelAnhCTPN.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel22.setText("Mã SP");

        txtMaSanPham.setEditable(false);

        jLabel23.setText("Tên SP");

        jLabel24.setText("Số lượng");

        jLabel25.setText("Đơn giá");

        jLabel26.setText("Thành tiền");

        txtTenSanPham.setEditable(false);

        txtSoLuongNhap.setEditable(false);

        txtDonGiaNhap.setEditable(false);

        txtThanhTien.setEditable(false);

        btnCapNhapCTPN.setBackground(new java.awt.Color(153, 153, 153));
        btnCapNhapCTPN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCapNhapCTPN.setText("Cập nhập");
        btnCapNhapCTPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhapCTPNActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("In phiếu nhập hàng");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel14))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaNCC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMaNV)
                            .addComponent(txtMaPN)
                            .addComponent(txtNgayLap)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnCapNhapCTPN)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbelAnhCTPN, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                                .addComponent(jLabel20)
                                .addGap(266, 266, 266))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel25)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel24))
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDonGiaNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                            .addComponent(txtSoLuongNhap, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtTenSanPham, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtMaSanPham)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                        .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel20)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(txtNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(txtSoLuongNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(txtDonGiaNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel26))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lbelAnhCTPN, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhapCTPN)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Chi tiết phiếu nhập hàng", jPanel5);

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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                NH.setVisible(false);
                sp.SP.setVisible(true);
                sp.SP.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void tblKhoHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoHangMouseClicked
        int  i=tblKhoHang.getSelectedRow();
        if(i>=0){
            sptk=bus.dstk.get(i);
            txtMaSP.setText(sptk.MaSP);
            txtTenSP.setText(sptk.TenSP);
        //hiện ảnh
        String linkAnh = sptk.HinhAnh;
        lbelAnh.setIcon(bus.ResizeImage(String.valueOf(linkAnh), lbelAnh));
        }
    }//GEN-LAST:event_tblKhoHangMouseClicked
    /*======================================Giỏ Hàng khi nhập==================================*/
    String s="";
    public boolean KiemTraGiaTri(){
        if (txtSoLuong.getText().equals("") ) {
            s="Số lượng không được để trống! \n";
            txtSoLuong.setBackground(Color.PINK);
        } else {
            txtSoLuong.setBackground(Color.white);
        }
        if (txtDonGia.getText().equals("") ) {
            s=s+"Đơn giá không được để trống! \n";
            txtDonGia.setBackground(Color.PINK);
        } else {
            txtDonGia.setBackground(Color.white);
        }
        if (s.length() > 0) {
            return false;
        }else
        return true;
    }
    
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (KiemTraGiaTri() == true) {
            pn.MaPN=x;
            pn.MaSP = txtMaSP.getText();
            pn.TenSP = txtTenSP.getText();
            pn.SoLuongNhap = Integer.parseInt(txtSoLuong.getText());
            pn.DonGia = Float.parseFloat(txtDonGia.getText());
            pn.ThanhTien = pn.SoLuongNhap * pn.DonGia;
            //Them vao arrayList tạm
            busPN.dsHoaDonNhap.add(pn);
            //cập nhật Jtable
            Vector header = new Vector();
            header.add("Mã PN");
            header.add("Mã SP");//tên cột table
            header.add("Tên SP");
            header.add("Số lượng");
            header.add("Đơn giá");
            header.add("Thành tiền");
            if (modelPN.getRowCount() == 0) {
                modelPN = new DefaultTableModel(header, 0);
            }
            //nạp dữ liệu cho mỗi row
            Vector row = new Vector();
            row.add(pn.MaPN);
            row.add(pn.MaSP);
            row.add(pn.TenSP);
            row.add(pn.SoLuongNhap);
            row.add(pn.DonGia);
            row.add(pn.ThanhTien);
            modelPN.addRow(row); //thêm row dữ liệu vào model
            //nạp du lieu cua model vào jtable tblDSSV
            tblPhieuNhap.setModel(modelPN);
            Float tam;
            if (txtTongPhiNhap.getText().equalsIgnoreCase("")) {
                tam = 0 + pn.ThanhTien;
            }else{
                tam=Float.parseFloat(txtTongPhiNhap.getText())+pn.ThanhTien;
            }
            txtTongPhiNhap.setText(String.valueOf(tam));
            JOptionPane.showMessageDialog(this, "thêm thành công!");
        } else {
            if (KiemTraGiaTri() == false) {
                JOptionPane.showMessageDialog(this, s.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
                s="";
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        //giu lai sp trc khi sua
        TableModel model=tblPhieuNhap.getModel();
        Float oldThanhTien=Float.parseFloat(model.getValueAt(tblPhieuNhap.getSelectedRow(), 5).toString());
        if (tblPhieuNhap.getSelectedRow()>=0){
        pn.SoLuongNhap = Integer.parseInt(txtSoLuong.getText());
        pn.DonGia = Float.parseFloat(txtDonGia.getText());
        pn.ThanhTien = pn.SoLuongNhap * pn.DonGia;
        modelPN.setValueAt(pn.SoLuongNhap, tblPhieuNhap.getSelectedRow(), 3);
        modelPN.setValueAt(pn.DonGia, tblPhieuNhap.getSelectedRow(), 4);
        modelPN.setValueAt(pn.ThanhTien, tblPhieuNhap.getSelectedRow(), 5);
        tblPhieuNhap.setModel(modelPN);
        Float tam=Float.parseFloat(txtTongPhiNhap.getText())-oldThanhTien+pn.ThanhTien;
        txtTongPhiNhap.setText(String.valueOf(tam));
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tbnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnXoaActionPerformed
        int i=tblPhieuNhap.getSelectedRow();
        TableModel model=tblPhieuNhap.getModel();
        Float oldThanhTien=Float.parseFloat(model.getValueAt(i, 5).toString());
        Float tam=Float.parseFloat(txtTongPhiNhap.getText())-oldThanhTien;
        if (i == -1) {
            JOptionPane.showMessageDialog(this, "Bạn cần chọn sản phẩm để xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int x = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa!");
            if (x == JOptionPane.YES_OPTION) {
                if (i >= 0) {
                    ChiTietPhieuNhap_BUS.dsHoaDonNhap.remove(i);
                    modelPN.removeRow(i);
                    tblPhieuNhap.setModel(modelPN);
                    txtTongPhiNhap.setText(String.valueOf(tam));
                }
            }
        }
    }//GEN-LAST:event_tbnXoaActionPerformed

    private void tblPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuNhapMouseClicked
        int i = tblPhieuNhap.getSelectedRow();
        TableModel pn=tblPhieuNhap.getModel();
        if (i >= 0) {
            //--------Hiện ở danh sách hóa đơn nhập hàng---------
            txtMaSP.setText(pn.getValueAt(i, 1).toString());
            txtTenSP.setText(pn.getValueAt(i, 2).toString());
            txtSoLuong.setText(pn.getValueAt(i, 3).toString());
            txtDonGia.setText(pn.getValueAt(i, 4).toString());
            //hiện ảnh
            for (NhapHang_DTO sptk : NhapHang_BUS.dstk) {
                if (sptk.MaSP.equals(pn.getValueAt(i, 1).toString())) {
                    String linkAnh = sptk.HinhAnh;
                    lbelAnh.setIcon(bus.ResizeImage(String.valueOf(linkAnh), lbelAnh));
                }
            }
        }
    }//GEN-LAST:event_tblPhieuNhapMouseClicked
     /*======================================Chi tiết Phiếu Nhập==================================*/
    public void DocCTPhieuNhap(){
        if (ChiTietPhieuNhap_BUS.dspn == null) {
            busPN.DocCTPN();
        }
        //cập nhật Jtable
        Vector header = new Vector();
        header.add("Mã PN");
        header.add("Mã SP");//tên cột table
        header.add("Tên SP");
        header.add("Số lượng");
        header.add("Đơn giá");
        header.add("Thành tiền");
        if (modelCTPN.getRowCount() == 0) {
            modelCTPN = new DefaultTableModel(header, 0);
        }
        for (ChiTietPhieuNhap_DTO pn : ChiTietPhieuNhap_BUS.dspn) {
            //nạp dữ liệu cho mỗi row
            Vector row = new Vector();
            row.add(pn.MaPN);
            row.add(pn.MaSP);
            row.add(pn.TenSP);
            row.add(pn.SoLuongNhap);
            row.add(pn.DonGia);
            row.add(pn.ThanhTien);
            modelCTPN.addRow(row); //thêm row dữ liệu vào model
            tbleChiTietPN.setModel(modelCTPN);
        }
    }
    private void tbleChiTietPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbleChiTietPNMouseClicked
        int i = tbleChiTietPN.getSelectedRow();
        if (i >= 0) {
            pn = busPN.dspn.get(i);
            //--------Hiện bên chi tiết phiếu nhập hàng---------
            txtMaSanPham.setText(pn.MaSP);
            txtTenSanPham.setText(pn.TenSP);
            txtSoLuongNhap.setText(String.valueOf(pn.SoLuongNhap));
            txtDonGiaNhap.setText(String.valueOf(pn.DonGia));
            txtThanhTien.setText(String.valueOf(pn.ThanhTien));
            //hiện ảnh
            for (NhapHang_DTO sptk : NhapHang_BUS.dstk) {
                if (sptk.MaSP.equals(pn.MaSP)) {
                    String linkAnh = sptk.HinhAnh;
                    lbelAnhCTPN.setIcon(busPN.ResizeImage(String.valueOf(linkAnh), lbelAnhCTPN));
                }
            }
        }
    }//GEN-LAST:event_tbleChiTietPNMouseClicked
    public void showCTSPNhapKhiClick(ArrayList<ChiTietPhieuNhap_DTO> ds){
        //cập nhật Jtable
        Vector header = new Vector();
        header.add("Mã PN");
        header.add("Mã SP");//tên cột table
        header.add("Tên SP");
        header.add("Số lượng");
        header.add("Đơn giá");
        header.add("Thành tiền");
        DefaultTableModel mCTPN = new DefaultTableModel(header, 0);
        for(ChiTietPhieuNhap_DTO pn : ds){
            //nạp dữ liệu cho mỗi row
            Vector row = new Vector();
            row.add(pn.MaPN);
            row.add(pn.MaSP);
            row.add(pn.TenSP);
            row.add(pn.SoLuongNhap);
            row.add(pn.DonGia);
            row.add(pn.ThanhTien);
            mCTPN.addRow(row);
        }
        tbleChiTietPN.setModel(mCTPN);
    }
    ArrayList<ChiTietPhieuNhap_DTO> dsKhiClick;
    private void tblPNHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPNHMouseClicked
        int i = tblPNH.getSelectedRow();
        if (i >= 0) {
            pnh = busPNH.dspnh.get(i);
            //--------Hiện bên chi tiết phiếu nhập hàng---------
            txtMaPN.setText(pnh.MaPN);
            for(NhaCungCap_DTO ncc : NhaCungCap_BUS.dsncc){
                if(ncc.MaNCC.equals(pnh.MaNCC)){
                    txtMaNCC.setText(ncc.TenNCC);
                }
            }
            //từ mã nv hiện tên
            QLNV_BUS busnv = new QLNV_BUS();
            if (QLNV_BUS.dsnv == null) {
                busnv.docDSNV();
            }
            for (QLNV_DTO nv : busnv.dsnv) {
                if (pnh.MaNV.equals(nv.Ma)) {
                    txtMaNV.setText(nv.Ten);
                }
            }
            txtNgayLap.setText(pnh.NgayLap);
            txtTongTien.setText(pnh.TongTien);
            //-------------Hiện danh sách chi tiết sp đã mua khi click vào phiếu nhập hàng-------//
            dsKhiClick= new ArrayList<ChiTietPhieuNhap_DTO>();
            for (ChiTietPhieuNhap_DTO pn : ChiTietPhieuNhap_BUS.dspn) {
                if (String.valueOf(pn.MaPN).equals(txtMaPN.getText())) {
                    dsKhiClick.add(pn);
                }
            }
            showCTSPNhapKhiClick(dsKhiClick);
        }
    }//GEN-LAST:event_tblPNHMouseClicked

    private void btnNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhaCungCapActionPerformed
        ncc_gui.NCC.setVisible(true);
        ncc_gui.NCC.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnNhaCungCapActionPerformed
/*======================================Phiếu Nhập==================================*/
    //-----------Nhà Cung Cấp---------/
    public void setTextNCC(String s){
        txtNhaCungCap.setText(s);
    }
    //--------------------------------/
    public void DocPhieuNhapHang(){
        if (PhieuNhap_BUS.dspnh == null) {
            busPNH.DocPhieuNhap();
        }
        //cập nhật Jtable
        Vector header = new Vector();
        header.add("Mã PN");//tên cột table
        header.add("Ngày lập");
        header.add("Tổng tiền");
        if (modelPNH.getRowCount() == 0) {
            modelPNH = new DefaultTableModel(header, 0);
        }
        for (PhieuNhap_DTO pnh : PhieuNhap_BUS.dspnh) {
            //nạp dữ liệu cho mỗi row
            Vector row = new Vector();
            row.add(pnh.MaPN);
            row.add(pnh.NgayLap);
            row.add(pnh.TongTien);
            modelPNH.addRow(row); //thêm row dữ liệu vào model
            tblPNH.setModel(modelPNH);
        }
    }
    public boolean KiemTraGiaTriNCC(){
        if (txtNhaCungCap.getText().equals("") ) {
            txtNhaCungCap.setBackground(Color.PINK);
            return false;
        } else {
            txtNhaCungCap.setBackground(Color.white);
            return true;
        }
    }
    private void btnNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapActionPerformed
        if (ChiTietPhieuNhap_BUS.dsHoaDonNhap.size()>0 && KiemTraGiaTriNCC()==true) {
            d=PhieuNhap_BUS.dspnh.size()+1;
            pnh.MaPN=String.valueOf(d);
            for(NhaCungCap_DTO ncc : NhaCungCap_BUS.dsncc){
                if(ncc.TenNCC.equals(txtNhaCungCap.getText())){
                    pnh.MaNCC=ncc.MaNCC;
                }
            }
            QLNV_BUS busnv = new QLNV_BUS();
            for (QLNV_DTO nv : busnv.dsnv) {
                if (txtNhanVienPhuTrach.getText().equals(nv.Ten)) {
                    pnh.MaNV=nv.Ma;
                }
            }
            pnh.NgayLap=String.valueOf(java.time.LocalDate.now());
            pnh.TongTien=txtTongPhiNhap.getText();
            busPNH.NhapHang(pnh);
            //cập nhật Jtable
            Vector header = new Vector();
            header.add("Mã PN");
            header.add("Ngày lập");//tên cột table
            header.add("Tổng tiền");
            if (modelPNH.getRowCount() == 0) {
                modelPNH = new DefaultTableModel(header, 0);
            }
            //nạp dữ liệu cho mỗi row
            Vector row = new Vector();
            row.add(pnh.MaPN);
            row.add(pnh.NgayLap);
            row.add(pnh.TongTien);
            modelPNH.addRow(row); //thêm row dữ liệu vào model
            //nạp du lieu cua model vào jtable tblDSSV
            tblPNH.setModel(modelPNH);
            ChiTietPhieuNhap_DTO x;
            //-----------Sau khi nhập thì ghi vào chi tiết phiếu nhập------------/
            for(int i=0;i<busPN.dsHoaDonNhap.size();i++){
                x=new ChiTietPhieuNhap_DTO();
                x.MaPN=Integer.parseInt(modelPN.getValueAt(i, 0).toString());
                x.MaSP=modelPN.getValueAt(i, 1).toString();
                x.TenSP=modelPN.getValueAt(i, 2).toString();
                x.SoLuongNhap=Integer.parseInt(modelPN.getValueAt(i, 3).toString());
                x.DonGia=Float.parseFloat(modelPN.getValueAt(i, 4).toString());
                x.ThanhTien=Float.parseFloat(modelPN.getValueAt(i, 5).toString());
                busPN.them(x);
                //cập nhật Jtable
                Vector hea = new Vector();
                hea.add("Mã PN");
                hea.add("Mã SP");//tên cột table
                hea.add("Tên SP");
                hea.add("Số lượng");
                hea.add("Đơn giá");
                hea.add("Thành tiền");
                if (modelCTPN.getRowCount() == 0) {
                    modelCTPN = new DefaultTableModel(header, 0);
                }
                //nạp dữ liệu cho mỗi row
                Vector r = new Vector();
                r.add(x.MaPN);
                r.add(x.MaSP);
                r.add(x.TenSP);
                r.add(x.SoLuongNhap);
                r.add(x.DonGia);
                r.add(x.ThanhTien);
                modelCTPN.addRow(r); //thêm row dữ liệu vào model
                //nạp du lieu cua model vào jtable tblDSSV
                tbleChiTietPN.setModel(modelCTPN);
            }
            //-----------Sau khi nhập thì tăng số lượng ở kho sản phẩm-----------/
            TableModel m = tblKhoHang.getModel();
            TableModel mPN = tblPhieuNhap.getModel();
            for (int k = 0; k < ChiTietPhieuNhap_BUS.dsHoaDonNhap.size(); k++) {
                pn.MaSP = mPN.getValueAt(k, 1).toString();
                for (int j = 0; j < NhapHang_BUS.dstk.size(); j++) {
                    sptk.MaSP = m.getValueAt(j, 0).toString();
                    if (pn.MaSP.equals(sptk.MaSP)) {
                        pn.SoLuongNhap = Integer.parseInt(mPN.getValueAt(k, 3).toString());
                        sptk.SoLuong = String.valueOf(Integer.parseInt(m.getValueAt(j, 2).toString()) + pn.SoLuongNhap);
                        bus.SuaSL(sptk);
                        m.setValueAt(sptk.SoLuong, j, 2);
                        tblKhoHang.setModel(m);
                    }
                }
            }
            //-----------Xóa table tạm ở arrayList dsHoaDonNhap------------------/
            ChiTietPhieuNhap_BUS.dsHoaDonNhap.removeAll(ChiTietPhieuNhap_BUS.dsHoaDonNhap);
            ((DefaultTableModel)tblPhieuNhap.getModel()).setRowCount(0);
            txtTongPhiNhap.setText("");
            JOptionPane.showMessageDialog(this, "Nhập hàng thành công!");
        } else {
            if (ChiTietPhieuNhap_BUS.dsHoaDonNhap.size() == 0) {
                JOptionPane.showMessageDialog(this, "Nhập hàng thất bại do không có sản phẩm nào trong phiếu nhập");
            }else if(KiemTraGiaTriNCC()==false){
                JOptionPane.showMessageDialog(this,"Bạn Cần chọn nhà cung cấp khi nhập hàng!");
            }
        }
    }//GEN-LAST:event_btnNhapActionPerformed

    private void btnCapNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhapActionPerformed
        tblKhoHang.setModel(modelKho);
    }//GEN-LAST:event_btnCapNhapActionPerformed

    private void btnCapNhapCTPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhapCTPNActionPerformed
        tbleChiTietPN.setModel(modelCTPN);
    }//GEN-LAST:event_btnCapNhapCTPNActionPerformed
//-------------Khi enter chuyển qua text kế tiếp-----------//
    private void txtSoLuongKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoLuongKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtDonGia.requestFocus();
        }
    }//GEN-LAST:event_txtSoLuongKeyPressed

    private void btnHoTroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoTroActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập")) {
            if (btnHoTro.isSelected() == true) {
                NH.setVisible(false);
                ht.HT.setVisible(true);
                ht.HT.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnHoTroActionPerformed

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

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập") && checkQuyenQLGD() == true) {
            if (btnThongKe.isSelected() == true) {
                NH.setVisible(false);
                TK.setVisible(true);
                TK.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnkhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhuyenMaiActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập")) {
            if (btnkhuyenMai.isSelected() == true) {
                NH.setVisible(false);
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
                NH.setVisible(false);
                KH.setVisible(true);
                KH.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnLienHeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLienHeActionPerformed
        JOptionPane.showMessageDialog(this,"Bạn vui lòng chọn chức năng hỗ trợ để liên hệ!");
    }//GEN-LAST:event_btnLienHeActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        NH.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
         if(btnHuongDan.isSelected()==true){
            HD.setVisible(true);
            HD.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnHuongDanActionPerformed

    private void CTPNKhiLocPhieuNhap(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CTPNKhiLocPhieuNhap
        int i = tbleChiTietPN.getSelectedRow();
        if (i >= 0) {
            pn = dsKhiClick.get(i);
            //--------Hiện bên chi tiết phiếu nhập hàng---------
            txtMaSanPham.setText(pn.MaSP);
            txtTenSanPham.setText(pn.TenSP);
            txtSoLuongNhap.setText(String.valueOf(pn.SoLuongNhap));
            txtDonGiaNhap.setText(String.valueOf(pn.DonGia));
            txtThanhTien.setText(String.valueOf(pn.ThanhTien));
            //hiện ảnh
            String x;
            for (NhapHang_DTO sptk : NhapHang_BUS.dstk) {
                if (sptk.MaSP.equals(pn.MaSP)) {
                    x = sptk.HinhAnh;
                    lbelAnhCTPN.setIcon(busPN.ResizeImage(String.valueOf(x), lbelAnhCTPN));
                }
            }
        }
    }//GEN-LAST:event_CTPNKhiLocPhieuNhap

    private void btnDonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonHangActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập")) {
            if (btnDonHang.isSelected() == true) {
                NH.setVisible(false);
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
                NH.setVisible(false);
                NV.setVisible(true);
                NV.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnNhanVienActionPerformed
    
    /*======================================ProFile Đăng Nhập==================================*/
    public void setTextTenDN(String s){
        btnDangNhap.setText(s);
    }
    public void setTextTenNV(String s){
        txtNhanVienPhuTrach.setText(s);
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
            java.util.logging.Logger.getLogger(NhapHang_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhapHang_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhapHang_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhapHang_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NH.setVisible(true);
                NH.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhap;
    private javax.swing.JButton btnCapNhapCTPN;
    private javax.swing.JToggleButton btnDangNhap;
    private javax.swing.JToggleButton btnDoanhThu;
    private javax.swing.JToggleButton btnDonHang;
    private javax.swing.JToggleButton btnHoTro;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JToggleButton btnKhachHang;
    private javax.swing.JButton btnLienHe;
    private javax.swing.JButton btnNhaCungCap;
    private javax.swing.JToggleButton btnNhanVien;
    private javax.swing.JButton btnNhap;
    private javax.swing.JToggleButton btnNhapHang;
    private javax.swing.JToggleButton btnSanPham;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JToggleButton btnThongKe;
    private javax.swing.JToggleButton btnkhuyenMai;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbKho;
    private javax.swing.JLabel lbPN;
    private javax.swing.JLabel lbTTPN;
    private javax.swing.JLabel lbTTSP;
    private javax.swing.JLabel lbelAnh;
    private javax.swing.JLabel lbelAnhCTPN;
    private javax.swing.JTable tblKhoHang;
    private javax.swing.JTable tblPNH;
    private javax.swing.JTable tblPhieuNhap;
    private javax.swing.JTable tbleChiTietPN;
    private javax.swing.JButton tbnXoa;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtDonGiaNhap;
    private javax.swing.JTextField txtMaNCC;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaPN;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtNgayLap;
    private javax.swing.JTextField txtNhaCungCap;
    private javax.swing.JTextField txtNhanVienPhuTrach;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtSoLuongNhap;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTenSanPham;
    private javax.swing.JTextField txtThanhTien;
    private javax.swing.JTextField txtTongPhiNhap;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
