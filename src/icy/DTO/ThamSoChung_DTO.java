/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DTO;

/**
 *
 * @author HP
 */
public class ThamSoChung_DTO {
    public String TenKho;
    public String TenPN;
    public String TTSP;
    public String TTPN;

    public ThamSoChung_DTO() {
    }

    public ThamSoChung_DTO(String TenKho, String TenPN, String TTSP, String TTPN) {
        this.TenKho = TenKho;
        this.TenPN = TenPN;
        this.TTSP = TTSP;
        this.TTPN = TTPN;
    }

    public String getTenKho() {
        return TenKho;
    }

    public void setTenKho(String TenKho) {
        this.TenKho = TenKho;
    }

    public String getTenPN() {
        return TenPN;
    }

    public void setTenPN(String TenPN) {
        this.TenPN = TenPN;
    }

    public String getTTSP() {
        return TTSP;
    }

    public void setTTSP(String TTSP) {
        this.TTSP = TTSP;
    }

    public String getTTPN() {
        return TTPN;
    }

    public void setTTPN(String TTPN) {
        this.TTPN = TTPN;
    }
    
}
