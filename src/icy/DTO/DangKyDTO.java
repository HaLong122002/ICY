/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICY.DTO;

/**
 *
 * @author Quan Phat Vinh Thanh
 */
public class DangKyDTO {
 public String TaiKhoan;
 public String MatKhau;
 public String MaDK;
 public String ChuVuDK;
 

    public DangKyDTO() {
    }

    public DangKyDTO(String TaiKhoan, String MatKhau, String MaDK, String ChuVuDK) {
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
        this.MaDK = MaDK;
        this.ChuVuDK = ChuVuDK;
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getMaDK() {
        return MaDK;
    }

    public void setMaDK(String MaDK) {
        this.MaDK = MaDK;
    }

    public String getChuVuDK() {
        return ChuVuDK;
    }

    public void setChuVuDK(String ChuVuDK) {
        this.ChuVuDK = ChuVuDK;
    }

 
        
}
