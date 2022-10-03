package icy.DAO;

import icy.DTO.KhachHang_DTO;
import icy.SQLConnect;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KhachHang_DAO {
    SQLConnect connect;
    
    public KhachHang_DAO(){
        connect = new SQLConnect("DESKTOP-LGV4DA9", "ICY", "sa", "123");
    } 
    
     public ArrayList DocDSKH(){
         ArrayList dskh=new ArrayList<KhachHang_DTO>();
        try {
            String qry = "select * from KhachHang";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                KhachHang_DTO kh = new KhachHang_DTO();
                kh.ma = result.getString(1);
                kh.ho = result.getString(2);
                kh.ten = result.getString(3);
                kh.sdt = result.getString(4);
                kh.sonha = result.getString(5);
                kh.duong = result.getString(6);
                kh.phuong = result.getString(7);
                kh.quan = result.getString(8);
                kh.thanhpho = result.getString(9);
                dskh.add(kh);
            }
        } catch (Exception ex) {
            Logger.getLogger(KhachHang_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dskh;
    }
    
    public void them(KhachHang_DTO kh){
        try {
            //N'KH001', N'Trần Thị Hạ', N'Long', N'0124567889', N'487/9', N'Kênh Tân Hóa', N'Hòa Thạnh', N'Tân Phú', N'Thành phố Hồ Chí Minh')
            String qry = "INSERT INTO KhachHang VALUES (";
            qry = qry + "N'" + kh.ma + "'";
            qry = qry + ", N'" + kh.ho + "'";
            qry = qry + ", N'" + kh.ten + "'";
            qry = qry + ", N'" + kh.sdt + "'";
            qry = qry + ", N'" + kh.sonha + "'";
            qry = qry + ", N'" + kh.duong + "'";
            qry = qry + ", N'" + kh.phuong + "'";
            qry = qry + ", N'" + kh.quan + "'";
            qry = qry + ", N'" + kh.thanhpho + "'";
            qry = qry + ")";
            connect.executeUpdate(qry);
        } catch (Exception e) {
            Logger.getLogger(KhachHang_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void sua (KhachHang_DTO kh){
        try{
            String qry = "Update KhachHang Set ";
            qry = qry + "HoLot=" + "N'" + kh.ho + "'";
            qry = qry + ", Ten=" + "N'" + kh.ten + "'";
            qry = qry + ", SoDienThoai=" + "N'" + kh.sdt + "'";
            qry = qry + ", SoNha=" + "N'" + kh.sonha + "'";
            qry = qry + ", Duong=" + "N'" + kh.duong + "'";
            qry = qry + ", Phuong=" + "N'" + kh.phuong + "'";
            qry = qry + ", Quan=" + "N'" + kh.quan + "'";
            qry = qry + ", ThanhPho=" + "N'" + kh.thanhpho + "'";
            qry = qry + " where MaKH=" + "N'" + kh.ma + "'";
            connect.executeUpdate(qry);
        } catch (Exception ex){
            Logger.getLogger(KhachHang_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void xoa (String ma){
        try{
            String qry = "Delete from KhachHang where MaKH=N'" + ma + "'";
            connect.executeUpdate(qry);
        } catch (Exception e) {
            Logger.getLogger(KhachHang_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
