package icy.GUI;

import ICY.BUS.QLNV_BUS;
import ICY.DTO.QLNV_DTO;
import icy.*;
import icy.BUS.CTKhuyenMai_BUS;
import icy.BUS.KhuyenMai_BUS;
import icy.DTO.CTKhuyenMai_DTO;
import icy.DTO.KhuyenMai_DTO;
import static icy.GUI.BanHang_GUI.BH;
import static icy.GUI.DangNhap_GUI.DN;
import static icy.GUI.DoanhThu_GUI.DT;
import static icy.GUI.HoSoNV_GUI.HS;
import static icy.GUI.HoTro_GUI.HT;
import static icy.GUI.HuongDan_GUI.HD;
import static icy.GUI.KhachHang_GUI.KH;
import static icy.GUI.NhapHang_GUI.NH;
import static icy.GUI.QLNV_GUI.NV;
import static icy.GUI.SanPham_GUI.SP;
import static icy.GUI.ThongKe_GUI.TK;
import java.awt.Color;
import java.time.LocalDate;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KhuyenMai_GUI extends javax.swing.JFrame {

    public static KhuyenMai_GUI KM = new KhuyenMai_GUI();

    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel model1 = new DefaultTableModel();

    public KhuyenMai_GUI() {
        initComponents();
        createComboD();
        createComboM();
        createComboY();
        DocDSKM();
        DocDSCTKM();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        buttonGroup2 = new javax.swing.ButtonGroup();
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
        tbChitiet = new javax.swing.JTabbedPane();
        panelThongtin = new javax.swing.JPanel();
        panelCTKM = new javax.swing.JPanel();
        lbMa = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        lbTen = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        lbNgaybd = new javax.swing.JLabel();
        cbboxNgaybd = new javax.swing.JComboBox<>();
        cbboxThangbd = new javax.swing.JComboBox<>();
        cbboxNambd = new javax.swing.JComboBox<>();
        lbNgaykt = new javax.swing.JLabel();
        cbboxNgaykt = new javax.swing.JComboBox<>();
        cbboxThangkt = new javax.swing.JComboBox<>();
        cbboxNamkt = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCTKM = new javax.swing.JTable();
        btnHienthi = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lbKhoatk = new javax.swing.JLabel();
        rbtMa = new javax.swing.JRadioButton();
        rbtTen = new javax.swing.JRadioButton();
        txtNhaptk = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        lbNgay = new javax.swing.JLabel();
        cbboxDfirst = new javax.swing.JComboBox<>();
        cbboxMfirst = new javax.swing.JComboBox<>();
        cbboxYfirst = new javax.swing.JComboBox<>();
        btnTimkiemNgay = new javax.swing.JButton();
        panelChitiet = new javax.swing.JPanel();
        panelCTCTKM = new javax.swing.JPanel();
        lbMaCT = new javax.swing.JLabel();
        txtMaCT = new javax.swing.JTextField();
        txtMaSP = new javax.swing.JTextField();
        lbMaSP = new javax.swing.JLabel();
        lbGiamgia = new javax.swing.JLabel();
        btnThemCT = new javax.swing.JButton();
        btnSuaCT = new javax.swing.JButton();
        btnXoaCT = new javax.swing.JButton();
        txtNoidung = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtGiamgia = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCTCTKM = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtNdchitiet = new javax.swing.JTextPane();
        lbChitiet = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbKhoa = new javax.swing.JLabel();
        cbboxKhoa = new javax.swing.JComboBox<>();
        txtNhapkhoa = new javax.swing.JTextField();
        btnTimkiemKhoa = new javax.swing.JButton();
        txtMaand = new javax.swing.JTextField();
        lbAnd = new javax.swing.JLabel();
        txtMaspand = new javax.swing.JTextField();
        btnTKAnd = new javax.swing.JButton();
        txtMaspor = new javax.swing.JTextField();
        lbOr = new javax.swing.JLabel();
        txtNDor = new javax.swing.JTextField();
        btnTkOr = new javax.swing.JButton();
        btnHienthiCT = new javax.swing.JButton();

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

        tbChitiet.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        lbMa.setText("Mã chương trình");

        txtMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaKeyPressed(evt);
            }
        });

        lbTen.setText("Tên chương trình");

        txtTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTenKeyPressed(evt);
            }
        });

        lbNgaybd.setText("Ngày bắt đầu");

        cbboxNgaybd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbboxNgaybd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbboxNgaybdKeyPressed(evt);
            }
        });

        cbboxThangbd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbboxThangbd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbboxThangbdKeyPressed(evt);
            }
        });

        cbboxNambd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbboxNambd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbboxNambdKeyPressed(evt);
            }
        });

        lbNgaykt.setText("Ngày kết thúc");

        cbboxNgaykt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbboxNgaykt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbboxNgayktKeyPressed(evt);
            }
        });

        cbboxThangkt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbboxThangkt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbboxThangktKeyPressed(evt);
            }
        });

        cbboxNamkt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbboxNamkt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbboxNamktKeyPressed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        btnThem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnThemKeyPressed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        btnSua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSuaKeyPressed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        btnXoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnXoaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelCTKMLayout = new javax.swing.GroupLayout(panelCTKM);
        panelCTKM.setLayout(panelCTKMLayout);
        panelCTKMLayout.setHorizontalGroup(
            panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCTKMLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMa)
                    .addComponent(lbTen))
                .addGap(18, 18, 18)
                .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCTKMLayout.createSequentialGroup()
                        .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMa, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(txtTen))
                        .addGap(23, 23, 23)
                        .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNgaybd)
                            .addComponent(lbNgaykt))
                        .addGap(18, 18, 18)
                        .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCTKMLayout.createSequentialGroup()
                                .addComponent(cbboxNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbboxThangkt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbboxNamkt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCTKMLayout.createSequentialGroup()
                                .addComponent(cbboxNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbboxThangbd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbboxNambd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelCTKMLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(428, 428, 428))
        );
        panelCTKMLayout.setVerticalGroup(
            panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCTKMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMa)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNgaybd)
                    .addComponent(cbboxNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbboxNambd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbboxThangbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbNgaykt)
                        .addComponent(cbboxNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbboxThangkt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbboxNamkt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbTen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableCTKM.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCTKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCTKMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCTKM);

        btnHienthi.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnHienthi.setText("Hiển thị toàn bộ");
        btnHienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienthiActionPerformed(evt);
            }
        });
        btnHienthi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnHienthiKeyPressed(evt);
            }
        });

        lbKhoatk.setText("Chọn khóa tìm kiếm:");

        buttonGroup2.add(rbtMa);
        rbtMa.setText("Mã chương trình");
        rbtMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbtMaKeyPressed(evt);
            }
        });

        buttonGroup2.add(rbtTen);
        rbtTen.setText("Tên chương trình");
        rbtTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbtTenKeyPressed(evt);
            }
        });

        txtNhaptk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNhaptkKeyPressed(evt);
            }
        });

        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });
        btnTimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnTimkiemKeyPressed(evt);
            }
        });

        lbNgay.setText("Ngày:");

        cbboxDfirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbboxDfirst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbboxDfirstKeyPressed(evt);
            }
        });

        cbboxMfirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbboxMfirst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbboxMfirstKeyPressed(evt);
            }
        });

        cbboxYfirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbboxYfirst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbboxYfirstKeyPressed(evt);
            }
        });

        btnTimkiemNgay.setText("Tìm kiếm");
        btnTimkiemNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemNgayActionPerformed(evt);
            }
        });
        btnTimkiemNgay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnTimkiemNgayKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(cbboxDfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbboxMfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbboxYfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTimkiemNgay))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lbKhoatk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtMa)
                                .addGap(18, 18, 18)
                                .addComponent(rbtTen))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(txtNhaptk, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimkiem)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbKhoatk)
                    .addComponent(rbtMa)
                    .addComponent(rbtTen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNhaptk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNgay)
                    .addComponent(cbboxDfirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbboxMfirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbboxYfirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiemNgay))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelThongtinLayout = new javax.swing.GroupLayout(panelThongtin);
        panelThongtin.setLayout(panelThongtinLayout);
        panelThongtinLayout.setHorizontalGroup(
            panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongtinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelThongtinLayout.createSequentialGroup()
                        .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHienthi)
                            .addGroup(panelThongtinLayout.createSequentialGroup()
                                .addComponent(panelCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelThongtinLayout.setVerticalGroup(
            panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongtinLayout.createSequentialGroup()
                .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHienthi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbChitiet.addTab("Thông tin", panelThongtin);

        lbMaCT.setText("Mã chương trình");

        txtMaCT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaCTKeyPressed(evt);
            }
        });

        txtMaSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaSPKeyPressed(evt);
            }
        });

        lbMaSP.setText("Mã sản phẩm");

        lbGiamgia.setText("Nội dung khuyến mãi");

        btnThemCT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnThemCT.setText("Thêm");
        btnThemCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCTActionPerformed(evt);
            }
        });
        btnThemCT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnThemCTKeyPressed(evt);
            }
        });

        btnSuaCT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnSuaCT.setText("Sửa");
        btnSuaCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCTActionPerformed(evt);
            }
        });
        btnSuaCT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSuaCTKeyPressed(evt);
            }
        });

        btnXoaCT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnXoaCT.setText("Xóa");
        btnXoaCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCTActionPerformed(evt);
            }
        });
        btnXoaCT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnXoaCTKeyPressed(evt);
            }
        });

        txtNoidung.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoidungKeyPressed(evt);
            }
        });

        jLabel2.setText("% giảm giá");

        javax.swing.GroupLayout panelCTCTKMLayout = new javax.swing.GroupLayout(panelCTCTKM);
        panelCTCTKM.setLayout(panelCTCTKMLayout);
        panelCTCTKMLayout.setHorizontalGroup(
            panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCTCTKMLayout.createSequentialGroup()
                .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCTCTKMLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnThemCT, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSuaCT, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoaCT, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCTCTKMLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCTCTKMLayout.createSequentialGroup()
                                .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMaCT)
                                    .addComponent(lbMaSP))
                                .addGap(45, 45, 45)
                                .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaCT, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelCTCTKMLayout.createSequentialGroup()
                                .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCTCTKMLayout.createSequentialGroup()
                                        .addComponent(lbGiamgia)
                                        .addGap(18, 18, 18))
                                    .addGroup(panelCTCTKMLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(74, 74, 74)))
                                .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNoidung, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(txtGiamgia))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCTCTKMLayout.setVerticalGroup(
            panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCTCTKMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaCT)
                    .addComponent(txtMaCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMaSP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGiamgia)
                    .addComponent(txtNoidung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtGiamgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemCT)
                    .addComponent(btnSuaCT)
                    .addComponent(btnXoaCT))
                .addGap(21, 21, 21))
        );

        tableCTCTKM.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCTCTKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCTCTKMMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableCTCTKM);

        txtNdchitiet.setMaximumSize(new java.awt.Dimension(269, 139));
        txtNdchitiet.setPreferredSize(new java.awt.Dimension(269, 139));
        txtNdchitiet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNdchitietKeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(txtNdchitiet);

        lbChitiet.setText("Nội dung chi tiết:");

        lbKhoa.setText("Chọn khóa tìm kiếm");

        cbboxKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã sản phẩm", "Nội dung khuyến mãi" }));
        cbboxKhoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbboxKhoaKeyPressed(evt);
            }
        });

        txtNhapkhoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNhapkhoaKeyPressed(evt);
            }
        });

        btnTimkiemKhoa.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnTimkiemKhoa.setText("Tìm kiếm");
        btnTimkiemKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemKhoaActionPerformed(evt);
            }
        });
        btnTimkiemKhoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnTimkiemKhoaKeyPressed(evt);
            }
        });

        txtMaand.setForeground(new java.awt.Color(153, 153, 153));
        txtMaand.setText("Mã chương trình");
        txtMaand.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMaandFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaandFocusLost(evt);
            }
        });
        txtMaand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaandKeyPressed(evt);
            }
        });

        lbAnd.setText("AND");

        txtMaspand.setForeground(new java.awt.Color(153, 153, 153));
        txtMaspand.setText("Mã sản phẩm");
        txtMaspand.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMaspandFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaspandFocusLost(evt);
            }
        });
        txtMaspand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaspandKeyPressed(evt);
            }
        });

        btnTKAnd.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnTKAnd.setText("Tìm kiếm");
        btnTKAnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKAndActionPerformed(evt);
            }
        });
        btnTKAnd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnTKAndKeyPressed(evt);
            }
        });

        txtMaspor.setForeground(new java.awt.Color(153, 153, 153));
        txtMaspor.setText("Mã sản phẩm");
        txtMaspor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMasporFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMasporFocusLost(evt);
            }
        });
        txtMaspor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMasporKeyPressed(evt);
            }
        });

        lbOr.setText("OR");

        txtNDor.setForeground(new java.awt.Color(153, 153, 153));
        txtNDor.setText("Nội dung khuyến mãi");
        txtNDor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNDorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNDorFocusLost(evt);
            }
        });
        txtNDor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNDorKeyPressed(evt);
            }
        });

        btnTkOr.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnTkOr.setText("Tìm kiếm");
        btnTkOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTkOrActionPerformed(evt);
            }
        });
        btnTkOr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnTkOrKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtNhapkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTimkiemKhoa))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbKhoa)
                        .addGap(18, 18, 18)
                        .addComponent(cbboxKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaspor)
                            .addComponent(txtMaand))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAnd)
                            .addComponent(lbOr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(txtNDor, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTkOr))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtMaspand, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTKAnd)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbKhoa)
                    .addComponent(cbboxKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNhapkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiemKhoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAnd)
                    .addComponent(txtMaspand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTKAnd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaspor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbOr)
                    .addComponent(txtNDor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTkOr))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnHienthiCT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnHienthiCT.setText("Hiển thị chi tiết");
        btnHienthiCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienthiCTActionPerformed(evt);
            }
        });
        btnHienthiCT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnHienthiCTKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelChitietLayout = new javax.swing.GroupLayout(panelChitiet);
        panelChitiet.setLayout(panelChitietLayout);
        panelChitietLayout.setHorizontalGroup(
            panelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChitietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(panelChitietLayout.createSequentialGroup()
                        .addComponent(panelCTCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbChitiet)
                        .addGroup(panelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelChitietLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelChitietLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHienthiCT)
                                .addGap(29, 29, 29)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelChitietLayout.setVerticalGroup(
            panelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChitietLayout.createSequentialGroup()
                .addComponent(panelCTCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelChitietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelChitietLayout.createSequentialGroup()
                        .addGroup(panelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbChitiet))
                        .addGap(11, 11, 11)
                        .addComponent(btnHienthiCT)
                        .addGap(11, 11, 11))
                    .addGroup(panelChitietLayout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addGap(32, 32, 32)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );

        tbChitiet.addTab("Chi tiết", panelChitiet);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbChitiet)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbChitiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean Ktra(String s, String s1) {
        if (s.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, s1 + " không được để trống");
            return false;
        } else {
            return true;
        }
    }

    private boolean KtraSo(String s) {
        boolean k = s.matches("-?\\d+(\\.\\d+)?");
        if (k) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "% giảm giá phải là số!");
            return false;
        }
    }
    private void btnXoaCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCTActionPerformed
        int i = tableCTCTKM.getSelectedRow();
        if (i >= 0) {
            CTKhuyenMai_BUS bus = new CTKhuyenMai_BUS();
            int j = 0;
            for (CTKhuyenMai_DTO ctkm : CTKhuyenMai_BUS.dsctkm) {
                if (CTKhuyenMai_BUS.dscttkkm.get(i).mact.equalsIgnoreCase(ctkm.mact)) {
                    break;
                }
                j++;
            }
            bus.xoa(CTKhuyenMai_BUS.dscttkkm.get(i).mact, j);
            CTKhuyenMai_BUS.dscttkkm.remove(i);
            model1.removeRow(i);
            tableCTCTKM.setModel(model1);
        }
    }//GEN-LAST:event_btnXoaCTActionPerformed

    private void btnSuaCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCTActionPerformed
        int i = tableCTCTKM.getSelectedRow();
        if (i >= 0) {
            String s = CTKhuyenMai_BUS.dscttkkm.get(i).makm;
            CTKhuyenMai_DTO km = new CTKhuyenMai_DTO();
            km.mact = CTKhuyenMai_BUS.dscttkkm.get(i).mact;
            km.makm = txtMaCT.getText().trim().toUpperCase();
            km.masp = txtMaSP.getText().trim().toUpperCase();
            km.noidungkm = txtNoidung.getText().trim();
            km.noidungct = txtNdchitiet.getText().trim();
            km.giamgia = txtGiamgia.getText().trim();
            if (Ktra(km.makm, "Mã khuyến mãi") == true && Ktra(km.masp, "Mã sản phẩm") == true && Ktra(km.noidungkm, "Nội dung khuyến mãi") == true && KtraSo(km.giamgia)) {
                CTKhuyenMai_BUS bus = new CTKhuyenMai_BUS();
                if (s.equalsIgnoreCase(km.makm)) {
                    int j = 0;
                    for (CTKhuyenMai_DTO ctkm : CTKhuyenMai_BUS.dsctkm) {
                        if (CTKhuyenMai_BUS.dscttkkm.get(i).mact.equalsIgnoreCase(ctkm.mact)) {
                            break;
                        }
                        j++;
                    }
                    bus.sua(j, km);
                    model1.setValueAt(km.makm, i, 0);
                    model1.setValueAt(km.masp, i, 1);
                    model1.setValueAt(km.noidungkm, i, 2);
                    model1.setValueAt(km.giamgia, i, 3);
                    tableCTCTKM.setModel(model1);
                } else {
                    JOptionPane.showMessageDialog(null, "Không được sửa mã khuyến mãi!");
                }
            }
        }
    }//GEN-LAST:event_btnSuaCTActionPerformed

    private void btnThemCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCTActionPerformed
        CTKhuyenMai_DTO km = new CTKhuyenMai_DTO();
        int i = 1, d = 0;
        do {
            d = 0;
            km.mact = "CT" + String.valueOf(CTKhuyenMai_BUS.dsctkm.size() + i);
            for (CTKhuyenMai_DTO ctkm : CTKhuyenMai_BUS.dsctkm) {
                if (ctkm.mact.equalsIgnoreCase(km.mact)) {
                    d++;
                    break;
                }
            }
            i++;
        } while (d != 0);
        km.makm = txtMaCT.getText().trim().toUpperCase();
        km.masp = txtMaSP.getText().trim().toUpperCase();
        km.noidungkm = txtNoidung.getText().trim();
        km.noidungct = txtNdchitiet.getText().trim();
        km.giamgia = txtGiamgia.getText().trim();
        if (Ktra(km.makm, "Mã khuyến mãi") == true && Ktra(km.masp, "Mã sản phẩm") == true && Ktra(km.noidungkm, "Nội dung khuyến mãi") == true && KtraSo(km.giamgia)) {
            d = 0;
            if (CTKhuyenMai_BUS.dscttkkm.size() != 0) {
                for (CTKhuyenMai_DTO km1 : CTKhuyenMai_BUS.dscttkkm) {
                    if (km1.masp.equalsIgnoreCase(km.masp)) {
                        d++;
                        break;
                    }
                }
                if (CTKhuyenMai_BUS.dscttkkm.get(0).makm.equalsIgnoreCase(km.makm)) {
                    CTKhuyenMai_BUS bus = new CTKhuyenMai_BUS();
                    bus.them(km);
                    if (d == 0) {
                        for (i = model1.getRowCount() - 1; i >= 0; i--) {
                            model1.removeRow(i);
                        }
                        if (CTKhuyenMai_BUS.dstimkiemct != null) {
                            CTKhuyenMai_BUS.dstimkiemct.clear();
                        }
                        for (CTKhuyenMai_DTO km1 : CTKhuyenMai_BUS.dscttkkm) {
                            HienthiDSCTKM(km1);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Mã khuyến mãi phải là: " + CTKhuyenMai_BUS.dscttkkm.get(0).makm);
                }
            } else {
                CTKhuyenMai_BUS bus = new CTKhuyenMai_BUS();
                bus.them(km);
                for (i = model1.getRowCount() - 1; i >= 0; i--) {
                    model1.removeRow(i);
                }
                if (CTKhuyenMai_BUS.dstimkiemct != null) {
                    CTKhuyenMai_BUS.dstimkiemct.clear();
                }
                for (CTKhuyenMai_DTO km1 : CTKhuyenMai_BUS.dscttkkm) {
                    HienthiDSCTKM(km1);
                }
            }
        }
    }//GEN-LAST:event_btnThemCTActionPerformed

    private void btnTimkiemNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemNgayActionPerformed
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        KhuyenMai_BUS bus = new KhuyenMai_BUS();
        if (KhuyenMai_BUS.dstkkm == null) {
            bus.timkiem();
        }
        if (KhuyenMai_BUS.dstkkm != null) {
            KhuyenMai_BUS.dstkkm.clear();
        }
        int d = Integer.parseInt((String) cbboxDfirst.getSelectedItem());
        int m = Integer.parseInt((String) cbboxMfirst.getSelectedItem());
        int y = Integer.parseInt((String) cbboxYfirst.getSelectedItem());
        for (KhuyenMai_DTO km : KhuyenMai_BUS.dskm) {
            int d1 = Integer.parseInt(km.ngaybd);
            int m1 = Integer.parseInt(km.thangbd);
            int y1 = Integer.parseInt(km.nambd);
            int d2 = Integer.parseInt(km.ngaykt);// d1/m1/y1  d/m/y  d2/m2/y2
            int m2 = Integer.parseInt(km.thangkt);
            int y2 = Integer.parseInt(km.namkt); //y=y1 y<y2  y=y1=y2  y=y2 y1<y  y1<y<y2
            if (y1 <= y && y <= y2) {
                if (y1 == y && y < y2) {
                    if (m1 <= m) {
                        if (m1 == m && d1 <= d) {
                            KhuyenMai_BUS.dstkkm.add(km);
                            HienthiDSKM(km);
                        } else if (d1 <= d) {
                            KhuyenMai_BUS.dstkkm.add(km);
                            HienthiDSKM(km);
                        }
                    }
                }
                if (y == y1 && y == y2) {
                    if (m1 <= m && m <= m2) {
                        if (m1 == m && m == m2 && d1 <= d && d <= d2) {
                            KhuyenMai_BUS.dstkkm.add(km);
                            HienthiDSKM(km);
                        } else {
                            if (m1 == m && m < m2 && d1 <= d) {
                                KhuyenMai_BUS.dstkkm.add(km);
                                HienthiDSKM(km);
                            }
                            if (m2 == m && m > m1 && d <= d2) {
                                KhuyenMai_BUS.dstkkm.add(km);
                                HienthiDSKM(km);
                            }
                            if (m1 < m && m2 > m) {
                                KhuyenMai_BUS.dstkkm.add(km);
                                HienthiDSKM(km);
                            }
                        }
                    }
                }
                if (y2 == y && y1 < y) {
                    if (m2 >= m) {
                        if (m2 == m && d <= d2) {
                            KhuyenMai_BUS.dstkkm.add(km);
                            HienthiDSKM(km);
                        } else if (d <= d2) {
                            KhuyenMai_BUS.dstkkm.add(km);
                            HienthiDSKM(km);
                        }
                    }
                }
                if (y1 < y && y < y2) {
                    KhuyenMai_BUS.dstkkm.add(km);
                    HienthiDSKM(km);
                }
            }
        }
    }//GEN-LAST:event_btnTimkiemNgayActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        String s = txtNhaptk.getText().trim();
        KhuyenMai_BUS bus = new KhuyenMai_BUS();
        if (KhuyenMai_BUS.dstkkm == null) {
            bus.timkiem();
        }
        if (KhuyenMai_BUS.dstkkm != null) {
            KhuyenMai_BUS.dstkkm.clear();
        }
        for (KhuyenMai_DTO km : KhuyenMai_BUS.dskm) {
            if (rbtMa.isSelected() && s.equalsIgnoreCase(km.makm)) {
                KhuyenMai_BUS.dstkkm.add(km);
                HienthiDSKM(km);
                break;
            }
            if (rbtTen.isSelected() && s.equalsIgnoreCase(km.ten)) {
                KhuyenMai_BUS.dstkkm.add(km);
                HienthiDSKM(km);
            }
        }
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void btnHienthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienthiActionPerformed
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        if (KhuyenMai_BUS.dstkkm != null) {
            KhuyenMai_BUS.dstkkm.clear();
        }
        for (KhuyenMai_DTO km : KhuyenMai_BUS.dskm)
            HienthiDSKM(km);
    }//GEN-LAST:event_btnHienthiActionPerformed

    private void tableCTCTKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCTCTKMMouseClicked
        int i = tableCTCTKM.getSelectedRow();
        //JOptionPane.showMessageDialog(null, "row:"+i);
        if (i >= 0) {
            CTKhuyenMai_DTO km = new CTKhuyenMai_DTO();
            /*if(CTKhuyenMai_BUS.dscttkkm == null || CTKhuyenMai_BUS.dscttkkm.size() == 0)
                km = CTKhuyenMai_BUS.dsctkm.get(i);*/

            if (CTKhuyenMai_BUS.dstimkiemct == null || CTKhuyenMai_BUS.dstimkiemct.size() == 0) {
                km = CTKhuyenMai_BUS.dscttkkm.get(i);
            } else {
                km = CTKhuyenMai_BUS.dstimkiemct.get(i);
            }
            txtMaCT.setText(km.makm);
            txtMaSP.setText(km.masp);
            txtNoidung.setText(km.noidungkm);
            txtNdchitiet.setText(km.noidungct);
            txtGiamgia.setText(km.giamgia);
        }
    }//GEN-LAST:event_tableCTCTKMMouseClicked

    private void tableCTKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCTKMMouseClicked
        int i = tableCTKM.getSelectedRow();
        //JOptionPane.showMessageDialog(null, "row:"+i);
        if (i >= 0) {
            KhuyenMai_DTO km = new KhuyenMai_DTO();
            if (KhuyenMai_BUS.dstkkm == null || KhuyenMai_BUS.dstkkm.size() == 0) {
                km = KhuyenMai_BUS.dskm.get(i);
            } else {
                km = KhuyenMai_BUS.dstkkm.get(i);
            }
            txtMa.setText(km.makm);
            txtTen.setText(km.ten);
            cbboxNgaybd.setSelectedItem(km.ngaybd);
            cbboxThangbd.setSelectedItem(km.thangbd);
            cbboxNambd.setSelectedItem(km.nambd);
            cbboxNgaykt.setSelectedItem(km.ngaykt);
            cbboxThangkt.setSelectedItem(km.thangkt);
            cbboxNamkt.setSelectedItem(km.namkt);
            HienthiCTCTKM(km.makm);
        }
    }//GEN-LAST:event_tableCTKMMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int i = tableCTKM.getSelectedRow();
        if (i >= 0) {
            KhuyenMai_BUS bus = new KhuyenMai_BUS();
            bus.xoa(KhuyenMai_BUS.dskm.get(i).makm, i);
            model.removeRow(i);
            tableCTKM.setModel(model);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int i = tableCTKM.getSelectedRow();
        if (i >= 0) {
            String s = KhuyenMai_BUS.dskm.get(i).makm;
            KhuyenMai_DTO km = new KhuyenMai_DTO();
            km.makm = txtMa.getText().trim();
            km.ten = txtTen.getText().trim();
            km.ngaybd = (String) cbboxNgaybd.getSelectedItem();
            km.thangbd = (String) cbboxThangbd.getSelectedItem();
            km.nambd = (String) cbboxNambd.getSelectedItem();
            km.ngaykt = (String) cbboxNgaykt.getSelectedItem();
            km.thangkt = (String) cbboxThangkt.getSelectedItem();
            km.namkt = (String) cbboxNamkt.getSelectedItem();
            if (Ktra(km.makm, "Mã khuyến mãi") == true && Ktra(km.ten, "Tên chương trình") == true) {
                KhuyenMai_BUS bus = new KhuyenMai_BUS();
                if (s.equalsIgnoreCase(km.makm)) {
                    bus.sua(i, km);
                    model.setValueAt(km.makm, i, 0);
                    model.setValueAt(km.ten, i, 1);
                    model.setValueAt(km.ngaybd + "/" + km.thangbd + "/" + km.nambd, i, 2);
                    model.setValueAt(km.ngaykt + "/" + km.thangkt + "/" + km.namkt, i, 3);
                    tableCTKM.setModel(model);
                } else {
                    JOptionPane.showMessageDialog(null, "Không được sửa mã khuyến mãi!");
                }
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        KhuyenMai_DTO km = new KhuyenMai_DTO();
        km.makm = txtMa.getText().trim().toUpperCase();
        km.ten = txtTen.getText().trim();
        km.ngaybd = (String) cbboxNgaybd.getSelectedItem();
        km.thangbd = (String) cbboxThangbd.getSelectedItem();
        km.nambd = (String) cbboxNambd.getSelectedItem();
        km.ngaykt = (String) cbboxNgaykt.getSelectedItem();
        km.thangkt = (String) cbboxThangkt.getSelectedItem();
        km.namkt = (String) cbboxNamkt.getSelectedItem();
        if (Ktra(km.makm, "Mã khuyến mãi") == true && Ktra(km.ten, "Tên chương trình") == true) {
            int d = 0;
            for (KhuyenMai_DTO km1 : KhuyenMai_BUS.dskm) {
                if (km1.makm.equalsIgnoreCase(km.makm)) {
                    d++;
                    break;
                }
            }
            KhuyenMai_BUS bus = new KhuyenMai_BUS();
            bus.them(km);
            if (d == 0) {
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    model.removeRow(i);
                }
                if (KhuyenMai_BUS.dstkkm != null) {
                    KhuyenMai_BUS.dstkkm.clear();
                }
                for (KhuyenMai_DTO km1 : KhuyenMai_BUS.dskm) {
                    HienthiDSKM(km1);
                }
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtMaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtTen.requestFocus();
    }//GEN-LAST:event_txtMaKeyPressed

    private void txtTenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            cbboxNgaybd.requestFocus();
    }//GEN-LAST:event_txtTenKeyPressed

    private void cbboxNgaybdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbboxNgaybdKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            cbboxThangbd.requestFocus();
    }//GEN-LAST:event_cbboxNgaybdKeyPressed

    private void cbboxThangbdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbboxThangbdKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            cbboxNambd.requestFocus();
    }//GEN-LAST:event_cbboxThangbdKeyPressed

    private void cbboxNambdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbboxNambdKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            cbboxNgaykt.requestFocus();
    }//GEN-LAST:event_cbboxNambdKeyPressed

    private void cbboxNgayktKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbboxNgayktKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            cbboxThangkt.requestFocus();
    }//GEN-LAST:event_cbboxNgayktKeyPressed

    private void cbboxThangktKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbboxThangktKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            cbboxNamkt.requestFocus();
    }//GEN-LAST:event_cbboxThangktKeyPressed

    private void cbboxNamktKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbboxNamktKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            btnThem.requestFocus();
    }//GEN-LAST:event_cbboxNamktKeyPressed

    private void btnThemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnThemKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            KhuyenMai_DTO km = new KhuyenMai_DTO();
            km.makm = txtMa.getText().trim().toUpperCase();
            km.ten = txtTen.getText().trim();
            km.ngaybd = (String) cbboxNgaybd.getSelectedItem();
            km.thangbd = (String) cbboxThangbd.getSelectedItem();
            km.nambd = (String) cbboxNambd.getSelectedItem();
            km.ngaykt = (String) cbboxNgaykt.getSelectedItem();
            km.thangkt = (String) cbboxThangkt.getSelectedItem();
            km.namkt = (String) cbboxNamkt.getSelectedItem();
            if (Ktra(km.makm, "Mã khuyến mãi") == true && Ktra(km.ten, "Tên chương trình") == true) {
                int d = 0;
                for (KhuyenMai_DTO km1 : KhuyenMai_BUS.dskm) {
                    if (km1.makm.equalsIgnoreCase(km.makm)) {
                        d++;
                        break;
                    }
                }
                KhuyenMai_BUS bus = new KhuyenMai_BUS();
                bus.them(km);
                if (d == 0) {
                    for (int i = model.getRowCount() - 1; i >= 0; i--) {
                        model.removeRow(i);
                    }
                    if (KhuyenMai_BUS.dstkkm != null) {
                        KhuyenMai_BUS.dstkkm.clear();
                    }
                    for (KhuyenMai_DTO km1 : KhuyenMai_BUS.dskm) {
                        HienthiDSKM(km1);
                    }
                }
            }
            btnSua.requestFocus();
        }
    }//GEN-LAST:event_btnThemKeyPressed

    private void btnSuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSuaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            int i = tableCTKM.getSelectedRow();
            if (i >= 0) {
                String s = KhuyenMai_BUS.dskm.get(i).makm;
                KhuyenMai_DTO km = new KhuyenMai_DTO();
                km.makm = txtMa.getText().trim();
                km.ten = txtTen.getText().trim();
                km.ngaybd = (String) cbboxNgaybd.getSelectedItem();
                km.thangbd = (String) cbboxThangbd.getSelectedItem();
                km.nambd = (String) cbboxNambd.getSelectedItem();
                km.ngaykt = (String) cbboxNgaykt.getSelectedItem();
                km.thangkt = (String) cbboxThangkt.getSelectedItem();
                km.namkt = (String) cbboxNamkt.getSelectedItem();
                if (Ktra(km.makm, "Mã khuyến mãi") == true && Ktra(km.ten, "Tên chương trình") == true) {
                    KhuyenMai_BUS bus = new KhuyenMai_BUS();
                    if (s.equalsIgnoreCase(km.makm)) {
                        bus.sua(i, km);
                        model.setValueAt(km.makm, i, 0);
                        model.setValueAt(km.ten, i, 1);
                        model.setValueAt(km.ngaybd + "/" + km.thangbd + "/" + km.nambd, i, 2);
                        model.setValueAt(km.ngaykt + "/" + km.thangkt + "/" + km.namkt, i, 3);
                        tableCTKM.setModel(model);
                    } else {
                        JOptionPane.showMessageDialog(null, "Không được sửa mã khuyến mãi!");
                    }
                }
            }
            btnXoa.requestFocus();
        }
    }//GEN-LAST:event_btnSuaKeyPressed

    private void btnXoaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnXoaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            int i = tableCTKM.getSelectedRow();
            if (i >= 0) {
                KhuyenMai_BUS bus = new KhuyenMai_BUS();
                bus.xoa(KhuyenMai_BUS.dskm.get(i).makm, i);
                model.removeRow(i);
                tableCTKM.setModel(model);
            }
            rbtMa.requestFocus();
        }
    }//GEN-LAST:event_btnXoaKeyPressed

    private void rbtMaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbtMaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            rbtTen.requestFocus();
    }//GEN-LAST:event_rbtMaKeyPressed

    private void rbtTenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbtTenKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtNhaptk.requestFocus();
    }//GEN-LAST:event_rbtTenKeyPressed

    private void txtNhaptkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNhaptkKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            String s = txtNhaptk.getText().trim();
            KhuyenMai_BUS bus = new KhuyenMai_BUS();
            if (KhuyenMai_BUS.dstkkm == null) {
                bus.timkiem();
            }
            if (KhuyenMai_BUS.dstkkm != null) {
                KhuyenMai_BUS.dstkkm.clear();
            }
            for (KhuyenMai_DTO km : KhuyenMai_BUS.dskm) {
                if (rbtMa.isSelected() && s.equalsIgnoreCase(km.makm)) {
                    KhuyenMai_BUS.dstkkm.add(km);
                    HienthiDSKM(km);
                    break;
                }
                if (rbtTen.isSelected() && s.equalsIgnoreCase(km.ten)) {
                    KhuyenMai_BUS.dstkkm.add(km);
                    HienthiDSKM(km);
                }
            }
            btnTimkiem.requestFocus();
        }
    }//GEN-LAST:event_txtNhaptkKeyPressed

    private void btnTimkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnTimkiemKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            String s = txtNhaptk.getText().trim();
            KhuyenMai_BUS bus = new KhuyenMai_BUS();
            if (KhuyenMai_BUS.dstkkm == null) {
                bus.timkiem();
            }
            if (KhuyenMai_BUS.dstkkm != null) {
                KhuyenMai_BUS.dstkkm.clear();
            }
            for (KhuyenMai_DTO km : KhuyenMai_BUS.dskm) {
                if (rbtMa.isSelected() && s.equalsIgnoreCase(km.makm)) {
                    KhuyenMai_BUS.dstkkm.add(km);
                    HienthiDSKM(km);
                    break;
                }
                if (rbtTen.isSelected() && s.equalsIgnoreCase(km.ten)) {
                    KhuyenMai_BUS.dstkkm.add(km);
                    HienthiDSKM(km);
                }
            }
            cbboxDfirst.requestFocus();
        }
    }//GEN-LAST:event_btnTimkiemKeyPressed

    private void cbboxMfirstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbboxMfirstKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            cbboxYfirst.requestFocus();
    }//GEN-LAST:event_cbboxMfirstKeyPressed

    private void cbboxYfirstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbboxYfirstKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            btnTimkiemNgay.requestFocus();
    }//GEN-LAST:event_cbboxYfirstKeyPressed

    private void cbboxDfirstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbboxDfirstKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            cbboxMfirst.requestFocus();
    }//GEN-LAST:event_cbboxDfirstKeyPressed

    private void btnTimkiemNgayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnTimkiemNgayKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            KhuyenMai_BUS bus = new KhuyenMai_BUS();
            if (KhuyenMai_BUS.dstkkm == null) {
                bus.timkiem();
            }
            if (KhuyenMai_BUS.dstkkm != null) {
                KhuyenMai_BUS.dstkkm.clear();
            }
            int d = Integer.parseInt((String) cbboxDfirst.getSelectedItem());
            int m = Integer.parseInt((String) cbboxMfirst.getSelectedItem());
            int y = Integer.parseInt((String) cbboxYfirst.getSelectedItem());
            for (KhuyenMai_DTO km : KhuyenMai_BUS.dskm) {
                int d1 = Integer.parseInt(km.ngaybd);
                int m1 = Integer.parseInt(km.thangbd);
                int y1 = Integer.parseInt(km.nambd);
                int d2 = Integer.parseInt(km.ngaykt);// d1/m1/y1  d/m/y  d2/m2/y2
                int m2 = Integer.parseInt(km.thangkt);
                int y2 = Integer.parseInt(km.namkt); //y=y1 y<y2  y=y1=y2  y=y2 y1<y  y1<y<y2
                if (y1 <= y && y <= y2) {
                    if (y1 == y && y < y2) {
                        if (m1 <= m) {
                            if (m1 == m && d1 <= d) {
                                KhuyenMai_BUS.dstkkm.add(km);
                                HienthiDSKM(km);
                            } else if (d1 <= d) {
                                KhuyenMai_BUS.dstkkm.add(km);
                                HienthiDSKM(km);
                            }
                        }
                    }
                    if (y == y1 && y == y2) {
                        if (m1 <= m && m <= m2) {
                            if (m1 == m && m == m2 && d1 <= d && d <= d2) {
                                KhuyenMai_BUS.dstkkm.add(km);
                                HienthiDSKM(km);
                            } else {
                                if (m1 == m && m < m2 && d1 <= d) {
                                    KhuyenMai_BUS.dstkkm.add(km);
                                    HienthiDSKM(km);
                                }
                                if (m2 == m && m > m1 && d <= d2) {
                                    KhuyenMai_BUS.dstkkm.add(km);
                                    HienthiDSKM(km);
                                }
                                if (m1 < m && m2 > m) {
                                    KhuyenMai_BUS.dstkkm.add(km);
                                    HienthiDSKM(km);
                                }
                            }
                        }
                    }
                    if (y2 == y && y1 < y) {
                        if (m2 >= m) {
                            if (m2 == m && d <= d2) {
                                KhuyenMai_BUS.dstkkm.add(km);
                                HienthiDSKM(km);
                            } else if (d <= d2) {
                                KhuyenMai_BUS.dstkkm.add(km);
                                HienthiDSKM(km);
                            }
                        }
                    }
                    if (y1 < y && y < y2) {
                        KhuyenMai_BUS.dstkkm.add(km);
                        HienthiDSKM(km);
                    }
                }
            }
            btnHienthi.requestFocus();
        }
    }//GEN-LAST:event_btnTimkiemNgayKeyPressed

    private void btnHienthiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnHienthiKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            if (KhuyenMai_BUS.dstkkm != null) {
                KhuyenMai_BUS.dstkkm.clear();
            }
            for (KhuyenMai_DTO km : KhuyenMai_BUS.dskm) {
                HienthiDSKM(km);
            }
            txtMa.requestFocus();
        }
    }//GEN-LAST:event_btnHienthiKeyPressed

    private void txtMaandFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaandFocusGained
        if (txtMaand.getText().trim().toLowerCase().equals("mã chương trình")) {
            txtMaand.setText("");
            txtMaand.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtMaandFocusGained

    private void txtMaandFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaandFocusLost
        if (txtMaand.getText().trim().equals("") || txtMaand.getText().trim().toLowerCase().equals("mã chương trình")) {
            txtMaand.setText("Mã chương trình");
            txtMaand.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtMaandFocusLost

    private void txtMaspandFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaspandFocusGained
        if (txtMaspand.getText().trim().toLowerCase().equals("mã sản phẩm")) {
            txtMaspand.setText("");
            txtMaspand.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtMaspandFocusGained

    private void txtMaspandFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaspandFocusLost
        if (txtMaspand.getText().trim().equals("") || txtMaspand.getText().trim().toLowerCase().equals("mã sản phẩm")) {
            txtMaspand.setText("Mã sản phẩm");
            txtMaspand.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtMaspandFocusLost

    private void txtMasporFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMasporFocusGained
        if (txtMaspor.getText().trim().toLowerCase().equals("mã sản phẩm")) {
            txtMaspor.setText("");
            txtMaspor.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtMasporFocusGained

    private void txtMasporFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMasporFocusLost
        if (txtMaspor.getText().trim().equals("") || txtMaspor.getText().trim().toLowerCase().equals("mã sản phẩm")) {
            txtMaspor.setText("Mã sản phẩm");
            txtMaspor.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtMasporFocusLost

    private void txtNDorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNDorFocusGained
        if (txtNDor.getText().trim().toLowerCase().equals("nội dung khuyến mãi")) {
            txtNDor.setText("");
            txtNDor.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtNDorFocusGained

    private void txtNDorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNDorFocusLost
        if (txtNDor.getText().trim().equals("") || txtNDor.getText().trim().toLowerCase().equals("nội dung khuyến mãi")) {
            txtNDor.setText("Nội dung khuyến mãi");
            txtNDor.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtNDorFocusLost

    private void btnTimkiemKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemKhoaActionPerformed
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        String s = txtNhapkhoa.getText().trim();
        CTKhuyenMai_BUS bus = new CTKhuyenMai_BUS();
        if (CTKhuyenMai_BUS.dstimkiemct == null) {
            bus.timkiemchitiet();
        }
        if (CTKhuyenMai_BUS.dstimkiemct != null) {
            CTKhuyenMai_BUS.dstimkiemct.clear();
        }
        for (CTKhuyenMai_DTO ctkm : CTKhuyenMai_BUS.dscttkkm) {
            if (cbboxKhoa.getSelectedItem().equals("Mã sản phẩm") && s.equalsIgnoreCase(ctkm.masp)) {
                CTKhuyenMai_BUS.dstimkiemct.add(ctkm);
                HienthiDSCTKM(ctkm);
            }
            if (cbboxKhoa.getSelectedItem().equals("Nội dung khuyến mãi") && s.equalsIgnoreCase(ctkm.noidungkm)) {
                CTKhuyenMai_BUS.dstimkiemct.add(ctkm);
                HienthiDSCTKM(ctkm);
            }
        }
    }//GEN-LAST:event_btnTimkiemKhoaActionPerformed

    private void btnHienthiCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienthiCTActionPerformed
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        CTKhuyenMai_BUS bus = new CTKhuyenMai_BUS();
        if (CTKhuyenMai_BUS.dstimkiemct != null) {
            CTKhuyenMai_BUS.dstimkiemct.clear();
        }
        if (CTKhuyenMai_BUS.dscttkkm == null) {
            bus.timkiem();
        }
        for (CTKhuyenMai_DTO kh : CTKhuyenMai_BUS.dscttkkm)
            HienthiDSCTKM(kh);
    }//GEN-LAST:event_btnHienthiCTActionPerformed

    private void btnTKAndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKAndActionPerformed
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        String s = txtMaand.getText().trim();
        String s1 = txtMaspand.getText().trim();
        CTKhuyenMai_BUS bus = new CTKhuyenMai_BUS();
        if (CTKhuyenMai_BUS.dstimkiemct == null) {
            bus.timkiemchitiet();
        }
        if (CTKhuyenMai_BUS.dstimkiemct != null) {
            CTKhuyenMai_BUS.dstimkiemct.clear();
        }
        for (CTKhuyenMai_DTO ctkm : CTKhuyenMai_BUS.dscttkkm)
            if (s.equalsIgnoreCase(ctkm.makm) && s1.equalsIgnoreCase(ctkm.masp)) {
                CTKhuyenMai_BUS.dstimkiemct.add(ctkm);
                HienthiDSCTKM(ctkm);
                break;
            }
    }//GEN-LAST:event_btnTKAndActionPerformed

    private void btnTkOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTkOrActionPerformed
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        String s = txtMaspor.getText().trim();
        String s1 = txtNDor.getText().trim();
        CTKhuyenMai_BUS bus = new CTKhuyenMai_BUS();
        if (CTKhuyenMai_BUS.dstimkiemct == null) {
            bus.timkiemchitiet();
        }
        if (CTKhuyenMai_BUS.dstimkiemct != null) {
            CTKhuyenMai_BUS.dstimkiemct.clear();
        }
        for (CTKhuyenMai_DTO ctkm : CTKhuyenMai_BUS.dscttkkm)
            if (s.equalsIgnoreCase(ctkm.masp) || s1.equalsIgnoreCase(ctkm.noidungkm)) {
                CTKhuyenMai_BUS.dstimkiemct.add(ctkm);
                HienthiDSCTKM(ctkm);
                break;
            }
    }//GEN-LAST:event_btnTkOrActionPerformed

    private void txtMaCTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaCTKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtMaSP.requestFocus();
    }//GEN-LAST:event_txtMaCTKeyPressed

    private void txtMaSPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaSPKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtNoidung.requestFocus();
    }//GEN-LAST:event_txtMaSPKeyPressed

    private void txtNoidungKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoidungKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtNdchitiet.requestFocus();
    }//GEN-LAST:event_txtNoidungKeyPressed

    private void btnThemCTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnThemCTKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            CTKhuyenMai_DTO km = new CTKhuyenMai_DTO();
            int i = 1, d = 0;
            do {
                d = 0;
                km.mact = "CT" + String.valueOf(CTKhuyenMai_BUS.dsctkm.size() + i);
                for (CTKhuyenMai_DTO ctkm : CTKhuyenMai_BUS.dsctkm) {
                    if (ctkm.mact.equalsIgnoreCase(km.mact)) {
                        d++;
                        break;
                    }
                }
                i++;
            } while (d != 0);
            km.makm = txtMaCT.getText().trim().toUpperCase();
            km.masp = txtMaSP.getText().trim().toUpperCase();
            km.noidungkm = txtNoidung.getText().trim();
            km.noidungct = txtNdchitiet.getText().trim();
            km.giamgia = txtGiamgia.getText().trim();
            if (Ktra(km.makm, "Mã khuyến mãi") == true && Ktra(km.masp, "Mã sản phẩm") == true && Ktra(km.noidungkm, "Nội dung khuyến mãi") == true && KtraSo(km.giamgia)) {
                d = 0;
                if (CTKhuyenMai_BUS.dscttkkm.size() != 0) {
                    for (CTKhuyenMai_DTO km1 : CTKhuyenMai_BUS.dscttkkm) {
                        if (km1.masp.equalsIgnoreCase(km.masp)) {
                            d++;
                            break;
                        }
                    }
                    if (CTKhuyenMai_BUS.dscttkkm.get(0).makm.equalsIgnoreCase(km.makm)) {
                        CTKhuyenMai_BUS bus = new CTKhuyenMai_BUS();
                        bus.them(km);
                        if (d == 0) {
                            for (i = model1.getRowCount() - 1; i >= 0; i--) {
                                model1.removeRow(i);
                            }
                            if (CTKhuyenMai_BUS.dstimkiemct != null) {
                                CTKhuyenMai_BUS.dstimkiemct.clear();
                            }
                            for (CTKhuyenMai_DTO km1 : CTKhuyenMai_BUS.dscttkkm) {
                                HienthiDSCTKM(km1);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Mã khuyến mãi phải là: " + CTKhuyenMai_BUS.dscttkkm.get(0).makm);
                    }
                } else {
                    CTKhuyenMai_BUS bus = new CTKhuyenMai_BUS();
                    bus.them(km);
                    for (i = model1.getRowCount() - 1; i >= 0; i--) {
                        model1.removeRow(i);
                    }
                    if (CTKhuyenMai_BUS.dstimkiemct != null) {
                        CTKhuyenMai_BUS.dstimkiemct.clear();
                    }
                    for (CTKhuyenMai_DTO km1 : CTKhuyenMai_BUS.dscttkkm) {
                        HienthiDSCTKM(km1);
                    }
                }
            }
            btnSuaCT.requestFocus();
        }
    }//GEN-LAST:event_btnThemCTKeyPressed

    private void btnSuaCTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSuaCTKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            int i = tableCTCTKM.getSelectedRow();
            if (i >= 0) {
                String s = CTKhuyenMai_BUS.dscttkkm.get(i).makm;
                CTKhuyenMai_DTO km = new CTKhuyenMai_DTO();
                km.mact = CTKhuyenMai_BUS.dscttkkm.get(i).mact;
                km.makm = txtMaCT.getText().trim().toUpperCase();
                km.masp = txtMaSP.getText().trim().toUpperCase();
                km.noidungkm = txtNoidung.getText().trim();
                km.noidungct = txtNdchitiet.getText().trim();
                km.giamgia = txtGiamgia.getText().trim();
                if (Ktra(km.makm, "Mã khuyến mãi") == true && Ktra(km.masp, "Mã sản phẩm") == true && Ktra(km.noidungkm, "Nội dung khuyến mãi") == true && KtraSo(km.giamgia)) {
                    CTKhuyenMai_BUS bus = new CTKhuyenMai_BUS();
                    if (s.equalsIgnoreCase(km.makm)) {
                        int j = 0;
                        for (CTKhuyenMai_DTO ctkm : CTKhuyenMai_BUS.dsctkm) {
                            if (CTKhuyenMai_BUS.dscttkkm.get(i).mact.equalsIgnoreCase(ctkm.mact)) {
                                break;
                            }
                            j++;
                        }
                        bus.sua(j, km);
                        model1.setValueAt(km.makm, i, 0);
                        model1.setValueAt(km.masp, i, 1);
                        model1.setValueAt(km.noidungkm, i, 2);
                        model1.setValueAt(km.giamgia, i, 3);
                        tableCTCTKM.setModel(model1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Không được sửa mã khuyến mãi!");
                    }
                }
            }
            btnXoaCT.requestFocus();
        }
    }//GEN-LAST:event_btnSuaCTKeyPressed

    private void btnXoaCTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnXoaCTKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            int i = tableCTCTKM.getSelectedRow();
            if (i >= 0) {
                int j = 0;
                for (CTKhuyenMai_DTO ctkm : CTKhuyenMai_BUS.dsctkm) {
                    if (CTKhuyenMai_BUS.dscttkkm.get(i).mact.equalsIgnoreCase(ctkm.mact)) {
                        break;
                    }
                    j++;
                }
                CTKhuyenMai_BUS bus = new CTKhuyenMai_BUS();
                bus.xoa(CTKhuyenMai_BUS.dscttkkm.get(i).mact, j);
                CTKhuyenMai_BUS.dscttkkm.remove(i);
                model1.removeRow(i);
                tableCTCTKM.setModel(model1);
            }
            cbboxKhoa.requestFocus();
        }
    }//GEN-LAST:event_btnXoaCTKeyPressed

    private void txtNdchitietKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNdchitietKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            btnThemCT.requestFocus();
    }//GEN-LAST:event_txtNdchitietKeyPressed

    private void cbboxKhoaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbboxKhoaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtNhapkhoa.requestFocus();
    }//GEN-LAST:event_cbboxKhoaKeyPressed

    private void txtNhapkhoaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNhapkhoaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            btnTimkiemKhoa.requestFocus();
    }//GEN-LAST:event_txtNhapkhoaKeyPressed

    private void btnTimkiemKhoaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnTimkiemKhoaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            for (int i = model1.getRowCount() - 1; i >= 0; i--) {
                model1.removeRow(i);
            }
            String s = txtNhapkhoa.getText().trim();
            CTKhuyenMai_BUS bus = new CTKhuyenMai_BUS();
            if (CTKhuyenMai_BUS.dstimkiemct == null) {
                bus.timkiemchitiet();
            }
            if (CTKhuyenMai_BUS.dstimkiemct != null) {
                CTKhuyenMai_BUS.dstimkiemct.clear();
            }
            for (CTKhuyenMai_DTO ctkm : CTKhuyenMai_BUS.dscttkkm) {
                if (cbboxKhoa.getSelectedItem().equals("Mã sản phẩm") && s.equalsIgnoreCase(ctkm.masp)) {
                    CTKhuyenMai_BUS.dstimkiemct.add(ctkm);
                    HienthiDSCTKM(ctkm);
                }
                if (cbboxKhoa.getSelectedItem().equals("Nội dung khuyến mãi") && s.equalsIgnoreCase(ctkm.noidungkm)) {
                    CTKhuyenMai_BUS.dstimkiemct.add(ctkm);
                    HienthiDSCTKM(ctkm);
                }
            }
            txtMaand.requestFocus();
        }
    }//GEN-LAST:event_btnTimkiemKhoaKeyPressed

    private void txtMaandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaandKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtMaspand.requestFocus();
    }//GEN-LAST:event_txtMaandKeyPressed

    private void txtMaspandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaspandKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            btnTKAnd.requestFocus();
    }//GEN-LAST:event_txtMaspandKeyPressed

    private void btnTKAndKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnTKAndKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            for (int i = model1.getRowCount() - 1; i >= 0; i--) {
                model1.removeRow(i);
            }
            String s = txtMaand.getText().trim();
            String s1 = txtMaspand.getText().trim();
            CTKhuyenMai_BUS bus = new CTKhuyenMai_BUS();
            if (CTKhuyenMai_BUS.dstimkiemct == null) {
                bus.timkiemchitiet();
            }
            if (CTKhuyenMai_BUS.dstimkiemct != null) {
                CTKhuyenMai_BUS.dstimkiemct.clear();
            }
            for (CTKhuyenMai_DTO ctkm : CTKhuyenMai_BUS.dscttkkm) {
                if (s.equalsIgnoreCase(ctkm.makm) && s1.equalsIgnoreCase(ctkm.masp)) {
                    CTKhuyenMai_BUS.dstimkiemct.add(ctkm);
                    HienthiDSCTKM(ctkm);
                    break;
                }
            }
            txtMaspor.requestFocus();
        }
    }//GEN-LAST:event_btnTKAndKeyPressed

    private void txtMasporKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMasporKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtNDor.requestFocus();
    }//GEN-LAST:event_txtMasporKeyPressed

    private void txtNDorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNDorKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            btnTkOr.requestFocus();
    }//GEN-LAST:event_txtNDorKeyPressed

    private void btnTkOrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnTkOrKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            for (int i = model1.getRowCount() - 1; i >= 0; i--) {
                model1.removeRow(i);
            }
            String s = txtMaspor.getText().trim();
            String s1 = txtNDor.getText().trim();
            CTKhuyenMai_BUS bus = new CTKhuyenMai_BUS();
            if (CTKhuyenMai_BUS.dstimkiemct == null) {
                bus.timkiemchitiet();
            }
            if (CTKhuyenMai_BUS.dstimkiemct != null) {
                CTKhuyenMai_BUS.dstimkiemct.clear();
            }
            for (CTKhuyenMai_DTO ctkm : CTKhuyenMai_BUS.dscttkkm) {
                if (s.equalsIgnoreCase(ctkm.masp) || s1.equalsIgnoreCase(ctkm.noidungkm)) {
                    CTKhuyenMai_BUS.dstimkiemct.add(ctkm);
                    HienthiDSCTKM(ctkm);
                    break;
                }
            }
            btnHienthiCT.requestFocus();
        }
    }//GEN-LAST:event_btnTkOrKeyPressed

    private void btnHienthiCTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnHienthiCTKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            for (int i = model1.getRowCount() - 1; i >= 0; i--) {
                model1.removeRow(i);
            }
            if (CTKhuyenMai_BUS.dstimkiemct != null) {
                CTKhuyenMai_BUS.dstimkiemct.clear();
            }
            for (CTKhuyenMai_DTO kh : CTKhuyenMai_BUS.dscttkkm) {
                HienthiDSCTKM(kh);
            }
            txtMaCT.requestFocus();
        }
    }//GEN-LAST:event_btnHienthiCTKeyPressed
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
                KM.setVisible(false);
                SP.setVisible(true);
                SP.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập")) {
            if (btnKhachHang.isSelected() == true) {
                KM.setVisible(false);
                KH.setVisible(true);
                KH.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapHangActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập") && checkQuyenQLGD() == true) {
            if (btnNhapHang.isSelected() == true) {
                KM.setVisible(false);
                NH.setVisible(true);
                NH.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnNhapHangActionPerformed

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

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập") && checkQuyenQLGD() == true) {
            if (btnThongKe.isSelected() == true) {
                KM.setVisible(false);
                TK.setVisible(true);
                TK.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnThongKeActionPerformed

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

    private void btnHoTroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoTroActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập")) {
            if (btnHoTro.isSelected() == true) {
                KM.setVisible(false);
                HT.setVisible(true);
                HT.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnHoTroActionPerformed

    private void btnLienHeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLienHeActionPerformed
        JOptionPane.showMessageDialog(this, "Bạn vui lòng chọn chức năng hỗ trợ để liên hệ!");
    }//GEN-LAST:event_btnLienHeActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        KM.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        if (btnHuongDan.isSelected() == true) {
            HD.setVisible(true);
            HD.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnHuongDanActionPerformed

    private void btnDonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonHangActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập")) {
            if (btnDonHang.isSelected() == true) {
                KM.setVisible(false);
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
                KM.setVisible(false);
                NV.setVisible(true);
                NV.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void HienthiDSKM(KhuyenMai_DTO km) {
        Vector row = new Vector();
        row.add(km.makm);
        row.add(km.ten);
        row.add(km.ngaybd + "/" + km.thangbd + "/" + km.nambd);
        row.add(km.ngaykt + "/" + km.thangkt + "/" + km.namkt);
        model.addRow(row);
        tableCTKM.setModel(model);
    }

    private void HienthiDSCTKM(CTKhuyenMai_DTO km) {
        Vector row = new Vector();
        row.add(km.makm);
        row.add(km.masp);
        row.add(km.noidungkm);
        row.add(km.giamgia);
        model1.addRow(row);
        tableCTCTKM.setModel(model1);
        txtNdchitiet.setText(km.noidungct);
    }

    private void DocDSKM() {
        KhuyenMai_BUS bus = new KhuyenMai_BUS();
        if (KhuyenMai_BUS.dskm == null) {
            bus.DocDSKM();
        }
        Vector header = new Vector();
        header.add("Mã chương trình");
        header.add("Tên chương trình");
        header.add("Ngày bắt đầu");
        header.add("Ngày kết thúc");
        model = new DefaultTableModel(header, 0);
        for (KhuyenMai_DTO km : KhuyenMai_BUS.dskm) {
            Vector row = new Vector();
            row.add(km.makm);
            row.add(km.ten);
            row.add(km.ngaybd + "/" + km.thangbd + "/" + km.nambd);
            row.add(km.ngaykt + "/" + km.thangkt + "/" + km.namkt);
            model.addRow(row);
        }
        tableCTKM.setModel(model);
    }

    private void DocDSCTKM() {
        CTKhuyenMai_BUS bus = new CTKhuyenMai_BUS();
        if (CTKhuyenMai_BUS.dsctkm == null) {
            bus.DocDSCTKM();
        }
        Vector header = new Vector();
        header.add("Mã chương trình");
        header.add("Mã sản phẩm");
        header.add("Nội dung khuyến mãi");
        header.add("% Giảm giá");
        model1 = new DefaultTableModel(header, 0);
        tableCTCTKM.setModel(model1);
    }

    private void HienthiCTCTKM(String ma) {
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        CTKhuyenMai_BUS bus = new CTKhuyenMai_BUS();
        if (CTKhuyenMai_BUS.dscttkkm == null) {
            bus.timkiem();
        }
        if (CTKhuyenMai_BUS.dscttkkm != null) {
            CTKhuyenMai_BUS.dscttkkm.clear();
        }
        for (CTKhuyenMai_DTO km : CTKhuyenMai_BUS.dsctkm) {
            //System.out.println(km.mact + " " + km.makm);
            if (km.makm.equalsIgnoreCase(ma)) {
                bus.dscttkkm.add(km);
                Vector row = new Vector();
                row.add(km.makm);
                row.add(km.masp);
                row.add(km.noidungkm);
                row.add(km.giamgia);
                model1.addRow(row);
                //txtNdchitiet.setText(km.noidungct);
            }
        }
        tableCTCTKM.setModel(model1);
    }

    private void createComboD() {
        String[] s = new String[31];
        for (int i = 1; i <= 31; i++) //ngay.addItem(i);
        {
            s[i - 1] = String.format("%02d", i);
        }
        cbboxNgaybd.setModel(new DefaultComboBoxModel(s));
        cbboxNgaykt.setModel(new DefaultComboBoxModel(s));
        cbboxDfirst.setModel(new DefaultComboBoxModel(s));
        //cbboxDlast.setModel(new DefaultComboBoxModel(s));
    }

    private void createComboM() {
        String[] s = new String[12];
        for (int i = 1; i <= 12; i++) //thang.addItem(i);
        {
            s[i - 1] = String.format("%02d", i);
        }
        cbboxThangbd.setModel(new DefaultComboBoxModel(s));
        cbboxThangkt.setModel(new DefaultComboBoxModel(s));
        cbboxMfirst.setModel(new DefaultComboBoxModel(s));
        //cbboxMlast.setModel(new DefaultComboBoxModel(s));
    }

    private void createComboY() {
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        //System.out.println(year);
        String[] s = new String[21];
        for (int i = year - 10; i <= year + 10; i++) //year.addItem(i);
        {
            s[i - year + 10] = String.valueOf(i);
        }
        cbboxNambd.setModel(new DefaultComboBoxModel(s));
        cbboxNamkt.setModel(new DefaultComboBoxModel(s));
        cbboxYfirst.setModel(new DefaultComboBoxModel(s));
        //cbboxYlast.setModel(new DefaultComboBoxModel(s));
    }

    public void setTextTenDN(String s) {
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
            java.util.logging.Logger.getLogger(KhuyenMai_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhuyenMai_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhuyenMai_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhuyenMai_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KM.setVisible(true);
                KM.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDangNhap;
    private javax.swing.JToggleButton btnDoanhThu;
    private javax.swing.JToggleButton btnDonHang;
    private javax.swing.JButton btnHienthi;
    private javax.swing.JButton btnHienthiCT;
    private javax.swing.JToggleButton btnHoTro;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JToggleButton btnKhachHang;
    private javax.swing.JButton btnLienHe;
    private javax.swing.JToggleButton btnNhanVien;
    private javax.swing.JToggleButton btnNhapHang;
    private javax.swing.JToggleButton btnSanPham;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSuaCT;
    private javax.swing.JButton btnTKAnd;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemCT;
    private javax.swing.JButton btnThoat;
    private javax.swing.JToggleButton btnThongKe;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnTimkiemKhoa;
    private javax.swing.JButton btnTimkiemNgay;
    private javax.swing.JButton btnTkOr;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaCT;
    private javax.swing.JToggleButton btnkhuyenMai;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbboxDfirst;
    private javax.swing.JComboBox<String> cbboxKhoa;
    private javax.swing.JComboBox<String> cbboxMfirst;
    private javax.swing.JComboBox<String> cbboxNambd;
    private javax.swing.JComboBox<String> cbboxNamkt;
    private javax.swing.JComboBox<String> cbboxNgaybd;
    private javax.swing.JComboBox<String> cbboxNgaykt;
    private javax.swing.JComboBox<String> cbboxThangbd;
    private javax.swing.JComboBox<String> cbboxThangkt;
    private javax.swing.JComboBox<String> cbboxYfirst;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbAnd;
    private javax.swing.JLabel lbChitiet;
    private javax.swing.JLabel lbGiamgia;
    private javax.swing.JLabel lbKhoa;
    private javax.swing.JLabel lbKhoatk;
    private javax.swing.JLabel lbMa;
    private javax.swing.JLabel lbMaCT;
    private javax.swing.JLabel lbMaSP;
    private javax.swing.JLabel lbNgay;
    private javax.swing.JLabel lbNgaybd;
    private javax.swing.JLabel lbNgaykt;
    private javax.swing.JLabel lbOr;
    private javax.swing.JLabel lbTen;
    private javax.swing.JPanel panelCTCTKM;
    private javax.swing.JPanel panelCTKM;
    private javax.swing.JPanel panelChitiet;
    private javax.swing.JPanel panelThongtin;
    private javax.swing.JRadioButton rbtMa;
    private javax.swing.JRadioButton rbtTen;
    private javax.swing.JTable tableCTCTKM;
    private javax.swing.JTable tableCTKM;
    private javax.swing.JTabbedPane tbChitiet;
    private javax.swing.JTextField txtGiamgia;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMaCT;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtMaand;
    private javax.swing.JTextField txtMaspand;
    private javax.swing.JTextField txtMaspor;
    private javax.swing.JTextField txtNDor;
    private javax.swing.JTextPane txtNdchitiet;
    private javax.swing.JTextField txtNhapkhoa;
    private javax.swing.JTextField txtNhaptk;
    private javax.swing.JTextField txtNoidung;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
