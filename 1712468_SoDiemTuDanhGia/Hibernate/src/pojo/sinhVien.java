package pojo;
// Generated Jun 11, 2021 5:19:12 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sinhvien generated by hbm2java
 */
public class Sinhvien  implements java.io.Serializable {


     private String mssv;
     private String password;
     private String hoTenSv;
     private String hoTenCha;
     private String hoTenMe;
     private Date namSinh;
     private String queQuan;
     private String choOhienTai;
     private String sdt;
     private Set dangkies = new HashSet(0);

    public Sinhvien() {
    }

	
    public Sinhvien(String mssv, String hoTenSv) {
        this.mssv = mssv;
        this.hoTenSv = hoTenSv;
    }
    public Sinhvien(String mssv, String password, String hoTenSv, String hoTenCha, String hoTenMe, Date namSinh, String queQuan, String choOhienTai, String sdt, Set dangkies) {
       this.mssv = mssv;
       this.password = password;
       this.hoTenSv = hoTenSv;
       this.hoTenCha = hoTenCha;
       this.hoTenMe = hoTenMe;
       this.namSinh = namSinh;
       this.queQuan = queQuan;
       this.choOhienTai = choOhienTai;
       this.sdt = sdt;
       this.dangkies = dangkies;
    }
   
    public String getMssv() {
        return this.mssv;
    }
    
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getHoTenSv() {
        return this.hoTenSv;
    }
    
    public void setHoTenSv(String hoTenSv) {
        this.hoTenSv = hoTenSv;
    }
    public String getHoTenCha() {
        return this.hoTenCha;
    }
    
    public void setHoTenCha(String hoTenCha) {
        this.hoTenCha = hoTenCha;
    }
    public String getHoTenMe() {
        return this.hoTenMe;
    }
    
    public void setHoTenMe(String hoTenMe) {
        this.hoTenMe = hoTenMe;
    }
    public Date getNamSinh() {
        return this.namSinh;
    }
    
    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }
    public String getQueQuan() {
        return this.queQuan;
    }
    
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public String getChoOhienTai() {
        return this.choOhienTai;
    }
    
    public void setChoOhienTai(String choOhienTai) {
        this.choOhienTai = choOhienTai;
    }
    public String getSdt() {
        return this.sdt;
    }
    
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public Set getDangkies() {
        return this.dangkies;
    }
    
    public void setDangkies(Set dangkies) {
        this.dangkies = dangkies;
    }




}


