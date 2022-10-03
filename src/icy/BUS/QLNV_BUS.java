/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICY.BUS;

import static ICY.BUS.DangKy_BUS.dsdk;
import ICY.DTO.DangKyDTO;
import ICY.DTO.Luong_DTO;
import ICY.DTO.QLNV_DTO;
import icy.DAO.QLNV_DAO;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Quan Phat Vinh Thanh
 */
public class QLNV_BUS {

    public static ArrayList<QLNV_DTO> dsnv;
    public static ArrayList<Luong_DTO> dsluong;
    // public static ArrayList<DangKyDTO> dsdk;
    // public static QLNV_ICY gui=new QLNV_ICY();
    public QLNV_DAO data = new QLNV_DAO();
    public static ArrayList<QLNV_DTO> kq = new ArrayList<QLNV_DTO>();
    public static ArrayList<QLNV_DTO> kqNC;
    public static ArrayList<Luong_DTO> kqLuong;
    public static ArrayList<Luong_DTO> DSLuongM;

    public void docDSNV() {
        if (dsnv == null) {
            dsnv = data.docDSNV();
        }
    }

    public void docDSLUONG() {
        if (dsluong == null) {
            dsluong = data.docDSLUONG();
        }
    }

    public void themNV(QLNV_DTO nv) {
        data.Them(nv);
        dsnv.add(nv);
    }

    public void ThemLuong(Luong_DTO luong) {
        data.ThemLuong(luong);
        dsluong.add(luong);
    }

    public void xoa(String ma) {
        data.xoa(ma);
        // dsnv.remove(nv);

    }

    public void xoaLuong(String ma) {
        data.xoaLuong(ma);
        //dsnv.remove(nv);

    }

    public static boolean KtrIDLuong(String x) {

        for (Luong_DTO luong : dsluong) {

            if (luong.MaNV.equals(x)) {
                return false;
            }

        }
        return true;
    }

    public void sua(QLNV_DTO nv) {
        data.sua(nv);
    }

    public void suaLuong(Luong_DTO luong) {
        data.suaLuong(luong);
    }

    public static boolean KtrID(String x) {
        for (QLNV_DTO nv : dsnv) {
            if (nv.Ma.equals(x)) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<QLNV_DTO> timTheoMa(String x) {
        ArrayList<QLNV_DTO> kq = new ArrayList<QLNV_DTO>();
        for (QLNV_DTO nv : dsnv) {
            if (nv.Ma.indexOf(x) >= 0) {
                kq.add(nv);
            }
        }
        return kq;

    }

    public static ArrayList<Luong_DTO> DSLUONG(String x) {
        ArrayList<Luong_DTO> DSLuongM = new ArrayList<Luong_DTO>();
        for (Luong_DTO luong : dsluong) {
            if (luong.MaNV.equals(x)) {
                DSLuongM.add(luong);
            }
        }
        return DSLuongM;

    }

    public static ArrayList<QLNV_DTO> timTheoHo(String x) {
        ArrayList<QLNV_DTO> kq = new ArrayList<QLNV_DTO>();
        for (QLNV_DTO nv : dsnv) {
            if (nv.Ho.indexOf(x) >= 0) {
                kq.add(nv);
            }
        }
        return kq;

    }

    public static ArrayList<QLNV_DTO> timTheoTen(String x) {
        ArrayList<QLNV_DTO> kq = new ArrayList<QLNV_DTO>();
        for (QLNV_DTO nv : dsnv) {
            if (nv.Ten.indexOf(x) >= 0) {
                kq.add(nv);
            }
        }
        return kq;

    }

    public static ArrayList<QLNV_DTO> timTheoGioiTinh(String x) {
        ArrayList<QLNV_DTO> kq = new ArrayList<QLNV_DTO>();
        for (QLNV_DTO nv : dsnv) {
            if (nv.GioiTinh.indexOf(x) >= 0) {
                kq.add(nv);
            }
        }
        return kq;
    }

    public static ArrayList<QLNV_DTO> timTheoEmail(String x) {
        ArrayList<QLNV_DTO> kq = new ArrayList<QLNV_DTO>();
        for (QLNV_DTO nv : dsnv) {
            if (nv.Email.indexOf(x) >= 0) {
                kq.add(nv);
            }
        }
        return kq;
    }

    public static ArrayList<QLNV_DTO> timTheoSDT(String x) {
        ArrayList<QLNV_DTO> kq = new ArrayList<QLNV_DTO>();
        for (QLNV_DTO nv : dsnv) {
            if (nv.SDT.indexOf(x) >= 0) {
                kq.add(nv);
            }
        }
        return kq;
    }

    public static ArrayList<QLNV_DTO> timTheoChucVu(String x) {
        ArrayList<QLNV_DTO> kq = new ArrayList<QLNV_DTO>();
        for (QLNV_DTO nv : dsnv) {
            if (nv.ChucVu.indexOf(x) >= 0) {
                kq.add(nv);
            }
        }
        return kq;
    }

    public static ArrayList<QLNV_DTO> timTheoDoTuoi(int a, int b) {
        ArrayList<QLNV_DTO> kq = new ArrayList<QLNV_DTO>();
        for (QLNV_DTO nv : dsnv) {
            int c = Integer.parseInt(nv.NamSinh);
            int tuoi = 2022 - c;
            if (tuoi >= a && tuoi <= b) {
                kq.add(nv);
            }
        }
        return kq;
    }

    public static ArrayList<QLNV_DTO> timTheoMucLuong(int a, int b) {
        ArrayList<QLNV_DTO> kq = new ArrayList<QLNV_DTO>();
        for (QLNV_DTO nv : dsnv) {
            int luong = Integer.parseInt(nv.Luong);
            if (luong >= a && luong <= b) {
                kq.add(nv);
            }
        }
        return kq;
    }

    public static ArrayList<QLNV_DTO> TimMavaChucVu(String x, String y) {
        ArrayList<QLNV_DTO> kqNC = new ArrayList<QLNV_DTO>();
        for (QLNV_DTO nv : dsnv) {
            if (nv.Ma.indexOf(x) >= 0 && nv.ChucVu.indexOf(y) >= 0) {
                kqNC.add(nv);
            }
        }
        return kqNC;
    }

    public static ArrayList<Luong_DTO> TimNVDuocThuong(String x, String y) {
        ArrayList<Luong_DTO> dqLuong = new ArrayList<Luong_DTO>();
        for (Luong_DTO luong : DSLuongM) {
            if (luong.MaNV.indexOf(x) >= 0 && luong.thuong.indexOf(String.valueOf(y)) >= 0) {
                kqLuong.add(luong);
            }
        }
        return kqLuong;
    }

    public static ArrayList<QLNV_DTO> TimMaorChucVu(String x, String y) {
        ArrayList<QLNV_DTO> kqNC = new ArrayList<QLNV_DTO>();
        for (QLNV_DTO nv : dsnv) {
            if (nv.Ma.indexOf(x) >= 0 || nv.ChucVu.indexOf(y) >= 0) {
                kqNC.add(nv);
            }
        }
        return kqNC;
    }

    public void timkiem() {
        if (dsluong == null) {
            dsluong = new ArrayList<Luong_DTO>();
        }
    }

    public static boolean checkCV(String x) {
        int d = 0;
        for (DangKyDTO dk : DangNhap_BUS.test) {

            if (dk.ChuVuDK.equals(x)) {
                d++;
            } else {
                d = 0;
            }
        }

        //System.out.println(d);
        if (d != 0) {
            return true;
        } else {
            return false;
        }
    }
}
