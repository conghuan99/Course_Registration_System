/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utills.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
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
public class GiaovuDAO {
    private static SessionFactory sf = HibernateUtil.getSessionFactory();
    public static List<Giaovu> layDanhSachGiaoVu() {
             try 
        {
                 Transaction beginTransaction;
                 beginTransaction = sf.getCurrentSession().beginTransaction();
            return sf.getCurrentSession().createCriteria(Giaovu.class).list();
            
        } catch (HibernateException e){
            LOG.info(e.toString());
            return null;
        } finally {
            sf.getCurrentSession().close();
        }
    }
    
     public static Giaovu layThongTinGiaoVu(String maGV) {
    Giaovu gv = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
    gv = (Giaovu) session.get(Giaovu.class, maGV);
    } catch (HibernateException ex) {
    //Log the exception
    System.err.println(ex);
    } finally {
    session.close();
    }
    return gv;
    }
     
     public static boolean capNhatThongTinGiaoVu(Giaovu gv) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (GiaovuDAO.layThongTinGiaoVu(gv.getMaGv()) == null) {
        return false;
        }
        Transaction transaction = null;
        try {
        transaction = session.beginTransaction();
        session.update(gv);
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
     
     public static boolean themGiaoVu(Giaovu gv) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (GiaovuDAO.layThongTinGiaoVu(gv.getMaGv())!=null) {//đa ton tai giao vu nay trong db
        return false;
        }
        Transaction transaction = null;
        try {
        transaction = session.beginTransaction();
        session.save(gv);
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
     
     public static boolean xoaGiaoVu(String maGV) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Giaovu gv = GiaovuDAO.layThongTinGiaoVu(maGV);
        if(gv==null){
        return false;
        }
        Transaction transaction = null;
        try {
        transaction = session.beginTransaction();
        session.delete(gv);
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
