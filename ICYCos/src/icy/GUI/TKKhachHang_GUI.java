package icy.GUI;

import icy.BUS.KhachHang_BUS;
import icy.DTO.KhachHang_DTO;
import java.awt.Color;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class TKKhachHang_GUI extends javax.swing.JFrame {
    public static TKKhachHang_GUI TKKH=new TKKhachHang_GUI();
    DefaultTableModel model = new DefaultTableModel();
    
    public TKKhachHang_GUI() {
        initComponents();
        DocDSKH();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        lbTuade = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachhang = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        lbMa = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        lbHo = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        lbTen = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        lbSdt = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        lbDiachi = new javax.swing.JLabel();
        txtSonha = new javax.swing.JTextField();
        txtDuong = new javax.swing.JTextField();
        txtPhuong = new javax.swing.JTextField();
        txtThanhpho = new javax.swing.JTextField();
        txtQuan = new javax.swing.JTextField();
        btnTrove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTuade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTuade.setForeground(new java.awt.Color(102, 102, 255));
        lbTuade.setText("Bảng thống kê khách hàng");

        tblKhachhang.setModel(new javax.swing.table.DefaultTableModel(
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
        tblKhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachhangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachhang);

        lbMa.setText("Mã khách hàng");
        lbMa.setName("lb_Ma"); // NOI18N

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

        lbHo.setText("Họ lót");
        lbHo.setName("lb_Ho"); // NOI18N

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

        lbTen.setText("Tên");
        lbTen.setName("lb_Ten"); // NOI18N

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

        lbSdt.setText("Số điện thoại");
        lbSdt.setName("lb_SDT"); // NOI18N

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

        lbDiachi.setText("Địa chỉ");
        lbDiachi.setName("lb_Diachi"); // NOI18N

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
                                .addComponent(lbMa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lbDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbHo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMa)
                            .addComponent(txtHo, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtSonha, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDuong, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPhuong, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtThanhpho)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMa)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHo)
                    .addComponent(txtHo))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTen)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSdt)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDuong, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDiachi)
                    .addComponent(txtSonha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhuong, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThanhpho, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnTrove.setBackground(new java.awt.Color(204, 204, 204));
        btnTrove.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTrove.setText("Trở về");
        btnTrove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroveActionPerformed(evt);
            }
        });
        btnTrove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnTroveKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTrove)
                        .addGap(36, 36, 36))))
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lbTuade)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTuade)
                .addGap(18, 18, 18)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTrove)
                        .addGap(39, 39, 39))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        tblKhachhang.setModel(model);
    }
    
    private void txtMaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaFocusGained
        if (txtMa.getText().trim().toLowerCase().equals("nhập mã")) {
            txtMa.setText("");
            txtMa.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtMaFocusGained

    private void txtMaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaFocusLost
        if (txtMa.getText().trim().equals("") || txtMa.getText().trim().toLowerCase().equals("nhập mã")) {
            txtMa.setText("Nhập mã");
            txtMa.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtMaFocusLost

    private void txtMaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtHo.requestFocus();
    }//GEN-LAST:event_txtMaKeyPressed

    private void txtHoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoFocusGained
        if (txtHo.getText().trim().toLowerCase().equals("nhập họ lót")) {
            txtHo.setText("");
            txtHo.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtHoFocusGained

    private void txtHoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoFocusLost
        if (txtHo.getText().trim().equals("") || txtHo.getText().trim().toLowerCase().equals("nhập họ lót")) {
            txtHo.setText("Nhập họ lót");
            txtHo.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtHoFocusLost

    private void txtHoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtTen.requestFocus();
    }//GEN-LAST:event_txtHoKeyPressed

    private void txtTenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenFocusGained
        if (txtTen.getText().trim().toLowerCase().equals("nhập tên")) {
            txtTen.setText("");
            txtTen.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtTenFocusGained

    private void txtTenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenFocusLost
        if (txtTen.getText().trim().equals("") || txtTen.getText().trim().toLowerCase().equals("nhập tên")) {
            txtTen.setText("Nhập tên");
            txtTen.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtTenFocusLost

    private void txtTenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtSDT.requestFocus();
    }//GEN-LAST:event_txtTenKeyPressed

    private void txtSDTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusGained
        if (txtSDT.getText().trim().toLowerCase().equals("nhập số điện thoại")) {
            txtSDT.setText("");
            txtSDT.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtSDTFocusGained

    private void txtSDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusLost
        if (txtSDT.getText().trim().equals("") || txtSDT.getText().trim().toLowerCase().equals("nhập số điện thoại")) {
            txtSDT.setText("Nhập số điện thoại");
            txtSDT.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtSDTFocusLost

    private void txtSDTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtSonha.requestFocus();
    }//GEN-LAST:event_txtSDTKeyPressed

    private void txtSonhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSonhaFocusGained
        if (txtSonha.getText().trim().toLowerCase().equals("số nhà")) {
            txtSonha.setText("");
            txtSonha.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtSonhaFocusGained

    private void txtSonhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSonhaFocusLost
        if (txtSonha.getText().trim().equals("") || txtSonha.getText().trim().toLowerCase().equals("số nhà")) {
            txtSonha.setText("Số nhà");
            txtSonha.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtSonhaFocusLost

    private void txtSonhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSonhaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtDuong.requestFocus();
    }//GEN-LAST:event_txtSonhaKeyPressed

    private void txtDuongFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDuongFocusGained
        if (txtDuong.getText().trim().toLowerCase().equals("đường")) {
            txtDuong.setText("");
            txtDuong.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtDuongFocusGained

    private void txtDuongFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDuongFocusLost
        if (txtDuong.getText().trim().equals("") || txtDuong.getText().trim().toLowerCase().equals("đường")) {
            txtDuong.setText("Đường");
            txtDuong.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtDuongFocusLost

    private void txtDuongKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuongKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtPhuong.requestFocus();
    }//GEN-LAST:event_txtDuongKeyPressed

    private void txtPhuongFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhuongFocusGained
        if (txtPhuong.getText().trim().toLowerCase().equals("phường/xã")) {
            txtPhuong.setText("");
            txtPhuong.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtPhuongFocusGained

    private void txtPhuongFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhuongFocusLost
        if (txtPhuong.getText().trim().equals("") || txtPhuong.getText().trim().toLowerCase().equals("phường/xã")) {
            txtPhuong.setText("Phường/Xã");
            txtPhuong.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtPhuongFocusLost

    private void txtPhuongKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhuongKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtQuan.requestFocus();
    }//GEN-LAST:event_txtPhuongKeyPressed

    private void txtQuanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuanFocusGained
        if (txtQuan.getText().trim().toLowerCase().equals("quận/huyện")) {
            txtQuan.setText("");
            txtQuan.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtQuanFocusGained

    private void txtQuanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuanFocusLost
        if (txtQuan.getText().trim().equals("") || txtQuan.getText().trim().toLowerCase().equals("quận/huyện")) {
            txtQuan.setText("Quận/Huyện");
            txtQuan.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtQuanFocusLost

    private void txtQuanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuanKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtThanhpho.requestFocus();
    }//GEN-LAST:event_txtQuanKeyPressed

    private void txtThanhphoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtThanhphoFocusGained
        if (txtThanhpho.getText().trim().toLowerCase().equals("tỉnh/thành phố")) {
            txtThanhpho.setText("");
            txtThanhpho.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtThanhphoFocusGained

    private void txtThanhphoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtThanhphoFocusLost
        if (txtThanhpho.getText().trim().equals("") || txtThanhpho.getText().trim().toLowerCase().equals("tỉnh/thành phố")) {
            txtThanhpho.setText("Tỉnh/Thành phố");
            txtThanhpho.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtThanhphoFocusLost

    private void txtThanhphoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtThanhphoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            btnTrove.requestFocus();
    }//GEN-LAST:event_txtThanhphoKeyPressed

    private void btnTroveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnTroveKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtMa.requestFocus();
    }//GEN-LAST:event_btnTroveKeyPressed

    private void tblKhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachhangMouseClicked
        int i = tblKhachhang.getSelectedRow();
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
    }//GEN-LAST:event_tblKhachhangMouseClicked

    private void btnTroveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroveActionPerformed
        TKKH.setVisible(false);
    }//GEN-LAST:event_btnTroveActionPerformed

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
            java.util.logging.Logger.getLogger(TKKhachHang_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TKKhachHang_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TKKhachHang_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TKKhachHang_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TKKH.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTrove;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDiachi;
    private javax.swing.JLabel lbHo;
    private javax.swing.JLabel lbMa;
    private javax.swing.JLabel lbSdt;
    private javax.swing.JLabel lbTen;
    private javax.swing.JLabel lbTuade;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTable tblKhachhang;
    private javax.swing.JTextField txtDuong;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtPhuong;
    private javax.swing.JTextField txtQuan;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSonha;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtThanhpho;
    // End of variables declaration//GEN-END:variables
}
