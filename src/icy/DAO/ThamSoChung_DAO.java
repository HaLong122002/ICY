/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DAO;

import icy.DTO.ThamSoChung_DTO;
import icy.SQLConnect;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class ThamSoChung_DAO {
    SQLConnect connect;
    public ThamSoChung_DAO(){
        connect = new SQLConnect("DESKTOP-LGV4DA9", "ICY", "sa", "123");
    }
     public ArrayList DocTS(){
     ArrayList dsts = new ArrayList<ThamSoChung_DTO>();
        try {
                
                String qry = "select * from ThamSoChung";
                ResultSet result = connect.executeQuery(qry);
                while (result.next()) {
                ThamSoChung_DTO ts = new ThamSoChung_DTO();
                ts.TenKho = result.getString(1);
                ts.TenPN = result.getString(2);
                ts.TTSP = result.getString(3);
                ts.TTPN = result.getString(4);
                dsts.add(ts);
            }
        } catch (Exception ex) {
            System.out.println("khong ket noi du lieu tu database!");
        }
        return dsts;
    }
     public void sua(ThamSoChung_DTO ts){
        try {
            String qry = "Update ThamSoChung Set ";
            qry = qry + " " + "TenKhoHang=" + "N'" + ts.TenKho + "'";
            qry = qry + " " + "TenPhieuNhap=" + "N'" + ts.TenPN + "'";
            qry = qry + " " + "ThongTinSanPham=" + "N'" + ts.TTSP + "'";
            qry = qry + " " + "ThongTinPhieuNhap=" + "N'" + ts.TTPN + "'";
            qry = qry + " Where Ma="+"N'1'";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println("Sửa thất bại!");
        }
    }
}
