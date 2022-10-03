/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.BUS;

import icy.DAO.LoaiSP_DAO;
import icy.DTO.LoaiSP_DTO;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class LoaiSP_BUS {
    public static ArrayList<LoaiSP_DTO> dslsp;
    LoaiSP_DAO data=new LoaiSP_DAO();
    public ArrayList<LoaiSP_DTO> kq=new ArrayList<LoaiSP_DTO>();
    public void DocLSP(){
        if(dslsp==null) dslsp=new ArrayList<LoaiSP_DTO>();
        dslsp=data.DocLSP();
    }
    public void them(LoaiSP_DTO lsp){
        data.them(lsp);
        dslsp.add(lsp);
    }
    public void sua(LoaiSP_DTO lsp){
        data.sua(lsp);
    }
    public void xoa(String s) {
        data.xoa(s);
    }
    public ArrayList<LoaiSP_DTO> timTheoMaLoai(String x){
        ArrayList<LoaiSP_DTO> kq=new ArrayList<LoaiSP_DTO>();
        for(LoaiSP_DTO lsp : dslsp){
            if(lsp.MaLoaiSP.indexOf(x)>=0)
                kq.add(lsp);
        }
        return kq;
    }
    public ArrayList<LoaiSP_DTO> timTheoTenLoai(String x){
        ArrayList<LoaiSP_DTO> kq=new ArrayList<LoaiSP_DTO>();
        for(LoaiSP_DTO lsp : dslsp){
            if(lsp.TenLoai.indexOf(x)>=0)
                kq.add(lsp);
        }
        return kq;
    }
    public void timKiemLoai(javax.swing.JComboBox<String> cbb,String x) {                                       
        if(cbb.getSelectedItem().toString().equalsIgnoreCase("Mã loại")){
            kq=timTheoMaLoai(x);
        }else if(cbb.getSelectedItem().toString().equalsIgnoreCase("Tên loại")){
            kq=timTheoTenLoai(x);
        }
    }
}
