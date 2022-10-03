package icy.BUS;

import icy.DAO.KhachHang_DAO;
import icy.DTO.KhachHang_DTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class KhachHang_BUS {
    
    public static ArrayList<KhachHang_DTO> dskh;
    public static ArrayList<KhachHang_DTO> dstkkh;

    public KhachHang_BUS() {
    }
        
    public void DocDSKH(){
        KhachHang_DAO data=new KhachHang_DAO();
        if(dskh==null) dskh=new ArrayList<KhachHang_DTO>();
        dskh=data.DocDSKH();
    }
    
    public void them (KhachHang_DTO kh){
        int d = 0;
        for(KhachHang_DTO kh1 : dskh) {
            if(kh1.ma.equalsIgnoreCase(kh.ma)){
                JOptionPane.showMessageDialog(null, "Trùng mã khách hàng!");
                d++;
                break;
            }
        }
        if(d == 0) {
            KhachHang_DAO data = new KhachHang_DAO();
            data.them(kh);
            dskh.add(kh);
        }
    }
    
    public void sua(int i, KhachHang_DTO kh){
        KhachHang_DAO data = new KhachHang_DAO();
        data.sua(kh);
        KhachHang_DTO old = dskh.set(i, kh);
    }
    
    public void xoa(String ma, int i) {
        KhachHang_DAO data = new KhachHang_DAO();
        data.xoa(ma);
        dskh.remove(i);
    }
    
    public void timkiem(){
        if(dstkkh==null) dstkkh=new ArrayList<KhachHang_DTO>();
        
    }
}
