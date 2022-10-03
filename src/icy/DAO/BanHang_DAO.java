/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DAO;

import icy.DTO.SanPham_DTO;
import icy.SQLConnect;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class BanHang_DAO {
    SQLConnect connect;
    public BanHang_DAO(){
        connect = new SQLConnect("DESKTOP-LGV4DA9", "ICY", "sa", "123");
    }
    public ArrayList DocSPTonKho(){
     ArrayList dssp = new ArrayList<SanPham_DTO>();
        try {
                
                String qry = "select * from SanPham";
                ResultSet result = connect.executeQuery(qry);
                while (result.next()) {
                SanPham_DTO sp = new SanPham_DTO();
                sp.MaSP = result.getString(1);
                sp.TenSP = result.getString(2);
                sp.GiaBan = result.getString(4);
                sp.SoLuong = result.getString(5);
                sp.HinhAnhSP = result.getString(7);
                dssp.add(sp);
            }
        } catch (Exception ex) {
            System.out.println("khong ket noi du lieu tu database!");
        }
        return dssp;
    }
    public void SuaSL(SanPham_DTO dssp){
        try {
            String qry = "Update SanPham Set ";
            qry = qry + " " + "SoLuong=" + "N'" + dssp.SoLuong + "'";
            qry = qry + " Where MaSP=" +"N'"+dssp.MaSP+"'";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println("Sửa thất bại!");
        }
    }
}
