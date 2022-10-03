/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICY.BUS;

import ICY.DAO.DangNhap_DAO;
import ICY.DTO.DangKyDTO;
import ICY.DTO.QLNV_DTO;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DangNhap_BUS {

    public static ArrayList<DangKyDTO> dsdk;
    public static ArrayList<QLNV_DTO> dsnv;
    QLNV_BUS qlnv = new QLNV_BUS();
    DangNhap_DAO data = new DangNhap_DAO();
    public static ArrayList<DangKyDTO> test;
    public static ArrayList<DangKyDTO> login;

    public void DocDSDN() {
        if (dsdk == null) {
            dsdk = new ArrayList<DangKyDTO>();
        }
        dsdk = data.DocDSDN();
    }

    public void DangNhap(String x, String y) {
        if (test == null) {
            test = new ArrayList<DangKyDTO>();
        }
        test = data.DangNhap(x, y);
    }

    public static boolean check(String x, String y) {
        int d = 0;
        for (DangKyDTO dk : test) {
            if (x.equals(dk.TaiKhoan) && y.equals(dk.MatKhau)) {
                d = d + 1;
            } else {
                d = 0;
            }
        }
        if (d != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkDN(String x) {
        int d = 0;
        for (DangKyDTO dk : dsdk) {
            if (dk.MaDK.equals(x)) {
                d++;
            } else {
                d = 0;
            }
        }
        if (d != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkTaiKhoan(String x) {
        int d = 0;
        for (DangKyDTO dk : test) {
            if (dk.MaDK.equals(x)) {
                System.out.println("DK" + x);
                d++;
            } else {
                d = 0;
            }
        }
        if (d != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkID(String x) {
        int d = 0;
        for (DangKyDTO dk : dsdk) {
            if (dk.TaiKhoan.equals(x)) {
                System.out.println("DK" + x);
                d++;
            } else {
                d = 0;
            }
        }
        if (d != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkIDMK(String x) {
        int d = 0;
        for (QLNV_DTO nv : QLNV_BUS.dsnv) {
            if (nv.Ma.equals(x)) {
                System.out.println("DK" + x);
                d++;
            } else {
                d = 0;
            }
        }
        if (d != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void Sua(String x, String y) {
        data.sua(x, y);
    }
}
