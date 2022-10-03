/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DTO;

/**
 *
 * @author Kieu Lam Ngo
 */
public class HoaDon_DTO {
    public String MaHD;
    public String TenKH;
    public String TenNV;
    public String NgayLap;
    public String TongTien;

    public HoaDon_DTO() {
    }

    public HoaDon_DTO(String MaHD, String TenKH, String TenNV, String NgayLap, String TongTien) {
        this.MaHD = MaHD;
        this.TenKH = TenKH;
        this.TenNV = TenNV;
        this.NgayLap = NgayLap;
        this.TongTien = TongTien;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String MaKH) {
        this.TenKH = MaKH;
    }


    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String MaNV) {
        this.TenNV = MaNV;
    }

    public String getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
    }

    public String getTongTien() {
        return TongTien;
    }

    public void setTongTien(String TongTien) {
        this.TongTien = TongTien;
    }
}
