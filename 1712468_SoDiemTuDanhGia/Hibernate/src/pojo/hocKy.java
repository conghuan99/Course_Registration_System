/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;
import java.util.Date;
/**
 *
 * @author VOCONGHUAN
 */
public class hocKy {
    private String tenHK;
    private String namHoc;
    private Date ngayBD;
    private Date ngayKT;
    private short hocKyHienTai;

    public hocKy() {
    }
    public hocKy(String tenHK) {
        this.tenHK = tenHK;
    }
    public hocKy(String tenHK, String namHoc, Date ngayBD, Date ngayKT, short hocKyHienTai) {
        this.tenHK = tenHK;
        this.namHoc = namHoc;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.hocKyHienTai = hocKyHienTai;
    }

    public String getTenHK() {
        return tenHK;
    }

    public void setTenHK(String tenHK) {
        this.tenHK = tenHK;
    }

    public String getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }

    public short getHocKyHienTai() {
        return hocKyHienTai;
    }

    public void setHocKyHienTai(short hocKyHienTai) {
        this.hocKyHienTai = hocKyHienTai;
    }
    
    
}
