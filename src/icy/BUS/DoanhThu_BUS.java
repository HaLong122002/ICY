package icy.BUS;

import icy.DAO.HoaDon_DAO;
import icy.DTO.HoaDon_DTO;
import java.util.ArrayList;

public class DoanhThu_BUS {
    
    public static ArrayList<HoaDon_DTO> dsdt;
    HoaDon_DAO data=new HoaDon_DAO();

    public void DocDSDT(){
        if(dsdt==null) dsdt=new ArrayList<HoaDon_DTO>();
        dsdt=data.DocHoaDon();
    }
}
