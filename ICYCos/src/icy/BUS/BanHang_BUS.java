/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.BUS;

import icy.DAO.BanHang_DAO;
import icy.DAO.NhapHang_DAO;
import icy.DTO.NhapHang_DTO;
import icy.DTO.SanPham_DTO;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Kieu Lam Ngo
 */
public class BanHang_BUS {
    public static ArrayList<SanPham_DTO> dssp;
    BanHang_DAO data=new BanHang_DAO();
    public void DocSPTonKho(){
        if(dssp==null) dssp=new ArrayList<SanPham_DTO>();
        dssp=data.DocSPTonKho();
    }
    public void SuaSL(SanPham_DTO dssp){
       data.SuaSL(dssp);
    }
    public ImageIcon ResizeImage(String ImagePath,javax.swing.JLabel lbel){
        ImageIcon myIcon = new ImageIcon(ImagePath);
        Image img = myIcon.getImage();
        Image newimg = img.getScaledInstance(lbel.getWidth(), lbel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimg);
        return image;
    }
}