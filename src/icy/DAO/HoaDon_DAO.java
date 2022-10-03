/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DAO;

import icy.DTO.HoaDon_DTO;
import icy.SQLConnect;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class HoaDon_DAO {
    SQLConnect connect;
    public HoaDon_DAO(){
        connect = new SQLConnect("DESKTOP-LGV4DA9", "ICY", "sa", "123");
    }
    public ArrayList DocHoaDon(){
        ArrayList dshoadon =new ArrayList<HoaDon_DTO>();
        try {
            
            String qry = "select * from HoaDon";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                HoaDon_DTO hd = new HoaDon_DTO();
                hd.MaHD = result.getString(1);
                hd.TenKH = result.getString(2);
                hd.TenNV = result.getString(3);
                hd.NgayLap = result.getString(4);
                hd.TongTien = result.getString(5);
                dshoadon.add(hd);
            }
        } catch (Exception ex) {
            System.out.println("Không đọc đc dữ liệu từ database!");
        }
        return dshoadon;
    }
    public void NhapHD(HoaDon_DTO pnh){
        try{
        String qry="Insert into HoaDon Values (";
        qry=qry+"N'"+pnh.MaHD+"'";
        qry=qry+",N'"+pnh.TenKH+"'";
        qry=qry+",N"+"'"+pnh.TenNV+"'";
        qry=qry+",N"+"'"+pnh.NgayLap+"'";
        qry=qry+",N"+"'"+pnh.TongTien+"'";
        qry=qry+")";
        connect.executeUpdate(qry);
        }catch (Exception ex) {
            System.out.println("Ghi vào database thất bại!");
        }
    }
}
