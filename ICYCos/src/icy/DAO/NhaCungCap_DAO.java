/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DAO;
import icy.SQLConnect;
import java.util.ArrayList;
import java.sql.ResultSet;
import icy.DTO.NhaCungCap_DTO;
/**
 *
 * @author HP
 */
public class NhaCungCap_DAO {
    SQLConnect connect;
    public NhaCungCap_DAO(){
        connect = new SQLConnect("DESKTOP-LGV4DA9", "ICY", "sa", "123");
    }
    public ArrayList DocNCC(){
        ArrayList dsncc=new ArrayList<NhaCungCap_DTO>();
        try {
            
            String qry = "select * from NhaCungCap";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                NhaCungCap_DTO ncc = new NhaCungCap_DTO();
                ncc.MaNCC= result.getString(1);
                ncc.TenNCC = result.getString(2);
                ncc.DiaChi = result.getString(3);
                ncc.SDT = result.getString(4);
                dsncc.add(ncc);
            }
        } catch (Exception ex) {
            System.out.println("Không đọc đc dữ liệu từ database!");
        }
        return dsncc;
    }
    public void them(NhaCungCap_DTO ncc){
        try{
        String qry="Insert into NhaCungCap Values (";
        qry=qry+"N'"+ncc.MaNCC+"'";
        qry=qry+",N'"+ncc.TenNCC+"'";
        qry=qry+",N"+"'"+ncc.DiaChi+"'";
        qry=qry+",N"+"'"+ncc.SDT+"'";
        qry=qry+")";
        connect.executeUpdate(qry);
        }catch (Exception ex) {
            System.out.println("Ghi vào database thất bại!");
        }
    }
    public void sua(NhaCungCap_DTO ncc){
        try {
            String qry = "Update NhaCungCap Set ";
            qry = qry + " " + "TenNCC=" + "N'" + ncc.TenNCC + "'";
            qry = qry + "," + "DiaChi=" + "N'" + ncc.DiaChi + "'";
            qry = qry + "," + "SDT=" + "N'" + ncc.SDT + "'";
            qry = qry + " Where MaNCC=" +"N'"+ncc.MaNCC+"'";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println("Sửa thất bại!");
        }
    }
    public void xoa(String ma){
        try{
                String qry="Delete from NhaCungCap where MaNCC='"+ma+"'";
                connect.executeUpdate(qry);
            }catch(Exception ex){
                System.out.println("Xóa thất bại!");
            }
    }
}
