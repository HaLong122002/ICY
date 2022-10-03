/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.BUS;

import icy.DAO.NhapHang_DAO;
import icy.DTO.NhapHang_DTO;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author HP
 */
public class NhapHang_BUS {
    public static ArrayList<NhapHang_DTO> dstk;
    NhapHang_DAO data=new NhapHang_DAO();
    public void DocSPTonKho(){
        if(dstk==null) dstk=new ArrayList<NhapHang_DTO>();
        dstk=data.DocSPTonKho();
    }
    public void SuaSL(NhapHang_DTO sptk){
        data.SuaSL(sptk);
    }
    public ImageIcon ResizeImage(String ImagePath,javax.swing.JLabel lbel){
        ImageIcon myIcon = new ImageIcon(ImagePath);
        Image img = myIcon.getImage();
        Image newimg = img.getScaledInstance(lbel.getWidth(), lbel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimg);
        return image;
    }
}
