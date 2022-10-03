package icy.DAO;

import icy.DTO.KhuyenMai_DTO;
import icy.SQLConnect;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KhuyenMai_DAO {
    
    SQLConnect connect;
    public KhuyenMai_DAO(){
        connect = new SQLConnect("DESKTOP-LGV4DA9", "ICY", "sa", "123");
    }
    public ArrayList DocDSKM(){
        ArrayList dskm=new ArrayList<KhuyenMai_DTO>();
        try {
            String qry = "select * from KhuyenMai";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                KhuyenMai_DTO km = new KhuyenMai_DTO();
                km.makm = result.getString(1);
                km.ten = result.getString(2);
                km.ngaybd = result.getString(3);
                km.thangbd = result.getString(4);
                km.nambd = result.getString(5);
                km.ngaykt = result.getString(6);
                km.thangkt = result.getString(7);
                km.namkt = result.getString(8);
                dskm.add(km);
            }
        } catch (Exception ex) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dskm;
    }
    
    public void them(KhuyenMai_DTO km){
        try {
            //N'KH001', N'Trần Thị Hạ', N'Long', N'0124567889', N'487/9', N'Kênh Tân Hóa', N'Hòa Thạnh', N'Tân Phú', N'Thành phố Hồ Chí Minh')
            String qry = "INSERT INTO KhuyenMai VALUES (";
            qry = qry + "N'" + km.makm + "'";
            qry = qry + ", N'" + km.ten + "'";
            qry = qry + ", N'" + km.ngaybd + "'";
            qry = qry + ", N'" + km.thangbd + "'";
            qry = qry + ", N'" + km.nambd + "'";
            qry = qry + ", N'" + km.ngaykt + "'";
            qry = qry + ", N'" + km.thangkt + "'";
            qry = qry + ", N'" + km.namkt + "'";
            qry = qry + ")";
            connect.executeUpdate(qry);
        } catch (Exception e) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void sua (KhuyenMai_DTO km){
        try{
            String qry = "Update KhuyenMai Set ";
            qry = qry + "TEN=" + "N'" + km.ten + "'";
            qry = qry + ", NGAYBD=" + "N'" + km.ngaybd + "'";
            qry = qry + ", THANGBD=" + "N'" + km.thangbd + "'";
            qry = qry + ", NAMBD=" + "N'" + km.nambd + "'";
            qry = qry + ", NGAYKT=" + "N'" + km.ngaykt + "'";
            qry = qry + ", THANGKT=" + "N'" + km.thangkt + "'";
            qry = qry + ", NAMKT=" + "N'" + km.namkt + "'";
            qry = qry + " where MAKM=" + "N'" + km.makm + "'";
            connect.executeUpdate(qry);
        } catch (Exception ex){
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void xoa (String ma){
        try{
            String qry = "Delete from KhuyenMai where MAKM=N'" + ma + "'";
            connect.executeUpdate(qry);
        } catch (Exception e) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
