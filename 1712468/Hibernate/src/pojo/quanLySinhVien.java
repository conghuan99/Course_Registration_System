package pojo;
// Generated Jun 8, 2021 6:18:02 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Quanlysinhvien generated by hbm2java
 */
public class Quanlysinhvien  implements java.io.Serializable {


     private Integer id;
     private Sinhvien sinhvien;
     private String password;
     private Date lichSu;

    public Quanlysinhvien() {
    }

    public Quanlysinhvien(Sinhvien sinhvien, String password, Date lichSu) {
       this.sinhvien = sinhvien;
       this.password = password;
       this.lichSu = lichSu;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Sinhvien getSinhvien() {
        return this.sinhvien;
    }
    
    public void setSinhvien(Sinhvien sinhvien) {
        this.sinhvien = sinhvien;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Date getLichSu() {
        return this.lichSu;
    }
    
    public void setLichSu(Date lichSu) {
        this.lichSu = lichSu;
    }




}


