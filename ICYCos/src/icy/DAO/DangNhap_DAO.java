/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICY.DAO;

import ICY.DTO.DangKyDTO;
import icy.GUI.DangNhap_GUI;
import icy.GUI.QLNV_GUI;
import icy.SQLConnect;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class DangNhap_DAO {

    static ArrayList dsdk = new ArrayList<DangKyDTO>();
    static ArrayList test = new ArrayList<DangKyDTO>();
    DangKyDTO dk = new DangKyDTO();
    SQLConnect connect;
    public DangNhap_DAO() {
        connect = new SQLConnect("DESKTOP-LGV4DA9", "ICY", "sa", "123");
    }

    public ArrayList DocDSDN() {

        try {
            String qry = "select * from NguoiDung";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                DangKyDTO dk = new DangKyDTO();
                dk.MaDK = result.getString(1);
                dk.TaiKhoan = result.getString(2);
                dk.MatKhau = result.getString(3);
                dk.ChuVuDK = result.getString(4);
                dsdk.add(dk);
            }
        } catch (Exception ex) {
            Logger.getLogger(DangNhap_GUI.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("chua ket noi");
        }
        return dsdk;
    }
    public ArrayList DangNhap(String x, String y) {
        DangKyDTO dk = new DangKyDTO();
        try {
            String qry = "select * from NguoiDung where TaiKhoan=N'" + x + "'and MatKhau=N'" + y + "'"; //where Ten= N'"+dn.TenDangNhap+"'";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                dk.MaDK = result.getString(1);
                dk.TaiKhoan = result.getString(2);
                dk.MatKhau = result.getString(3);
                dk.ChuVuDK = result.getString(4);
                test.add(dk);
                System.out.println(test.size());
            }
        } catch (Exception ex) {
            Logger.getLogger(DangNhap_GUI.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("chua ket noi");
        }
        return test;
    }

    public void sua(String x, String y) {
        try {
            String qry = "Update NguoiDung Set";
            qry = qry + " " + "MatKhau=" + "N'" + x + "'";
            qry = qry + " Where Ma=" + "N'" + y + "'";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
            Logger.getLogger(QLNV_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
