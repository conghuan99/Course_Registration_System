package pojo;
// Generated Jun 11, 2021 5:19:12 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Dangky generated by hbm2java
 */
public class Dangky  implements java.io.Serializable {


     private DangkyId id;
     private Hocphan hocphan;
     private Sinhvien sinhvien;
     private Date lichSuDangKy;

    public Dangky() {
    }

	
    public Dangky(DangkyId id, Hocphan hocphan, Sinhvien sinhvien) {
        this.id = id;
        this.hocphan = hocphan;
        this.sinhvien = sinhvien;
    }
    public Dangky(DangkyId id, Hocphan hocphan, Sinhvien sinhvien, Date lichSuDangKy) {
       this.id = id;
       this.hocphan = hocphan;
       this.sinhvien = sinhvien;
       this.lichSuDangKy = lichSuDangKy;
    }
   
    public DangkyId getId() {
        return this.id;
    }
    
    public void setId(DangkyId id) {
        this.id = id;
    }
    public Hocphan getHocphan() {
        return this.hocphan;
    }
    
    public void setHocphan(Hocphan hocphan) {
        this.hocphan = hocphan;
    }
    public Sinhvien getSinhvien() {
        return this.sinhvien;
    }
    
    public void setSinhvien(Sinhvien sinhvien) {
        this.sinhvien = sinhvien;
    }
    public Date getLichSuDangKy() {
        return this.lichSuDangKy;
    }
    
    public void setLichSuDangKy(Date lichSuDangKy) {
        this.lichSuDangKy = lichSuDangKy;
    }




}


