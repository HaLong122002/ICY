/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.BUS;

import icy.DAO.ChiTietPhieuNhap_DAO;
import icy.DTO.ChiTietPhieuNhap_DTO;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author HP
 */
public class ChiTietPhieuNhap_BUS {
    public static ArrayList<ChiTietPhieuNhap_DTO> dspn;
    public static ArrayList<ChiTietPhieuNhap_DTO> dsHoaDonNhap=new ArrayList<ChiTietPhieuNhap_DTO>();
    ChiTietPhieuNhap_DAO data=new ChiTietPhieuNhap_DAO();
    public void DocCTPN(){
        if(dspn==null) dspn=new ArrayList<ChiTietPhieuNhap_DTO>();
        dspn=data.DocCTPN();
    }
    public void them(ChiTietPhieuNhap_DTO pn){
        data.them(pn);
        dspn.add(pn);
    }
    public void sua(ChiTietPhieuNhap_DTO pn){
        data.sua(pn);
    }
    public void xoa(String stt) {
        data.xoa(stt);
    }
    public ImageIcon ResizeImage(String ImagePath,javax.swing.JLabel lbel){
        ImageIcon myIcon = new ImageIcon(ImagePath);
        Image img = myIcon.getImage();
        Image newimg = img.getScaledInstance(lbel.getWidth(), lbel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimg);
        return image;
    }
}
