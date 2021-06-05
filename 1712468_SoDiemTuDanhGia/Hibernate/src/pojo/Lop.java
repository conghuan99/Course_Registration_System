/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author VOCONGHUAN
 */
public class Lop {
    private String maLop;
    private String tenLop;
    private int tongSV;
    private int sinhVienNam;
    private int sinhVienNu;
    private String maHP;

    public Lop() {
    }
    
    public Lop(String maLop) {
        this.maLop = maLop;
    }
    
    public Lop(String maLop, String tenLop, int tongSV, int sinhVienNam, int sinhVienNu, String maHP) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.tongSV = tongSV;
        this.sinhVienNam = sinhVienNam;
        this.sinhVienNu = sinhVienNu;
        this.maHP = maHP;
    }

    public String getMaLopa() {
        return maLop;
    }

    public void setMaLopa(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getTongSV() {
        return tongSV;
    }

    public void setTongSV(int tongSV) {
        this.tongSV = tongSV;
    }

    public int getSinhVienNam() {
        return sinhVienNam;
    }

    public void setSinhVienNam(int sinhVienNam) {
        this.sinhVienNam = sinhVienNam;
    }

    public int getSinhVienNu() {
        return sinhVienNu;
    }

    public void setSinhVienNu(int sinhVienNu) {
        this.sinhVienNu = sinhVienNu;
    }

    public String getMaHP() {
        return maHP;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }
    
    
}
