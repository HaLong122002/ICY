/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.BUS;

import icy.DAO.NhaCungCap_DAO;
import icy.DTO.NhaCungCap_DTO;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class NhaCungCap_BUS {
    public static ArrayList<NhaCungCap_DTO> dsncc;
    NhaCungCap_DAO data=new NhaCungCap_DAO();
    public void DocNCC(){
        if(dsncc==null) dsncc=new ArrayList<NhaCungCap_DTO>();
        dsncc=data.DocNCC();
    }
    public void them(NhaCungCap_DTO ncc){
        data.them(ncc);
        dsncc.add(ncc);
    }
    public void sua(NhaCungCap_DTO ncc){
        data.sua(ncc);
    }
    public void xoa(String stt) {
        data.xoa(stt);
    }
}
