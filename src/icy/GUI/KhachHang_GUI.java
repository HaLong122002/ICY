package icy.GUI;

import ICY.BUS.QLNV_BUS;
import ICY.DTO.QLNV_DTO;
import icy.*;
import icy.BUS.KhachHang_BUS;
import icy.DTO.KhachHang_DTO;
import icy.GUI.*;
import static icy.GUI.BanHang_GUI.BH;
import static icy.GUI.DangNhap_GUI.DN;
import static icy.GUI.DoanhThu_GUI.DT;
import static icy.GUI.HoSoNV_GUI.HS;
import static icy.GUI.HoTro_GUI.HT;
import static icy.GUI.HuongDan_GUI.HD;
import static icy.GUI.KhuyenMai_GUI.KM;
import static icy.GUI.NhapHang_GUI.NH;
import static icy.GUI.QLNV_GUI.NV;
import static icy.GUI.SanPham_GUI.SP;
import static icy.GUI.ThongKe_GUI.TK;
import java.awt.Color;
import java.awt.color.ColorSpace;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class KhachHang_GUI extends javax.swing.JFrame {
    
    public static KhachHang_GUI KH=new KhachHang_GUI();
    DefaultTableModel model = new DefaultTableModel();
    //static SanPham_GUI sp=new SanPham_GUI();
    
    public KhachHang_GUI() {
        initComponents();     
        panel_ThongtinKH.setFocusable(true);
        DocDSKH();
        try{
            btnKhachHang.setSelected(true);
        }catch(Exception ex){
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
        tbChitietKH = new javax.swing.JTabbedPane();
        panel_ThongtinKH = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableKhachhang = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSonha = new javax.swing.JTextField();
        txtDuong = new javax.swing.JTextField();
        txtPhuong = new javax.swing.JTextField();
        txtQuan = new javax.swing.JTextField();
        txtThanhpho = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lbKhoatimkiem = new javax.swing.JLabel();
        cbboxKhoatimkiem = new javax.swing.JComboBox<>();
        lbNhaptimkiem = new javax.swing.JLabel();
        txtNhaptimkiem = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        btnHienthi = new javax.swing.JButton();
        txtTktenand = new javax.swing.JTextField();
        lbAnd = new javax.swing.JLabel();
        txtTksdt = new javax.swing.JTextField();
        btnTimkiemAnd = new javax.swing.JButton();
        txtTkho = new javax.swing.JTextField();
        lbOr = new javax.swing.JLabel();
        txtTkTenor = new javax.swing.JTextField();
        btnTimkiemOR = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        tbChitietKH.setBackground(new java.awt.Color(185, 204, 255));
        tbChitietKH.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tbChitietKH.setName("tbChitietKH"); // NOI18N

        panel_ThongtinKH.setBackground(new java.awt.Color(216, 240, 240));
        panel_ThongtinKH.setName("panel_Thongtin"); // NOI18N

        tableKhachhang.setModel(new javax.swing.table.DefaultTableModel(
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
        tableKhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDSKHMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableKhachhang);

        jPanel6.setBackground(new java.awt.Color(197, 233, 234));

        jLabel2.setText("Mã khách hàng");
        jLabel2.setName("lb_Ma"); // NOI18N

        txtMa.setForeground(new java.awt.Color(153, 153, 153));
        txtMa.setText("Nhập mã");
        txtMa.setName("txt_Ma"); // NOI18N
        txtMa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaFocusLost(evt);
            }
        });
        txtMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaKeyPressed(evt);
            }
        });

        jLabel5.setText("Họ lót");
        jLabel5.setName("lb_Ho"); // NOI18N

        txtHo.setForeground(new java.awt.Color(153, 153, 153));
        txtHo.setText("Nhập họ lót");
        txtHo.setName("txt_Ho"); // NOI18N
        txtHo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoFocusLost(evt);
            }
        });
        txtHo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoKeyPressed(evt);
            }
        });

        jLabel6.setText("Tên");
        jLabel6.setName("lb_Ten"); // NOI18N

        txtTen.setForeground(new java.awt.Color(153, 153, 153));
        txtTen.setText("Nhập tên");
        txtTen.setName("txt_Ten"); // NOI18N
        txtTen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenFocusLost(evt);
            }
        });
        txtTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTenKeyPressed(evt);
            }
        });

        jLabel7.setText("Số điện thoại");
        jLabel7.setName("lb_SDT"); // NOI18N

        txtSDT.setForeground(new java.awt.Color(153, 153, 153));
        txtSDT.setText("Nhập số điện thoại");
        txtSDT.setName("txt_SDT"); // NOI18N
        txtSDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSDTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSDTFocusLost(evt);
            }
        });
        txtSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSDTKeyPressed(evt);
            }
        });

        jLabel8.setText("Địa chỉ");
        jLabel8.setName("lb_Diachi"); // NOI18N

        txtSonha.setForeground(new java.awt.Color(153, 153, 153));
        txtSonha.setText("Số nhà");
        txtSonha.setName("txt_Diachi"); // NOI18N
        txtSonha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSonhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSonhaFocusLost(evt);
            }
        });
        txtSonha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSonhaKeyPressed(evt);
            }
        });

        txtDuong.setForeground(new java.awt.Color(153, 153, 153));
        txtDuong.setText(" Đường");
        txtDuong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDuongFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDuongFocusLost(evt);
            }
        });
        txtDuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDuongKeyPressed(evt);
            }
        });

        txtPhuong.setForeground(new java.awt.Color(153, 153, 153));
        txtPhuong.setText("Phường/Xã");
        txtPhuong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPhuongFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPhuongFocusLost(evt);
            }
        });
        txtPhuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhuongKeyPressed(evt);
            }
        });

        txtQuan.setForeground(new java.awt.Color(153, 153, 153));
        txtQuan.setText("Quận/Huyện");
        txtQuan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuanFocusLost(evt);
            }
        });
        txtQuan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuanKeyPressed(evt);
            }
        });

        txtThanhpho.setForeground(new java.awt.Color(153, 153, 153));
        txtThanhpho.setText("Tỉnh/Thành phố");
        txtThanhpho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtThanhphoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtThanhphoFocusLost(evt);
            }
        });
        txtThanhpho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtThanhphoKeyPressed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(0, 204, 204));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/ThemKH.png"))); // NOI18N
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

        btnSua.setBackground(new java.awt.Color(0, 204, 204));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua(evt);
            }
        });
        btnSua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSuaKeyPressed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(0, 204, 204));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/XoaKH.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtSonha, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDuong, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPhuong, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtThanhpho, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSonha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDuong, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhuong, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThanhpho, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtMa.getAccessibleContext().setAccessibleName("");

        jPanel5.setBackground(new java.awt.Color(197, 233, 234));

        lbKhoatimkiem.setText("Chọn khóa tìm kiếm:");

        cbboxKhoatimkiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã khách hàng", "Họ lót", "Tên", "Số điện thoại", "Địa chỉ" }));
        cbboxKhoatimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbboxKhoatimkiemKeyPressed(evt);
            }
        });

        lbNhaptimkiem.setText("Nhập giá trị tìm kiếm:");

        txtNhaptimkiem.setForeground(new java.awt.Color(153, 153, 153));
        txtNhaptimkiem.setText("Nhập tìm kiếm");
        txtNhaptimkiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNhaptimkiemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNhaptimkiemFocusLost(evt);
            }
        });
        txtNhaptimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNhaptimkiemKeyPressed(evt);
            }
        });

        btnTimkiem.setBackground(new java.awt.Color(0, 204, 204));
        btnTimkiem.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnTimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/TimkiemKH.png"))); // NOI18N
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

        btnHienthi.setBackground(new java.awt.Color(0, 204, 204));
        btnHienthi.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnHienthi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/ToanboKH.png"))); // NOI18N
        btnHienthi.setText("Hiển thị toàn bộ");
        btnHienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienthi(evt);
            }
        });
        btnHienthi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnHienthiKeyPressed(evt);
            }
        });

        txtTktenand.setForeground(new java.awt.Color(153, 153, 153));
        txtTktenand.setText("Nhập tên");
        txtTktenand.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTktenandFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTktenandFocusLost(evt);
            }
        });
        txtTktenand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTktenandKeyPressed(evt);
            }
        });

        lbAnd.setText("AND");

        txtTksdt.setForeground(new java.awt.Color(153, 153, 153));
        txtTksdt.setText("Nhập số điện thoại");
        txtTksdt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTksdtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTksdtFocusLost(evt);
            }
        });
        txtTksdt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTksdtKeyPressed(evt);
            }
        });

        btnTimkiemAnd.setBackground(new java.awt.Color(0, 204, 204));
        btnTimkiemAnd.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnTimkiemAnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/TimkiemKH.png"))); // NOI18N
        btnTimkiemAnd.setText("Tìm kiếm");
        btnTimkiemAnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemAndActionPerformed(evt);
            }
        });
        btnTimkiemAnd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnTimkiemAndKeyPressed(evt);
            }
        });

        txtTkho.setForeground(new java.awt.Color(153, 153, 153));
        txtTkho.setText("Nhập họ lót");
        txtTkho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTkhoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTkhoFocusLost(evt);
            }
        });
        txtTkho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTkhoKeyPressed(evt);
            }
        });

        lbOr.setText("OR");

        txtTkTenor.setForeground(new java.awt.Color(153, 153, 153));
        txtTkTenor.setText("Nhập tên");
        txtTkTenor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTkTenorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTkTenorFocusLost(evt);
            }
        });
        txtTkTenor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTkTenorKeyPressed(evt);
            }
        });

        btnTimkiemOR.setBackground(new java.awt.Color(0, 204, 204));
        btnTimkiemOR.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnTimkiemOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/TimkiemKH.png"))); // NOI18N
        btnTimkiemOR.setText("Tìm kiếm");
        btnTimkiemOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemORActionPerformed(evt);
            }
        });
        btnTimkiemOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnTimkiemORKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lbKhoatimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(cbboxKhoatimkiem, 0, 125, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTkho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(txtTktenand, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbAnd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbOr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTkTenor)
                                    .addComponent(txtTksdt)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lbNhaptimkiem)
                                .addGap(28, 28, 28)
                                .addComponent(txtNhaptimkiem)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTimkiemOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTimkiemAnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnHienthi)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbKhoatimkiem)
                    .addComponent(cbboxKhoatimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNhaptimkiem)
                    .addComponent(txtNhaptimkiem)
                    .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTktenand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAnd)
                    .addComponent(txtTksdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiemAnd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTkho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbOr)
                    .addComponent(txtTkTenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiemOR, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnHienthi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_ThongtinKHLayout = new javax.swing.GroupLayout(panel_ThongtinKH);
        panel_ThongtinKH.setLayout(panel_ThongtinKHLayout);
        panel_ThongtinKHLayout.setHorizontalGroup(
            panel_ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThongtinKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(panel_ThongtinKHLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_ThongtinKHLayout.setVerticalGroup(
            panel_ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThongtinKHLayout.createSequentialGroup()
                .addGroup(panel_ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbChitietKH.addTab("Thông tin", panel_ThongtinKH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbChitietKH, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbChitietKH, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean Ktra(String s, String s1){
        if(s.equalsIgnoreCase("Nhập mã") || s.equalsIgnoreCase("Nhập họ lót") || s.equalsIgnoreCase("Nhập tên") || s.equalsIgnoreCase("Nhập số điện thoại")) {
            JOptionPane.showMessageDialog(null, s1 + " không được để trống");
            return false;
        }
        else return true;
    }
    
    private void DocDSKH(){
        KhachHang_BUS bus = new KhachHang_BUS();
        if(KhachHang_BUS.dskh == null) bus.DocDSKH();
        Vector header = new Vector();
        header.add("Mã khách hàng");
        header.add("Họ lót");
        header.add("Tên");
        header.add("Số điện thoại");
        header.add("Địa chỉ");
        model = new DefaultTableModel(header, 0);
        for(KhachHang_DTO kh : KhachHang_BUS.dskh){
            Vector row = new Vector();
            row.add(kh.ma);
            row.add(kh.ho);
            row.add(kh.ten);
            row.add(kh.sdt);
            row.add(kh.sonha + " " + kh.duong + ", " + kh.phuong + ", " + kh.quan + ", " + kh.thanhpho);
            model.addRow(row);
        }
        tableKhachhang.setModel(model);
    }
    
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
                KH.setVisible(false);
                SP.setVisible(true);
                SP.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void tabpaneTrangChuAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabpaneTrangChuAncestorAdded
 
    }//GEN-LAST:event_tabpaneTrangChuAncestorAdded

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        for (int i = model.getRowCount() - 1; i >= 0; i--)
            model.removeRow(i);
        String s = txtNhaptimkiem.getText();
        KhachHang_BUS bus = new KhachHang_BUS();
        if(KhachHang_BUS.dstkkh == null) bus.timkiem();
        if(KhachHang_BUS.dstkkh != null)
            KhachHang_BUS.dstkkh.clear();
        for(KhachHang_DTO kh : KhachHang_BUS.dskh){
            if(cbboxKhoatimkiem.getSelectedItem().equals("Mã khách hàng") && s.equalsIgnoreCase(kh.ma)) {
                KhachHang_BUS.dstkkh.add(kh);
                HienthiDSKH(kh);
                break;
            }
            if(cbboxKhoatimkiem.getSelectedItem().equals("Họ lót") && s.equalsIgnoreCase(kh.ho)) {
                KhachHang_BUS.dstkkh.add(kh);
                HienthiDSKH(kh);
            }
            if(cbboxKhoatimkiem.getSelectedItem().equals("Tên") && s.equalsIgnoreCase(kh.ten)) {
                KhachHang_BUS.dstkkh.add(kh);
                HienthiDSKH(kh);
            }
            if(cbboxKhoatimkiem.getSelectedItem().equals("Số điện thoại") && s.equalsIgnoreCase(kh.sdt)) {
                KhachHang_BUS.dstkkh.add(kh);
                HienthiDSKH(kh);
            }
            if(cbboxKhoatimkiem.getSelectedItem().equals("Địa chỉ") && s.equalsIgnoreCase(kh.Diachi())) {
                KhachHang_BUS.dstkkh.add(kh);
                HienthiDSKH(kh);
            }
        }
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void HienthiDSKH(KhachHang_DTO kh) {
        Vector row = new Vector();
        row.add(kh.ma);
        row.add(kh.ho);
        row.add(kh.ten);
        row.add(kh.sdt);
        row.add(kh.sonha + " " + kh.duong + ", " + kh.phuong + ", " + kh.quan + ", " + kh.thanhpho);
        model.addRow(row);
        tableKhachhang.setModel(model);
    }
    
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int i = tableKhachhang.getSelectedRow();
        if(i >= 0) {
            KhachHang_BUS bus = new KhachHang_BUS();
            bus.xoa(txtMa.getText().trim().toUpperCase(), i);
            model.removeRow(i);
            tableKhachhang.setModel(model);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        KhachHang_DTO kh = new KhachHang_DTO();
        kh.ma = txtMa.getText().toUpperCase();
        kh.ho = txtHo.getText();
        kh.ten = txtTen.getText();
        kh.sdt = txtSDT.getText();
        kh.sonha = txtSonha.getText();
        kh.duong = txtDuong.getText();
        kh.phuong = txtPhuong.getText();
        kh.quan = txtQuan.getText();
        kh.thanhpho = txtThanhpho.getText();
        if (Ktra(kh.ma, "Mã khách hàng") == true && Ktra(kh.ho, "Họ lót") == true && Ktra(kh.ten, "Tên") == true && Ktra(kh.sdt, "Số điện thoại") == true) {
            int d = 0;
            for (KhachHang_DTO kh1 : KhachHang_BUS.dskh) {
                if (kh1.ma.equalsIgnoreCase(kh.ma)) {
                    d++;
                    break;
                }
            }
            KhachHang_BUS bus = new KhachHang_BUS();
            bus.them(kh);
            if (d == 0) {
                for (int i = model.getRowCount() - 1; i >= 0; i--)
                    model.removeRow(i);
                if (KhachHang_BUS.dstkkh != null)
                    KhachHang_BUS.dstkkh.clear();
                for (KhachHang_DTO kh1 : KhachHang_BUS.dskh)
                    HienthiDSKH(kh1);
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtMaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaFocusLost
        if(txtMa.getText().trim().equals("") || txtMa.getText().trim().toLowerCase().equals("nhập mã")) {
            txtMa.setText("Nhập mã");
            txtMa.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtMaFocusLost

    private void txtMaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaFocusGained
        if(txtMa.getText().trim().toLowerCase().equals("nhập mã")) {
            txtMa.setText("");
            txtMa.setForeground(new Color(102,0,51));
        }
    }//GEN-LAST:event_txtMaFocusGained

    private void txtHoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoFocusGained
        if(txtHo.getText().trim().toLowerCase().equals("nhập họ lót")) {
            txtHo.setText("");
            txtHo.setForeground(new Color(102,0,51));
        }
    }//GEN-LAST:event_txtHoFocusGained

    private void txtHoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoFocusLost
        if(txtHo.getText().trim().equals("") || txtHo.getText().trim().toLowerCase().equals("nhập họ lót")) {
            txtHo.setText("Nhập họ lót");
            txtHo.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtHoFocusLost

    private void txtTenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenFocusGained
        if(txtTen.getText().trim().toLowerCase().equals("nhập tên")) {
            txtTen.setText("");
            txtTen.setForeground(new Color(102,0,51));
        }
    }//GEN-LAST:event_txtTenFocusGained

    private void txtTenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenFocusLost
        if(txtTen.getText().trim().equals("") || txtTen.getText().trim().toLowerCase().equals("nhập tên")) {
            txtTen.setText("Nhập tên");
            txtTen.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtTenFocusLost

    private void txtSDTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusGained
        if(txtSDT.getText().trim().toLowerCase().equals("nhập số điện thoại")) {
            txtSDT.setText("");
            txtSDT.setForeground(new Color(102,0,51));
        }
    }//GEN-LAST:event_txtSDTFocusGained

    private void txtSDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusLost
        if(txtSDT.getText().trim().equals("") || txtSDT.getText().trim().toLowerCase().equals("nhập số điện thoại")) {
            txtSDT.setText("Nhập số điện thoại");
            txtSDT.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtSDTFocusLost

    private void txtSonhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSonhaFocusGained
        if(txtSonha.getText().trim().toLowerCase().equals("số nhà")) {
            txtSonha.setText("");
            txtSonha.setForeground(new Color(102,0,51));
        }
    }//GEN-LAST:event_txtSonhaFocusGained

    private void txtSonhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSonhaFocusLost
        if(txtSonha.getText().trim().equals("") || txtSonha.getText().trim().toLowerCase().equals("số nhà")) {
            txtSonha.setText("Số nhà");
            txtSonha.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtSonhaFocusLost

    private void txtPhuongFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhuongFocusGained
        if(txtPhuong.getText().trim().toLowerCase().equals("phường/xã")) {
            txtPhuong.setText("");
            txtPhuong.setForeground(new Color(102,0,51));
        }
    }//GEN-LAST:event_txtPhuongFocusGained

    private void txtPhuongFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhuongFocusLost
        if(txtPhuong.getText().trim().equals("") || txtPhuong.getText().trim().toLowerCase().equals("phường/xã")) {
            txtPhuong.setText("Phường/Xã");
            txtPhuong.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtPhuongFocusLost

    private void txtQuanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuanFocusGained
        if(txtQuan.getText().trim().toLowerCase().equals("quận/huyện")) {
            txtQuan.setText("");
            txtQuan.setForeground(new Color(102,0,51));
        }
    }//GEN-LAST:event_txtQuanFocusGained

    private void txtQuanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuanFocusLost
        if(txtQuan.getText().trim().equals("") || txtQuan.getText().trim().toLowerCase().equals("quận/huyện")) {
            txtQuan.setText("Quận/Huyện");
            txtQuan.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtQuanFocusLost

    private void txtThanhphoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtThanhphoFocusGained
        if(txtThanhpho.getText().trim().toLowerCase().equals("tỉnh/thành phố")) {
            txtThanhpho.setText("");
            txtThanhpho.setForeground(new Color(102,0,51));
        }
    }//GEN-LAST:event_txtThanhphoFocusGained

    private void txtThanhphoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtThanhphoFocusLost
        if(txtThanhpho.getText().trim().equals("") || txtThanhpho.getText().trim().toLowerCase().equals("tỉnh/thành phố")) {
            txtThanhpho.setText("Tỉnh/Thành phố");
            txtThanhpho.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtThanhphoFocusLost

    private void txtDuongFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDuongFocusGained
        if(txtDuong.getText().trim().toLowerCase().equals("đường")) {
            txtDuong.setText("");
            txtDuong.setForeground(new Color(102,0,51));
        }
    }//GEN-LAST:event_txtDuongFocusGained

    private void txtDuongFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDuongFocusLost
        if(txtDuong.getText().trim().equals("") || txtDuong.getText().trim().toLowerCase().equals("đường")) {
            txtDuong.setText("Đường");
            txtDuong.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtDuongFocusLost

    private void tableDSKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDSKHMouseClicked
        int i = tableKhachhang.getSelectedRow();
        //JOptionPane.showMessageDialog(null, "row:"+i);
        if (i >= 0) {
            KhachHang_DTO kh = new KhachHang_DTO();
            if(KhachHang_BUS.dstkkh == null || KhachHang_BUS.dstkkh.size() == 0)
                kh = KhachHang_BUS.dskh.get(i);
            else
                kh = KhachHang_BUS.dstkkh.get(i);
            txtMa.setText(kh.ma);
            txtHo.setText(kh.ho);
            txtTen.setText(kh.ten);
            txtSDT.setText(kh.sdt);
            txtSonha.setText(kh.sonha);
            txtDuong.setText(kh.duong);
            txtPhuong.setText(kh.phuong);
            txtQuan.setText(kh.quan);
            txtThanhpho.setText(kh.thanhpho);
            txtMa.setForeground(new Color(102,0,51));
            txtHo.setForeground(new Color(102,0,51));
            txtTen.setForeground(new Color(102,0,51));
            txtSDT.setForeground(new Color(102,0,51));
            txtSonha.setForeground(new Color(102,0,51));
            txtDuong.setForeground(new Color(102,0,51));
            txtPhuong.setForeground(new Color(102,0,51));
            txtQuan.setForeground(new Color(102,0,51));
            txtThanhpho.setForeground(new Color(102,0,51));
        }
    }//GEN-LAST:event_tableDSKHMouseClicked
    
    private void btnSua(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua
        int i = tableKhachhang.getSelectedRow();
        if(i>=0) {
            KhachHang_DTO kh = new KhachHang_DTO();
            kh.ma = txtMa.getText().toUpperCase();
                kh.ho = txtHo.getText();
                kh.ten = txtTen.getText();
                kh.sdt = txtSDT.getText();
            kh.sonha = txtSonha.getText();
            kh.duong = txtDuong.getText();
            kh.phuong = txtPhuong.getText();
            kh.quan = txtQuan.getText();
            kh.thanhpho = txtThanhpho.getText();
            if(Ktra(kh.ma, "Mã khách hàng") == true && Ktra(kh.ho, "Họ lót") == true && Ktra(kh.ten, "Tên") == true && Ktra(kh.sdt, "Số điện thoại") == true){
            if(!kh.ma.equalsIgnoreCase(KhachHang_BUS.dskh.get(i).ma))
                JOptionPane.showMessageDialog(null, "Không được sửa mã khách hàng!");
            else {
            KhachHang_BUS bus = new KhachHang_BUS();
            bus.sua(i, kh);
            model.setValueAt(kh.ma, i, 0);
            model.setValueAt(kh.ho, i, 1);
            model.setValueAt(kh.ten, i, 2);
            model.setValueAt(kh.sdt, i, 3);
            model.setValueAt(kh.sonha + " " + kh.duong + ", phường " + kh.phuong + ", quận " + kh.quan + ", " + kh.thanhpho, i, 4);
            tableKhachhang.setModel(model);
            }
            }
        }
    }//GEN-LAST:event_btnSua

    private void btnHienthi(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienthi
        for (int i = model.getRowCount() - 1; i >= 0; i--)
            model.removeRow(i);
        if(KhachHang_BUS.dstkkh != null)
            KhachHang_BUS.dstkkh.clear();
        for(KhachHang_DTO kh : KhachHang_BUS.dskh) 
            HienthiDSKH(kh);
    }//GEN-LAST:event_btnHienthi

    private void txtMaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER)
            txtHo.requestFocus();
    }//GEN-LAST:event_txtMaKeyPressed

    private void txtTenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER)
            txtSDT.requestFocus();
    }//GEN-LAST:event_txtTenKeyPressed

    private void txtSDTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER)
            txtSonha.requestFocus();
    }//GEN-LAST:event_txtSDTKeyPressed

    private void txtSonhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSonhaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER)
            txtDuong.requestFocus();
    }//GEN-LAST:event_txtSonhaKeyPressed

    private void txtDuongKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuongKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER)
            txtPhuong.requestFocus();
    }//GEN-LAST:event_txtDuongKeyPressed

    private void txtPhuongKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhuongKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER)
            txtQuan.requestFocus();
    }//GEN-LAST:event_txtPhuongKeyPressed

    private void txtQuanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuanKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER)
            txtThanhpho.requestFocus();
    }//GEN-LAST:event_txtQuanKeyPressed

    private void txtThanhphoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtThanhphoKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER)
            btnThem.requestFocus();
    }//GEN-LAST:event_txtThanhphoKeyPressed

    private void txtHoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER)
            txtTen.requestFocus();
    }//GEN-LAST:event_txtHoKeyPressed

    private void btnThemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnThemKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            KhachHang_DTO kh = new KhachHang_DTO();
            kh.ma = txtMa.getText().toUpperCase();
            kh.ho = txtHo.getText();
            kh.ten = txtTen.getText();
            kh.sdt = txtSDT.getText();
            kh.sonha = txtSonha.getText().trim();
            kh.duong = txtDuong.getText().trim();
            kh.phuong = txtPhuong.getText().trim();
            kh.quan = txtQuan.getText().trim();
            kh.thanhpho = txtThanhpho.getText().trim();
            if (Ktra(kh.ma, "Mã khách hàng") == true && Ktra(kh.ho, "Họ lót") == true && Ktra(kh.ten, "Tên") == true && Ktra(kh.sdt, "Số điện thoại") == true) {
                int d = 0;
                for (KhachHang_DTO kh1 : KhachHang_BUS.dskh) {
                    if (kh1.ma.equalsIgnoreCase(kh.ma)) {
                        d++;
                        break;
                    }
                }
                KhachHang_BUS bus = new KhachHang_BUS();
                bus.them(kh);
                if (d == 0) {
                    for (int i = model.getRowCount() - 1; i >= 0; i--)
                        model.removeRow(i);
                    if (KhachHang_BUS.dstkkh != null)
                        KhachHang_BUS.dstkkh.clear();
                    for (KhachHang_DTO kh1 : KhachHang_BUS.dskh)
                        HienthiDSKH(kh1);
                }
            }
            btnSua.requestFocus();
        }
    }//GEN-LAST:event_btnThemKeyPressed

    private void btnSuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSuaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER) {
            int i = tableKhachhang.getSelectedRow();
            if(i>=0) {
                KhachHang_DTO kh = new KhachHang_DTO();
            kh.ma = txtMa.getText().toUpperCase();
            kh.ho = txtHo.getText();
            kh.ten = txtTen.getText();
            kh.sdt = txtSDT.getText();
                kh.sonha = txtSonha.getText().trim();
                kh.duong = txtDuong.getText().trim();
                kh.phuong = txtPhuong.getText().trim();
                kh.quan = txtQuan.getText().trim();
                kh.thanhpho = txtThanhpho.getText().trim();
                if(Ktra(kh.ma, "Mã khách hàng") == true && Ktra(kh.ho, "Họ lót") == true && Ktra(kh.ten, "Tên") == true && Ktra(kh.sdt, "Số điện thoại") == true){
                if(!kh.ma.equalsIgnoreCase(KhachHang_BUS.dskh.get(i).ma))
                    JOptionPane.showMessageDialog(null, "Không được sửa mã khách hàng!");
                else {
                KhachHang_BUS bus = new KhachHang_BUS();
                bus.sua(i, kh);
                model.setValueAt(kh.ma, i, 0);
                model.setValueAt(kh.ho, i, 1);
                model.setValueAt(kh.ten, i, 2);
                model.setValueAt(kh.sdt, i, 3);
                model.setValueAt(kh.sonha + " " + kh.duong + ", phường " + kh.phuong + ", quận " + kh.quan + ", " + kh.thanhpho, i, 4);
                tableKhachhang.setModel(model);
                }
                }
            }
            btnXoa.requestFocus();
        }
    }//GEN-LAST:event_btnSuaKeyPressed

    private void btnXoaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnXoaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER) {
            int i = tableKhachhang.getSelectedRow();
            if(i >= 0) {
                KhachHang_BUS bus = new KhachHang_BUS();
                bus.xoa(txtMa.getText().trim().toUpperCase(), i);
                model.removeRow(i);
                tableKhachhang.setModel(model);
                cbboxKhoatimkiem.requestFocus();
            }
        }
    }//GEN-LAST:event_btnXoaKeyPressed

    private void cbboxKhoatimkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbboxKhoatimkiemKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER)
            txtNhaptimkiem.requestFocus();
    }//GEN-LAST:event_cbboxKhoatimkiemKeyPressed

    private void txtNhaptimkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNhaptimkiemKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER) {
            for (int i = model.getRowCount() - 1; i >= 0; i--)
                model.removeRow(i);
            String s = txtNhaptimkiem.getText().trim();
            KhachHang_BUS bus = new KhachHang_BUS();
            if(KhachHang_BUS.dstkkh == null) bus.timkiem();
            if(KhachHang_BUS.dstkkh != null)
                KhachHang_BUS.dstkkh.clear();
            for(KhachHang_DTO kh : KhachHang_BUS.dskh){
                if(cbboxKhoatimkiem.getSelectedItem().equals("Mã khách hàng") && s.equalsIgnoreCase(kh.ma)) {
                    KhachHang_BUS.dstkkh.add(kh);
                    HienthiDSKH(kh);
                    break;
                }
                if(cbboxKhoatimkiem.getSelectedItem().equals("Họ lót") && s.equalsIgnoreCase(kh.ho)) {
                    KhachHang_BUS.dstkkh.add(kh);
                    HienthiDSKH(kh);
                }
                if(cbboxKhoatimkiem.getSelectedItem().equals("Tên") && s.equalsIgnoreCase(kh.ten)) {
                    KhachHang_BUS.dstkkh.add(kh);
                    HienthiDSKH(kh);
                }
                if(cbboxKhoatimkiem.getSelectedItem().equals("Số điện thoại") && s.equalsIgnoreCase(kh.sdt)) {
                    KhachHang_BUS.dstkkh.add(kh);
                    HienthiDSKH(kh);
                }
                if(cbboxKhoatimkiem.getSelectedItem().equals("Địa chỉ") && s.equalsIgnoreCase(kh.Diachi())) {
                    KhachHang_BUS.dstkkh.add(kh);
                    HienthiDSKH(kh);
                }
            }
            btnTimkiem.requestFocus();
        }
    }//GEN-LAST:event_txtNhaptimkiemKeyPressed

    private void btnTimkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnTimkiemKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER) {
            for (int i = model.getRowCount() - 1; i >= 0; i--)
                model.removeRow(i);
            String s = txtNhaptimkiem.getText().trim();
            KhachHang_BUS bus = new KhachHang_BUS();
            if(KhachHang_BUS.dstkkh == null) bus.timkiem();
            if(KhachHang_BUS.dstkkh != null)
                KhachHang_BUS.dstkkh.clear();
            for(KhachHang_DTO kh : KhachHang_BUS.dskh){
                if(cbboxKhoatimkiem.getSelectedItem().equals("Mã khách hàng") && s.equalsIgnoreCase(kh.ma)) {
                    KhachHang_BUS.dstkkh.add(kh);
                    HienthiDSKH(kh);
                    break;
                }
                if(cbboxKhoatimkiem.getSelectedItem().equals("Họ lót") && s.equalsIgnoreCase(kh.ho)) {
                    KhachHang_BUS.dstkkh.add(kh);
                    HienthiDSKH(kh);
                }
                if(cbboxKhoatimkiem.getSelectedItem().equals("Tên") && s.equalsIgnoreCase(kh.ten)) {
                    KhachHang_BUS.dstkkh.add(kh);
                    HienthiDSKH(kh);
                }
                if(cbboxKhoatimkiem.getSelectedItem().equals("Số điện thoại") && s.equalsIgnoreCase(kh.sdt)) {
                    KhachHang_BUS.dstkkh.add(kh);
                    HienthiDSKH(kh);
                }
                if(cbboxKhoatimkiem.getSelectedItem().equals("Địa chỉ") && s.equalsIgnoreCase(kh.Diachi())) {
                    KhachHang_BUS.dstkkh.add(kh);
                    HienthiDSKH(kh);
                }
            }
            txtTktenand.requestFocus();
        }
    }//GEN-LAST:event_btnTimkiemKeyPressed

    private void btnHienthiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnHienthiKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER) {
            for (int i = model.getRowCount() - 1; i >= 0; i--)
                model.removeRow(i);
            for(KhachHang_DTO kh : KhachHang_BUS.dskh) 
                HienthiDSKH(kh);
            txtMa.requestFocus();
        }
    }//GEN-LAST:event_btnHienthiKeyPressed

    private void txtNhaptimkiemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNhaptimkiemFocusGained
        if(txtNhaptimkiem.getText().trim().toLowerCase().equals("nhập tìm kiếm")) {
            txtNhaptimkiem.setText("");
            txtNhaptimkiem.setForeground(new Color(102,0,51));
        }
    }//GEN-LAST:event_txtNhaptimkiemFocusGained

    private void txtNhaptimkiemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNhaptimkiemFocusLost
        if(txtNhaptimkiem.getText().trim().equals("") || txtNhaptimkiem.getText().trim().toLowerCase().equals("nhập tìm kiếm")) {
            txtNhaptimkiem.setText("Nhập tìm kiếm");
            txtNhaptimkiem.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtNhaptimkiemFocusLost

    private void txtTktenandFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTktenandFocusGained
        if(txtTktenand.getText().trim().toLowerCase().equals("nhập tên")) {
            txtTktenand.setText("");
            txtTktenand.setForeground(new Color(102,0,51));
        }
    }//GEN-LAST:event_txtTktenandFocusGained

    private void txtTktenandFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTktenandFocusLost
        if(txtTktenand.getText().trim().equals("") || txtTktenand.getText().trim().toLowerCase().equals("nhập tên")) {
            txtTktenand.setText("Nhập tên");
            txtTktenand.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtTktenandFocusLost

    private void txtTksdtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTksdtFocusGained
        if(txtTksdt.getText().trim().toLowerCase().equals("nhập số điện thoại")) {
            txtTksdt.setText("");
            txtTksdt.setForeground(new Color(102,0,51));
        }
    }//GEN-LAST:event_txtTksdtFocusGained

    private void txtTksdtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTksdtFocusLost
        if(txtTksdt.getText().trim().equals("") || txtTksdt.getText().trim().toLowerCase().equals("nhập số điện thoại")) {
            txtTksdt.setText("Nhập số điện thoại");
            txtTksdt.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtTksdtFocusLost

    private void txtTkhoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTkhoFocusGained
        if(txtTkho.getText().trim().toLowerCase().equals("nhập họ lót")) {
            txtTkho.setText("");
            txtTkho.setForeground(new Color(102,0,51));
        }
    }//GEN-LAST:event_txtTkhoFocusGained

    private void txtTkhoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTkhoFocusLost
        if(txtTkho.getText().trim().equals("") || txtTkho.getText().trim().toLowerCase().equals("nhập họ lót")) {
            txtTkho.setText("Nhập họ lót");
            txtTkho.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtTkhoFocusLost

    private void txtTkTenorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTkTenorFocusGained
        if(txtTkTenor.getText().trim().toLowerCase().equals("nhập tên")) {
            txtTkTenor.setText("");
            txtTkTenor.setForeground(new Color(102,0,51));
        }
    }//GEN-LAST:event_txtTkTenorFocusGained

    private void txtTkTenorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTkTenorFocusLost
        if(txtTkTenor.getText().trim().equals("") || txtTkTenor.getText().trim().toLowerCase().equals("nhập tên")) {
            txtTkTenor.setText("Nhập tên");
            txtTkTenor.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtTkTenorFocusLost

    private void btnTimkiemAndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemAndActionPerformed
        for (int i = model.getRowCount() - 1; i >= 0; i--)
                model.removeRow(i);
        String s = txtTktenand.getText().trim();
        String s1 = txtTksdt.getText().trim();
        KhachHang_BUS bus = new KhachHang_BUS();
        if(KhachHang_BUS.dstkkh == null) bus.timkiem();
        if(KhachHang_BUS.dstkkh != null)
            KhachHang_BUS.dstkkh.clear();
        for(KhachHang_DTO kh : KhachHang_BUS.dskh)
            if(s.equalsIgnoreCase(kh.ten) && s1.equalsIgnoreCase(kh.sdt)){
                KhachHang_BUS.dstkkh.add(kh);
                HienthiDSKH(kh);
                break;
            }
    }//GEN-LAST:event_btnTimkiemAndActionPerformed

    private void btnTimkiemORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemORActionPerformed
        for (int i = model.getRowCount() - 1; i >= 0; i--)
                model.removeRow(i);
        String s = txtTkho.getText().trim();
        String s1 = txtTkTenor.getText().trim();
        KhachHang_BUS bus = new KhachHang_BUS();
        if(KhachHang_BUS.dstkkh == null) bus.timkiem();
        if(KhachHang_BUS.dstkkh != null)
            KhachHang_BUS.dstkkh.clear();
        for(KhachHang_DTO kh : KhachHang_BUS.dskh)
            if(s.equalsIgnoreCase(kh.ho) || s1.equalsIgnoreCase(kh.ten)){
                KhachHang_BUS.dstkkh.add(kh);
                HienthiDSKH(kh);
            }
    }//GEN-LAST:event_btnTimkiemORActionPerformed

    private void txtTktenandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTktenandKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER) {
            txtTksdt.requestFocus();
        }
    }//GEN-LAST:event_txtTktenandKeyPressed

    private void txtTksdtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTksdtKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER) {
            btnTimkiemAnd.requestFocus();
        }
    }//GEN-LAST:event_txtTksdtKeyPressed

    private void btnTimkiemAndKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnTimkiemAndKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER) {
            for (int i = model.getRowCount() - 1; i >= 0; i--)
                model.removeRow(i);
            String s = txtTktenand.getText().trim();
            String s1 = txtTksdt.getText().trim();
            KhachHang_BUS bus = new KhachHang_BUS();
            if(KhachHang_BUS.dstkkh == null) bus.timkiem();
            if(KhachHang_BUS.dstkkh != null)
                KhachHang_BUS.dstkkh.clear();
            for(KhachHang_DTO kh : KhachHang_BUS.dskh)
                if(s.equalsIgnoreCase(kh.ten) && s1.equalsIgnoreCase(kh.sdt)){
                    KhachHang_BUS.dstkkh.add(kh);
                    HienthiDSKH(kh);
                    break;
                }
            txtTkho.requestFocus();
        }
    }//GEN-LAST:event_btnTimkiemAndKeyPressed

    private void txtTkhoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTkhoKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER) {
            txtTkTenor.requestFocus();
        }
    }//GEN-LAST:event_txtTkhoKeyPressed

    private void txtTkTenorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTkTenorKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER) {
            btnTimkiemOR.requestFocus();
        }
    }//GEN-LAST:event_txtTkTenorKeyPressed

    private void btnTimkiemORKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnTimkiemORKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER) {
            for (int i = model.getRowCount() - 1; i >= 0; i--)
                model.removeRow(i);
            String s = txtTkho.getText().trim();
            String s1 = txtTkTenor.getText().trim();
            KhachHang_BUS bus = new KhachHang_BUS();
            if(KhachHang_BUS.dstkkh == null) bus.timkiem();
            if(KhachHang_BUS.dstkkh != null)
               KhachHang_BUS.dstkkh.clear();
            for(KhachHang_DTO kh : KhachHang_BUS.dskh)
                if(s.equalsIgnoreCase(kh.ho) || s1.equalsIgnoreCase(kh.ten)){
                    KhachHang_BUS.dstkkh.add(kh);
                    HienthiDSKH(kh);
                }
            btnHienthi.requestFocus();
        }
    }//GEN-LAST:event_btnTimkiemORKeyPressed

    private void btnkhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhuyenMaiActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập")) {
            if (btnkhuyenMai.isSelected() == true) {
                KH.setVisible(false);
                KM.setVisible(true);
                KM.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnkhuyenMaiActionPerformed

    private void btnNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapHangActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập") && checkQuyenQLGD() == true) {
            if (btnNhapHang.isSelected() == true) {
                KH.setVisible(false);
                NH.setVisible(true);
                NH.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnNhapHangActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập") && checkQuyenQLGD() == true) {
            if (btnThongKe.isSelected() == true) {
                KH.setVisible(false);
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
                KH.setVisible(false);
                HT.setVisible(true);
                HT.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnHoTroActionPerformed

    private void btnLienHeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLienHeActionPerformed
        JOptionPane.showMessageDialog(this,"Bạn vui lòng chọn chức năng hỗ trợ để liên hệ!");
    }//GEN-LAST:event_btnLienHeActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        KH.setVisible(false);
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
                KH.setVisible(false);
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
                KH.setVisible(false);
                NV.setVisible(true);
                NV.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKhachHangActionPerformed
    
    public void setTextTenDN(String s){
        btnDangNhap.setText(s);
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KhachHang_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHang_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHang_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHang_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
                KH.setVisible(true);
                KH.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDangNhap;
    private javax.swing.JToggleButton btnDoanhThu;
    private javax.swing.JToggleButton btnDonHang;
    private javax.swing.JButton btnHienthi;
    private javax.swing.JToggleButton btnHoTro;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JToggleButton btnKhachHang;
    private javax.swing.JButton btnLienHe;
    private javax.swing.JToggleButton btnNhanVien;
    private javax.swing.JToggleButton btnNhapHang;
    private javax.swing.JToggleButton btnSanPham;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JToggleButton btnThongKe;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnTimkiemAnd;
    private javax.swing.JButton btnTimkiemOR;
    private javax.swing.JButton btnXoa;
    private javax.swing.JToggleButton btnkhuyenMai;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbboxKhoatimkiem;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbAnd;
    private javax.swing.JLabel lbKhoatimkiem;
    private javax.swing.JLabel lbNhaptimkiem;
    private javax.swing.JLabel lbOr;
    private javax.swing.JPanel panel_ThongtinKH;
    private javax.swing.JTable tableKhachhang;
    private javax.swing.JTabbedPane tbChitietKH;
    private javax.swing.JTextField txtDuong;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNhaptimkiem;
    private javax.swing.JTextField txtPhuong;
    private javax.swing.JTextField txtQuan;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSonha;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtThanhpho;
    private javax.swing.JTextField txtTkTenor;
    private javax.swing.JTextField txtTkho;
    private javax.swing.JTextField txtTksdt;
    private javax.swing.JTextField txtTktenand;
    // End of variables declaration//GEN-END:variables
}
