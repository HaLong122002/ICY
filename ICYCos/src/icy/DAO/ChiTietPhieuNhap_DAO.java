/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DAO;

import icy.DTO.ChiTietPhieuNhap_DTO;
import icy.SQLConnect;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class ChiTietPhieuNhap_DAO {
    SQLConnect connect;
    public ChiTietPhieuNhap_DAO(){
        connect=new SQLConnect("DESKTOP-LGV4DA9","ICY","sa","123");
    }
    public ArrayList DocCTPN(){
        ArrayList dspn=new ArrayList<ChiTietPhieuNhap_DTO>();
        try {
            
            String qry = "select * from ChiTietPhieuNhap";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                ChiTietPhieuNhap_DTO pn = new ChiTietPhieuNhap_DTO();
                pn.MaPN= Integer.parseInt(result.getString(1));
                pn.MaSP = result.getString(2);
                pn.TenSP = result.getString(3);
                pn.SoLuongNhap = Integer.parseInt(result.getString(4));
                pn.DonGia = Float.parseFloat(result.getString(5));
                pn.ThanhTien = Float.parseFloat(result.getString(6));
                dspn.add(pn);
            }
        } catch (Exception ex) {
            System.out.println("Không đọc đc dữ liệu từ database!");
        }
        return dspn;
    }
    public void them(ChiTietPhieuNhap_DTO pn){
        try{
        String qry="Insert into ChiTietPhieuNhap Values (";
        qry=qry+"N'"+pn.MaPN+"'";
        qry=qry+",N'"+pn.MaSP+"'";
        qry=qry+",N"+"'"+pn.TenSP+"'";
        qry=qry+",N"+"'"+pn.SoLuongNhap+"'";
        qry=qry+",N"+"'"+pn.DonGia+"'";
        qry=qry+",N"+"'"+pn.ThanhTien+"'";
        qry=qry+")";
        connect.executeUpdate(qry);
        }catch (Exception ex) {
            System.out.println("Ghi vào database thất bại!");
        }
    }
    public void sua(ChiTietPhieuNhap_DTO pn){
        try {
            String qry = "Update ChiTietPhieuNhap Set ";
            qry = qry + " " + "SoLuong=" + "N'" + pn.SoLuongNhap + "'";
            qry = qry + "," + "DonGia=" + "N'" + pn.DonGia + "'";
            qry = qry + "," + "ThanhTien=" + "N'" + pn.ThanhTien + "'";
            qry = qry + " Where MaPN=" +"N'"+pn.MaPN+"'";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println("Sửa thất bại!");
        }
    }
    public void xoa(String stt){
        try{
                String qry="Delete from ChiTietPhieuNhap where MaPN='"+stt+"'";
                connect.executeUpdate(qry);
            }catch(Exception ex){
                System.out.println("Xóa thất bại!");
            }
    }
}
