/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DAO;

import ICY.DTO.Luong_DTO;
import ICY.DTO.QLNV_DTO;
import icy.GUI.QLNV_GUI;
import icy.SQLConnect;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QLNV_DAO {

    public static ArrayList kqNC = new ArrayList<QLNV_DTO>();
    public static ArrayList kqLuong = new ArrayList<Luong_DTO>();
    public static ArrayList dsluong = new ArrayList<QLNV_DTO>();
    public static ArrayList DSluongM = new ArrayList<QLNV_DTO>();
    SQLConnect connect;

    public QLNV_DAO() {
        connect = new SQLConnect("DESKTOP-LGV4DA9", "ICY", "sa", "123");
    }

    public ArrayList docDSNV() {
        ArrayList dsnv = new ArrayList<QLNV_DTO>();

        try {

            String qry = "select * from NVIEN1";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                QLNV_DTO nv = new QLNV_DTO();
                nv.Ma = result.getString(1);
                nv.Ho = result.getString(2);
                nv.Ten = result.getString(3);
                nv.GioiTinh = result.getString(4);
                nv.ChucVu = result.getString(5);
                nv.NgaySinh = result.getString(6);
                nv.ThangSinh = result.getString(7);
                nv.NamSinh = result.getString(8);
                nv.DiaChi = result.getString(9);
                nv.SDT = result.getString(10);
                nv.Email = result.getString(11);
                nv.Luong = result.getString(12);
                nv.anh = result.getString(13);
                dsnv.add(nv);
            }
        } catch (Exception ex) {
            Logger.getLogger(QLNV_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsnv;
    }

    public void Them(QLNV_DTO nv) {
        try {
            String qry = "Insert into NVIEN1 Values (";
            qry = qry + "N'" + nv.Ma + "'";
            qry = qry + ",N" + "'" + nv.Ho + "'";
            qry = qry + ",N" + "'" + nv.Ten + "'";
            qry = qry + ",N" + "'" + nv.GioiTinh + "'";
            qry = qry + ",N" + "'" + nv.ChucVu + "'";
            qry = qry + ",N" + "'" + nv.NgaySinh + "'";
            qry = qry + ",N" + "'" + nv.ThangSinh + "'";
            qry = qry + ",N" + "'" + nv.NamSinh + "'";
            qry = qry + ",N" + "'" + nv.DiaChi + "'";
            qry = qry + ",N" + "'" + nv.SDT + "'";
            qry = qry + ",N" + "'" + nv.Email + "'";
            qry = qry + ",N" + "'" + nv.Luong + "'";
            qry = qry + ",N" + "'" + nv.anh + "'";
            qry = qry + ")";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
            Logger.getLogger(QLNV_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sua(QLNV_DTO nv) {
        try {
            String qry = "Update NVIEN1 Set";
            qry = qry + " " + "Ma=" + "N'" + nv.Ma + "'";
            qry = qry + "," + "Ho=" + "N'" + nv.Ho + "'";
            qry = qry + "," + "Ten=" + "N'" + nv.Ten + "'";
            qry = qry + "," + "GioiTinh=" + "N'" + nv.GioiTinh + "'";
            qry = qry + "," + "ChucVu=" + "N'" + nv.ChucVu + "'";
            qry = qry + "," + "NgaySinh=" + "N'" + nv.NgaySinh + "'";
            qry = qry + "," + "ThangSinh=" + "N'" + nv.ThangSinh + "'";
            qry = qry + "," + "NamSinh=" + "N'" + nv.NamSinh + "'";
            qry = qry + "," + "DiaChi=" + "N'" + nv.DiaChi + "'";
            qry = qry + "," + "SDT=" + "N'" + nv.SDT + "'";
            qry = qry + "," + "Email=" + "N'" + nv.Email + "'";
            qry = qry + "," + "Luong=" + "N'" + nv.Luong + "'";
            qry = qry + "," + "Anh=" + "N'" + nv.anh + "'";
            qry = qry + " Where Ma=" + "N'" + nv.Ma + "'";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
            Logger.getLogger(QLNV_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void suaLuong(Luong_DTO luong) {
        try {
            String qry = "Update Luong Set";
            qry = qry + " " + "MaNV=" + "N'" + luong.MaNV + "'";
            qry = qry + "," + "LuongCB=" + "N'" + luong.LuongCB + "'";
            qry = qry + "," + "PhuCapAnUong=" + "N'" + luong.PhuCapanUong + "'";
            qry = qry + "," + "PhuCapXangXe=" + "N'" + luong.PhuCapXangXe + "'";
            qry = qry + "," + "PhuCapDienThoai=" + "N'" + luong.PhuCapDienThoai + "'";
            qry = qry + "," + "Thuong=" + "N'" + luong.thuong + "'";
            qry = qry + " Where MaNV=" + "N'" + luong.MaNV + "'";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
            Logger.getLogger(QLNV_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList docDSLUONG() {
        ArrayList dsnv = new ArrayList<QLNV_DTO>();

        try {

            String qry = "select * from Luong";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                Luong_DTO luong = new Luong_DTO();
                luong.MaNV = result.getString(1);
                luong.LuongCB = result.getString(2);
                luong.PhuCapanUong = result.getString(3);
                luong.PhuCapXangXe = result.getString(4);
                luong.PhuCapDienThoai = result.getString(5);
                luong.thuong = result.getString(6);
                dsluong.add(luong);
            }
        } catch (Exception ex) {
            Logger.getLogger(QLNV_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsluong;
    }

    public void ThemLuong(Luong_DTO luong) {
        try {
            String qry = "Insert into Luong Values (";
            qry = qry + "N'" + luong.MaNV + "'";
            qry = qry + ",N" + "'" + luong.LuongCB + "'";
            qry = qry + ",N" + "'" + luong.PhuCapanUong + "'";
            qry = qry + ",N" + "'" + luong.PhuCapXangXe + "'";
            qry = qry + ",N" + "'" + luong.PhuCapDienThoai + "'";
            qry = qry + ",N" + "'" + luong.thuong + "'";
            qry = qry + ")";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
            Logger.getLogger(QLNV_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //public  ArrayList docTK()
    /*       public void docTK(QLNV_DTO nv,String x, String y)
   {
       
        ArrayList kqNC=new ArrayList<QLNV_DTO>();
      
        try {
            SQLConnect connect = new SQLConnect("DESKTOP-1PTP5JE", "QLNV", "sa", "123");
           // QLNV_DTO nv= new QLNV_DTO();
            String qry="Select * From NVIEN1 WHERE Ma=N'"+nv.Ma+"' and ChucVu=N'"+nv.ChucVu+"'";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                QLNV_DTO NV = new QLNV_DTO();
                NV.Ma= result.getString(1);
                NV.Ho = result.getString(2);
                NV.Ten = result.getString(3);
                NV.GioiTinh = result.getString(4);
                NV.ChucVu = result.getString(2);
                NV.NgaySinh = result.getString(6);
                NV.ThangSinh = result.getString(7);
                NV.NamSinh = result.getString(8);
                NV.DiaChi = result.getString(9);
                NV.SDT = result.getString(10);
                NV.Email = result.getString(11);
                NV.Luong= result.getString(12);
                NV.anh= result.getString(13);
                kqNC.add(nv);
            }
        } catch (Exception ex) {
            Logger.getLogger(QLNV_ICY.class.getName()).log(Level.SEVERE, null, ex);
        }
    //    return kqNC;
    }
     */
    public void xoa(String ma) {
        try {
            String qry = "Delete from NVIEN1 where Ma=N'" + ma + "'";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
            Logger.getLogger(QLNV_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void xoaLuong(String ma) {
        try {
            String qry = "Delete from Luong where MaNV =N'" + ma + "'";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
            Logger.getLogger(QLNV_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList TimMavaChucVu(String x, String y) {
        //DangNhap_DTO  dn = new DangNhap_DTO();
        QLNV_DTO nv = new QLNV_DTO();
        try {
            //x=dn.TenDangNhap;
            String qry = "select * from NVIEN1   where Ma=N'" + x + "'and ChucVu=N'" + y + "'"; //where Ten= N'"+dn.TenDangNhap+"'";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                // QLNV_DTO nv = new QLNV_DTO();
                nv.Ma = result.getString(1);
                nv.Ho = result.getString(2);
                nv.Ten = result.getString(3);
                nv.GioiTinh = result.getString(4);
                nv.ChucVu = result.getString(5);
                nv.NgaySinh = result.getString(6);
                nv.ThangSinh = result.getString(7);
                nv.NamSinh = result.getString(8);
                nv.DiaChi = result.getString(9);
                nv.SDT = result.getString(10);
                nv.Email = result.getString(11);
                nv.Luong = result.getString(12);
                nv.anh = result.getString(13);
                kqNC.add(nv);
                System.out.println(kqNC.size());

            }
        } catch (Exception ex) {
            //  Logger.getLogger(DangNhap_GUI.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("chua ket noi");
        }
        return kqNC;
    }

    public ArrayList TimMaorChucVu(String x, String y) {
        //DangNhap_DTO  dn = new DangNhap_DTO();
        QLNV_DTO nv = new QLNV_DTO();
        try {
            //x=dn.TenDangNhap;
            String qry = "select * from NVIEN1   where Ma=N'" + x + "'or ChucVu=N'" + y + "'"; //where Ten= N'"+dn.TenDangNhap+"'";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                // QLNV_DTO nv = new QLNV_DTO();
                nv.Ma = result.getString(1);
                nv.Ho = result.getString(2);
                nv.Ten = result.getString(3);
                nv.GioiTinh = result.getString(4);
                nv.ChucVu = result.getString(5);
                nv.NgaySinh = result.getString(6);
                nv.ThangSinh = result.getString(7);
                nv.NamSinh = result.getString(8);
                nv.DiaChi = result.getString(9);
                nv.SDT = result.getString(10);
                nv.Email = result.getString(11);
                nv.Luong = result.getString(12);
                nv.anh = result.getString(13);
                kqNC.add(nv);

            }
        } catch (Exception ex) {
            //  Logger.getLogger(DangNhap_GUI.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("chua ket noi");
        }
        return kqNC;
    }

    public ArrayList DSLUONG(String x) {
        //DangNhap_DTO  dn = new DangNhap_DTO();
        //QLNV_DTO nv = new QLNV_DTO();
        Luong_DTO luong = new Luong_DTO();
        try {
            //x=dn.TenDangNhap;
            String qry = "select * from Luong  where MaNV=N'" + x + "'"; //where Ten= N'"+dn.TenDangNhap+"'";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                // QLNV_DTO nv = new QLNV_DTO();
                luong.MaNV = result.getString(1);
                luong.LuongCB = result.getString(2);
                luong.PhuCapanUong = result.getString(3);
                luong.PhuCapXangXe = result.getString(4);
                luong.PhuCapDienThoai = result.getString(1);
                luong.thuong = result.getString(4);

                DSluongM.add(luong);
                System.out.println(kqNC.size());

            }
        } catch (Exception ex) {
            //  Logger.getLogger(DangNhap_GUI.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("chua ket noi");
        }
        return DSluongM;
    }

    /* public static  ArrayList TimMavaChucVu(String x,String y){
       //DangNhap_DTO  dn = new DangNhap_DTO();
       QLNV_DTO nv = new QLNV_DTO();
        try {
            SQLConnect connect = new SQLConnect("DESKTOP-1PTP5JE", "QLNV", "sa", "123"); 
           //x=dn.TenDangNhap;
            String qry = "select * from NVIEN1   where Ma=N'"+x+"'and ChucVu=N'"+y+"'"; //where Ten= N'"+dn.TenDangNhap+"'";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
               // QLNV_DTO nv = new QLNV_DTO();
                nv.Ma= result.getString(1);
                nv.Ho = result.getString(2);
                nv.Ten = result.getString(3);
                nv.GioiTinh = result.getString(4);
                nv.ChucVu = result.getString(5);
                nv.NgaySinh = result.getString(6);
                nv.ThangSinh = result.getString(7);
                nv.NamSinh = result.getString(8);
                nv.DiaChi = result.getString(9);
                nv.SDT = result.getString(10);
                nv.Email = result.getString(11);
                nv.Luong= result.getString(12);
                nv.anh= result.getString(13);
                kqNC.add(nv);
                System.out.println(kqNC.size());
              
           
            }
        } catch (Exception ex) {
          //  Logger.getLogger(DangNhap_GUI.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("chua ket noi");
        }
        return kqNC;
     } */
    public ArrayList TimNVDuocThuong(String x, String y) {
        //DangNhap_DTO  dn = new DangNhap_DTO();
        // QLNV_DTO nv = new QLNV_DTO();
        Luong_DTO luong = new Luong_DTO();
        try {
            //x=dn.TenDangNhap;
            String qry = "select * from Luong   where MaNV=N'" + x + "' and Thuong=N'" + y + "'"; //where Ten= N'"+dn.TenDangNhap+"'";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                // QLNV_DTO nv = new QLNV_DTO();
                luong.MaNV = result.getString(1);
                luong.LuongCB = result.getString(2);
                luong.PhuCapanUong = result.getString(3);
                luong.PhuCapXangXe = result.getString(4);
                luong.PhuCapDienThoai = result.getString(5);
                luong.thuong = result.getString(6);
                kqLuong.add(luong);

            }
        } catch (Exception ex) {
            //  Logger.getLogger(DangNhap_GUI.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("chua ket noi");
        }
        return kqLuong;
    }
}
