package pojo;
// Generated Jun 11, 2021 5:19:12 PM by Hibernate Tools 4.3.1



/**
 * Lop generated by hbm2java
 */
public class Lop  implements java.io.Serializable {


     private String maLop;
     private Hocphan hocphan;
     private String tenLop;
     private Integer tongSv;
     private Integer sinhVienNam;
     private Integer sinhVienNu;

    public Lop() {
    }

	
    public Lop(String maLop) {
        this.maLop = maLop;
    }
    public Lop(String maLop, Hocphan hocphan, String tenLop, Integer tongSv, Integer sinhVienNam, Integer sinhVienNu) {
       this.maLop = maLop;
       this.hocphan = hocphan;
       this.tenLop = tenLop;
       this.tongSv = tongSv;
       this.sinhVienNam = sinhVienNam;
       this.sinhVienNu = sinhVienNu;
    }
   
    public String getMaLop() {
        return this.maLop;
    }
    
    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }
    public Hocphan getHocphan() {
        return this.hocphan;
    }
    
    public void setHocphan(Hocphan hocphan) {
        this.hocphan = hocphan;
    }
    public String getTenLop() {
        return this.tenLop;
    }
    
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    public Integer getTongSv() {
        return this.tongSv;
    }
    
    public void setTongSv(Integer tongSv) {
        this.tongSv = tongSv;
    }
    public Integer getSinhVienNam() {
        return this.sinhVienNam;
    }
    
    public void setSinhVienNam(Integer sinhVienNam) {
        this.sinhVienNam = sinhVienNam;
    }
    public Integer getSinhVienNu() {
        return this.sinhVienNu;
    }
    
    public void setSinhVienNu(Integer sinhVienNu) {
        this.sinhVienNu = sinhVienNu;
    }




}


