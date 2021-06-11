package pojo;
// Generated Jun 11, 2021 5:19:12 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Monhoc generated by hbm2java
 */
public class Monhoc  implements java.io.Serializable {


     private String maMh;
     private String tenMh;
     private Integer soTinChi;
     private Set hocphans = new HashSet(0);

    public Monhoc() {
    }

	
    public Monhoc(String maMh, String tenMh) {
        this.maMh = maMh;
        this.tenMh = tenMh;
    }
    public Monhoc(String maMh, String tenMh, Integer soTinChi, Set hocphans) {
       this.maMh = maMh;
       this.tenMh = tenMh;
       this.soTinChi = soTinChi;
       this.hocphans = hocphans;
    }
   
    public String getMaMh() {
        return this.maMh;
    }
    
    public void setMaMh(String maMh) {
        this.maMh = maMh;
    }
    public String getTenMh() {
        return this.tenMh;
    }
    
    public void setTenMh(String tenMh) {
        this.tenMh = tenMh;
    }
    public Integer getSoTinChi() {
        return this.soTinChi;
    }
    
    public void setSoTinChi(Integer soTinChi) {
        this.soTinChi = soTinChi;
    }
    public Set getHocphans() {
        return this.hocphans;
    }
    
    public void setHocphans(Set hocphans) {
        this.hocphans = hocphans;
    }




}


