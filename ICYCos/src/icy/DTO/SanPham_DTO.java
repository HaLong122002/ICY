/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DTO;

/**
 *
 * @author HP
 */
public class SanPham_DTO extends LoaiSP_DTO{
    public String MaSP;
    public String TenSP;
    public String GiaBan;
    public String SoLuong;
    public String DonViTinh;
    public String HinhAnhSP;

    public SanPham_DTO() {
    }

    public SanPham_DTO(String MaSP, String TenSP, String GiaBan, String SoLuong, String DonViTinh, String HinhAnhSP, String MaLoaiSP) {
        super(MaLoaiSP);
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.GiaBan = GiaBan;
        this.SoLuong = SoLuong;
        this.DonViTinh = DonViTinh;
        this.HinhAnhSP = HinhAnhSP;
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

    public String getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(String GiaBan) {
        this.GiaBan = GiaBan;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getDonViTinh() {
        return DonViTinh;
    }

    public void setDonViTinh(String DonViTinh) {
        this.DonViTinh = DonViTinh;
    }

    public String getHinhAnhSP() {
        return HinhAnhSP;
    }

    public void setHinhAnhSP(String HinhAnhSP) {
        this.HinhAnhSP = HinhAnhSP;
    }

    public String getMaLoaiSP() {
        return MaLoaiSP;
    }

    public void setMaLoaiSP(String MaLoaiSP) {
        this.MaLoaiSP = MaLoaiSP;
    }
    
 }