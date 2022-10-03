/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DTO;

/**
 *
 * @author HP
 */
public class ChiTietPhieuNhap_DTO extends NhapHang_DTO{
    public int MaPN;
    public int SoLuongNhap;
    public float DonGia;
    public float ThanhTien;

    public ChiTietPhieuNhap_DTO() {
    }

    public ChiTietPhieuNhap_DTO(int MaPN, int SoLuongNhap, float DonGia, float ThanhTien, String MaSP, String TenSP) {
        super(MaSP, TenSP);
        this.MaPN = MaPN;
        this.SoLuongNhap = SoLuongNhap;
        this.DonGia = DonGia;
        this.ThanhTien = ThanhTien;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public int getSoLuongNhap() {
        return SoLuongNhap;
    }

    public void setSoLuongNhap(int SoLuong) {
        this.SoLuongNhap = SoLuongNhap;
    }

    public int getMaPN() {
        return MaPN;
    }

    public void setMaPN(int MaPN) {
        this.MaPN = MaPN;
    }
    
}
