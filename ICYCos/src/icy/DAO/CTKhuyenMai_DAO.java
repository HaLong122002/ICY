package icy.DAO;

import icy.DTO.CTKhuyenMai_DTO;
import icy.SQLConnect;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CTKhuyenMai_DAO {
    SQLConnect connect;
    
    public CTKhuyenMai_DAO(){
        connect = new SQLConnect("DESKTOP-LGV4DA9", "ICY", "sa", "123");

    } 
    
    public ArrayList DocDSCTKM(){
        ArrayList dsctkm = new ArrayList<CTKhuyenMai_DTO>();
        try {
            String qry = "select * from CTKhuyenMai";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                CTKhuyenMai_DTO ctkm = new CTKhuyenMai_DTO();
                ctkm.mact = result.getString(1);
                ctkm.makm = result.getString(2);
                ctkm.masp = result.getString(3);
                ctkm.noidungkm = result.getString(4);
                ctkm.noidungct = result.getString(5);
                ctkm.giamgia = result.getString(6);
                dsctkm.add(ctkm);
            }
        } catch (Exception ex) {
            Logger.getLogger(CTKhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsctkm;
    }
    
    public void them(CTKhuyenMai_DTO ctkm){
        try {
            String qry = "INSERT INTO CTKhuyenMai VALUES (";
            qry = qry + "N'" + ctkm.mact + "'";
            qry = qry + ", N'" + ctkm.makm + "'";
            qry = qry + ", N'" + ctkm.masp + "'";
            qry = qry + ", N'" + ctkm.noidungkm+ "'";
            qry = qry + ", N'" + ctkm.noidungct+ "'";
            qry = qry + ", N'" + ctkm.giamgia+ "'";
            qry = qry + ")";
            connect.executeUpdate(qry);
        } catch (Exception e) {
            Logger.getLogger(CTKhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void sua (CTKhuyenMai_DTO ctkm){
        try{
            String qry = "Update CTKhuyenMai Set ";
            qry = qry + "MAKM=" + "N'" + ctkm.makm + "'";
            qry = qry + ", MASP=" + "N'" + ctkm.masp + "'";
            qry = qry + ", NOIDUNG=" + "N'" + ctkm.noidungkm + "'";
            qry = qry + ", NOIDUNGCT=" + "N'" + ctkm.noidungct + "'";
            qry = qry + ", GIAMGIA=" + "N'" + ctkm.giamgia + "'";
            qry = qry + " where MACT=" + "N'" + ctkm.mact + "'";
            connect.executeUpdate(qry);
        } catch (Exception ex){
            Logger.getLogger(CTKhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void xoa (String ma){
        try{
            String qry = "Delete from CTKhuyenMai where MACT=N'" + ma + "'";
            connect.executeUpdate(qry);
        } catch (Exception e) {
            Logger.getLogger(CTKhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
