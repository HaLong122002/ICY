/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICY.BUS;

import ICY.DTO.DangKyDTO;
import icy.DAO.DangKy_DAO;
import java.util.ArrayList;

public class DangKy_BUS {

    public static ArrayList<DangKyDTO> dsdk;
    DangKy_DAO data = new DangKy_DAO();

    public void DocDSDK() {
        if (dsdk == null) {
            dsdk = new ArrayList<DangKyDTO>();
        }
        dsdk = data.DocDSDK();
    }

    public void themTK(DangKyDTO dk) {
        data.themTK(dk);
        dsdk.add(dk);
    }

    public void xoaTK(String ma) {
        data.xoaTK(ma);

    }

    public static boolean KtrTK(String x) {
        for (DangKyDTO dk : dsdk) {
            if (dk.TaiKhoan.equals(x)) {
                return false;
            }
        }
        return true;
    }

    public static boolean MaDKy(String x) {
        for (DangKyDTO dk : dsdk) {
            if (dk.MaDK.equals(x)) {
                return false;
            }
        }
        return true;

    }

    public boolean ID(String x) {
        for (DangKyDTO dk : dsdk) {
            if (dk.MaDK.equals(x)) {
                return false;
            }
        }
        return true;
    }

}
