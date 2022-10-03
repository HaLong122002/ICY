/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DAO;

import icy.DTO.ChiTietHoaDon_DTO;
import icy.SQLConnect;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Kieu Lam Ngo
 */
public class ChiTietHoaDon_DAO {

    SQLConnect connect;

    public ChiTietHoaDon_DAO() {
        connect = new SQLConnect("DESKTOP-LGV4DA9", "ICY", "sa", "123");
    }

    public ArrayList DocCTHD() {
        ArrayList dshd = new ArrayList<ChiTietHoaDon_DTO>();
        try {

            String qry = "select * from ChiTietHoaDon";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                ChiTietHoaDon_DTO hd = new ChiTietHoaDon_DTO();
                hd.MaHD = Integer.parseInt(result.getString(1));
                hd.MaSP = result.getString(2);
                hd.TenSP = result.getString(3);
                hd.SoLuong = Integer.parseInt(result.getString(4));
                hd.GiaBan = Float.parseFloat(result.getString(5));
                hd.ThanhTien = Float.parseFloat(result.getString(6));
                dshd.add(hd);
            }
        } catch (Exception ex) {
            System.out.println("Không đọc đc dữ liệu từ database!");
        }
        return dshd;
    }

    public void them(ChiTietHoaDon_DTO pn) {
        try {
            String qry = "Insert into ChiTietHoaDon Values (";
            qry = qry + "N'" + pn.MaHD + "'";
            qry = qry + ",N'" + pn.MaSP + "'";
            qry = qry + ",N" + "'" + pn.TenSP + "'";
            qry = qry + ",N" + "'" + pn.SoLuong + "'";
            qry = qry + ",N" + "'" + pn.GiaBan + "'";
            qry = qry + ",N" + "'" + pn.ThanhTien + "'";
            qry = qry + ")";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println("Ghi vào database thất bại!");
        }
    }
}
