/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.BUS;

import icy.DAO.HoaDon_DAO;
import icy.DTO.HoaDon_DTO;
import java.util.ArrayList;

/**
 *
 * @author Kieu Lam Ngo
 */
public class HoaDon_BUS {
    public static ArrayList<HoaDon_DTO> dshoadon;
    HoaDon_DAO data=new HoaDon_DAO();
    public void DocHoaDon(){
        if(dshoadon == null) dshoadon=new ArrayList<HoaDon_DTO>();
        dshoadon=data.DocHoaDon();
    }
      public void NhapHD(HoaDon_DTO hd){
        data.NhapHD(hd);
        dshoadon.add(hd);
    }
}
