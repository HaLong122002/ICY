/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.BUS;

import icy.DAO.PhieuNhap_DAO;
import icy.DTO.PhieuNhap_DTO;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class PhieuNhap_BUS {
    public static ArrayList<PhieuNhap_DTO> dspnh;
    PhieuNhap_DAO data=new PhieuNhap_DAO();
    public void DocPhieuNhap(){
        if(dspnh==null) dspnh=new ArrayList<PhieuNhap_DTO>();
        dspnh=data.DocPhieuNhap();
    }
    public void NhapHang(PhieuNhap_DTO pnh){
        data.NhapHang(pnh);
        dspnh.add(pnh);
    }
}
