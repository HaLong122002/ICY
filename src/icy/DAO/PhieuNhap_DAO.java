/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DAO;

import icy.DTO.PhieuNhap_DTO;
import icy.SQLConnect;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class PhieuNhap_DAO {
    SQLConnect connect;
    public PhieuNhap_DAO(){
        connect = new SQLConnect("DESKTOP-LGV4DA9", "ICY", "sa", "123");
    }
    public ArrayList DocPhieuNhap(){
        ArrayList dspnh=new ArrayList<PhieuNhap_DTO>();
        try {
            
            String qry = "select * from PhieuNhap";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                PhieuNhap_DTO pnh = new PhieuNhap_DTO();
                pnh.MaPN = result.getString(1);
                pnh.MaNCC = result.getString(2);
                pnh.MaNV = result.getString(3);
                pnh.NgayLap = result.getString(4);
                pnh.TongTien = result.getString(5);
                dspnh.add(pnh);
            }
        } catch (Exception ex) {
            System.out.println("Không đọc đc dữ liệu từ database!");
        }
        return dspnh;
    }
    public void NhapHang(PhieuNhap_DTO pnh){
        try{
        String qry="Insert into PhieuNhap Values (";
        qry=qry+"N'"+pnh.MaPN+"'";
        qry=qry+",N'"+pnh.MaNCC+"'";
        qry=qry+",N"+"'"+pnh.MaNV+"'";
        qry=qry+",N"+"'"+pnh.NgayLap+"'";
        qry=qry+",N"+"'"+pnh.TongTien+"'";
        qry=qry+")";
        connect.executeUpdate(qry);
        }catch (Exception ex) {
            System.out.println("Ghi vào database thất bại!");
        }
    }
}
