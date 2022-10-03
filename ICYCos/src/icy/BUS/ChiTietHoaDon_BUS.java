/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.BUS;

import icy.DAO.ChiTietHoaDon_DAO;
import icy.DTO.ChiTietHoaDon_DTO;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Kieu Lam Ngo
 */
public class ChiTietHoaDon_BUS {
    public static ArrayList<ChiTietHoaDon_DTO> dshd;
    public static ArrayList<ChiTietHoaDon_DTO> dsHoaDon=new ArrayList<ChiTietHoaDon_DTO>();
    ChiTietHoaDon_DAO data=new ChiTietHoaDon_DAO();
    public void DocCTHD(){
        if(dshd==null) dshd=new ArrayList<ChiTietHoaDon_DTO>();
        dshd=data.DocCTHD();
    }
    public void them(ChiTietHoaDon_DTO hd){
        data.them(hd);
        dshd.add(hd);
    }
    public ImageIcon ResizeImage(String ImagePath,javax.swing.JLabel lbel){
        ImageIcon myIcon = new ImageIcon(ImagePath);
        Image img = myIcon.getImage();
        Image newimg = img.getScaledInstance(lbel.getWidth(), lbel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimg);
        return image;
    }
}
