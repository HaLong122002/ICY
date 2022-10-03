/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICY.DTO;

/**
 *
 * @author Quan Phat Vinh Thanh
 */
public class Luong_DTO {
    public String MaNV;
     public String LuongCB;
    public String PhuCapanUong;
    public String PhuCapXangXe;
    public String PhuCapDienThoai;
    public String thuong;

    public Luong_DTO() {
    }

    public Luong_DTO(String MaNV, String LuongCB, String PhuCapanUong, String PhuCapXangXe, String PhuCapDienThoai, String thuong) {
        this.MaNV = MaNV;
        this.LuongCB = LuongCB;
        this.PhuCapanUong = PhuCapanUong;
        this.PhuCapXangXe = PhuCapXangXe;
        this.PhuCapDienThoai = PhuCapDienThoai;
        this.thuong = thuong;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getLuongCB() {
        return LuongCB;
    }

    public void setLuongCB(String LuongCB) {
        this.LuongCB = LuongCB;
    }

    public String getPhuCapanUong() {
        return PhuCapanUong;
    }

    public void setPhuCapanUong(String PhuCapanUong) {
        this.PhuCapanUong = PhuCapanUong;
    }

    public String getPhuCapXangXe() {
        return PhuCapXangXe;
    }

    public void setPhuCapXangXe(String PhuCapXangXe) {
        this.PhuCapXangXe = PhuCapXangXe;
    }

    public String getPhuCapDienThoai() {
        return PhuCapDienThoai;
    }

    public void setPhuCapDienThoai(String PhuCapDienThoai) {
        this.PhuCapDienThoai = PhuCapDienThoai;
    }

    public String getThuong() {
        return thuong;
    }

    public void setThuong(String thuong) {
        this.thuong = thuong;
    }
    
}
