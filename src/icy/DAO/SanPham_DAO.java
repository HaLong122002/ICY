/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DAO;

import icy.SQLConnect;
import icy.DTO.SanPham_DTO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class SanPham_DAO {
    SQLConnect connect;
    public SanPham_DAO(){
        connect = new SQLConnect("DESKTOP-LGV4DA9", "ICY", "sa", "123");
    }
    public ArrayList DocSP(){
        ArrayList dssp=new ArrayList<SanPham_DTO>();
        try {
            
            String qry = "select * from SanPham";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                SanPham_DTO sp = new SanPham_DTO();
                sp.MaSP = result.getString(1);
                sp.TenSP = result.getString(2);
                sp.MaLoaiSP = result.getString(3);
                sp.GiaBan = result.getString(4);
                sp.SoLuong = result.getString(5);
                sp.DonViTinh=result.getString(6);
                sp.HinhAnhSP = result.getString(7);
                dssp.add(sp);
            }
        } catch (Exception ex) {
            System.out.println("Không đọc đc dữ liệu từ database!");
        }
        return dssp;
    }
    public void them(SanPham_DTO sp){
        try{
        String qry="Insert into SanPham Values (";
        qry=qry+"N'"+sp.MaSP+"'";
        qry=qry+",N"+"'"+sp.TenSP+"'";
        qry=qry+",N"+"'"+sp.MaLoaiSP+"'";
        qry=qry+",N"+"'"+sp.GiaBan+"'";
        qry=qry+",N"+"'"+sp.SoLuong+"'";
        qry=qry+",N"+"'"+sp.DonViTinh+"'";
        qry=qry+",N"+"'"+sp.HinhAnhSP+"'";
        qry=qry+")";
        connect.executeUpdate(qry);
        }catch (Exception ex) {
            System.out.println("Ghi vào database thất bại!");
        }
    }
    public void sua(SanPham_DTO sp){
        try {
            String qry = "Update SanPham Set ";
            qry = qry + " " + "TenSP=" + "N'" + sp.TenSP + "'";
            qry = qry + "," + "MaLoaiSP=" + "N'" + sp.MaLoaiSP + "'";
            qry = qry + "," + "GiaBan=" + "N'" + sp.GiaBan + "'";
            qry = qry + "," + "DonViTinh=" + "N'" + sp.DonViTinh + "'";
            qry = qry + "," + "HinhAnh=" + "N'" + sp.HinhAnhSP + "'";
            qry = qry + " Where MaSP=" +"N'"+sp.MaSP+"'";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println("Sửa thất bại!");
        }
    }
    public void xoa(String ma){
        try{
                String qry="Delete from SanPham where MaSP='"+ma+"'";
                connect.executeUpdate(qry);
            }catch(Exception ex){
                System.out.println("Xóa thất bại!");
            }
    }
}
