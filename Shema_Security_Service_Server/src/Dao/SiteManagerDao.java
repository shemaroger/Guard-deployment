
package Dao;

import Model.SiteManager;
import java.util.List;
import org.hibernate.Session;


public class SiteManagerDao {
    public SiteManager recordSiteManagers(SiteManager siteManagerObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(siteManagerObj);
            ss.beginTransaction().commit();
            ss.close();
            return siteManagerObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public SiteManager updateSiteManagers(SiteManager siteManagerObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(siteManagerObj);
            ss.beginTransaction().commit();
            ss.close();
            return siteManagerObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public SiteManager deleteSiteManagers(SiteManager siteManagerObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(siteManagerObj);
            ss.beginTransaction().commit();
            ss.close();
            return siteManagerObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public SiteManager searchSiteManagers(SiteManager siteManagerObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            SiteManager siteManagers = (SiteManager) ss.get(SiteManager.class, siteManagerObj.getId());
            ss.close();
            return siteManagers;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<SiteManager> displaySiteManagers(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<SiteManager> theSiteManagers = ss.createQuery("SELECT site_m FROM SiteManager site_m").list();
            ss.close();
            return theSiteManagers;  
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    } 
}
