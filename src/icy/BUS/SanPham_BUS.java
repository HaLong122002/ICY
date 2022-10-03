/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.BUS;

import icy.DAO.SanPham_DAO;
import icy.DTO.SanPham_DTO;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Base64;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class SanPham_BUS {
    public static ArrayList<SanPham_DTO> dssp;
    SanPham_DAO data=new SanPham_DAO();
    public ArrayList<SanPham_DTO> kq=new ArrayList<SanPham_DTO>();
    public ArrayList<SanPham_DTO> kqNC=new ArrayList<SanPham_DTO>();
    public void DocSP(){
        if(dssp==null) dssp=new ArrayList<SanPham_DTO>();
        dssp=data.DocSP();
    }
    public void them(SanPham_DTO sp){
        data.them(sp);
        dssp.add(sp);
    }
    public void sua(SanPham_DTO sp){
        data.sua(sp);
    }
    public void xoa(String s) {
        data.xoa(s);
    }
    public ImageIcon ResizeImage(String ImagePath,javax.swing.JLabel lbel){
        ImageIcon myIcon = new ImageIcon(ImagePath);
        Image img = myIcon.getImage();
        Image newimg = img.getScaledInstance(lbel.getWidth(), lbel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimg);
        return image;
    }
    
    public ArrayList<SanPham_DTO> timTheoMa(String x){
        ArrayList<SanPham_DTO> kq=new ArrayList<SanPham_DTO>();
        for(SanPham_DTO sp : dssp){
            if(sp.MaSP.indexOf(x)>=0)
                kq.add(sp);
        }
        return kq;
    }
    public ArrayList<SanPham_DTO> timTheoTen(String x){
        ArrayList<SanPham_DTO> kq=new ArrayList<SanPham_DTO>();
        for(SanPham_DTO sp : dssp){
            if(sp.TenSP.indexOf(x)>=0)
                kq.add(sp);
        }
        return kq;
    }
    public ArrayList<SanPham_DTO> timTheoGiaBan(String x){
        ArrayList<SanPham_DTO> kq=new ArrayList<SanPham_DTO>();
        for(SanPham_DTO sp : dssp){
            if(sp.GiaBan.indexOf(x)>=0)
                kq.add(sp);
        }
        return kq;
    }
    public ArrayList<SanPham_DTO> timTheoSoLuong(String x){
        ArrayList<SanPham_DTO> kq=new ArrayList<SanPham_DTO>();
        for(SanPham_DTO sp : dssp){
            if(sp.SoLuong.indexOf(x)>=0)
                kq.add(sp);
        }
        return kq;
    }
    public void timKiem(javax.swing.JComboBox<String> cbb,String x) {                                       
        if(cbb.getSelectedItem().toString().equalsIgnoreCase("Mã SP")){
            kq=timTheoMa(x);
        }else if(cbb.getSelectedItem().toString().equalsIgnoreCase("Tên SP")){
            kq=timTheoTen(x);
        }else if(cbb.getSelectedItem().toString().equalsIgnoreCase("Giá bán")){
            kq=timTheoGiaBan(x);
        }else if(cbb.getSelectedItem().toString().equalsIgnoreCase("Số lượng")){
            kq=timTheoSoLuong(x);
        }
    }
    public ArrayList<SanPham_DTO> timTheoGiaBanNC(javax.swing.JComboBox<String> cbb,String x){
        if (cbb.getSelectedItem().toString().equalsIgnoreCase("Giá bán")) {
            ArrayList<SanPham_DTO> kq = new ArrayList<SanPham_DTO>();
            for (SanPham_DTO sp : dssp) {
                if (sp.GiaBan.equals(x)) {
                    kq.add(sp);
                }
            }
        }
        return kq;
    }
    public ArrayList<SanPham_DTO> timTheoSoLuongNC(javax.swing.JComboBox<String> cbb,String x){
        if (cbb.getSelectedItem().toString().equalsIgnoreCase("Số lượng")) {
            ArrayList<SanPham_DTO> kq = new ArrayList<SanPham_DTO>();
            for (SanPham_DTO sp : dssp) {
                if (sp.SoLuong.equals(x)) {
                    kq.add(sp);
                }
            }
        }
        return kq;
    }
    public void Tim_AND(String x,String y){
        ArrayList<SanPham_DTO> kq = new ArrayList<SanPham_DTO>();
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        for (SanPham_DTO sp : dssp) {
            if (Integer.parseInt(sp.GiaBan) >= a && Integer.parseInt(sp.GiaBan) <= b) {
                kq.add(sp);
            }
        }
        kqNC= kq;
    }
    public void Tim_OR(String x,String y){
        ArrayList<SanPham_DTO> kq = new ArrayList<SanPham_DTO>();
        for (SanPham_DTO sp : dssp) {
            if (sp.SoLuong.equals(x) || sp.SoLuong.equals(y)) {
                kq.add(sp);
            }
        }
        kqNC= kq;
    }
}
