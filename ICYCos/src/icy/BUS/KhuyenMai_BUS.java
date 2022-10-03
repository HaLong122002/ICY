package icy.BUS;

import icy.DAO.KhuyenMai_DAO;
import icy.DTO.KhuyenMai_DTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class KhuyenMai_BUS {
    
    public static ArrayList<KhuyenMai_DTO> dskm;
    public static ArrayList<KhuyenMai_DTO> dstkkm;

    public void DocDSKM(){
        KhuyenMai_DAO data=new KhuyenMai_DAO();
        if(dskm==null) dskm=new ArrayList<KhuyenMai_DTO>();
        dskm=data.DocDSKM();
    }
    
    public void them (KhuyenMai_DTO km){
        int d = 0;
        for(KhuyenMai_DTO km1 : dskm) {
            if(km1.makm.equalsIgnoreCase(km.makm)){
                JOptionPane.showMessageDialog(null, "Trùng mã khuyến mãi!");
                d++;
                break;
            }
        }
        if(d == 0) {
            KhuyenMai_DAO data = new KhuyenMai_DAO();
            data.them(km);
            dskm.add(km);
        }
    }
    
    public void sua(int i, KhuyenMai_DTO km){
        KhuyenMai_DAO data = new KhuyenMai_DAO();
        data.sua(km);
        KhuyenMai_DTO old = dskm.set(i, km);
    }
    
    public void xoa(String ma, int i) {
        KhuyenMai_DAO data = new KhuyenMai_DAO();
        data.xoa(ma);
        dskm.remove(i);
    }
    
    public void timkiem(){
        if(dstkkm==null) dstkkm=new ArrayList<KhuyenMai_DTO>();
    }
}
