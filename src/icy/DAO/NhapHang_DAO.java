/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DAO;

import icy.DTO.NhapHang_DTO;
import icy.SQLConnect;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class NhapHang_DAO {
    SQLConnect connect;
    public NhapHang_DAO(){
        connect = new SQLConnect("DESKTOP-LGV4DA9", "ICY", "sa", "123");
    }
    public ArrayList DocSPTonKho(){
        ArrayList dstk=new ArrayList<NhapHang_DTO>();
        try {
            
            String qry = "select * from SanPham";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                NhapHang_DTO sptk = new NhapHang_DTO();
                sptk.MaSP = result.getString(1);
                sptk.TenSP = result.getString(2);
                sptk.SoLuong = result.getString(5);
                sptk.HinhAnh = result.getString(7);
                dstk.add(sptk);
            }
        } catch (Exception ex) {
            System.out.println("Không đọc đc dữ liệu từ database!");
        }
        return dstk;
    }
    public void SuaSL(NhapHang_DTO sptk){
        try {
            String qry = "Update SanPham Set ";
            qry = qry + " " + "SoLuong=" + "N'" + sptk.SoLuong + "'";
            qry = qry + " Where MaSP=" +"N'"+sptk.MaSP+"'";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println("Sửa thất bại!");
        }
    }
}
