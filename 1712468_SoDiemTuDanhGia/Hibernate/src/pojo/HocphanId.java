package pojo;
// Generated Jun 8, 2021 6:18:02 PM by Hibernate Tools 4.3.1



/**
 * HocphanId generated by hbm2java
 */
public class HocphanId  implements java.io.Serializable {


     private String maHp;
     private String hocKy;
     private String namHoc;

    public HocphanId() {
    }

    public HocphanId(String maHp, String hocKy, String namHoc) {
       this.maHp = maHp;
       this.hocKy = hocKy;
       this.namHoc = namHoc;
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
		 if ( !(other instanceof HocphanId) ) return false;
		 HocphanId castOther = ( HocphanId ) other; 
         
		 return ( (this.getMaHp()==castOther.getMaHp()) || ( this.getMaHp()!=null && castOther.getMaHp()!=null && this.getMaHp().equals(castOther.getMaHp()) ) )
 && ( (this.getHocKy()==castOther.getHocKy()) || ( this.getHocKy()!=null && castOther.getHocKy()!=null && this.getHocKy().equals(castOther.getHocKy()) ) )
 && ( (this.getNamHoc()==castOther.getNamHoc()) || ( this.getNamHoc()!=null && castOther.getNamHoc()!=null && this.getNamHoc().equals(castOther.getNamHoc()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getMaHp() == null ? 0 : this.getMaHp().hashCode() );
         result = 37 * result + ( getHocKy() == null ? 0 : this.getHocKy().hashCode() );
         result = 37 * result + ( getNamHoc() == null ? 0 : this.getNamHoc().hashCode() );
         return result;
   }   


}


