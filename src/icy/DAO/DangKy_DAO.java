/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DAO;

import ICY.DTO.DangKyDTO;
import icy.GUI.QLNV_GUI;
import icy.SQLConnect;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Quan Phat Vinh Thanh
 */
public class DangKy_DAO {
    SQLConnect connect;

    public DangKy_DAO() {
        connect = new SQLConnect("DESKTOP-LGV4DA9", "ICY", "sa", "123");
    }

    public ArrayList DocDSDK() {
        ArrayList dsdk = new ArrayList<DangKyDTO>();
        try {
            String qry = "select * from NguoiDung";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                DangKyDTO dk = new DangKyDTO();
                dk.MaDK = result.getString(1);
                dk.TaiKhoan = result.getString(2);
                dk.MatKhau = result.getString(3);
                dk.ChuVuDK = result.getString(4);
                dsdk.add(dk);
            }
        } catch (Exception ex) {
            Logger.getLogger(QLNV_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsdk;
    }

    public void themTK(DangKyDTO dk) {
        try {
            String qry = "Insert into NguoiDung Values (";
            qry = qry + " N'" + dk.MaDK + "'";
            qry = qry + ",N" + "'" + dk.TaiKhoan + "'";
            qry = qry + ",N" + "'" + dk.MatKhau + "'";
            qry = qry + ",N" + "'" + dk.ChuVuDK + "'";
            qry = qry + ")";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
            Logger.getLogger(QLNV_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void xoaTK(String ma) {
        try {
            String qry = "Delete from NguoiDung WHERE Ma=N'" + ma + "'";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
            Logger.getLogger(QLNV_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
