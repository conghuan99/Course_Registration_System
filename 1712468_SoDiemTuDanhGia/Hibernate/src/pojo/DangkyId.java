package pojo;
// Generated Jun 8, 2021 6:18:02 PM by Hibernate Tools 4.3.1



/**
 * DangkyId generated by hbm2java
 */
public class DangkyId  implements java.io.Serializable {


     private String mssv;
     private String maHp;
     private String hocKy;
     private String namHoc;

    public DangkyId() {
    }

    public DangkyId(String mssv, String maHp, String hocKy, String namHoc) {
       this.mssv = mssv;
       this.maHp = maHp;
       this.hocKy = hocKy;
       this.namHoc = namHoc;
    }
   
    public String getMssv() {
        return this.mssv;
    }
    
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }
    public String getMaHp() {
        return this.maHp;
    }
    
    public void setMaHp(String maHp) {
        this.maHp = maHp;
    }
    public String getHocKy() {
        return this.hocKy;
    }
    
    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }
    public String getNamHoc() {
        return this.namHoc;
    }
    
    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DangkyId) ) return false;
		 DangkyId castOther = ( DangkyId ) other; 
         
		 return ( (this.getMssv()==castOther.getMssv()) || ( this.getMssv()!=null && castOther.getMssv()!=null && this.getMssv().equals(castOther.getMssv()) ) )
 && ( (this.getMaHp()==castOther.getMaHp()) || ( this.getMaHp()!=null && castOther.getMaHp()!=null && this.getMaHp().equals(castOther.getMaHp()) ) )
 && ( (this.getHocKy()==castOther.getHocKy()) || ( this.getHocKy()!=null && castOther.getHocKy()!=null && this.getHocKy().equals(castOther.getHocKy()) ) )
 && ( (this.getNamHoc()==castOther.getNamHoc()) || ( this.getNamHoc()!=null && castOther.getNamHoc()!=null && this.getNamHoc().equals(castOther.getNamHoc()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getMssv() == null ? 0 : this.getMssv().hashCode() );
         result = 37 * result + ( getMaHp() == null ? 0 : this.getMaHp().hashCode() );
         result = 37 * result + ( getHocKy() == null ? 0 : this.getHocKy().hashCode() );
         result = 37 * result + ( getNamHoc() == null ? 0 : this.getNamHoc().hashCode() );
         return result;
   }   


}


