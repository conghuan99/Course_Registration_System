/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import pojo.Sinhvien;

/**
 *
 * @author VOCONGHUAN
 */
public class Main {
    private static List<Sinhvien> ds;
    public static void main(String args[]) {
    ds = SinhvienDAO.layDanhSachSinhVien();
    for(int i=0; i<ds.size(); i++){
        Sinhvien sv= ds.get(i);
        System.out.println("MSSV: "+ sv.getMssv());
        System.out.println("Họ và tên: "+sv.getHoTenSv());
        System.out.println("Ngày sinh: " + sv.getNamSinh());
        System.out.println("Họ tên cha: " + sv.getHoTenCha());
        System.out.println("Học tên mẹ: " + sv.getHoTenMe());
        System.out.println("Quê quán: " + sv.getQueQuan());
        System.out.println("Chỗ ở hiện tại: " + sv.getChoOhienTai());
        System.out.println("SĐT: " + sv.getSdt());
        System.out.println("---------------------------------------------");
        }
    
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");    
    }
}
