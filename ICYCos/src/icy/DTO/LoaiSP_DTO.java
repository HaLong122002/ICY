/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DTO;

/**
 *
 * @author HP
 */
public class LoaiSP_DTO{
    public String MaLoaiSP;
    public String TenLoai;
    public String ThanhPhan;
    public String CongDungSP;

    public LoaiSP_DTO() {
    }

    public LoaiSP_DTO(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public LoaiSP_DTO(String MaLoaiSP, String TenLoai, String ThanhPhan, String CongDungSP) {
        this.MaLoaiSP = MaLoaiSP;
        this.TenLoai = TenLoai;
        this.ThanhPhan = ThanhPhan;
        this.CongDungSP = CongDungSP;
    }

    public String getMaLoaiSP() {
        return MaLoaiSP;
    }

    public void setMaLoaiSP(String MaLoaiSP) {
        this.MaLoaiSP = MaLoaiSP;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public String getThanhPhan() {
        return ThanhPhan;
    }

    public void setThanhPhan(String HangSX) {
        this.ThanhPhan = HangSX;
    }

    public String getCongDungSP() {
        return CongDungSP;
    }

    public void setCongDungSP(String CongDungSP) {
        this.CongDungSP = CongDungSP;
    }
    
}
