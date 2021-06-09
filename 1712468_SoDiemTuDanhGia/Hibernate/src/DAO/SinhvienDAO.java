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
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import static org.hibernate.jpa.internal.EntityManagerImpl.LOG;
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
   
}