/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utills.HibernateUtil;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import static org.hibernate.jpa.internal.EntityManagerImpl.LOG;
import pojo.Giaovu;
import pojo.Sinhvien;

/**
 *
 * @author VOCONGHUAN
 */

public class SinhvienDAO {
    private static SessionFactory sf = HibernateUtil.getSessionFactory();
    public static List<Sinhvien> layDanhSachSinhVien() {
             try 
        {
                 Transaction beginTransaction;
                 beginTransaction = sf.getCurrentSession().beginTransaction();
            return sf.getCurrentSession().createCriteria(Sinhvien.class).list();
            
        } catch (HibernateException e){
            LOG.info(e.toString());
            return null;
        } finally {
            sf.getCurrentSession().close();
        }
    }
    
   public static Sinhvien layThongTinSinhVien(String maSinhVien) {
    Sinhvien sv = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
    sv = (Sinhvien) session.get(Sinhvien.class, maSinhVien);
    } catch (HibernateException ex) {
    //Log the exception
    System.err.println(ex);
    } finally {
    session.close();
    }
    return sv;
    }
   
    public static boolean capNhatThongTinSinhVien(Sinhvien sv) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    if (SinhvienDAO.layThongTinSinhVien(sv.getMssv()) == null) {
        return false;
    }
    Transaction transaction = null;
    try {
    transaction = session.beginTransaction();
    session.update(sv);
    transaction.commit();
    } catch (HibernateException ex) {
    //Log the exception
    transaction.rollback();
    System.err.println(ex);
    } finally {
    session.close();
    }
    return true;
    }
}