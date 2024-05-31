
package Dao;

import Model.Guard;
import java.util.List;
import org.hibernate.Session;


public class GuardDao {
    public Guard recordGuards(Guard guardObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(guardObj);
            ss.beginTransaction().commit();
            ss.close();
            return guardObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Guard updateGuards(Guard guardObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(guardObj);
            ss.beginTransaction().commit();
            ss.close();
            return guardObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Guard deleteGuards(Guard guardObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(guardObj);
            ss.beginTransaction().commit();
            ss.close();
            return guardObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Guard searchGuards(Guard guardObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Guard guards = (Guard) ss.get(Guard.class, guardObj.getGuardId());
            ss.close();
            return guards;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
   public List<Guard> displayGuards() {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        List<Guard> theGuards = ss.createQuery("SELECT guard FROM Guard guard").list();
        ss.close();
        return theGuards;  
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
 
}
