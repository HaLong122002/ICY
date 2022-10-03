package icy.BUS;

import icy.DAO.CTKhuyenMai_DAO;
import icy.DTO.CTKhuyenMai_DTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CTKhuyenMai_BUS {
    
    public static ArrayList<CTKhuyenMai_DTO> dsctkm;
    public static ArrayList<CTKhuyenMai_DTO> dscttkkm;
    public static ArrayList<CTKhuyenMai_DTO> dstimkiemct;
    
    public void DocDSCTKM(){
        CTKhuyenMai_DAO data=new CTKhuyenMai_DAO();
        if(dsctkm==null) dsctkm=new ArrayList<CTKhuyenMai_DTO>();
        if(dscttkkm==null) dscttkkm=new ArrayList<CTKhuyenMai_DTO>();
        dsctkm=data.DocDSCTKM();
    }
    
    public void them(CTKhuyenMai_DTO km){
        int d = 0;
        for (CTKhuyenMai_DTO km1 : dscttkkm) {
            if (km1.masp.equalsIgnoreCase(km.masp)) {
                JOptionPane.showMessageDialog(null, "Trùng mã sản phẩm");
                d++;
                break;
            }
        }
        if (d == 0) {
            CTKhuyenMai_DAO data = new CTKhuyenMai_DAO();
            data.them(km);
            dsctkm.add(km);
            dscttkkm.add(km);
        }
    }

    public void sua(int i, CTKhuyenMai_DTO km){
        CTKhuyenMai_DAO data = new CTKhuyenMai_DAO();
        data.sua(km);
        CTKhuyenMai_DTO old = dsctkm.set(i, km);
    }
    
    public void xoa(String ma, int i) {
        CTKhuyenMai_DAO data = new CTKhuyenMai_DAO();
        data.xoa(ma);
        dsctkm.remove(i);
    }
    
    public void timkiem(){
        if(dscttkkm==null) dscttkkm=new ArrayList<CTKhuyenMai_DTO>();
    }
    
    public void timkiemchitiet(){
        if(dstimkiemct==null) dstimkiemct=new ArrayList<CTKhuyenMai_DTO>();
        
    }
}
