/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DTO;

/**
 *
 * @author HP
 */
public class NhapHang_DTO {
    public String MaSP;
    public String TenSP;
    public String SoLuong;
    public String HinhAnh;

    public NhapHang_DTO() {
    }

    public NhapHang_DTO(String MaSP, String TenSP) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
    }

    public NhapHang_DTO(String MaSP, String TenSP, String SoLuong, String HinhAnh) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.SoLuong = SoLuong;
        this.HinhAnh = HinhAnh;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }
    
}