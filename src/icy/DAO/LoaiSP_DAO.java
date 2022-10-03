/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DAO;
import java.sql.ResultSet;
import icy.DTO.LoaiSP_DTO;
import icy.SQLConnect;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class LoaiSP_DAO {
    SQLConnect connect ;
    public LoaiSP_DAO(){
        connect = new SQLConnect("DESKTOP-LGV4DA9", "ICY", "sa", "123");
    }
    public ArrayList DocLSP(){
        ArrayList dslsp=new ArrayList<LoaiSP_DTO>();
        try {
            
            String qry = "select * from LoaiSanPham";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                LoaiSP_DTO lsp = new LoaiSP_DTO();
                lsp.MaLoaiSP = result.getString(1);
                lsp.TenLoai = result.getString(2);
                lsp.ThanhPhan = result.getString(3);
                lsp.CongDungSP = result.getString(4);
                dslsp.add(lsp);
            }
        } catch (Exception ex) {
            System.out.println("Không đọc đc dữ liệu từ database!");
        }
        return dslsp;
    }
    public void them(LoaiSP_DTO lsp){
        try{
        String qry="Insert into LoaiSanPham Values (";
        qry=qry+"N'"+lsp.MaLoaiSP+"'";
        qry=qry+",N"+"'"+lsp.TenLoai+"'";
        qry=qry+",N"+"'"+lsp.ThanhPhan+"'";
        qry=qry+",N"+"'"+lsp.CongDungSP+"'";
        qry=qry+")";
        connect.executeUpdate(qry);
        }catch (Exception ex) {
            System.out.println("Ghi vào database thất bại!");
        }
    }
    public void sua(LoaiSP_DTO lsp){
        try {
            String qry = "Update LoaiSanPham Set ";
            qry = qry + " " + "TenLoai=" + "N'" + lsp.TenLoai + "'";
            qry = qry + "," + "ThanhPhan=" + "N'" + lsp.ThanhPhan + "'";
            qry = qry + "," + "CongDung=" + "N'" + lsp.CongDungSP + "'";
            qry = qry + " Where MaLoai=" +"N'"+lsp.MaLoaiSP+"'";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println("Sửa thất bại!");
        }
    }
    public void xoa(String ma){
        try{
                String qry="Delete from LoaiSanPham where MaLoai='"+ma+"'";
                connect.executeUpdate(qry);
            }catch(Exception ex){
                System.out.println("Xóa thất bại!");
            }
    }
}
